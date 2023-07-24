

public class Futbolista extends SeleccionFutbol
{
    private Integer dorsal;
    private String demarcacion;
   
    public Futbolista()
    {
        super();
    }
    
    public Futbolista(Integer cedula,String nombre,String apellidos,Integer edad,Integer dorsal,String demarcacion)
    {
        super(cedula,nombre,apellidos,edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    
    public void jugarPartido()
    {
        System.out.println("los jugadores seleccionados juegan el partido");
    }
    
    public void entrenar()
    {
        System.out.println("Todos los jugadores fisicamente aptos entrenan"); 
    }
    
    //Getters y Setters
    public Integer getdorsal() {
        return dorsal;
    }

    public void setañosExperiencia(Integer dorsal) {
        this.dorsal = dorsal;
    }    
    
    public String getdemarcacion() {
        return demarcacion;
    }

    public void setdemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
        }
}
