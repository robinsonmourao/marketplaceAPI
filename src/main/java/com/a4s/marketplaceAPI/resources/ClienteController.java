package com.a4s.marketplaceAPI.resources;

import java.util.List;

import com.a4s.marketplaceAPI.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.a4s.marketplaceAPI.domain.Cliente;

@RestController
@RequestMapping(path="/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //Ao invés de somente "OK" retorna "Created"
    public Cliente adicionarCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
