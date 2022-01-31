package Banco.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static int GERAR_ID_TITULAR = 0;

    protected String nomeTitular;
    private int idCliente;
    private List<Conta> conta;


    public Cliente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        GERAR_ID_TITULAR++;
        idCliente = GERAR_ID_TITULAR;
        conta = new ArrayList<>();

    }

    protected Cliente() {

    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public int getIdCliente() {
        return this.idCliente;
    }


    public void abrirConta(String tipoConta) {

        if(tipoConta.equalsIgnoreCase("Poupança")){
            conta.add(new ContaPoupanca(this.getNomeTitular(), this.getIdCliente()));
        }else if(tipoConta.equalsIgnoreCase("Corrente")){
            conta.add(new ContaCorrente(this.getNomeTitular(), this.getIdCliente()));
        }else{
            System.out.println("Tipo de conta inválida.");
        }

    }

    public Conta getConta(int index) {

        return this.conta.get(index);
    }

}
