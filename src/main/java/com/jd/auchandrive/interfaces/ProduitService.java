package com.jd.auchandrive.interfaces;

import com.jd.auchandrive.models.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    public List<Produit> findAll();

    public Produit create(Produit p);

    public Produit put(Produit p);

    public void delete(Long id);

    public Optional<Produit> findProduitById(Long id);
}
