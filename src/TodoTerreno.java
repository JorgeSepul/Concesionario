import java.util.ArrayList;

public class TodoTerreno extends Coche {
    private char traccion;
    private String interior;
    private ArrayList<String>extras=new ArrayList<>();
    public TodoTerreno(String color, String modelo, int potencia, String marca, double precio) {
        super();
        this.color = color;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public void setTraccion(char traccion) {
        this.traccion = traccion;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setExtras(ArrayList<String> extras) {
        this.extras = extras;
    }

    public String getInterior() {
        return interior;
    }

    public char getTraccion() {
        return traccion;
    }

    public ArrayList<String> getExtras() {
        return extras;
    }
}
