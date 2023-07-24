
public class Entrenador extends SeleccionFutbol
{
   private String idFederacion;
   
    public Entrenador()
    {
       super();
    }
    
    public Entrenador(Integer cedula,String nombre,String apellidos,Integer edad,String idFederacion)
    {
       super(cedula,nombre,apellidos,edad);
       this.idFederacion=idFederacion;
    }
    
    public void dirigirPartido()
    {
        System.out.println("El entrenador dirige el partido");
    }
    
    public void dirigirEntreno()
    {
        System.out.println("El entrenador dirige el entreno");
    }
    
    //Getters y Setters
    public String getidFederacion() {
        return idFederacion;
    }

    public void setidFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
}
