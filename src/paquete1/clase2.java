package paquete1;

public class clase2 {
    public static void main(String[] args) {
        clase1 objeto1=new clase1();
        //metodo establecer
        objeto1.setEdad(20);
        objeto1.setNombre("Matias");
        //metodo obtener
        System.out.println("Su edad es: "+objeto1.getEdad());
        System.out.println("su nombre es: "+objeto1.getNombre());

    }
}
