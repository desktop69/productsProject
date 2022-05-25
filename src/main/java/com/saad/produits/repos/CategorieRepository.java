package com.saad.produits.repos;



import org.springframework.data.jpa.repository.JpaRepository;


import com.saad.produits.entities.Categorie;


public interface CategorieRepository extends JpaRepository<Categorie, Long> {


}
