public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private boolean ehEletrico;
    private String especificacao;

    // sem parâmetros
    public Veiculo() {
        marca = "Toyota";
        modelo = "Corolla";
        anoFabricacao = 2022;
        ehEletrico = false;
        especificacao = "Veículo a gasolina com motor 1.8.";
    }

    // com parâmetros
    public Veiculo(String m, String mo, int ano, boolean eletrico, String e) {
        marca = m;
        modelo = mo;
        anoFabricacao = ano;
        ehEletrico = eletrico;
        especificacao = e;
    }

    // marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // ano de fabricação
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // eletricidade
    public boolean isEhEletrico() {
        return ehEletrico;
    }

    public void setEhEletrico(boolean ehEletrico) {
        this.ehEletrico = ehEletrico;
    }

    // especificação
    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();  // usando o construtor sem parâmetros
        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Ano de Fabricação: " + v1.getAnoFabricacao());
        System.out.println("É elétrico: " + (v1.isEhEletrico() ? "Sim" : "Não"));
        System.out.println("Especificação: " + v1.getEspecificacao());

        // usando o construtor com parâmetros
        Veiculo v2 = new Veiculo("Tesla", "Model S", 2023, true, "Veículo totalmente elétrico com autonomia de 500 km.");
        System.out.println("\nMarca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());
        System.out.println("Ano de Fabricação: " + v2.getAnoFabricacao());
        System.out.println("É elétrico: " + (v2.isEhEletrico() ? "Sim" : "Não"));
        System.out.println("Especificação: " + v2.getEspecificacao());
    }
}
