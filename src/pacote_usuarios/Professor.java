package pacote_usuarios;
import pacote_classes_abstratas.Funcionario;

public class Professor extends Funcionario{
    private String Area_At;
        public String getArea_At() {
            return Area_At;
        }
        public void setArea_At(String Area_At) {
            this.Area_At = Area_At;
        }
        //CONSTRUTOR COM SUPER
        public Professor(String cod_Funcional, String Area_At, String nome, String cpf, String data_Nasc, String telefone) {
            super(cod_Funcional, nome, cpf, data_Nasc, telefone);
            this.Area_At = Area_At;
        }
}
