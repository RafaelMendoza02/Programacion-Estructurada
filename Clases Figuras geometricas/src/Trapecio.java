public class Trapecio {

    private int baseMayor;
    private int baseMenor;
    private int ladoIzquierdo;
    private int ladoDerecho;
    private int altura;

    public Trapecio(int baseMayor, int baseMenor, int ladoIzquierdo, int ladoDerecho, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.ladoIzquierdo = ladoIzquierdo;
        this.ladoDerecho = ladoDerecho;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + ladoIzquierdo + ladoDerecho;
    }
}
