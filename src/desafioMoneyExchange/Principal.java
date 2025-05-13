package desafioMoneyExchange;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        public class ConversorDeMonedas {

            private static double USD_TO_EUR = 0.93;
            private static double USD_TO_GBP = 0.80;
            private static double USD_TO_JPY = 155.50;
            private static double EUR_TO_USD = 1.07;
            private static double GBP_TO_USD = 1.25;
            private double JPY_TO_USD = 0.0064;

            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Indique la opcion: ");
                int opcion = teclado.nextInt();

                do {
                    System.out.println("\n--- Conversor de Monedas ---");
                    System.out.println("1. USD a EUR");
                    System.out.println("2. USD a GBP");
                    System.out.println("3. USD a JPY");
                    System.out.println("4. EUR a USD");
                    System.out.println("5. GBP a USD");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");

                    

                    switch (opcion) {
                        case 1:
                            convertirMoneda("USD", "EUR" + USD_TO_EUR + opcion);
                            break;
                        case 2:
                            convertirMoneda("USD", "GBP", USD_TO_GBP, opcion);
                            break;
                        case 3:
                            convertirMoneda("USD", "JPY", USD_TO_JPY, opcion);
                            break;
                        case 4:
                            convertirMoneda("EUR", "USD", EUR_TO_USD, opcion);
                            break;
                        case 5:
                            convertirMoneda("GBP", "USD", GBP_TO_USD, opcion);
                            break;
                        case 0:
                            System.out.println("Saliendo del conversor.");
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    }
                } while (opcion != 0);


            }

            private static void convertirMoneda(String monedaOrigen, String monedaDestino, double tipoCambio, int scanner) {
                System.out.print("Ingrese la cantidad en " + monedaOrigen + ": ");
                double cantidad = Scanner.nextDouble();
                double resultado = cantidad * tipoCambio;
                System.out.printf("%.2f %s equivalen a %.2f %s.\n", cantidad, monedaOrigen, resultado, monedaDestino);
            }
        }
    }