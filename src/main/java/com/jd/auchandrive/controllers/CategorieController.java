package com.jd.auchandrive.controllers;

import com.jd.auchandrive.interfaces.CategorieService;
import com.jd.auchandrive.interfaces.ClientService;
import com.jd.auchandrive.models.Categorie;
import com.jd.auchandrive.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("anchandrive/categories")
public class CategorieController {

    private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
    private CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping
    public List<Categorie> getAllCategories() {
        LOGGER.info("Récupération de toutes les catégories");
        return this.categorieService.findAll();
    }

    @PostMapping
    public Categorie createCategorie(@RequestBody Categorie categorie) {
        LOGGER.info("Création d'une nouvelle categorie");
        this.categorieService.create(categorie);
        return  categorie;
    }

    @PutMapping
    public Categorie PutCategorie(@RequestBody Categorie categorie) {
        LOGGER.info("Modification d'une catégorie existante");
        this.categorieService.create(categorie);
        return  categorie;
    }

    @DeleteMapping("{id}")
    public void deleteCategorieById(@PathVariable Long id) {
        LOGGER.info("Suppression d'une catégorie d'id " + id);
        this.categorieService.delete(id);
    }

    @GetMapping("{id}")
    public Optional<Categorie> getCategorieById(@PathVariable Long id) {
        LOGGER.info("Récupération d'une catégorie d'id " + id);
        return this.categorieService.findCategorieById(id);
    }
}
