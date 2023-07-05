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
        if (cliente.validarEmail(cliente.getEmail()) && autenticarCpf(cliente.getCpf()) && !verificarCadastro(cliente.getCpf())) {
            clientes.add(cliente);
            System.out.println("cliente cadastrado");
        } else {
            System.out.println("email ou cpf inválido!");
        }
    }
    public void adicionarVendedor(Vendedor vendedor){
        if (vendedor.validarEmail(vendedor.getEmail()) && !verificarCadastro(vendedor.getCpf())){
            vendedores.add(vendedor);
        } else {
            System.out.println("email inválido!");
        }
    }
    public boolean autenticarCpf(String cpf){
        for (Pessoa p: pessoas){
            if (p.getCpf().equals(cpf)){
                return  true;
            }
        }
return false;
    }

    public void verificarRegistro(){
        if (autenticarCpf(joao.getCpf()) && autenticarCpf(maria.getCpf())){
            this.vendas.add(venda1);
        } else {
            System.out.println("cliente ou vendedor não cadastrados!");

        }



            }

            public void listarCompras(Cliente cliente){
                System.out.println("compras do cliente " + cliente.getNome() + ":");
                for (Venda venda: vendas){
                   if (venda.getCliente().equals(cliente)){
                       System.out.println(venda.toString());
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
        vendas.add(venda);
}

public void listarVendas() {

    for (Venda v : vendas) {
        System.out.println(v.toString());


    }
}

    public void listarClienteCadastrado(){
        System.out.println("Clientes cadastrados:");

        for (Cliente c: clientes){
            System.out.println("nome do cliente: " + c.getNome());
            System.out.println("email do cliente: " + c.getEmail());
            System.out.println("cpf do cliente: " + c.getCpf());
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
