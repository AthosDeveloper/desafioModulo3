package sistemaRegistroVendas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
public Pessoa(){

}
    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public boolean validarEmail(String email) {

        return getEmail().matches("\\w+@\\w+\\.\\w+");
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
