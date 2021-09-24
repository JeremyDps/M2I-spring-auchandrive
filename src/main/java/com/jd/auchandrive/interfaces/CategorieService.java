package com.jd.auchandrive.interfaces;

import com.jd.auchandrive.models.Categorie;

import java.util.List;
import java.util.Optional;

public interface CategorieService {

    public List<Categorie> findAll();

    public Categorie create(Categorie p);

    public Categorie put(Categorie p);

    public void delete(Long id);

    public Optional<Categorie> findCategorieById(Long id);
}
