package pacote_classes_abstratas;
import static java.lang.Character.digit;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public abstract class Pessoa{
    private String nome;
    private String cpf;
    private String data_Nasc;
    private String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_Nasc() {
        return data_Nasc;
    }

    public void setData_Nasc(String data_Nasc) {
        this.data_Nasc = data_Nasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa(String nome, String cpf, String data_Nasc, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_Nasc = data_Nasc;
        this.telefone = telefone;
    }
    public static boolean CPF_Numerico(String cpf){
        String digitos = "0123456789";
        for(int i = 0; i <cpf.length(); i++){
            if(digitos.indexOf(cpf.charAt(i)) == -1) return true;
        }
        return false;
    }
    public static boolean CPF_N_Iguais(String cpf){
        int i;
        char[] charCpf = cpf.toCharArray();
        for(i = 1; i < cpf.length(); i++)
            if(charCpf[i]!= charCpf[0]) return false;
        return true;
    }
    public static int validaCPF(String cpf){
        int i;
        int soma=0;
        int resto=0;
        int digitoGerado1, digitoGerado2;
        char[] charCpf;
        if(cpf.length() != 11) return 1;
        else if(CPF_Numerico(cpf)) return 1;
        else if(CPF_N_Iguais(cpf)) return 1;
        else{
        charCpf = cpf.toCharArray();
        //Gerando o 1º dígito verificador
        for(i = 0; i < cpf.length()-2; i++)
            soma += digit(charCpf[i], 10)*(10-i);
        resto = soma % 11;
        if(resto < 2) digitoGerado1 = 0;
        else digitoGerado1 = 11 - resto;
        //Gerando o 2º dígito verificador
        soma = 0;
        for(i = 0; i < cpf.length()-2; i++)
            soma += digit(charCpf[i], 10)*(11-i);
        soma += digitoGerado1 * 2;
        resto = soma % 11;
        if(resto < 2) digitoGerado2 = 0;
        else digitoGerado2 = 11 - resto;
        if((digit(charCpf[9], 10) != digitoGerado1) || (digit(charCpf[10], 10) != digitoGerado2))
            return 1;
        }
        return 0;
    }
    public static int idade_atual(String data){
        String[] aux = data.split("/");
        int dia_aux = Integer.parseInt(aux[0]);
        int mes_aux = Integer.parseInt(aux[1]);
        int ano_aux = Integer.parseInt(aux[2]);
        LocalDate nasc = LocalDate.of(ano_aux, mes_aux, dia_aux);
        LocalDate data_atual = LocalDate.now();      
        Period tempo = Period.between(nasc, data_atual);
        return tempo.getYears();
    }
}
