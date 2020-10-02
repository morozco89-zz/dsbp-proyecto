package co.edu.javeriana.dsbp.proyecto.repository;

import java.util.List;

import co.edu.javeriana.dsbp.proyecto.model.Article;
import org.springframework.stereotype.Service;

@Service
public interface WebServiceRepository {
	List<Article> search(List<String> keywords);
}
