package com.a4s.marketplaceAPI.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Produto implements Serializable {

    private Long produto_id;
    private String nome;
    private String fabricante;
    private LocalDate dataAtual;
    private Integer dataDeFabricacao;
    private Integer validade;

    public Produto() {
    }
    public Produto(Long produto_id, String nome, String fabricante) {
        this.produto_id = produto_id;
        this.nome = nome;
        this.fabricante = fabricante;
    }
    public Produto(Long produto_id, String nome, String fabricante, LocalDate dataAtual, Integer dataDeFabricacao,
            Integer validade) {
        this.produto_id = produto_id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.dataAtual = dataAtual;
        this.dataDeFabricacao = dataDeFabricacao;
        this.validade = validade;
    }
    public Long getP_id() {
        return produto_id;
    }
    public void setP_id(Long produto_id) {
        this.produto_id = produto_id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public LocalDate getDataAtual() {
        return dataAtual;
    }
    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }
    public Integer getDataDeFabricacao() {
        return dataDeFabricacao;
    }
    public void setDataDeFabricacao(Integer dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
    public Integer getValidade() {
        return validade;
    }
    public void setValidade(Integer validade) {
        this.validade = validade;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((produto_id == null) ? 0 : produto_id.hashCode());
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
        Produto other = (Produto) obj;
        if (produto_id == null) {
            if (other.produto_id != null)
                return false;
        } else if (!produto_id.equals(other.produto_id))
            return false;
        return true;
    }
    
}
