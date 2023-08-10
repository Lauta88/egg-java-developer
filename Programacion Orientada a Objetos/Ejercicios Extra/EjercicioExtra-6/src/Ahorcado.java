public class Ahorcado {

    private int longitudPalabra;
    private String[] palabraSecreta = new String[longitudPalabra];
    private int letrasEncontradas = 0;
    private int cantidadDeJugadas;

    public Ahorcado() {
    }

    public Ahorcado(int longitudPalabra, String[] palabraSecreta, int letrasEncontradas, int cantidadDeJugadas) {
        this.longitudPalabra = longitudPalabra;
        this.palabraSecreta = palabraSecreta;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadDeJugadas = cantidadDeJugadas;
    }

    public int getLongitudPalabra() {
        return longitudPalabra;
    }

    public void setLongitudPalabra(int longitudPalabra) {
        this.longitudPalabra = longitudPalabra;
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadDeJugadas() {
        return cantidadDeJugadas;
    }

    public void setCantidadDeJugadas(int cantidadDeJugadas) {
        this.cantidadDeJugadas = cantidadDeJugadas;
    }
}
