package br.com.matrix.dscatalogmeu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.matrix.dscatalogmeu.entities.Category;
import br.com.matrix.dscatalogmeu.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Transactional(readOnly = true)
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
}
