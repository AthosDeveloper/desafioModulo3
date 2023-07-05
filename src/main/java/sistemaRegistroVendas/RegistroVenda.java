package sistemaRegistroVendas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroVenda {
Pessoa pessoa;

List<Cliente> clientes = new ArrayList<>();
List<Vendedor> vendedores = new ArrayList<>();
    List<Pessoa> pessoas = new ArrayList<>();

    List<Venda> vendas = new ArrayList<>();
    Cliente joao = new Cliente("joão", "joao@gmail.com", "722.982.120-74");
    Vendedor maria = new Vendedor("maria", "mariaClara@gmail.com", "743.678.900-74");
    Venda venda1 = new Venda(joao, maria, 100.0, LocalDate.now());

    public void adicionarCliente(Cliente cliente){

        if (cliente.validarEmail(cliente.getEmail()) && !verificarCadastro(cliente.getCpf())) {
            this.clientes.add(cliente);
this.pessoas.add(cliente);
            System.out.println("cliente cadastrado");
        } else {
            throw new IllegalStateException("email ou cpf inválido!");

        }
    }

    public void adicionarVendedor(Vendedor vendedor){
        if (vendedor.validarEmail(vendedor.getEmail()) && !verificarCadastro(vendedor.getCpf())) {

            this.vendedores.add(vendedor);
       this.pessoas.add(vendedor);
            System.out.println("vendedor cadastrado");
        } else {


            throw new IllegalStateException("não foi possível cadastrar esse vendedor");
        }
    }





            public void listarClientesCadastrados(Cliente cliente){
                for (Venda venda: vendas){
                   if (venda.getCliente().equals(cliente)){
                       System.out.println("nome do cliente: " + cliente.getNome() + " email do cliente: " + cliente.getEmail());
                   }

                }

                    }
             public void listarCompra(Vendedor vendedor){
                 System.out.println("Vendas do vendedor " + vendedor.getNome() + ":");
                 for (Venda venda: vendas){
                     if (venda.getVendedor().equals(vendedor)){
                         System.out.println("cliente: " + venda.getCliente().getNome());
                         System.out.println("valor: " + venda.getValorASerPago());
                         System.out.println("data: " + venda.getDataRegistro());
                         System.out.println();

                     } else {
                         System.out.println("vendedor não cadastrado!");
                     }
                }
            }

public boolean verificarCadastro(String cpf){
        for (Pessoa pessoa2: pessoas){
            if (pessoa2.getCpf().equals(cpf)){
                return  true;
                }
            }
        return  false;
}
public void adicionarVenda(Venda venda){

if (!verificarCadastro(venda.getCliente().getCpf()) && !verificarCadastro(venda.getVendedor().getCpf())){


    vendas.add(venda);

    System.out.println("venda cadastrada com sucesso!");
}
}

        public void listarVendas() {

            for (Venda v : vendas) {
                System.out.println("nome do cliente: " + v.getCliente().getNome());
                System.out.println("vendedor responsável: " + v.getVendedor().getNome());
                System.out.println("valor da venda: " + v.getValorASerPago());
                System.out.println("data da venda: " + v.getDataRegistro());
            }
}

    public void listarClienteCadastrado(){
        System.out.println("Clientes cadastrados:");

        for (Cliente c: clientes){
            System.out.println("nome do cliente: " + c.getNome());
            System.out.println("email do cliente: " + c.getEmail());

            System.out.println();
        }

    }

        public void listarVendedorCadastrado(){
            System.out.println("vendedores cadastrados:");
        for (Vendedor vendedor: vendedores){
            System.out.println("Nome do vendedor: " + vendedor.getNome());
            System.out.println("Email do vendedor: " + vendedor.getEmail());
            System.out.println("cpf do vendedor: " + vendedor.getCpf());

        }

    }
    public Cliente buscarCliente (String cpf){
        for (Cliente cliente: clientes){
            if (cliente.getCpf().equals(cpf)){
                return  cliente;
            }
        }
return  null;
    }
    public Vendedor buscarVendedorEmail(String email){
        for (Vendedor vendedor: vendedores){
            if (vendedor.getEmail().equals(email)){
                return  vendedor;
            }

        }
return  null;
    }
    public Vendedor buscarVendedorCpf(String cpf){
        for (Vendedor vendedor: vendedores){
            if (vendedor.getCpf().equals(cpf)){
                return  vendedor;
            }
        }
        return null;
    }

    }
