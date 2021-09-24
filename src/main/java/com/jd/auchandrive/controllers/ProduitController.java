package com.jd.auchandrive.controllers;

import com.jd.auchandrive.interfaces.ClientService;
import com.jd.auchandrive.interfaces.ProduitService;
import com.jd.auchandrive.models.Client;
import com.jd.auchandrive.models.Produit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("anchandrive/produits")
public class ProduitController {

    private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public List<Produit> getAllProduits() {
        LOGGER.info("Récupération de tous les produits");
        return this.produitService.findAll();
    }

    @PostMapping
    public Produit createClient(@RequestBody Produit produit) {
        LOGGER.info("Création d'un nouveau produit");
        this.produitService.create(produit);
        return  produit;
    }

    @PutMapping
    public Produit PutClient(@RequestBody Produit produit) {
        LOGGER.info("Modification d'un produit existant");
        this.produitService.create(produit);
        return  produit;
    }

    @DeleteMapping("{id}")
    public void deleteProduitById(@PathVariable Long id) {
        LOGGER.info("Suppression du produit d'id " + id);
        this.produitService.delete(id);
    }

    @GetMapping("{id}")
    public Optional<Produit> getClientVyId(@PathVariable Long id) {
        LOGGER.info("Récupération du produit d'id " + id);
        return this.produitService.findProduitById(id);
    }
}
