package ProjetoMonstrosBatalhaPOO;

public class Main {

    public static void main(String[] args) {
       MonstroBatalha monstroVerde = new MonstroBatalha("Dipsy", "Grama", 130, 50, 55, 45, new GolpeMonstroBatalha("Projetil de semente", 20, "Grama"), new GolpeMonstroBatalha("Chute Labareda", 15, "Fogo"));
       MonstroBatalha monstroVermelho = new MonstroBatalha("Po", "Fogo", 125, 45, 50, 50, new GolpeMonstroBatalha("Chamas azuis", 30, "Fogo"), new GolpeMonstroBatalha("Canhao de agua", 22, "Agua"));
       MonstroBatalha monstroAzul = new MonstroBatalha("Tinky", "Agua", 150, 35, 45, 40, new GolpeMonstroBatalha("Martelo de agua", 22, "Agua"), new GolpeMonstroBatalha("Tiro relampago", 27, "Eletrico"));
       MonstroBatalha monstroBranco = new MonstroBatalha("Winky", "Ar", 120, 55, 55, 50, new GolpeMonstroBatalha("Tornado", 30, "Ar"), new GolpeMonstroBatalha("Explosao floral", 25, "Grama"));
       MonstroBatalha monstroAmarelo = new MonstroBatalha("LaaLaa", "Eletrico", 135, 45, 50, 45, new GolpeMonstroBatalha("Cativeiro eletrico", 30, "Eletrico"), new GolpeMonstroBatalha("Bastao de pedra", 20, "Terrestre"));
       MonstroBatalha monstroMarrom = new MonstroBatalha("Evil Dipsy", "Terrestre", 140, 40, 45, 40, new GolpeMonstroBatalha("Terremoto", 25, "Terrestre"), new GolpeMonstroBatalha("Explosao aerea", 18, "Ar"));
       
       JogoMonstroBatalha gameMonstros = new JogoMonstroBatalha(monstroVerde, monstroVermelho, monstroAzul, monstroBranco, monstroAmarelo, monstroMarrom);
       
       gameMonstros.jogarMonstroBatalha();
       
       //monstroVerde.jogarMonstroBatalha();
       //System.out.println(monstroAzul.getTipotGolpeMonstro());
    }
    
}
