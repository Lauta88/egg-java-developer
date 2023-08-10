/*
3. Validador de Contraseñas:
Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.
 */

/*
olean matchUpper = password.matches(".*[A-Z].*");
        boolean matchDigits = password.matches(".*[0-9].*");
        boolean matchSpecials = password.matches(".*[!@#$%&_-].*");
 */
package Entidad;

public class PasswordValidator {


    public PasswordValidator() {
    }

    public boolean PasswordIsValid(String password){
        if (password.matches(".*[A-Z].*") & password.matches(".*[0-9].*") & password.matches(".*[!@#$%&_-].*")){
            return true;
        }
        else return false;

    }
}
