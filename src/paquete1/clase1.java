//encapsulamiento con setters y getters
package paquete1;

public class clase1 {

    private int edad;
    private String nombre;

    public clase1() {
    }

    //metodo Setter
    public void setEdad(int edad)//set es igual a establecer
     {
        this.edad=edad;

    }
    //metodo Getter
    public int getEdad()//Get es igual a Obtener
    {
        return edad;
    }
    //metodo Setter
    public void setNombre(String nombre) //set es igual a establecer
    {
        this.nombre = nombre;
    }
    //metodo Getter
    public String getNombre()//Get es igual a Obtener
    {
        return nombre;
    }
}
