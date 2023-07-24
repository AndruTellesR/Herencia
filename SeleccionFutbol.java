

public class SeleccionFutbol
{
   protected Integer cedula;
   protected String nombre;
   protected String apellidos;
   protected Integer edad;
   
   public SeleccionFutbol()
   {
   }

   public SeleccionFutbol(Integer cedula,String nombre,String apellidos,Integer edad)
   { 
       this.cedula=cedula;
       this.nombre=nombre;
       this.apellidos=apellidos;
       this.edad=edad;
   }
   
   public void concentrarse()
   {
       System.out.println("los mienbros de la seleccion se concentran");
   }
   
   public void viajar()
   {
       System.out.println("los miembros de la seleccion viajan ");
   }
   
   // Getters y Setters
   public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
   
}

