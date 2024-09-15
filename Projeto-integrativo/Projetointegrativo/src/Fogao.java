public class Fogao {
    private String marca;
    private int numeroDeBocas;
    private boolean possuiForno;
    private String especificacao;

    // sem parâmetros
    public Fogao() {
        marca = "Brastemp";
        numeroDeBocas = 4;
        possuiForno = true;
        especificacao = "Fogão de 4 bocas com forno elétrico.";
    }

    // com parâmetros
    public Fogao(String m, int bocas, boolean forno, String especificacao) {
        marca = m;
        numeroDeBocas = bocas;
        possuiForno = forno;
        this.especificacao = especificacao;
    }
    
    // marca
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // número de bocas
    public int getNumeroDeBocas() {
        return numeroDeBocas;
    }
    
    public void setNumeroDeBocas(int numeroDeBocas) {
        this.numeroDeBocas = numeroDeBocas;
    }

    // forno
    public boolean isPossuiForno() {
        return possuiForno;
    }
    
    public void setPossuiForno(boolean possuiForno) {
        this.possuiForno = possuiForno;
    }

    // especificação
    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public static void main(String[] args) {
        Fogao f1 = new Fogao();  // usando o construtor sem parâmetros
        System.out.println("Marca: " + f1.getMarca());
        System.out.println("Número de bocas: " + f1.getNumeroDeBocas());
        System.out.println("Possui forno: " + (f1.isPossuiForno() ? "Sim" : "Não"));
        System.out.println("Especificação: " + f1.getEspecificacao());

        // usando o construtor com parâmetros
        Fogao f2 = new Fogao("Electrolux", 5, true, "Fogão de 5 bocas com forno a gás.");
        System.out.println("\nMarca: " + f2.getMarca());
        System.out.println("Número de bocas: " + f2.getNumeroDeBocas());
        System.out.println("Possui forno: " + (f2.isPossuiForno() ? "Sim" : "Não"));
        System.out.println("Especificação: " + f2.getEspecificacao());
    }
}
