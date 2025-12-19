package peaje;

public class Camion extends Vehiculo {
    private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public int getValorPeaje() {
        return numeroEjes;
    }

    @Override
    public void imprimir() {
        System.out.println("Camión - Placa: " + placa +
                " - Ejes: " + numeroEjes +
                " - Peaje: $" + getValorPeaje());
    }
}