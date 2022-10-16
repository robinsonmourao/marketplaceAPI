package com.a4s.marketplaceAPI.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity//informa para o banco de dados que essa classe é uma entidade
public class Cliente implements Serializable{

    @Id//informa que o id da entidade está aqui
    @GeneratedValue//Faz o banco de dados incrementar os id automaticamente
            (strategy = GenerationType.IDENTITY)
    private Long cliente_id;
    @Column(nullable=false)// O atributo nome não pode ser nulo
    private String nome;

    public Cliente() {
    }
    public Cliente(Long cliente_id, String nome) {
        this.cliente_id = cliente_id;
        this.nome = nome;
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cliente_id == null) ? 0 : cliente_id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (cliente_id == null) {
            if (other.cliente_id != null)
                return false;
        } else if (!cliente_id.equals(other.cliente_id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    
}
