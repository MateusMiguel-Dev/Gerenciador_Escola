package pacote_usuarios;
import pacote_classes_abstratas.Funcionario;

public class TecAdmin extends Funcionario{
    private String dpto;

        public String getDpto() {
            return dpto;
        }
        public void setDpto(String dpto) {
            this.dpto = dpto;
        }
        public TecAdmin(String cod_Funcional, String dpto, String nome, String cpf, String data_Nasc, String telefone) {
            super(cod_Funcional, nome, cpf, data_Nasc, telefone);
            this.dpto = dpto;
        }
}
