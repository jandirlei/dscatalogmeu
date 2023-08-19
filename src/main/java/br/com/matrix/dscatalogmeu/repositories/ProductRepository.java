package br.com.matrix.dscatalogmeu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matrix.dscatalogmeu.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
