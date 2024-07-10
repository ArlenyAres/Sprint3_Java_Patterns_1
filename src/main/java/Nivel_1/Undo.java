package Nivel_1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instancia;
    private List<String> comandas;

    private Undo() {
        this.comandas = new ArrayList<>();
    }

    public static synchronized Undo getInstancia() {
        if (instancia == null) {
            instancia = new Undo();
        }
        return instancia;
    }

    public void anadirComandas(String comanda) {
        this.comandas.add(comanda);
        System.out.println(" La comanda " + comanda + " ha sido creada correctamente \n");
    }

    public void eliminarComandas() {
        if ( !comandas.isEmpty() ) {
            comandas.remove(comandas.size() -1);
            System.out.println("Comanda" + comandas +  "eliminada Correctamentes \n");
        }
    }

    public void eliminarDatoComanda(String dato) {
        comandas.removeIf(order -> order.equals(dato));
    }


    public void listarComandas() {
        for (String comanda : comandas) {
            System.out.println(comanda);
        }
    }
}
