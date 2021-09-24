package com.jd.auchandrive.services;

import com.jd.auchandrive.interfaces.ProduitService;
import com.jd.auchandrive.models.Produit;
import com.jd.auchandrive.repositories.ProduitRepository;

import java.util.List;
import java.util.Optional;

public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {this.produitRepository = produitRepository;}

    @Override
    public List<Produit> findAll() {
        return this.produitRepository.findAll();
    }

    @Override
    public Produit create(Produit p) {
        this.produitRepository.save(p);
        return p;
    }

    @Override
    public Produit put(Produit p) {
        this.produitRepository.save(p);
        return p;
    }

    @Override
    public void delete(Long id) {
        this.produitRepository.deleteById(id);
    }

    @Override
    public Optional<Produit> findProduitById(Long id) {
        return this.produitRepository.findById(id);
    }
}
