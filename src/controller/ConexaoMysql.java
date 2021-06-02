
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql {
    
    public Connection conectar;

    static String host = "localhost"; // local onde ele vai conectar, onde está o bd - servidor
    static String database = "livraria"; // base de dados
    static String usuario = "root";
    static String senha = "pcpa1343";
    static String url = "jdbc:mysql://" + host + "/" + database;

    public ConexaoMysql() {
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver OK!!!");

            conectar = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão OK!!!");

        } catch (ClassNotFoundException exc) {
            System.out.println("Erro no driver " + exc.getMessage());
        } catch (SQLException exc) {
            System.out.println("Erro de conexao =" + exc.getMessage());
        }
    }

    public void Fechar_Conexao() {
        try {
            conectar.close();

        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
    }
    
}
