package br.com.matrix.dscatalogmeu.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.matrix.dscatalogmeu.dto.CategoryDTO;
import br.com.matrix.dscatalogmeu.entities.Category;
import br.com.matrix.dscatalogmeu.repositories.CategoryRepository;
import br.com.matrix.dscatalogmeu.services.exceptions.EntityNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = categoryRepository.findAll();
		List<CategoryDTO> listDto = list.stream().map(x-> new CategoryDTO(x)).collect(Collectors.toList());
		return listDto;
	}
	
	@Transactional(readOnly = true)
	public CategoryDTO findById(long id) {
		Optional<Category>  obj = categoryRepository.findById(id);
		Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new CategoryDTO(entity);
	}	
}
