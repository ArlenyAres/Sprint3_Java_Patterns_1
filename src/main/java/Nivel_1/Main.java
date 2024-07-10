package Nivel_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Undo Undoinstancia = Undo.getInstancia();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Escoje una opccion \n");
            System.out.println("1. Añadir comamda");
            System.out.println("2. eliminar datos de comanda");
            System.out.println("3. Ver comandas \n");
            System.out.println("4. Exit");


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca la comanda");
                    String comanda = sc.nextLine();
                    Undoinstancia.anadirComandas(comanda);
                    break;
                case 2:
                    System.out.println("introduzca el nombre de la comanda que desea eliminar");
                    String nombreComanda = sc.nextLine();
                    Undoinstancia.eliminarComandas();
                    break;
                case 3:
                    System.out.println("Ver comandas");
                    Undoinstancia.listarComandas();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }

        sc.close();
    }
}
