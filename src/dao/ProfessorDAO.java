package dao;
import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static pacote_classes_abstratas.Pessoa.idade_atual;
import pacote_usuarios.Professor;

public class ProfessorDAO {
    public static void cadastrar(Professor prof){
        PreparedStatement sql;
        try{
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("insert into professor(cod, area, nome, cpf, dataNasc, telefone) values (?,?,?,?,?,?)");
            sql.setString(1,prof.getCod_Funcional());
            sql.setString(2,prof.getArea_At());
            sql.setString(3,prof.getNome());
            sql.setString(4,prof.getCpf());
            sql.setString(5,prof.getData_Nasc());
            sql.setString(6,prof.getTelefone());
            sql.execute();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
    }
    public static void consultar(String Cod){
        try {
            PreparedStatement sql = ConexaoBD.getInstance().prepareStatement("SELECT * FROM professor WHERE cod = ?");
            sql.setString(1, Cod);
            ResultSet rs = sql.executeQuery();
            if (rs.next()) {
                Professor prof = new Professor(null, null, null, null, null, null);
                prof.setCod_Funcional(rs.getString("cod"));
                prof.setArea_At(rs.getString("area"));
                prof.setNome(rs.getString("nome"));
                prof.setCpf(rs.getString("cpf"));
                prof.setData_Nasc(rs.getString("dataNasc"));
                prof.setTelefone(rs.getString("telefone"));
                JOptionPane.showMessageDialog(null,"Cod: " + prof.getCod_Funcional() + "\nArea: " + prof.getArea_At() + "\nNome: " + prof.getNome() + "\nCPF: " + prof.getCpf() + "\nData Nascimento: " + prof.getData_Nasc() + "\nTelefone: " + prof.getTelefone() + "\nIdade Atual:" + idade_atual(prof.getData_Nasc()));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum professor encontrado com o código: " + Cod);
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
            ("SELECT * FROM professor WHERE cod = ?");
            sql.setString(1, Cod);
            ResultSet rs = sql.executeQuery();
            resultado = rs.next();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
        return resultado;
    }
    public static void alterar(Professor prof, String Cod){
        PreparedStatement sql;
        try{
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("update professor set cod=?, area=?, nome=?, cpf=?, dataNasc=?, telefone=? where cod=?");
            sql.setString(1,prof.getCod_Funcional());
            sql.setString(2,prof.getArea_At());
            sql.setString(3,prof.getNome());
            sql.setString(4,prof.getCpf());
            sql.setString(5,prof.getData_Nasc());
            sql.setString(6,prof.getTelefone());
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
            ("delete from professor where cod=?");
            sql.setString(1,Cod);
            sql.execute();
        }
        catch(SQLException ex) {
        System.out.println(ex);
        }
    }
}
