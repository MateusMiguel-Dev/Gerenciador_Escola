package dao;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static pacote_classes_abstratas.Pessoa.idade_atual;
import pacote_usuarios.Professor;
import pacote_usuarios.TecAdmin;


public class TecAdminDAO {
    public static void cadastrar(TecAdmin tec){
        PreparedStatement sql;
        try{
        sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
        ("insert into tecadmin(cod, departamento, nome, cpf, dataNasc, telefone) values (?,?,?,?,?,?)");
        //sql.setInt(1,p.getCod());
        sql.setString(1,tec.getCod_Funcional());
        sql.setString(2,tec.getDpto());
        sql.setString(3,tec.getNome());
        sql.setString(4,tec.getCpf());
        sql.setString(5,tec.getData_Nasc());
        sql.setString(6,tec.getTelefone());
        sql.execute();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
    }
    
    public static void consultar(String Cod){
        try {
            PreparedStatement sql = ConexaoBD.getInstance().prepareStatement("SELECT * FROM tecadmin WHERE cod = ?");
            sql.setString(1, Cod);
            ResultSet rs = sql.executeQuery();
            if (rs.next()) {
                TecAdmin tec = new TecAdmin(null, null, null, null, null, null);
                tec.setCod_Funcional(rs.getString("cod"));
                tec.setDpto(rs.getString("departamento"));
                tec.setNome(rs.getString("nome"));
                tec.setCpf(rs.getString("cpf"));
                tec.setData_Nasc(rs.getString("dataNasc"));
                tec.setTelefone(rs.getString("telefone"));
                JOptionPane.showMessageDialog(null,"Cod: " + tec.getCod_Funcional() + "\nDepartamento: " + tec.getDpto() + "\nNome: " + tec.getNome() + "\nCPF: " + tec.getCpf() + "\nData Nascimento: " + tec.getData_Nasc() + "\nTelefone: " + tec.getTelefone() + "\nIdade Atual:" + idade_atual(tec.getData_Nasc()));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum Técnico Admnistrativo encontrado com o código: " + Cod);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static boolean pesquisa(String Cod){
        PreparedStatement sql;
        boolean resultado = false;
        try{    
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("SELECT * FROM tecadmin WHERE cod = ?");
            sql.setString(1, Cod);
            ResultSet rs = sql.executeQuery();
            resultado = rs.next();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
        return resultado;
    }
    public static void alterar(TecAdmin tec, String Cod){
        PreparedStatement sql;
        try{
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("update tecadmin set cod=?, departamento=?, nome=?, cpf=?, dataNasc=?, telefone=? where cod=?");
            sql.setString(1,tec.getCod_Funcional());
            sql.setString(2,tec.getDpto());
            sql.setString(3,tec.getNome());
            sql.setString(4,tec.getCpf());
            sql.setString(5,tec.getData_Nasc());
            sql.setString(6,tec.getTelefone());
            sql.setString(7,Cod);
            sql.execute();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
    }
   
        public static void excluir(String Cod){
        PreparedStatement sql;
        try{
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("delete from tecadmin where cod=?");
            sql.setString(1, Cod);
            sql.execute();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
    }

}
