
public class Masajista extends SeleccionFutbol
{
    private String titulacion;
    private Integer añosExperiencia;
    
    public Masajista()
    {
      super();  
    }
    
    public Masajista(Integer cedula,String nombre,String apellidos,Integer edad,String titulacion,Integer añosExperiencia)
    {
      super(cedula,nombre,apellidos,edad);
      this.titulacion=titulacion;
      this.añosExperiencia=añosExperiencia;
    }

    public void darMasaje()
    {
        System.out.println("el masajista toca idebidamente a los jugadores pero realiza el masaje :V");
    }
    
    //Getters y Setters
    public String gettituacion() {
        return titulacion;
    }

    public void setidFederacion(String titulacion) {
        this.titulacion = titulacion;
        }
        
    public Integer getañosExperiencia() {
        return añosExperiencia;
    }

    public void setañosExperiencia(Integer añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }    
}
