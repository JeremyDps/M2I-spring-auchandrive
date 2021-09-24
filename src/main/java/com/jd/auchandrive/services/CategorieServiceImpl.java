package com.jd.auchandrive.services;

import com.jd.auchandrive.interfaces.CategorieService;
import com.jd.auchandrive.models.Categorie;
import com.jd.auchandrive.repositories.CategorieRepository;

import java.util.List;
import java.util.Optional;

public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<Categorie> findAll() {
        return this.categorieRepository.findAll();
    }

    @Override
    public Categorie create(Categorie c) {
        this.categorieRepository.save(c);
        return c;
    }

    @Override
    public Categorie put(Categorie c) {
        this.categorieRepository.save(c);
        return c;
    }

    @Override
    public void delete(Long id) {
        this.categorieRepository.deleteById(id);
    }

    @Override
    public Optional<Categorie> findCategorieById(Long id) {
        return this.categorieRepository.findById(id);
    }
}
