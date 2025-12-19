package peaje;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String departamento;
    private int totalPeaje;
    private List<Vehiculo> vehiculos;

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalPeaje = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        totalPeaje += vehiculo.getValorPeaje();
    }

    public void imprimir() {
        System.out.println("Peaje: " + nombre);
        System.out.println("Departamento/Cantón: " + departamento);
        System.out.println("Vehículos registrados:");

        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }

        System.out.println("TOTAL RECAUDADO: $" + totalPeaje);
    }
}