package sistemaRegistroVendas;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroVenda registro = new RegistroVenda();
        int opcao = 1;
        while (opcao != 0) {
            System.out.println("menu de opções");
            System.out.println("1 - cadastrar cliente: ");
            System.out.println("2 - cadastrar vendedor");
            System.out.println("3 - cadastrar venda.");
            System.out.println("4 - listar clientes cadastrados");
            System.out.println("5 - listar vendedores cadastrados");
            System.out.println("6 - listar vendas");
            System.out.println("7 - pesquisar nome de um cliente pelo cpf");
            System.out.println("8 -  pesquisar o nome de um vendedor por email");
            System.out.println("0, sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {

                case 1:

                    System.out.println("digite o nome do cliente");
                    String nomeCliente = sc.next();
                    System.out.println("digite o email do cliente: ");
                    String emailCliente = sc.next();
                    System.out.println("digite o cpf do cliente: ");
                    String cpfCliente = sc.next();
                    Cliente cliente = new Cliente(nomeCliente, emailCliente, cpfCliente);
                    registro.adicionarCliente(cliente);
                    break;
                case 2:


                    System.out.println("digite o nome do vendedor: ");
                    String nomeVendedor = sc.next();
                    System.out.println("digite o email do vendedor: ");
                    String emailVendedor = sc.next();
                    System.out.println("digite o cpf do vendedor: ");
                    String cpfVendedor = sc.next();
                    Vendedor vendedor = new Vendedor(nomeVendedor, emailVendedor, cpfVendedor);
                    registro.adicionarVendedor(vendedor);


                    break;
                case 3:
                    System.out.println("digite o cpf do cliente: ");
                    String clienteCpf = sc.nextLine();
                    System.out.println("digite o cpf do vendedor: ");
                    String vendedorCpf = sc.nextLine();
                    if (!registro.verificarCadastro(clienteCpf) && !registro.verificarCadastro(vendedorCpf)) {
                        System.out.println("cliente ou vendedor não cadastrado!");
                        break;
                    }
                    Cliente clienteVenda = registro.buscarCliente(clienteCpf);
                    Vendedor vendedorVenda = registro.buscarVendedorCpf(vendedorCpf);
                    System.out.println("digite o valor da venda: ");

                    double valorVenda = sc.nextDouble();
                    sc.nextLine();
                    Venda venda = new Venda(clienteVenda, vendedorVenda, valorVenda, LocalDate.now());
                    registro.adicionarVenda(venda);
                    System.out.println("venda cadastrada com sucesso!");
                    break;
                case 4:
                    registro.listarClienteCadastrado();

                    break;
                case 5:

                    registro.listarVendedorCadastrado();
                    break;
                case 6:

                    registro.listarVendas();
                    break;
                case 7:
                    System.out.println("digite o cpf do cliente: ");
                    String cpfBuscaCliente = sc.next();
                    Cliente clienteBuscado = registro.buscarCliente(cpfBuscaCliente);
                    if (clienteBuscado != null) {
                        registro.listarClientesCadastrados(clienteBuscado);
                    } else {
                        System.out.println("cliente não cadastrado!");
                    }
                    break;
                case 8:

                    System.out.println("digite o email do vendedor: ");
                    String buscaEmailVendedor = sc.next();
                    Vendedor buscarVendedorEmail = registro.buscarVendedorEmail(buscaEmailVendedor);
                    if (buscarVendedorEmail != null) {
                        registro.listarVendedorCadastrado();
                    } else {
                        System.out.println("vendedor não cadastrado!");
                    }
                    break;
                    case  0:

                    System.out.println("obrigado por participar do cadastro de vendas!");
break;
                default:
                    System.out.println("opção inválida!");
            }
        }
            sc.close();
        }


    }

