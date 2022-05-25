package com.saad.produits.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.saad.produits.entities.Categorie;
import com.saad.produits.entities.Produit;

public interface ProduitService {
	Produit saveProduit(Produit p);

	Produit updateProduit(Produit p);

	void deleteProduit(Produit p);

	void deleteProduitById(Long id);

	Produit getProduit(Long id);

	List<Produit> getAllProduits();
	
	Page<Produit> getAllProduitsParPage(int page, int size);
	
	/* neww add */

	
	List<Produit> getAllProduits1();
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	List<Produit> findByNomPrix (String nom, Double prix);
	
	List<Produit> findByCategorie (Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();

	List<Categorie> getAllCategories();


}