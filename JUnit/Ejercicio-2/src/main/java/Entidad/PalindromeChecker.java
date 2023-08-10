package Entidad;

public class PalindromeChecker {

    public PalindromeChecker() {
    }

    public boolean esUnPalindromo(String palabra){


        palabra = palabra.toLowerCase();

        for (int i = 0, j = palabra.length()-1 ; i <= j; i++, j--) {

            if (palabra.charAt(i) != palabra.charAt(j)){

                return false;
            }
        }
        return true;


    }
}
