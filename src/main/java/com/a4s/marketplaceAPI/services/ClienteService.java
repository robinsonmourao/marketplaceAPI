package com.a4s.marketplaceAPI.services;

import com.a4s.marketplaceAPI.domain.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

public class ClienteService {
    public List<Cliente> getClientes(){
        return List.of(
                new Cliente(1L, "robinson"));
    }
}

