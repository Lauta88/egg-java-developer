import java.util.ArrayList;
import java.util.Scanner;

/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public void ingresarAlumno(){

        int opcion = 1;
       while (opcion != 0){
           System.out.println("1. Ingresar Alumno");
           System.out.println("0. Salir");
           opcion = leer.nextInt();

           if(opcion == 1){
               Alumno alumno = new Alumno();
               System.out.println("Ingrese el nombre del alumno");
               leer.nextLine();
               String nombreAlumno = leer.nextLine();
               alumno.setNombre(nombreAlumno);
               ArrayList<Integer> notas = new ArrayList<>();
               System.out.println("Ingrese la nota 1");
               notas.add(leer.nextInt());
               System.out.println("Ingrese la nota 2");
               notas.add(leer.nextInt());
               System.out.println("Ingrese la nota 3");
               notas.add(leer.nextInt());
               alumno.setNotas(notas);

               alumnos.add(alumno);
           }
       }
    }

    public void notaFinal(){

        System.out.println("Ingrese el nombre del alumno que desea buscar");
        leer.nextLine();
        String nombre = leer.nextLine();
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                ArrayList<Integer> notas = alumno.getNotas();
              double notaFinal =  (notas.get(0) + notas.get(1) + notas.get(2) ) / 3;

                System.out.println("La nota final del alumno " + alumno.getNombre()+ " es " + notaFinal);
            }
        }

    }
}
