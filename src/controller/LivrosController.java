
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.LivroModel;

public class LivrosController {
    
    ConexaoMysql conectar = new ConexaoMysql();
    
    public void salvar (LivroModel livros){
        
        try {
            conectar.conectar();
            
            PreparedStatement stmt = conectar.conectar.prepareStatement(
                    "INSERT INTO livro (nome, autor, preco, categoria) "
                            + "VALUES (?,?,?,?)" );
            stmt.setString(1, livros.getNome());
            stmt.setString(2, livros.getAutor());
            stmt.setDouble(3, livros.getPreco());
            stmt.setString(4, livros.getCategoria());            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro Realizado!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados" + e.getMessage(), "Cadastro de Livros", 0);
        }
    }
            
    
}
