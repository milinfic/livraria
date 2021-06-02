
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ClienteModel;

public class ClienteController {
    
    ConexaoMysql conectar = new ConexaoMysql();
    
    public void salvar(ClienteModel dados){
        try {
            conectar.conectar();
            
            PreparedStatement stmt = conectar.conectar.prepareStatement(
                "INSERT INTO cliente (cpf, nome, endereco, telefone) "
                        + "values (?,?,?,?)");
            
            stmt.setString(1, (dados.getCpf()));
            stmt.setString(2, (dados.getNome()));
            stmt.setString(3, (dados.getEndereco()));
            stmt.setString(4, (dados.getTelefone()));
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro Realizado!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados" + e.getMessage(), "Cadastro de Cliente", 0);
        }
    }
    
}
