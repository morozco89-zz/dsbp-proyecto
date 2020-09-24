package co.edu.javeriana.dsbp.proyecto.repository;

import java.util.ArrayList;

import co.edu.javeriana.dsbp.proyecto.model.Article;

public interface WebServiceRepository {
	public ArrayList<Article> search(ArrayList<String> keywords);
}
