import java.util.Random;
import java.util.Scanner;


public class Practica1 {

	
	public static void main(String[] args) {
		// Crear un Arreglo de 30 posiciones con numeros entre el 15 y el 30 aleatoriamente
		int[] a = new int[30];
		
		Random r = new Random();
		
		for(int i=0; i<30; i++){
			a[i] = r.nextInt (15) + 15;
			System.out.print(a[i]+",");
		}

	}
	
//Capturar el valor de un articulo, calcular el IVA y mostrar el precio total
System.out.printIn("\nPROGRAMA PARA CALCULAR IVA");

double precio, iva, total;
precio = sc.nextDouble(;)
Scanner sc =new Scanner(System.in);


