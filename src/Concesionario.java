import java.util.ArrayList;

public class Concesionario extends Localizacion{
    public String nombre;
    public Coche[] coches;
    public Concesionario(String pais, String Ciudad, String nombre, int tamanoConcesionario) {
        super(pais, Ciudad);
        this.nombre=nombre;
        this.coches=new Coche[tamanoConcesionario];

    }
    public void addCoche(Coche coche){
         for(int i=0;i<coches.length;i++){
            if (coches[i]==null){
                coches[i]=coche;
                System.out.println(coche.toString() + "anadido");
            }
            if (coches[i]!=null && i==coches.length-1){
                System.out.println("No se puede agregar un coche concesionario");
            }
        }
    }
    public int cochesBlancos(Concesionario c){
        int blanco=0;
        for(int i=0;i<coches.length;i++){
            if (coches[i]!=null && coches[i].color.equalsIgnoreCase("Blanco")){
                blanco++;
            }
        }
        return blanco;
    }
    public int totalCoches(Concesionario c){
        return c.coches.length-1;
    }
    

}
