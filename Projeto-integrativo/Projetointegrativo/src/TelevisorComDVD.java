public class TelevisorComDVD {
    protected String tamanho;
    protected int canal;
    protected String modelo;

    public  TelevisorComDVD(){
        canal=31;
        modelo="LG";
        tamanho="20 polegadas";
    }

    public String eject (){
        return "Eject ativido";
    }
    
    public String play (){
        return "Função play ativada";
    }
    
    public String stop(){
        return "Função stop ativada";
    }
    
    public String pause (){
        return "Função pause ativada";
    }
    public static void main (String args []){
        TelevisorComDVD tvdvd1= new TelevisorComDVD();
        
        System.out.println(" "+tvdvd1.eject());
        System.out.println(" "+tvdvd1.stop());
        System.out.println(" "+tvdvd1.play());
        System.out.println(" "+tvdvd1.pause());
    }

}

