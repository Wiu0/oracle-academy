package banco_dados;

import java.sql.*;

public class ConexaoSQlite {

	private Connection conn;
	private Statement stm;
	
	public ConexaoSQlite(String arquivo) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
		this.stm = this.conn.createStatement();
	}
	
	
	public void criarTabela() throws SQLException {
		this.stm.executeUpdate("CREATE TABLE parceiro ("
				+ "nome varchar(70) PRIMARY KEY NOT NULL);");
	}
	
	
	public void insert(String nome) {		  
		try {		
			this.stm = conn.createStatement();
		  
			this.stm.executeUpdate("INSERT INTO parceiro VALUES ('"+ nome + "')");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void showAll() {
		System.out.println("Mostrando dados");
		
		ResultSet rs;

		try {
			rs = this.stm.executeQuery("SELECT * FROM parceiro");

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}

			rs.close();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConexaoSQlite con = new ConexaoSQlite("gerandofalcoes.db");
//		System.out.println("Criar tabela");
//		con.criarTabela();
//		System.out.println("Tabela Criada");
//		System.out.println("Inserindo nome");
//		con.insert("Pedro");
//		System.out.println("Inserido nome");
		con.showAll();
	}
}




//INSERT INTO parceiro VALUES (WIU)
