package repaso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Ejercicios {
	private static void subrayado(String enunciado) {
		System.out.printf("%n%s%n", enunciado);
		System.out.printf("%s%n", "-".repeat(enunciado.length()));
	}
	public static void main(String[] args) {
		
//	1. Bucle de 1 a 10 separados por guiones excepto en el último caso
		subrayado("1. Bucle de 1 a 10 separados por guiones excepto en el último caso");
		
		subrayado("Una forma");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i < 10 ? i + "-": i);
		}
		
		subrayado("Otra forma");	
		for (int i = 1; i <= 10; i++) {
			if(i < 10) {
				System.out.print(i + "-");
			}else {
				System.out.print(i);
			}
		}
		
		subrayado("Otra forma");
		int tamaño = 10;
		for (int i = 1; i <= tamaño; i++) {
			System.out.print(i < tamaño ? i + "-" : i);
		}
		
		subrayado("Forma Javi");
		for(int i=1; i <= 10;i++) {
			System.out.print(i);
			System.out.print(i != 10 ? "-": "");		
		}
		
	   System.out.println();
//	2. Bucle para obtener de igual forma los números que suman 100 (sin pasarse 100)
		subrayado("2. Bucle para obtener de igual forma los números que suman 100 (sin pasarse 100)");
		
		int suma = 0;
		for (int i = 1; suma <= 100; i++) {
			suma += i;
			System.out.print(suma < 100 ? suma + "-" : suma);
			
		}
		System.out.println();
		
// 2.1. Bucle para mostrar 1-2-3-4-5-6-7-8-9-10 …. hasta que sumen 100
		subrayado("2.1. Bucle para mostrar 1-2-3-4-5-6-7-8-9-10 …. hasta que sumen 100");
		
		suma = 0;
		for (int i = 1; suma <= 100; i++) {
			suma += i;
			System.out.print(suma < 100 ? i + "-" : i);
		}
		
	   System.out.println();
//	3. Bucle para Do-Re-Mi-Fa-Sol-La-Si-Do con el apoyo de un array
		subrayado("3. Bucle para Do-Re-Mi-Fa-Sol-La-Si-Do con el apoyo de un array");
		
		String [] notas = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do"};
		for (int i = 0; i < notas.length; i++) {
			System.out.print(i < notas.length-1 ? notas[i] + "-": notas[i]);
		}
		
		
	System.out.println();
//	4. Bucle para Do-Re-Mi-Fa-Sol-La-Si-Do con el apoyo de unList
		subrayado("4. Bucle para Do-Re-Mi-Fa-Sol-La-Si-Do con el apoyo de unList");
		subrayado("Una forma");
		List <String> notasAL = Arrays.asList("Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do");
		
		for (int i = 0; i < notasAL.size(); i++) {
			System.out.print(i < notasAL.size()-1 ? notasAL.get(i) + "-" : notasAL.get(i));
		}
		
		System.out.println();
		subrayado("Otra forma");
		List <String> notasAL2 = new ArrayList<String>();
		
		for (String nota : notas) {
			notasAL2.add(nota);
		}
		
		for (int i = 0; i < notasAL2.size(); i++) {
			System.out.print(i < notasAL2.size()-1 ? notasAL2.get(i) + "-" : notasAL2.get(i));
		}
		
		
		
		
		
		
	}
	
	

}
