package peaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Peaje peaje = new Peaje("Peaje Central", "Quito");

        int carros = 0;
        int motos = 0;
        int camiones = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DE INGRESO DE VEHÍCULOS ---");
            System.out.println("1. Ingresar Carro (máx 4)");
            System.out.println("2. Ingresar Moto (máx 3)");
            System.out.println("3. Ingresar Camión (máx 4)");
            System.out.println("4. Finalizar y mostrar reporte");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    if (carros < 4) {
                        System.out.print("Ingrese placa del carro: ");
                        String placa = scanner.nextLine();
                        peaje.addVehiculo(new Carro(placa));
                        carros++;
                        System.out.println("✅ Carro registrado correctamente.");
                    } else {
                        System.out.println("❌ Límite de carros alcanzado.");
                    }
                    break;

                case 2:
                    if (motos < 3) {
                        System.out.print("Ingrese placa de la moto: ");
                        String placa = scanner.nextLine();
                        peaje.addVehiculo(new Moto(placa));
                        motos++;
                        System.out.println("✅ Moto registrada correctamente.");
                    } else {
                        System.out.println("❌ Límite de motos alcanzado.");
                    }
                    break;

                case 3:
                    if (camiones < 4) {
                        System.out.print("Ingrese placa del camión: ");
                        String placa = scanner.nextLine();

                        int ejes;
                        do {
                            System.out.print("Ingrese número de ejes (SOLO PARES): ");
                            ejes = scanner.nextInt();

                            if (ejes % 2 != 0) {
                                System.out.println("❌ Error: los camiones no tienen ejes impares.");
                            } else if (ejes <= 0) {
                                System.out.println("❌ Error: el número de ejes debe ser mayor que cero.");
                            }

                        } while (ejes % 2 != 0 || ejes <= 0);

                        scanner.nextLine(); // limpiar buffer

                        peaje.addVehiculo(new Camion(placa, ejes));
                        camiones++;
                        System.out.println("✅ Camión registrado correctamente.");
                    } else {
                        System.out.println("❌ Límite de camiones alcanzado.");
                    }
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("⚠️ Opción inválida.");
            }
        }

        System.out.println("\n===== REPORTE FINAL =====");
        peaje.imprimir();

        scanner.close();
    }
}