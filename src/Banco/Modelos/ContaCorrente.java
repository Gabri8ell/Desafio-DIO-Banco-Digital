package Banco.Modelos;

public class ContaCorrente extends Conta{
    private String tipo;
    private int numConta;

    public ContaCorrente(String nomeCliente, int idCliente) {
        super(nomeCliente, idCliente, "Corrente");
        this.tipo = "CC";
        this.numConta = NUMCONTASEQUENCIAL;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumConta() {
        return numConta;
    }

}
