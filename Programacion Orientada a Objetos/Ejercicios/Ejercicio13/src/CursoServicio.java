/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.

 */

import java.util.Scanner;

public class CursoServicio{

    Scanner leer = new Scanner(System.in);
    public void cargarAlumno(Curso curso){

        String[] alumnos = curso.getAlumnos();
        leer.nextLine();
        for (int i = 0; i < curso.getAlumnos().length; i++) {


            System.out.println("Ingrese el nombre del alumno");
            alumnos[i] = leer.nextLine();

        }

        curso.setAlumnos(alumnos);
    }

    public Curso crearCurso(){

        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas diarias del curso");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana que se dictara el curso");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        String turno;
        leer.nextLine();
        do {

            System.out.println("Ingrese el turno del curso (mañana o tarde)");
            turno = leer.nextLine();
            curso.setTurno(turno);
        }while(!turno.equalsIgnoreCase("mañana") && !turno.equalsIgnoreCase("tarde"));

        System.out.println("Ingrese el precio x hora");
        curso.setPrecioPorHora(leer.nextInt());

        cargarAlumno(curso);

        return curso;

    }

    public void calcularGanaciaSemanal(Curso curso){
        int horasPorSemana = curso.getCantidadDiasPorSemana() * curso.getCantidadHorasPorDia();
        int gananciaPorSemana = curso.getAlumnos().length * (curso.getPrecioPorHora() * horasPorSemana);

        System.out.println("La ganancia semanal es: " + gananciaPorSemana);
    }
}
