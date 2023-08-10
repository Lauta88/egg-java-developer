

public class Libro {

    private String titulo;
    private Integer anio;

    public Libro() {
    }

    public Libro(String titulo, Integer año) {
        this.titulo = titulo;
        this.anio = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
