public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "*************************************" );
        System.out.println("**** Guia 1 Desarrollo de SW EAN ****" );
        System.out.println( "*************************************" + "\n");

        //Fraccionario
        System.out.println("1. Clase Fraccionario:" + "\n");
        Fraccionario fraccion = new Fraccionario(88, 99);
        System.out.println("Numerador: " + fraccion.getNumerador());
        System.out.println("Denominador: " + fraccion.getDenominador());
        System.out.println("Fraccionario Crerado: "+ fraccion.getNumerador() + "/" + fraccion.getDenominador()+ "\n");

        // Cambiar el numerador y el denominador
        fraccion.setNumerador(77);
        fraccion.setDenominador(44);
        System.out.println("Nuevo Numerador: " + fraccion.getNumerador());
        System.out.println("Nuevo Denominador: " + fraccion.getDenominador());
        System.out.println("Fraccionario Crerado: "+ fraccion.getNumerador() + "/" + fraccion.getDenominador()+ "\n");

        //Reloj
        System.out.println("\n" + "------------------------------" + "\n");
        System.out.println("2. Clase Reloj:" + "\n");

        Reloj reloj = new Reloj(12, 3, 45);
        
        System.out.println("Hora: " + reloj.getHora() + ", Minutos: " + reloj.getMinutos() + ", Segundos: " + reloj.getSegundos());
        System.out.println("Hora Local: " + reloj.getHora() + ":" + reloj.getMinutos() + ":" + reloj.getSegundos());

        // Cambio de la hora
        reloj.setHora(13);
        System.out.println("Nueva Local: " + reloj.getHora() + ":" + reloj.getMinutos() + ":" + reloj.getSegundos());
        System.out.println("Nueva Hora: " + reloj.getHora());

        //Fecha
        System.out.println("\n" + "------------------------------" + "\n");
        System.out.println("3. Clase Fecha:" + "\n");
        Fecha fecha = new Fecha(2024, 2, 13);
        System.out.println("Año: " + fecha.getAño());
        System.out.println("Mes: " + fecha.getMes());
        System.out.println("Día: " + fecha.getDia());
        System.out.println("Fecha: " + fecha.getAño() + "-" + fecha.getMes() + "-" + fecha.getDia() +"\n");

        // Cambio de la fecha
        fecha.setAño(2025);
        System.out.println("Nuevo Año: " + fecha.getAño());
        fecha.setMes(3);
        System.out.println("Nuevo mes: " + fecha.getMes() );
        fecha.setDia(15);
        System.out.println("Nuevo día: " + fecha.getDia());
        System.out.println("Nueva fecha: " + fecha.getAño() + "-" + fecha.getMes() + "-" + fecha.getDia());

        //Proyectil
        System.out.println("\n" + "------------------------------" + "\n");
        System.out.println("4. Clase Proyectil:" + "\n");
        Proyectil proyectil = new Proyectil(175.2, 60);
         
        System.out.println("Velocidad: "+proyectil.getVelocidad());
        System.out.println("Angulo: "+proyectil.getAngulo());
        System.out.println(proyectil.movimientoProyectil());

        System.out.println("\nNuevo disparo:");
        proyectil.setAngulo(45.3);
        proyectil.setVelocidad(247.9);
        System.out.println("Velocidad: "+proyectil.getVelocidad());
        System.out.println("Angulo: "+proyectil.getAngulo());
        System.out.println(proyectil.movimientoProyectil());

        //Tienda
        System.out.println("\n" + "------------------------------" + "\n");
        System.out.println("5. Clase Tienda:" + "\n");

        Tienda miTienda= new Tienda("Yumbo","Calle 95 # 11a - 23", "3214280028",null);


        System.out.println("Bienvenidos a la tienda "+ miTienda.getNombre() + " estamos ubicados en la " + miTienda.getDireccion()+ " puede solicitar servicio a Domicilio en el número de telefono "+ miTienda.getTelefono());
        
        Tienda tiendita= new Tienda("exIT","Calle 195 # 21a - 23", "3222136628",null);
        System.out.println("Bienvenidos a la tienda "+ tiendita.getNombre() + " estamos ubicados en la " + tiendita.getDireccion()+ " puede solicitar servicio a Domicilio en el número de telefono "+ tiendita.getTelefono());
        
      
         




    }
}
