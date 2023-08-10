import java.util.Scanner;

public class JuegoServicio {

    Scanner leer = new Scanner(System.in);



    public void iniciarJuego(){

        Juego juego = new Juego();
        System.out.println("Bienvenido al juego");
        System.out.println("Ingrese un mes del año para intentar adivinar el correcto");
        String mesUsuario;
        do {
            mesUsuario = leer.nextLine();
            if (juego.getMesSecreto().equalsIgnoreCase(mesUsuario)){
                break;
            }
            System.out.println("Incorecto intente nuevamente");


        } while (!juego.getMesSecreto().equalsIgnoreCase(mesUsuario));
        System.out.println("Corecto usted ha acertado!");

    }

}
