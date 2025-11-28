package claseTerreno;

import java.util.Scanner;

//clase principal para instanciar objetos
public class TestTerreno {
    public static void main(String[] args) {
        //variables y objetos
        Terreno terreno = new Terreno();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            //menu
            System.out.println("""
                   \n
                   *** Bienvenido al menu de Terreno ***
                   Ingresa la opción deseada:
                   1- Capturar información
                   2- Imprimir información del terreno
                   3- Imprimir perimetro
                   4- Imprimir area
                   5- Salir
                    """);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa el numero de lote");
                    terreno.setNumLote(teclado.nextInt());
                    System.out.println("Ingresa el ancho del terreno");
                    terreno.setAnchoN(teclado.nextInt());
                    System.out.println("Ingresa el largo del terreno");
                    terreno.setLargoY(teclado.nextInt());
                    break;

                case 2:
                    System.out.printf("""
                            -- Información del terreno --
                            Numero de lote: %d
                            Ancho del terreno: %.2f
                            Largo del terreno: %.2f
                          
                            """, terreno.getNumLote(), terreno.getAnchoN(), terreno.getLargoY());
                    break;

                case 3:
                    System.out.println("El perimetro del terreno es de: " + terreno.calcularPerimetro() + " metros");
                    break;

                case 4:
                    System.out.println("El area del terreno es de: " + terreno.calcularArea() + " m2");
                    break;

                case 5:
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Por favor ingresa una opción válida");
            }
        }
        while (opcion != 5);
    }
}
