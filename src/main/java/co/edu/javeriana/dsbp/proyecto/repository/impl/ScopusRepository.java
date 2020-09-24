package co.edu.javeriana.dsbp.proyecto.repository.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Repository;
import co.edu.javeriana.dsbp.proyecto.model.Article;
import co.edu.javeriana.dsbp.proyecto.repository.WebServiceRepository;

@Repository
public class ScopusRepository implements WebServiceRepository {
	private final String urlSearchTemplate = "https://api.elsevier.com/content/search/scopus?query=[QUERY_PLACEHOLDER]&APIKey=80952819cb4f2b1a2a7cb8a7d43be26f";
    private static final Logger logger = LogManager.getLogger(ScopusRepository.class);
	
	@Override
	public ArrayList<Article> search(ArrayList<String> keywords) {
		if(keywords == null || keywords.size() == 0) return new ArrayList<Article>();
		
		String queryFilter = String.join(",", keywords);
		ArrayList<Article> returnable = new ArrayList<Article>();
		
		String finalURL = urlSearchTemplate.replace("[QUERY_PLACEHOLDER]", queryFilter);
		logger.info(finalURL);
		try {
			JSONParser parser = new JSONParser();			
			JSONObject responseBody = (JSONObject) parser.parse(callWebService(finalURL));
			JSONObject searchResults = (JSONObject) responseBody.get("search-results");
			JSONArray entries = (JSONArray) searchResults.get("entry");

			for(int i = 0; i < entries.size(); i++) {
				try {
					Article article = new Article();
					JSONObject jsonArticle = (JSONObject) entries.get(i);

					article.setSource("SCOPUS");
					article.setId((String)jsonArticle.get("dc:identifier"));
					article.setUrl((String)jsonArticle.get("prism:url"));
					article.setTitle((String)jsonArticle.get("dc:title"));
					article.setPublicationName((String)jsonArticle.get("prism:publicationName"));
					article.setAuthors((String)jsonArticle.get("dc:creator"));
					article.setArticleAbstract("");
					
					returnable.add(article);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		return returnable;
	}

	public String callWebService(String finalUrl) {
		String returnable = "";

		try {
			URL url = new URL(finalUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json");
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
			    content.append(inputLine);
			}
			in.close();
			con.disconnect();
			returnable = content.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnable;
	}
}
