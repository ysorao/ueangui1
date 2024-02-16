public class Producto {

    public final static int LACTEO=1;
    public final static int CARNICO=2;
    public final static int FRUTA=3;
    public final static int ENLATADO=4;

    private int codigo;
    private String nombre;
    private int tipo; //LACTEO,CARNICO,FRUTA o ENLATADO
    private String  fechaVencimiento;
    private String fabricante;
    private double precio;
    private int existencias;

    public  Producto(int codigo,String nombre,int tipo,String fechaVencimiento,String fabricante,double precio,int existencias){
        this.codigo             = codigo;
        this.nombre             = nombre;
        this.tipo               = tipo;
        this.fechaVencimiento   = fechaVencimiento;
        this.fabricante         = fabricante;
        this.precio             = precio;
        this.existencias        = existencias;
    }


    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTipo(){
        return tipo;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public String getFechaVencimiento(){
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }


    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public Double getPrecio(){
        return precio;
    }

    public void setPrecio (Double precio){
        this.precio = precio;
    }

    public int getExistencias(){
        return existencias;
    }

    public void setExistencias(int existencias){
        this.existencias = existencias;
    }

    




}
