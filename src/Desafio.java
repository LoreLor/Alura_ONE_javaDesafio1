import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Datos del Cliente
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 5000.10;
        int opcion=0;

        System.out.println("************************************\n");
        System.out.println("Nombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo del Cliente: " + saldo);
        System.out.println("\n************************************");

        // Menú
        String menu = """
                *** Ingrese ele número de opción deseada ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;


        while(opcion != 9){
            System.out.println(menu);
            // le asigno a opción, lo que ingrese por teclado
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Su saldo es de: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese monto a retirar");
                    double retiro = scanner.nextDouble();

                    if(saldo >= retiro){
                        saldo-=retiro;
                        System.out.println("Usted ha retirado: " + retiro);
                        System.out.println("El saldo actualizado es: " + saldo);
                    } else {
                        System.out.println("Su saldo es insuficiente");
                    }
                    break;
                case 3:
                    double deposito = scanner.nextDouble();
                    System.out.println("Ingrese el monto a depositar");
                    saldo += deposito;
                    System.out.println("Usted ha depositado: " + deposito);
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Su sesión ha finalizado con éxito: ");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}
