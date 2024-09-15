public class ObjetoGeometrico {
    private String tipo;
    private String cor;
    private double area;
    private double perimetro;

    // sem parâmetros
    public ObjetoGeometrico() {
        tipo = "Círculo";
        cor = "Azul";
        area = 78.5;
        perimetro = 31.4;
    }

    // com parâmetros
    public ObjetoGeometrico(String t, String c, double a, double p) {
        tipo = t;
        cor = c;
        area = a;
        perimetro = p;
    }

    // tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // área
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // perímetro
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public static void main(String[] args) {
        ObjetoGeometrico obj1 = new ObjetoGeometrico();  // usando o construtor sem parâmetros
        System.out.println("Tipo: " + obj1.getTipo());
        System.out.println("Cor: " + obj1.getCor());
        System.out.println("Área: " + obj1.getArea());
        System.out.println("Perímetro: " + obj1.getPerimetro());

        // usando o construtor com parâmetros
        ObjetoGeometrico obj2 = new ObjetoGeometrico("Quadrado", "Vermelho", 25.0, 20.0);
        System.out.println("\nTipo: " + obj2.getTipo());
        System.out.println("Cor: " + obj2.getCor());
        System.out.println("Área: " + obj2.getArea());
        System.out.println("Perímetro: " + obj2.getPerimetro());
    }
}
