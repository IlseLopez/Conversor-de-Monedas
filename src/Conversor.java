
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsumoApi consumoApi = new ConsumoApi();


        System.out.println("||||||||||||SISTEMA CONVERSION DE MONEDA||||||||||");
        System.out.println("Moneda base:");
        String base = scanner.nextLine().toUpperCase();


        System.out.println("Moneda a convertir");
        String base1 = scanner.nextLine().toUpperCase();

        System.out.println("|||||||||||||||||||| $$$$$$$ ||||||||||||||||||||||||");
        System.out.println("Cantidad a convertir");
        double cantidad = scanner.nextInt();

        Monedas monedas = consumoApi.convertirMonedas(base);


        if (monedas != null && monedas.conversion_rates().containsKey(base1)) {
            //System.out.println("Base: " + monedas.base_code());
            //System.out.println("Tasas de conversión: " + monedas.conversion_rates());
            double conversor = monedas.conversion_rates().get(base1);
            double suma = cantidad * conversor;

            System.out.println("\n== Resultado ==");
            System.out.println(cantidad + " " + base + " = " + suma + " " + base1);

        } else {
            System.out.println("No se pudo obtener la información de la API.");
        }
    }
}
