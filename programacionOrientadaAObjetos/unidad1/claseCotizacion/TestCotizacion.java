package claseCotizacion;


import java.util.Scanner;

public class TestCotizacion {
    public static void main(String[] args) {
        Cotizacion cotizacion = new Cotizacion();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            //menu
            System.out.println("""
                    \n
                    *** Bienvenido al menu de Cotización ***
                    Ingresa la opción deseada:
                    1- Capturar información
                    2- Imprimir información de la cotización
                    3- Obtener pago inicial
                    4- Obtener total a financiar
                    5- Obtener mensualidades
                    6- Salir
                    """);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el numero de folio");
                    cotizacion.setFolio(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Ingresa el modelo y año del que auto deseas cotizar");
                    cotizacion.setDescripcion(teclado.nextLine());
                    System.out.println("Ingresa el costo total del auto");
                    cotizacion.setPrecio(teclado.nextFloat());
                    System.out.println("Ingresa el porcentaje de tu pago inicial");
                    cotizacion.setPorPagoInicial(teclado.nextInt());
                    System.out.println("Ingresa en cuantos plazos deseas dividir tu pago");
                    cotizacion.setPlazos(teclado.nextInt());
                    break;
                case 2:
                    System.out.printf("""
                            -- Información de la cotización --
                            Numero de folio: %d
                            Modelo del auto: %s
                            Costo total del auto: %.2f
                            Porcentaje del pago inicial: %d
                            Plazos: %d
                            """,
                            cotizacion.getFolio(),
                            cotizacion.getDescripcion(),
                            cotizacion.getPrecio(),
                            cotizacion.getPorPagoInicial(),
                            cotizacion.getPlazos());
                    break;

                case 3:
                    System.out.println("El pago inicial de su auto es de: $" + cotizacion.calcularPagoInicial());
                    break;
                case 4:
                    System.out.println("Su total a financiar es de: $" + cotizacion.calcularTotalAFin());
                    break;
                case 5:
                    System.out.println("Su pago mensual sera de : $" + cotizacion.calcularPagoMes());
                    break;
                case 6:
                    System.out.println("Hasta la próxima!");
                default:
                    System.out.println("Por favor ingresa una opción válida.");
            }
        }
        while (opcion != 6);
    }
}
