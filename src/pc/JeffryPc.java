package pc;

import rd.world.pc.*;

public class JeffryPc {

    public static void main(String[] args) {

        Monitor monitorHP = new Monitor("HP ", 13);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Raton ratonhp = new Raton("BLUETOOTH", "HP");

        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonhp);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.mostrarOrden();
    }
}
