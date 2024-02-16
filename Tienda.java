public class Tienda {

    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    private String nombre;
    private String direccion;
    private String telefono;

    public Tienda(String nombre, String direccion, String telefono, Producto[] productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }



    //Metodos getter y setter para las variables privadas de la clase tienda

    public Producto darProducto1(){
        return(p1);
    }

    public Producto darProducto2(){
        return(p2);
    }

    public Producto darProducto3(){
        return(p3);
    }

    public Producto darProducto4(){
        return(p4);
    }
    
}
