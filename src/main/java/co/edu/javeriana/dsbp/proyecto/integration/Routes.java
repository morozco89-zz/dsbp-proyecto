package co.edu.javeriana.dsbp.proyecto.integration;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Routes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:ebi-proxy")
                .setBody(constant(null))
                .removeHeaders("*")
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .setHeader(Exchange.HTTP_QUERY, constant("query=fever"))
                .to("https://www.ebi.ac.uk/europepmc/webservices/rest/search")
                .convertBodyTo(String.class)
                .log(LoggingLevel.INFO, "${body}");
    }
}
