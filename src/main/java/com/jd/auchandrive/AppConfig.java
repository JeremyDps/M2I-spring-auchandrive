package com.jd.auchandrive;

import com.jd.auchandrive.interfaces.CategorieService;
import com.jd.auchandrive.interfaces.ClientService;
import com.jd.auchandrive.interfaces.CommandeService;
import com.jd.auchandrive.interfaces.ProduitService;
import com.jd.auchandrive.repositories.CategorieRepository;
import com.jd.auchandrive.repositories.ClientRepository;
import com.jd.auchandrive.repositories.CommandeRepository;
import com.jd.auchandrive.repositories.ProduitRepository;
import com.jd.auchandrive.services.CategorieServiceImpl;
import com.jd.auchandrive.services.ClientServiceImpl;
import com.jd.auchandrive.services.CommandeServiceImpl;
import com.jd.auchandrive.services.ProduitServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ClientService clientService(ClientRepository clientRepository) {
        return new ClientServiceImpl(clientRepository);
    }

    @Bean
    public CommandeService commandeService(CommandeRepository commandeRepository) {
        return new CommandeServiceImpl(commandeRepository);
    }

    @Bean
    public ProduitService produitService(ProduitRepository produitRepository) {
        return new ProduitServiceImpl(produitRepository);
    }

    @Bean
    public CategorieService categorieService(CategorieRepository categorieRepository) {
        return new CategorieServiceImpl(categorieRepository);
    }
}
