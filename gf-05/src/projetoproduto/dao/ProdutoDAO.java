/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoproduto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import projetoproduto.dao.ConnectionFactory;
import projetoproduto.model.Produto;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author pedro
 */
public class ProdutoDAO {
    
    ConnectionFactory bd = new ConnectionFactory();
    
    private PreparedStatement pst;
    private Connection cn;
    private ResultSet rs;
    
    public ProdutoDAO(){
       cn = this.bd.conectar();
    }
    
    public void inserirProduto(Produto produto){
        try {
            pst = cn.prepareStatement("insert into produto(statusproduto,nome,descricao,qtd_estoque,estoque_minimo,estoque_maximo,preco_compra,"
                    + "preco_venda,bar_code,ncm,fator,data_cadastro,imagem) "
                    + "               values (?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
            pst.setString(1,produto.getStatusProduto());
            pst.setString(2,produto.getNome());
            pst.setString(3, produto.getDescricao());
            pst.setInt(4, produto.getQtdEstoque());
            pst.setInt(5, produto.getEstoqueMinimo());
            pst.setInt(6, produto.getEstoqueMaximo());
            pst.setDouble(7, produto.getPrecoCompra());
            pst.setDouble(8, produto.getPrecoVenda());
            pst.setString(9, produto.getBarCode());
            pst.setInt(10, produto.getNcm());
            pst.setDouble(11, produto.getFator());
            pst.setString(12, produto.getData());
            pst.setString(13, produto.getImagem());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Cadastro: " + e.getMessage());
        }
        
    }
    
    public void atualizarProduto(Produto produto){
        try {
            pst = cn.prepareStatement("update produto set statusproduto = ?, nome = ?, descricao = ?, qtd_estoque = ?, estoque_minimo = ?, "
                    + "estoque_maximo = ?, preco_compra = ?, preco_venda = ?, bar_code = ?, ncm = ?, fator = ?, data_cadastro = ?, imagem = ? where id = ?"); 

            pst.setString(1,produto.getStatusProduto());
            pst.setString(2,produto.getNome());
            pst.setString(3, produto.getDescricao());
            pst.setInt(4, produto.getQtdEstoque());
            pst.setInt(5, produto.getEstoqueMinimo());
            pst.setInt(6, produto.getEstoqueMaximo());
            pst.setDouble(7, produto.getPrecoCompra());
            pst.setDouble(8, produto.getPrecoVenda());
            pst.setString(9, produto.getBarCode());
            pst.setInt(10, produto.getNcm());
            pst.setDouble(11, produto.getFator());
            pst.setString(12, produto.getData());
            pst.setString(13, produto.getImagem());
            pst.setInt(14, produto.getId());
            JOptionPane.showMessageDialog(null, "Produto Alterado");
            pst.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Alterar: " + e.getMessage());
        }
        
    }
    
    public void desativarProduto(Produto produto){
        try {
            pst = cn.prepareStatement("update produto set statusproduto = ? where id = ?"); 
            pst.setString(1, produto.getStatusProduto());
            pst.setInt(2, produto.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Desativado");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Excluir: " + e.getMessage());
        }
        
    }
    
    public void ativarProduto(Produto produto){
        try {
            pst = cn.prepareStatement("update produto set statusproduto = ? where id = ?"); 
            pst.setString(1, produto.getStatusProduto());
            pst.setInt(2, produto.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Ativado");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Excluir: " + e.getMessage());
        }
        
    }
    
    public void updateDB(JTable table){
        
        try {
            pst = cn.prepareStatement("select * from produto");
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta");
        }
    }
    
    
}
