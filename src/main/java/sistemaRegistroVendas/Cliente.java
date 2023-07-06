package sistemaRegistroVendas;

public class Cliente extends Pessoa{
    public Cliente(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    @Override
    public String toString() {
        return " nome do cliente: " + this.getNome() + " Email do cliente: " + this.getEmail();
    }
}
