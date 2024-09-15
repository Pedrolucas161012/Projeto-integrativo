public class Televisor {
    private int tamanho;
    private String marca;
    private String cor;
    
    // Construtor sem parâmetros
    public Televisor() {
        tamanho = 75;
        marca = "Samsung";
        cor = "Preta";
    }

    // Construtor com parâmetros
    public Televisor(int t, String m, String c) {
        tamanho = t;
        marca = m;
        cor = c;
    }
    
    // tamanho
    public int getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //marca
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter e Setter para cor
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args) {
        Televisor t1 = new Televisor();  // usando o construtor sem parâmetros
        System.out.println("Tamanho: " + t1.getTamanho());
        System.out.println("Marca: " + t1.getMarca());
        System.out.println("Cor: " + t1.getCor());

        Televisor t2 = new Televisor(65, "LG", "Branca"); // usando o construtor com parâmetros
        System.out.println("\nTamanho: " + t2.getTamanho());
        System.out.println("Marca: " + t2.getMarca());
        System.out.println("Cor: " + t2.getCor());
    }
}

