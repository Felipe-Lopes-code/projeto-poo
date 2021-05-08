package ProjetoMonstrosBatalhaPOO;


public class MonstroBatalha {
    private String nomeMonstro;
    private String tipoMonstro;
    private int vidaMonstro;
    private int forcaMonstro;
    private int defesaMonstro;
    private int velocidadeMonstro;
    private GolpeMonstroBatalha golpeMonstroBatalha;
    private GolpeMonstroBatalha golpeMonstroBatalha2;

    public MonstroBatalha() {
    }

    public MonstroBatalha(String nomeMonstro, String tipoMonstro, int vidaMonstro, int forcaMonstro, int defesaMonstro, int velocidadeMonstro, GolpeMonstroBatalha golpeMonstroBatalha, GolpeMonstroBatalha golpeMonstroBatalha2) {
        this.nomeMonstro = nomeMonstro;
        this.tipoMonstro = tipoMonstro;
        this.vidaMonstro = vidaMonstro;
        this.forcaMonstro = forcaMonstro;
        this.defesaMonstro = defesaMonstro;
        this.velocidadeMonstro = velocidadeMonstro;
        this.golpeMonstroBatalha = golpeMonstroBatalha;
        this.golpeMonstroBatalha2 = golpeMonstroBatalha2;
    }

   
    public void setMonstroBatalha(String nomeMonstro, String tipoMonstro, int vidaMonstro, int forcaMonstro, int defesaMonstro, int velocidadeMonstro, GolpeMonstroBatalha golpeMonstroBatalha, GolpeMonstroBatalha golpeMonstroBatalha2) {
        this.nomeMonstro = nomeMonstro;
        this.tipoMonstro = tipoMonstro;
        this.vidaMonstro = vidaMonstro;
        this.forcaMonstro = forcaMonstro;
        this.defesaMonstro = defesaMonstro;
        this.velocidadeMonstro = velocidadeMonstro;
        this.golpeMonstroBatalha = golpeMonstroBatalha;
        this.golpeMonstroBatalha2 = golpeMonstroBatalha2;
    }
          
    
    public String getNomeMonstro(){
        return this.nomeMonstro;
    }
    
    public String getTipoMonstro(){
        return this.tipoMonstro;
    }
    
    public int getVidaMonstro(){
        return this.vidaMonstro;
    }
    
    public int getForcaMonstro(){
        return this.forcaMonstro;
    }
    
    public int getDefesaMonstro(){
        return this.defesaMonstro;
    }
    
    public int getVelocidadeMonstro(){
        return this.velocidadeMonstro;
    }
    
    
    
    public String getNometGolpeMonstro(){
        return this.golpeMonstroBatalha.getNometGolpeMonstro();
    }
    
    public int getPodertGolpeMonstro(){
        return this.golpeMonstroBatalha.getPodertGolpeMonstro();
    }
    
    public String getTipotGolpeMonstro(){
        return this.golpeMonstroBatalha.getTipotGolpeMonstro();
    }
    
    
    
    public GolpeMonstroBatalha getGolpeMonstroBatalha(){
        return this.golpeMonstroBatalha;
    }
}
