package sistemaRegistroVendas;

public class Vendedor extends Pessoa{
    public Vendedor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    @Override
    public String toString() {
        return "nome do vendedor: " + this.getNome() + " email do vendedor: " + this.getEmail();
    }
}
