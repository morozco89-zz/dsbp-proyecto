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
	
	@RequestMapping("/")
	public ArrayList<Article> search(@RequestBody ArrayList<String> keywords) {
		ArrayList<Article> returnable = new ArrayList<Article>();
		returnable.addAll(scopusRepository.search(keywords));
		return returnable;
	}
}
