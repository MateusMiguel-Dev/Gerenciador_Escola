package pacote_usuarios;
import pacote_classes_abstratas.Pessoa;

public class Aluno extends Pessoa{
    private String RA;
    private float IRA;

    public String getRA() {
        return RA;
    }
    public void setRA(String RA) {
        this.RA = RA;
    }
    public float getIRA() {
        return IRA;
    }
    
    public void setIRA(float IRA) {
        this.IRA = IRA;
    }
    //CONSTRUTOR COM SUPER
    public Aluno(String RA1, float IRA1, String nome, String cpf, String data_Nasc, String telefone) {
        super(nome, cpf, data_Nasc, telefone);
        RA = RA1;
        IRA = IRA1;
    }   
}
