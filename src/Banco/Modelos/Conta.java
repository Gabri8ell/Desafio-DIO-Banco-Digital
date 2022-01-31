package Banco.Modelos;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta extends Banco{

    private final int numAgencia = 1;//Número da agência
    protected static int NUMCONTASEQUENCIAL = 0; //Gerador do Número da Conta

    protected int idTitular;
    protected String nomeTitular;
    protected float saldo;
    //private Cliente cliente;
    protected String tipoConta;

    private List<String> movimentacoes; //Armazena dados para imprimir o extrato

    public Conta(String nomeCliente, int idCliente, String tipoConta) {
        this.tipoConta = tipoConta;
        this.saldo = 0;
        NUMCONTASEQUENCIAL++;
        this.idTitular = idCliente;
        this.nomeTitular = nomeCliente;
        movimentacoes = new ArrayList<>();
    }

    public boolean sacar(double valor){
        this.saldo -= valor;
        movimentacoes.add(" -" + valor + "S");


        return true;
    }

    public void depositar(double valor){
        this.saldo += valor;
        movimentacoes.add(" +" + valor + "D");
    }

    public void transferir(double valor, Conta dest){
        if(this.sacar(valor)){
            dest.depositar(valor);
        }
    }

    public int getAgencia() {
        return numAgencia;
    }

    public double getSaldo() {
        System.out.println(cabecalho());
        System.out.println("Saldo");
        return saldo;
    }

    public String visualizarExtrato(){
        System.out.println(cabecalho());
        System.out.println("\nMovimentações");
        return this.movimentacoes.toString();
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public String cabecalho(){
        String cabecalho = "\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
        cabecalho += getNomeBanco() + "  ";
        cabecalho += "Número: " + getNumeroBanco() + "  ";
        cabecalho += "Agência: " + this.numAgencia + "  \n";
        cabecalho += "Titular: " + this.nomeTitular + " ";
        cabecalho += "  Conta " + this.tipoConta + "\n";

        return cabecalho;
    }

}
