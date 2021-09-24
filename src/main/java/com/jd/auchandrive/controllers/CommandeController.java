package com.jd.auchandrive.controllers;

import com.jd.auchandrive.interfaces.ClientService;
import com.jd.auchandrive.interfaces.CommandeService;
import com.jd.auchandrive.models.Client;
import com.jd.auchandrive.models.Commande;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("auchandrive/commandes")
public class CommandeController {

    private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
    private CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping
    public List<Commande> getAllCommandes() {
        LOGGER.info("Récupération de toutes les commandes");
        return this.commandeService.findAll();
    }

    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        LOGGER.info("Création d'une nouvelle commande");
        this.commandeService.create(commande);
        return  commande;
    }

    @PutMapping
    public Commande PutCommande(@RequestBody Commande commande) {
        LOGGER.info("Modification d'une commande existante");
        this.commandeService.create(commande);
        return  commande;
    }

    @DeleteMapping("{id}")
    public void deleteCommandeById(@PathVariable Long id) {
        LOGGER.info("Suppression d'une commande d'id " + id);
        this.commandeService.delete(id);
    }

    @GetMapping("{id}")
    public Optional<Commande> getCommandeById(@PathVariable Long id) {
        LOGGER.info("Récupération d'une commande d'id " + id);
        return this.commandeService.findCommandeById(id);
    }
}
