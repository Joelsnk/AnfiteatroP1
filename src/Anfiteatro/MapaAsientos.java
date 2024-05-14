package Anfiteatro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Galford
 */
public class MapaAsientos {

    public List<String> mapaAsiento = new ArrayList<>();

    public void crearMapaAsientos() {
        System.out.println("Creando Mapa de Asientos");
        for (int i = 0; i < 100; i++) {
            mapaAsiento.add("L");
        }
    }

    public void mostrarAsientos() {
        System.out.println(" Mostrar Mapa de Asientos");
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print((i + 1) + " " + mapaAsiento.get(i) + "  ");
        }
        System.out.println();
    }
    
}
