/*
 * Autor: Hugo
 */
package ciclo;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("..................................");
		System.out.println("|        Lenguaje Index          |");
		System.out.println("..................................");
		System.out.println("|           Ciclo Xor            |");
		System.out.println("..................................");

		System.out.println("");
		System.out.println("Escriba el ciclo: ");

		String leer = sc.nextLine(); // Xor ( d=2 / d<9 / d++ ) ¿ ? es la cadena
										// correcta
		String Array[] = leer.split("\\s"); // los valores se van guardando en
											// el arreglo para despues hacer la
											// comparacion
		boolean s; // es un variable de flojo para ya no escribir mas donde
					// validamos los errores del arreglo
		// la que sigue es la expresion regular que tiene que tener el for de
		// nuestro lenguaje
		String cifor = "^Xor.*\\s[(]\\s[a-zA-Z][=]\\d+\\s[/]\\s[a-zA-Z]([<>=]|<=|>=|==)\\d+\\s[/]\\s[a-zA-Z][+]{2}\\s[)]\\s[¿]\\s[?]";

		if (s= leer.matches(cifor)) {
			System.out.println(" :) Bien Hecho");
			System.out.println("La sintaxis del ciclo 'Xor' es correcta");
		}
		// Busqueda de los errores XOR ( D=F D/ D<9 / D++ ) ¿ ?
		else {
			System.err.println("FATAL ERROR");
			System.err.println("La sintaxis del ciclo 'Xor' es incorrecta");
		}
		if (s = Array[0].matches("Xor")) {
		} else {
			System.err.println("(0001)ERROR: " + Array[0] + " Palabra reservada incorrecta.");
		}
		if (s = Array[1].matches("\\(")) {
		} else {
			System.err.println("(0002)ERROR: " + Array[1] + " No se encuentra el signo '('");
		}
		if (s = Array[2].matches("[a-zA-Z][=]\\d")) {
		} else {
			System.err.println("(0003)ERROR: " + "Valor inicial incorrecto. REVISAR SINTAXIS");
		}
		if (s = Array[3].matches("\\/")) {
		} else {
			System.err.println("(0004)ERROR: No se encuentra el signo '/' despues del valor inicial");
		}
		if (s = Array[4].matches("[a-zA-Z][<>=|<=|>=|==]\\d")) {
		} else {
			System.err.println("(0005)ERROR: " + "Condicion de termino incorrecto. REVISAR SINTAXIS");
		}
		if (s = Array[5].matches("\\/")) {
		} else {
			System.err.println("(0006)ERROR: No se encuentra el signo '/' despues de la condicion de termino.");
		}
		if (s = Array[6].matches("[a-zA-Z][+]{2}")) {
		} else {
			System.err.println("(0007)ERROR: Factor de incremento incorrecto. REVISAR SINTAXIS.");
		}
		if (s = Array[7].matches("\\)")) {
		} else {
			System.err.println("(0008)ERROR: " + Array[7] + "No se encuentra el signo ')'");
		}
		if (s = Array[8].matches("\\¿")) {
		} else {
			System.err.println("(0009)ERROR: " + Array[8] + "No se encuentra el signo '¿'");
		}
		if (s = Array[9].matches("\\?")) {
		} else {
			System.err.println("(0010)ERROR: " + Array[9] + "No se encuentra el signo '?'");
		}
	}
}