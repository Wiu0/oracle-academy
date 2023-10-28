/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoproduto.model;

import java.sql.Date;


/**
 *
 * @author pedro
 */
public class Produto {
    
    private int id;
    private String nome;
    private String descricao;
    private String statusProduto;
    private int qtdEstoque;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private double precoVenda;
    private double precoCompra;
    private String barCode;
    private int ncm;
    private double fator;
    private String imagem;
    private String data;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the statusProduto
     */
    public String getStatusProduto() {
        return statusProduto;
    }

    /**
     * @param statusProduto the statusProduto to set
     */
    public void setStatusProduto(String statusProduto) {
        this.statusProduto = statusProduto;
    }

    /**
     * @return the qtdEstoque
     */
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    /**
     * @param qtdEstoque the qtdEstoque to set
     */
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    /**
     * @return the estoqueMinimo
     */
    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    /**
     * @param estoqueMinimo the estoqueMinimo to set
     */
    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    /**
     * @return the estoqueMaximo
     */
    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    /**
     * @param estoqueMaximo the estoqueMaximo to set
     */
    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    /**
     * @return the precoVenda
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the precoCompra
     */
    public double getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * @return the barCode
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * @param barCode the barCode to set
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * @return the ncm
     */
    public int getNcm() {
        return ncm;
    }

    /**
     * @param ncm the ncm to set
     */
    public void setNcm(int ncm) {
        this.ncm = ncm;
    }

    /**
     * @return the fator
     */
    public double getFator() {
        return fator;
    }

    /**
     * @param fator the fator to set
     */
    public void setFator(double fator) {
        this.fator = fator;
    }

    /**
     * @return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    public double obterFatorLucro(double precoVenda, double precoCompra){
       
        return (precoVenda - precoCompra);
        
        
    }
    
    public double obterPrecoVenda(double lucro, double precoCompra){
        return precoVenda = lucro + precoCompra;   
    }
    
}
