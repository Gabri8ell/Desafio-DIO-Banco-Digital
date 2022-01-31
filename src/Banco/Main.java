package Banco;

import Banco.Modelos.Banco;
import Banco.Modelos.Cliente;

public class Main {
    public static void main(String[] args) {
        Banco bdp = new Banco();
        Cliente gabriel = new Cliente("Gabriel");
        Cliente mariana = new Cliente("Mariana");
        Cliente barbara = new Cliente("Barbara");
        //Adiciona clientes à lista de clientes do banco
        bdp.addClientes(gabriel);
        bdp.addClientes(mariana);
        bdp.addClientes(barbara);
        //Cria as contas poupanças
        gabriel.abrirConta("Poupança");
        mariana.abrirConta("Poupança");
        barbara.abrirConta("Poupança");
        //Faz depósito
        gabriel.getConta(0).depositar(200.00);
        mariana.getConta(0).depositar(500.00);
        barbara.getConta(0).depositar(800.00);
        //Imprime o saldo das contas poupanças
        System.out.println(gabriel.getConta(0).getSaldo());
        System.out.println(mariana.getConta(0).getSaldo());
        System.out.println(barbara.getConta(0).getSaldo());

        //Abre Conta Corrente e faz depósito
        gabriel.abrirConta("Corrente");
        gabriel.getConta(1).depositar(500.00);

        //Realiza a transferência e Imprime o saldo
        gabriel.getConta(0).transferir(550.00, gabriel.getConta(1) );
        System.out.println(gabriel.getConta(0).getSaldo());
        //Realiza a transferência e Imprime o saldo
        gabriel.getConta(1).transferir(550.00, gabriel.getConta(0) );
        System.out.println(gabriel.getConta(1).getSaldo());
        //Imprime o extrato das contas
        System.out.println(gabriel.getConta(0).visualizarExtrato());
        System.out.println(gabriel.getConta(1).visualizarExtrato());
        System.out.println(mariana.getConta(0).visualizarExtrato());
        System.out.println(barbara.getConta(0).visualizarExtrato());
        //imprime Lista de clientes do Banco
        System.out.println(bdp);





    }
}
