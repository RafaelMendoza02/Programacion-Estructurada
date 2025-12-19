package peaje;

public class Carro extends Vehiculo {
    private int valorPeaje = 2;

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    @Override
    public void imprimir() {
        System.out.println("Carro - Placa: " + placa + " - Peaje: $" + valorPeaje);
    }
}