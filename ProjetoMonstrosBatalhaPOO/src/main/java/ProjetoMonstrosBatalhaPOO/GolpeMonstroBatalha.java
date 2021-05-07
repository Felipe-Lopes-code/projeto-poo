package ProjetoMonstrosBatalhaPOO;

public class GolpeMonstroBatalha {
    /*
    private String nomeGolpeGrama1 = "Projetil de semente";
    private int poderGolpeGrama1 = 20;
    private String tipoGolpeGrama1 = "Grama";
    
    private String nomeGolpeGrama2 = "Explosao floral";
    private int poderGolpeGrama2 = 25;
    private String tipoGolpeGrama2 = "Grama";
    
    
    private String nomeGolpeFogo1 = "Chute labareda";
    private int poderGolpe1Fogo1 = 15;
    private String tipoGolpeFogo1 = "Fogo";
    
    private String nomeGolpeFogo2 = "Chamas azuis";
    private int poderGolpeFogo2 = 30;
    private String tipoGolpeFogo2 = "Fogo";
    
    
    private String nomeGolpeAgua1 = "Canhao de agua";
    private int poderGolpeAgua1 = 22;
    private String tipoGolpeAgua1 = "Agua";
    
    private String nomeGolpeAgua2 = "Martelo de agua";
    private int poderGolpeAgua2 = 22;
    private String tipoGolpeAgua2 = "Agua";
    
    
    private String nomeGolpeAr1 = "Explosão aerea";
    private int poderGolpeAr1 = 18;
    private String tipoGolpeAr1 = "Ar";
    
    private String nomeGolpeAr2 = "Tornado";
    private int poderGolpeAr2 = 30;
    private String tipoGolpeAr2 = "Ar";
    
    
    private String nomeGolpeEletrico1 = "Tiro relampago";
    private int poderGolpeEletrico1 = 27;
    private String tipoGolpeEletrico1 = "Eletrico";
    
    private String nomeGolpeEletrico2 = "Cativeiro eletrico";
    private int poderGolpeEletrico2 = 30;
    private String tipoGolpeEletrico2 = "Eletrico";
    
    
    private String nomeGolpeTerrestre1 = "Bastao de pedra";
    private int poderGolpeTerrestre1 = 20;
    private String tipoGolpeTerrestre1 = "Terrestre";
    
    private String nomeGolpeTerrestre2 = "Terremoto";
    private int poderGolpeTerrestre2 = 25;
    private String tipoGolpeTerrestre2 = "Terrestre";
    */
    
    private String nomeGolpeMonstro;
    private int poderGolpeMonstro;
    private String tipoGolpeMonstro;
    
    public void setGolpeMonstroBatalha(String nome, int poder, String tipo){
        this.nomeGolpeMonstro = nome;
        this.poderGolpeMonstro = poder;
        this.tipoGolpeMonstro = tipo;
    }
    
    public String getNometGolpeMonstro(){
        return this.nomeGolpeMonstro;
    }
    
    public int getPodertGolpeMonstro(){
        return this.poderGolpeMonstro;
    }
    
    public String getTipotGolpeMonstro(){
        return this.tipoGolpeMonstro;
    }
    
}
