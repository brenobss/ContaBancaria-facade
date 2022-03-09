package entities;

import java.util.Scanner;

public class Fachada {
    private Cliente cliente;
    private ContaBancaria conta;
    private Scanner sc;
    
    public Fachada(Scanner sc) {
	this.cliente = new Cliente();
	this.conta = new ContaBancaria();
	this.sc = sc;
    }
    
    public void criarConta() {
	System.out.println("===== Criar nova conta =====");
	System.out.print("Digite o nome do cliente: ");
	cliente.setNome(sc.nextLine());
	System.out.print("Digite o país de origem do cliente: ");
	cliente.setNaturalidade(sc.nextLine());
	System.out.print("Digite o estado do cliente: ");
	cliente.setEstado(sc.nextLine());
	System.out.print("Digite a cidade do cliente: ");
	cliente.setMunicipio(sc.nextLine());
	conta.setCliente(cliente);
	System.out.print("Agora digite o número de conta desejado: ");
	conta.setNumConta(sc.nextInt());
	System.out.println("Conta criada com sucesso!");
    }
    
    public void sacar() {
	System.out.print("Digite o valor que deseja sacar: ");
	conta.sacar(sc.nextDouble());
	System.out.println("==== Novo saldo ====");
	System.out.println(String.format("%.2f", conta.getSaldo()));
    }
    
    public void depositar() {
	System.out.print("Digite o valor que deseja depositar: ");
	conta.depositar(sc.nextDouble());
	System.out.println("==== Novo saldo ====");
	System.out.println(String.format("%.2f", conta.getSaldo()));
    }
    
    public void verificarSaldo() {
	System.out.println("==== Saldo atual ====");
	System.out.println(String.format("%.2f", conta.getSaldo()));
    }
    
    
}
