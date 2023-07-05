package sistemaRegistroVendas;

import java.time.LocalDate;

public class Venda {

    private  Cliente cliente;
    private Vendedor vendedor;
    private double valorASerPago;
    private LocalDate dataRegistro;

    public Venda(Cliente cliente, Vendedor vendedor, double valorASerPago, LocalDate dataRegistro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorASerPago = valorASerPago;
        this.dataRegistro = LocalDate.now();
    }


    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + cliente.getNome() + " Nome do vendedor responsável: " + vendedor.getNome() + " data da venda: " + dataRegistro.toString();
    }
}
