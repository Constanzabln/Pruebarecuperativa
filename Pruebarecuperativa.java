import java.io.Console;

import javax.sound.sampled.SourceDataLine;

public class Pruebarecuperativa {
    public static void main(String[] args) {
        System.out.println("Bienvendio/e al Minimarket de Don José");
        Console console = System.console();
        int precio = Integer.parseInt(console.readLine("Ingrese precio total de su compra " ));
        int dia = Integer.parseInt("Ingrese día en que realiza esta compra " );
        if(dia = "Martes" || dia= "Jueves"){
             System.out.println("El valor total de su compra es" precio*0,8 "con un descuento correspondiente al 20%");

        }
        else{
             System.out.println("El valor de su compra es" precio);
        }
        

    }
}
