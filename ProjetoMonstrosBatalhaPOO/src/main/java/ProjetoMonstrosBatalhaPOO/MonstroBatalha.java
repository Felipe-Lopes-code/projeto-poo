package ProjetoMonstrosBatalhaPOO;


public class MonstroBatalha {
    private String nomeMonstro;
    private String tipoMonstro;
    private int vidaMonstro;
    private int forcaMonstro;
    private int defesaMonstro;
    private int velocidadeMonstro;
    

    public void setMonstroBatalha(String nomeMonstro, String tipoMonstro, int vidaMonstro, int forcaMonstro, int defesaMonstro, int velocidadeMonstro) {
        this.nomeMonstro = nomeMonstro;
        this.tipoMonstro = tipoMonstro;
        this.vidaMonstro = vidaMonstro;
        this.forcaMonstro = forcaMonstro;
        this.defesaMonstro = defesaMonstro;
        this.velocidadeMonstro = velocidadeMonstro;
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
}
