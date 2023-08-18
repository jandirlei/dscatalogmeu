package br.com.matrix.dscatalogmeu.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matrix.dscatalogmeu.dto.CategoryDTO;
import br.com.matrix.dscatalogmeu.entities.Category;
import br.com.matrix.dscatalogmeu.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity <List<CategoryDTO>> findAll(){
		//List<Category> list = new ArrayList<>();
		//list.add(new Category(1L, "Books"));
		//list.add(new Category(2L, "Eletronics"));
		//list.add(new Category(3L, "Informatic"));
		List<CategoryDTO> list =  categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<CategoryDTO> findById(@PathVariable Long id){
		CategoryDTO dto = categoryService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
 