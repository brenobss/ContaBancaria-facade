package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Fachada;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Fachada fachada = new Fachada(sc);
	
	fachada.criarConta();
	
	fachada.depositar();
	fachada.sacar();
	fachada.verificarSaldo();
	
	sc.close();
    }

}
