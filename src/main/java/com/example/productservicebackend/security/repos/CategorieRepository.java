package com.example.productservicebackend.security.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nadhem.produits.entities.Categorie;

@RepositoryRestResource(path = "cat")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
