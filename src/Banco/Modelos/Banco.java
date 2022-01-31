package Banco.Modelos;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private Integer numeroBanco;

    protected List<Cliente> listaClientes;

    public Banco() {
        this.nomeBanco = "Banco da Praça";
        this.numeroBanco = 999;
        listaClientes = new ArrayList<>();
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void addClientes(Cliente listaClientes) {
        this.listaClientes.add(listaClientes);
    }

    public Integer getNumeroBanco() {
        return numeroBanco;
    }

    @Override
    public String toString() {
        String tela = "Clientes.\n";
        for (Cliente cliente: listaClientes) {
            tela += "Nome: " + cliente.getNomeTitular() + "  ID: " +cliente.getIdCliente() +"\n";
        }
        return tela;
    }
}
