package ProjetoMonstrosBatalhaPOO;

public final class GolpeMonstroBatalha {
    
    private String nomeGolpeMonstro;
    private int poderGolpeMonstro;
    private String tipoGolpeMonstro;

    public GolpeMonstroBatalha(String nomeGolpeMonstro, int poderGolpeMonstro, String tipoGolpeMonstro) {
        this.setGolpeMonstroBatalha(nomeGolpeMonstro, poderGolpeMonstro, tipoGolpeMonstro);
    }
    
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
