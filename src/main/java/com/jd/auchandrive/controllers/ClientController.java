package com.jd.auchandrive.controllers;

import com.jd.auchandrive.interfaces.ClientService;
import com.jd.auchandrive.models.Client;
import com.jd.auchandrive.models.Commande;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin
@RequestMapping("auchandrive/clients")
public class ClientController {

    private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        LOGGER.info("Récupération de tous les clients");
        return this.clientService.findAll();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        LOGGER.info("Création d'un nouveau client");
        this.clientService.create(client);
        return  client;
    }

    @PutMapping
    public Client PutClient(@RequestBody Client client) {
        LOGGER.info("Modification d'un client existant");
        this.clientService.create(client);
        return  client;
    }

    @DeleteMapping("{id}")
    public void deleteClientById(@PathVariable Long id) {
        LOGGER.info("Suppression du client d'id " + id);
        this.clientService.delete(id);
    }

    @GetMapping("{id}")
    public Optional<Client> getClientVyId(@PathVariable Long id) {
        LOGGER.info("Récupération du client d'id " + id);
        return this.clientService.findClientById(id);
    }

    @GetMapping("{id}/commandes")
    public Set<Commande> getCommandesByClient(@PathVariable Long id) {
        return this.clientService.findCommandeByClient(id);
    }



}
