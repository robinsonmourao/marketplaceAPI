package com.a4s.marketplaceAPI.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a4s.marketplaceAPI.domain.Cliente;
import com.a4s.marketplaceAPI.services.MarketplaceService;

@RestController
@RequestMapping(path="marketplace")
public class MarketplaceController {

    private final MarketplaceService marketplaceService;

    public MarketplaceController(MarketplaceService marketplaceService) {
        this.marketplaceService = marketplaceService;
    }

    @GetMapping
    public List<Cliente> getClientes(){
        return marketplaceService.getClientes();
    }
}
