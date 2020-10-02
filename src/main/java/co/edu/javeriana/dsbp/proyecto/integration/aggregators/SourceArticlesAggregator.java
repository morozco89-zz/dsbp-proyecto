package co.edu.javeriana.dsbp.proyecto.integration.aggregators;

import co.edu.javeriana.dsbp.proyecto.model.Article;
import org.apache.camel.Exchange;

import java.util.ArrayList;
import java.util.List;

public class SourceArticlesAggregator implements org.apache.camel.AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        List<Article> articles;

        if (oldExchange == null) {
            articles = new ArrayList<>();
        } else {
            articles = oldExchange.getIn().getBody(ArrayList.class);
        }

        List<Article> newArticles = newExchange.getIn().getBody(ArrayList.class);

        articles.addAll(newArticles);

        newExchange.getIn().setBody(articles);
        return newExchange;
    }
}
