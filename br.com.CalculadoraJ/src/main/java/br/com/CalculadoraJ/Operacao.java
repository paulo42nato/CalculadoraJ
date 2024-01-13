package br.com.CalculadoraJ;
import java.util.Scanner;

public class Operacao  {

		Scanner sc = new Scanner(System.in);
		
		public void somar(int num1, int num2, int rs) {
			System.out.println("Digite um valor");
			num1 = sc.nextInt();
			System.out.println("Digite outro valor");
			num2 = sc.nextInt();
			
			rs = num1+num2;
			System.out.println("O resultado e: "+rs);
				
			}
			
		public void subtrair(int num1, int num2, int rs) {
			System.out.println("Digite um valor");
			num1 = sc.nextInt();
			System.out.println("Digite outro valor");
			num2 = sc.nextInt();
			
			rs = num1-num2;
			System.out.println("O resultado e: "+rs);
				
			}
		public void multiplicar(int num1, int num2, int rs) {
			System.out.println("Digite um valor");
			num1 = sc.nextInt();
			System.out.println("Digite outro valor");
			num2 = sc.nextInt();
			
			rs = num1*num2;
			System.out.println("O resultado e: "+rs);
				
			}
		public void dividir(int num1, int num2, int rs) {
			System.out.println("Digite um valor");
			num1 = sc.nextInt();
			System.out.println("Digite outro valor");
			num2 = sc.nextInt();
			
			rs = num1/num2;
			System.out.println("O resultado e: "+rs);
				
			}
		}




