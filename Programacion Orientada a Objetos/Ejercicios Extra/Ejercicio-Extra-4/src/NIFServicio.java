import java.util.Scanner;

/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in);

    public NIF  crearNif(){
        NIF nif = new NIF();

        System.out.println("ingrese los 8 digitos de su dni");
        String dniString = leer.nextLine();
        while (dniString.length() != 8){
            System.out.println("ingrese los 8 digitos de su dni");
             dniString = leer.nextLine();
        }
        int dni = Integer.parseInt(dniString);
        nif.setDni(dni);
        int posicion = dni - (int)(Math.floor(dni / 23) *  23);

        String[] caracteres =  {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        nif.setLetra(caracteres[posicion]);
        return nif;
    }

    public void mostrarNif(NIF nif){

        String dni = Integer.toString(nif.getDni());

        switch (dni.length()){
            case 5:
                System.out.println("000"+dni+"-"+nif.getLetra());
                break;
            case 6:
                System.out.println("00"+dni+"-"+nif.getLetra());
                break;
            case 7:
                System.out.println("0"+dni+"-"+nif.getLetra());
                break;
            case 8:
                System.out.println(dni+"-"+nif.getLetra());
                break;
        }
    }

;}
