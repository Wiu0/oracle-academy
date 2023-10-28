/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoproduto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ConnectionFactory {
    
    private Connection connection = null;
    private Statement statement = null;
    

    public Connection conectar() {
        String servidor = "jdbc:mysql://localhost:3306/projetoProduto";
        String usuario = "root";
        String senha = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(servidor, usuario, senha);
            this.statement = this.connection.createStatement();
            
            return this.connection;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro de conexão:" + e.getMessage());
            return null;
        }
       
    }

    public boolean estaConectado() {

        if (this.connection != null) {
            return true;
        } else {
            return false;
        }
    }

    public void desconectar() {
        try {
            this.connection.close();
            System.out.println("Desconectado do Banco de Dados!");
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
    
}
