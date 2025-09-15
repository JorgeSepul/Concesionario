public class Coche {
    public final int ruedas=4;
    public String color;
    public String modelo;
    public int potencia;
    public String marca;
    public double precio;
    public Coche(String color, String modelo, int potencia, String marca, double precio) {
        this.color = color;
        this.modelo = modelo;
        this.potencia = potencia;
        this.marca = marca;
        this.precio = precio;
    }
    Coche() {}
    @Override
    public String toString() {
       return this.color + this.modelo + this.potencia + this.marca + this.precio;
    }

}
