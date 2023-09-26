package dao;
import conexao.ConexaoBD;
import pacote_usuarios.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static pacote_classes_abstratas.Pessoa.idade_atual;

public class AlunoDAO {
    public static void cadastrar(Aluno aluno){
        PreparedStatement sql;
        try{
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("insert into aluno(RA, IRA, nome, cpf, dataNasc, telefone) values (?,?,?,?,?,?)");
            sql.setString(1,aluno.getRA());
            sql.setFloat(2,aluno.getIRA());
            sql.setString(3,aluno.getNome());
            sql.setString(4,aluno.getCpf());
            sql.setString(5,aluno.getData_Nasc());
            sql.setString(6,aluno.getTelefone());
            sql.execute();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
    }
    
    public static void consultar(String RA) {
    try {
        PreparedStatement sql = ConexaoBD.getInstance().prepareStatement("SELECT * FROM aluno WHERE RA = ?");
        sql.setString(1, RA);
        ResultSet rs = sql.executeQuery();

        if (rs.next()) {
            Aluno aluno = new Aluno(null, 0, null, null, null, null);
            aluno.setRA(rs.getString("RA"));
            aluno.setIRA(rs.getFloat("IRA"));
            aluno.setNome(rs.getString("nome"));
            aluno.setCpf(rs.getString("cpf"));
            aluno.setData_Nasc(rs.getString("dataNasc"));
            aluno.setTelefone(rs.getString("telefone"));
            JOptionPane.showMessageDialog(null,"RA: " + aluno.getRA() + "\nIRA: " + aluno.getIRA() + "\nNome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf() + "\nData Nascimento: " + aluno.getData_Nasc() + "\nTelefone: " + aluno.getTelefone() + "\nIdade Atual:" + idade_atual(aluno.getData_Nasc()));
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum aluno encontrado com o RA: " + RA);
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    }
}

    public static boolean pesquisa(String RA){
        PreparedStatement sql;
        boolean resultado = false;
        try{    
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("SELECT * FROM aluno WHERE RA = ?");
            sql.setString(1, RA);
            ResultSet rs = sql.executeQuery();
            resultado = rs.next();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
        return resultado;
    }
    public static void alterar(Aluno aluno, String RA){
        PreparedStatement sql;
        try{
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("update aluno set RA=?, IRA=?, nome=?, cpf=?, dataNasc=?, telefone=? where RA=?");
            sql.setString(1,aluno.getRA());
            sql.setFloat(2,aluno.getIRA());
            sql.setString(3,aluno.getNome());
            sql.setString(4,aluno.getCpf());
            sql.setString(5,aluno.getData_Nasc());
            sql.setString(6,aluno.getTelefone());
            sql.setString(7, RA);
            sql.execute();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
    }
   
        public static void excluir(String RA){
        PreparedStatement sql;
        try{
            sql=(PreparedStatement) ConexaoBD.getInstance().prepareStatement
            ("delete from aluno where RA=?");
            sql.setString(1,RA);
            sql.execute();
        }
        catch(SQLException ex) {
          System.out.println(ex);
        }
    }

    
}
