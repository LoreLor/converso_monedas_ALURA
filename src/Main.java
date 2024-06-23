import entities.MonedaDTO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println("Bienvenido al Conversor de Monedas - ALURA!");
        Scanner scanner = new Scanner(System.in);
        ConversorMonedas conversor = new ConversorMonedas();

        boolean continuar = true;
        while (continuar) {

            System.out.println("\n*******************************************");
            System.out.println("""
                    Seleccione su moneda de conversión:
                    1) USD =>> ARS
                    2) ARS =>> USD
                    3) USD =>> BRL
                    4) BRL =>> USD
                    5) USD =>> COP
                    6) COP =>> USD
                    7) Salir
            """);

            try {
                int busqueda = Integer.parseInt(scanner.nextLine());

                if (busqueda == 7) {
                    continuar = false;
                    continue;
                }

                String monedaBase;
                String monedaConvertida;
                switch (busqueda) {
                    case 1:
                        monedaBase = "USD";
                        monedaConvertida = "ARS";
                        break;
                    case 2:
                        monedaBase = "ARS";
                        monedaConvertida = "USD";
                        break;
                    case 3:
                        monedaBase = "USD";
                        monedaConvertida = "BRL";
                        break;
                    case 4:
                        monedaBase = "BRL";
                        monedaConvertida = "USD";
                        break;
                    case 5:
                        monedaBase = "USD";
                        monedaConvertida = "COP";
                        break;
                    case 6:
                        monedaBase = "COP";
                        monedaConvertida = "USD";
                        break;
                    default:
                        System.out.println("Opción no válida, intente nuevamente.");
                        continue;
                }

                System.out.print("Ingrese la cantidad a convertir: ");
                double cantidad = Double.parseDouble(scanner.nextLine());

                MonedaDTO tasaCambio = conversor.buscarMoneda(monedaBase);
                Double tasaDeCambio = tasaCambio.getConversionRate(monedaConvertida);

                if (tasaDeCambio != null) {
                    double resultado = conversor.convertirMoneda(cantidad, tasaDeCambio);
                    System.out.printf("Resultado: (" + monedaBase+"-"+monedaConvertida+ ") %.2f %s son %.2f %s%n", cantidad, monedaBase, resultado, monedaConvertida);
                } else {
                    System.out.println("No se encontró la tasa de cambio para la moneda objetivo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Gracias por usar el Conversor de Monedas - ALURA!");
    }
}