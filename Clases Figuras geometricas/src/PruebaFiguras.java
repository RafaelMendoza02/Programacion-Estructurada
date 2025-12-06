public class PruebaFiguras {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(1, 2);
        Cuadrado cuadrado = new Cuadrado(3);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 5);
        Trapecio trapecio = new Trapecio(10, 6, 4, 4, 5);

        System.out.println("CÍRCULO");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println();

        System.out.println("RECTÁNGULO");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println();

        System.out.println("CUADRADO");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println();

        System.out.println("TRIÁNGULO RECTÁNGULO");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Tipo: " + triangulo.determinarTipoTriangulo());
        System.out.println();

        System.out.println("TRAPECIO");
        System.out.println("Área: " + trapecio.calcularArea());
        System.out.println("Perímetro: " + trapecio.calcularPerimetro());
    }
}
