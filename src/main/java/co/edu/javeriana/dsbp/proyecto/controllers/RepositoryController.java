package co.edu.javeriana.dsbp.proyecto.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.dsbp.proyecto.model.Article;
import co.edu.javeriana.dsbp.proyecto.repository.WebServiceRepository;

@RestController
public class RepositoryController {

	@Autowired
	WebServiceRepository scopusRepository;
	
	@RequestMapping("/")
	public ArrayList<Article> search(@RequestBody ArrayList<String> keywords) {
		ArrayList<Article> returnable = new ArrayList<Article>();
		returnable.addAll(scopusRepository.search(keywords));
		return returnable;
	}
}
