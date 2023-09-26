package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static Connection conexaoBD = null;
    private String fonte = "Banco_Escola";

    public ConexaoBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexaoBD = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + fonte + "?useTimezone=true&serverTimezone=UTC", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro de classe não encontrada!!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro na conexão com o banco de dados!!!");
        }
    }

    public static Connection getInstance() {
        if (conexaoBD == null) {
            new ConexaoBD();
        }
        return conexaoBD;
    }
}