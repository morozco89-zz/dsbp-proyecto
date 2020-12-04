package co.edu.javeriana.dsbp.proyecto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.javeriana.dsbp.proyecto.model.Article;
import co.edu.javeriana.dsbp.proyecto.repository.WebServiceRepository;

@RestController
public class RepositoryController {

	@Autowired
	WebServiceRepository scopusRepository;

	@Autowired
	private ProducerTemplate producerTemplate;

	@GetMapping("/ebi")
	public List<Article> ebiSearch(@RequestParam String query) {
		return producerTemplate.requestBody("direct:ebi-proxy", query, List.class);
	}

	@GetMapping("/all")
	public List<Article> search(@RequestParam String query) {
		 List<Article> articles = producerTemplate.requestBody("direct:search-articles-service", query, List.class);
		 List<String> arrayOfStrings = new ArrayList<String>();
		 arrayOfStrings.add(query);
		 articles.addAll(scopusRepository.search(arrayOfStrings));
		return producerTemplate.requestBody("direct:search-articles-service", query, List.class);
	}
	
	@RequestMapping("/scope")
	public ArrayList<Article> scopeSearch(@RequestBody ArrayList<String> keywords) {
		ArrayList<Article> returnable = new ArrayList<Article>();
		returnable.addAll(scopusRepository.search(keywords));
		return returnable;
	}
}
