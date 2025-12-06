public class TrianguloRectangulo {

    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "Triángulo rectángulo isósceles";
        } else {
            return "Triángulo rectángulo escaleno";
        }
    }
}