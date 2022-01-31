package Banco.Modelos;

public class ContaPoupanca extends Conta{
    private String tipo;
    private int numConta;

    public ContaPoupanca(String nomeCliente, int idCliente) {
        super(nomeCliente, idCliente, "Poupança");
        this.tipo = "CP";
        this.numConta = NUMCONTASEQUENCIAL;
    }

    @Override
    public boolean sacar(double valor) {
        if(super.saldo >= valor){
            super.sacar(valor);
        }else{
            System.out.println("\nTransferência não realizada. \nSaldo insuficiente.");
            return false;
        }
        return true;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumConta() {
        return numConta;
    }
}
