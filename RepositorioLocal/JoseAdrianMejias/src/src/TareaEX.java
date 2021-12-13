package src;
import java.util.Scanner;
public class TareaEX {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = reader.nextInt();
		if(numero%2==0) {
		System.out.println("El número es par");
		} else {
		System.out.println("El número es impar");
		}
		reader.close();
	}

}
