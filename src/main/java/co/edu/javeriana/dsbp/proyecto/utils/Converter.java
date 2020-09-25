package co.edu.javeriana.dsbp.proyecto.utils;

import co.edu.javeriana.dsbp.proyecto.model.Article;
import co.edu.javeriana.dsbp.proyecto.model.ebi.ResponseWrapper;
import co.edu.javeriana.dsbp.proyecto.model.ebi.Result;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public List<Article> ebiResponseWrapperToArticle(ResponseWrapper rw) {
        List<Article> articles = new ArrayList<>();

        for(Result r : rw.getResultList()) {
            articles.add(resultToArticle(r));
        }

        return articles;
    }

    private Article resultToArticle(Result r) {
        Article ar = new Article();
        ar.setSource(r.getSource());
        ar.setId(r.getId());
        ar.setTitle(r.getTitle());
        ar.setAuthors(r.getAuthorString());
        ar.setReleaseDate(r.getFirstIndexDate());

        return ar;
    }

}
