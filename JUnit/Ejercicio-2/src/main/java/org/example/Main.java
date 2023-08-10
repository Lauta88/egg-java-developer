/*
Verificador de Palíndromos:
Crea una clase PalindromeChecker que verifique si una cadena es un palíndromo (se lee
igual de adelante hacia atrás y viceversa).
Escribe pruebas unitarias para asegurarte de que el verificador de palíndromos detecte
correctamente las cadenas que son palíndromos y las que no lo son.
 */
package org.example;

import Entidad.PalindromeChecker;

public class Main {
    public static void main(String[] args) {


        PalindromeChecker pc = new PalindromeChecker();

        pc.esUnPalindromo("osso");
    }
}