/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindromo.fatalis;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        
        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
        
        scanner.close();
    }
    
    public static boolean esPalindromo(String frase) {
        // Eliminamos espacios y convertimos todo a minúsculas para comparar
        frase = frase.replaceAll(" ", "").toLowerCase();
        
        // Dividimos la frase en palabras
        String[] palabras = frase.split(" ");
        
        for (String palabra : palabras) {
            if (!esPalabraPalindromo(palabra)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean esPalabraPalindromo(String palabra) {
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
}
