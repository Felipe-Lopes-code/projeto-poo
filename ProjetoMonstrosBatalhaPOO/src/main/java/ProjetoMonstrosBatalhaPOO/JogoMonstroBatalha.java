package ProjetoMonstrosBatalhaPOO;

public class JogoMonstroBatalha {
    private MonstroBatalha monstro1;
    private MonstroBatalha monstro2;
    private MonstroBatalha monstro3;
    private MonstroBatalha monstro4;
    private MonstroBatalha monstro5;
    private MonstroBatalha monstro6;

    public JogoMonstroBatalha() {
    }

    public JogoMonstroBatalha(MonstroBatalha monstro1, MonstroBatalha monstro2, MonstroBatalha monstro3, MonstroBatalha monstro4, MonstroBatalha monstro5, MonstroBatalha monstro6) {
        this.monstro1 = monstro1;
        this.monstro2 = monstro2;
        this.monstro3 = monstro3;
        this.monstro4 = monstro4;
        this.monstro5 = monstro5;
        this.monstro6 = monstro6;
    }
    
    public void jogarMonstroBatalha(){
        System.out.println("=================================================================================================");
        System.out.println("                      ESCOLHA O SEU MOSNTRO DE BATALHA");
        System.out.println("=================================================================================================");
        System.out.println("MONSTRO 1\t" + "MOSNTRO 2\t"+ "MONSTRO 3\t" + "MONSTRO 4\t" + "MONSTRO 5\t" + "MONSTRO 6\t");
        System.out.printf(this.monstro1.getNomeMonstro() + "\t\t" + this.monstro2.getNomeMonstro() + "\t\t" + this.monstro3.getNomeMonstro() + "\t\t");
        System.out.printf(this.monstro4.getNomeMonstro() + "\t\t" + this.monstro5.getNomeMonstro() + "\t\t" + this.monstro6.getNomeMonstro() + "\n");
    }
            
}
