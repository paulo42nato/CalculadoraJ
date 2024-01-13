package br.com.CalculadoraJ;
import java.util.Scanner;
public class Menu {



	Scanner sc = new Scanner(System.in);
	Operacao operacao = new Operacao();
	int esc;
	
	public void escolha() {
		System.out.println("Bem vindo a calculadora do iniciante! \n escolha uma opção: \n 1 = somar \n 2 = subtrair \n 3 = multiplicar \n 4 = dividir \n 5 = sair");
		esc = this.sc.nextInt();
		if(esc == 1) {
			operacao.somar(0,0, 0);
		}
		if(esc == 2) {
			operacao.subtrair(0,0, 0);
		}
		if(esc == 3) {
			operacao.multiplicar(0,0, 0);
		}
		if(esc == 4) {
			operacao.dividir(0,0, 0);
		}
		if(esc == 5) {
			System.exit(0);
		}
	}


	}



