package pacote_classes_abstratas;

public abstract class Funcionario extends Pessoa{
    private String cod_Funcional;

        public String getCod_Funcional() {
            return cod_Funcional;
        }

        public void setCod_Funcional(String cod_Funcional) {
            this.cod_Funcional = cod_Funcional;
        }

        public Funcionario(String cod_Funcional, String nome, String cpf, String data_Nasc, String telefone) {
            super(nome, cpf, data_Nasc, telefone);
            this.cod_Funcional = cod_Funcional;
        }
}
