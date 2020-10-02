package co.edu.javeriana.dsbp.proyecto.integration.processors;

import co.edu.javeriana.dsbp.proyecto.model.Article;
import co.edu.javeriana.dsbp.proyecto.repository.WebServiceRepository;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ScopeServiceProcessor implements Processor {

    @Autowired
    WebServiceRepository scopusRepository;

    @Override
    public void process(Exchange exchange) throws Exception {
        String searchTerms = exchange.getIn().getBody(String.class);
        List<String> keys = Arrays.asList(searchTerms.split("\\s"));
        List<Article> articles = scopusRepository.search(keys);
        exchange.getIn().setBody(articles);
    }
}
