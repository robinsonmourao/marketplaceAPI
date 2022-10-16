package com.a4s.marketplaceAPI.services;

import com.a4s.marketplaceAPI.domain.Cliente;

import java.util.List;

public class MarketplaceService {
    
    public List<Cliente> getClientes(){
        return List.of(
            new Cliente("111.111.111-11", "robinson"));
    }
}
