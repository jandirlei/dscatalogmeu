package br.com.matrix.dscatalogmeu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matrix.dscatalogmeu.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
