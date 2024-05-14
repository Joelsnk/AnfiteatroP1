package Anfiteatro;

import java.awt.AWTException;
import java.util.Scanner;

/**
 *
 * @author Galford
 */
public class Main {
static MapaAsientos objMapaAsientos = new MapaAsientos();
    public static void main(String[] args) throws AWTException {

        Scanner teclado = new Scanner(System.in);
        LimpiarConsola objLimpiarConsola = new LimpiarConsola();
        String valorAsiento;
        objMapaAsientos.crearMapaAsientos();

        do {
            //objLimpiarConsola.limpiar();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println("Sistema de Anfiteatro");
            System.out.println("------- -- ----------");
            objMapaAsientos.mostrarAsientos();
            System.out.println();
            System.out.println("Opciones del sistema: ");
            System.out.println("  1. Escriba el número de asiento que desea comprar:");
            System.out.println("  2. Salir [E]");
            System.out.println("Seleccione una opción: ");
            valorAsiento = teclado.nextLine();

            if (isNumero(valorAsiento)) {
                if (Integer.valueOf(valorAsiento) <= 100) {
                    //Verificar si asiento está disponible
                    if (objMapaAsientos.mapaAsiento.get(Integer.valueOf(valorAsiento) - 1).equals("L")) {
                        //Si está disponible -> Reservar asiento
                        //System.out.println("Asiento Libre");
                        reservarAsiento(Integer.valueOf(valorAsiento) - 1);
                        System.out.println("Reserva Exitosa!");
                        System.out.println("Presione ENTER para continuar..");
                        teclado.nextLine();
                    } else {
                        //Si no está disponible -> Enviar mensaje de asiento ocupado y elija otro asiento
                        System.out.println("Asiento ocupado -> Elija otro asiento.");
                        //System.out.println("Elija otro asiento");
                        System.out.println("Presione ENTER para continuar..");
                        teclado.nextLine();
                    }
                }else{
                    System.out.println("Número fuera de rango -> Elija otro asiento.");
                    System.out.println("Presione ENTER para continuar..");
                        teclado.nextLine();
                }
            }

        } while (!valorAsiento.equals("E"));

    }

    public static boolean isNumero(String cad) {
        boolean resultado;
        try {
            Integer.parseInt(cad);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }
    
    public static void reservarAsiento(int i){
        objMapaAsientos.mapaAsiento.set(i, "X");
    }

}
