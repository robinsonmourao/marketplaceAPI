package com.a4s.marketplaceAPI.domain;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    private Long carrinho_id;
    private List<Produto> produtos = new ArrayList<>();
    
    public Carrinho(Long carrinho_id, List<Produto> produtos) {
        this.carrinho_id = carrinho_id;
        this.produtos = produtos;
    }

    public Long getCarrinho_id() {
        return carrinho_id;
    }
    public void setCarrinho_id(Long carrinho_id) {
        this.carrinho_id = carrinho_id;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carrinho_id == null) ? 0 : carrinho_id.hashCode());
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
        Carrinho other = (Carrinho) obj;
        if (carrinho_id == null) {
            if (other.carrinho_id != null)
                return false;
        } else if (!carrinho_id.equals(other.carrinho_id))
            return false;
        return true;
    }

    
    
}
