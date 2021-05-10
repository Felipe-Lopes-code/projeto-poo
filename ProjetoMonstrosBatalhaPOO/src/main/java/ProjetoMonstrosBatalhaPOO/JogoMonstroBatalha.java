package ProjetoMonstrosBatalhaPOO;


import java.util.Scanner;

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
        int[] escolhaJogador1 = new int[3];
        int[] escolhaJogador2 = new int[3];
        int acaoJogador1, acaoJogador2, monstroBatalhandoJog1, monstroBatalhandoJog2;
        MonstroBatalha[] monstrosJogador1 = new MonstroBatalha[3];
        MonstroBatalha[] monstrosJogador2 = new MonstroBatalha[3];
        
        System.out.println("=====================================================================================================================================");
        System.out.println("                                                    TABELA MOSNTRO DE BATALHA");
        System.out.println("=====================================================================================================================================");
        System.out.println("\t\tMONSTRO 1\t\t" + "MOSNTRO 2\t"+ "MONSTRO 3\t" + "MONSTRO 4\t" + "MONSTRO 5\t\t" + "MONSTRO 6\t");
        System.out.printf("NOME\t\t" + this.monstro1.getNomeMonstro() + "\t\t\t" + this.monstro2.getNomeMonstro() + "\t\t" + this.monstro3.getNomeMonstro() + "\t\t");
        System.out.println(this.monstro4.getNomeMonstro() + "\t\t" + this.monstro5.getNomeMonstro() + "\t\t\t" + this.monstro6.getNomeMonstro());
        
        System.out.printf("TIPO\t\t" + this.monstro1.getTipoMonstro() + "\t\t\t" + this.monstro2.getTipoMonstro() + "\t\t" + this.monstro3.getTipoMonstro() + "\t\t");
        System.out.println(this.monstro4.getTipoMonstro() + "\t\t" + this.monstro5.getTipoMonstro() + "\t\t\t" + this.monstro6.getTipoMonstro());
        
        System.out.printf("VIDA\t\t" + this.monstro1.getVidaMonstro() + "\t\t\t" + this.monstro2.getVidaMonstro() + "\t\t" + this.monstro3.getVidaMonstro() + "\t\t");
        System.out.println(this.monstro4.getVidaMonstro() + "\t\t" + this.monstro5.getVidaMonstro() + "\t\t\t" + this.monstro6.getVidaMonstro());
        
        System.out.printf("FORCA\t\t" + this.monstro1.getForcaMonstro() + "\t\t\t" + this.monstro2.getForcaMonstro() + "\t\t" + this.monstro3.getForcaMonstro() + "\t\t");
        System.out.println(this.monstro4.getForcaMonstro() + "\t\t" + this.monstro5.getForcaMonstro() + "\t\t\t" + this.monstro6.getForcaMonstro());
        
        System.out.printf("DEFESA\t\t" + this.monstro1.getDefesaMonstro() + "\t\t\t" + this.monstro2.getDefesaMonstro() + "\t\t" + this.monstro3.getDefesaMonstro() + "\t\t");
        System.out.println(this.monstro4.getDefesaMonstro() + "\t\t" + this.monstro5.getDefesaMonstro() + "\t\t\t" + this.monstro6.getDefesaMonstro());
        
        System.out.printf("VELOCIDADE\t" + this.monstro1.getVidaMonstro() + "\t\t\t" + this.monstro2.getVidaMonstro() + "\t\t" + this.monstro3.getVidaMonstro() + "\t\t");
        System.out.println(this.monstro4.getVidaMonstro() + "\t\t" + this.monstro5.getVidaMonstro() + "\t\t\t" + this.monstro6.getVidaMonstro());
        
        System.out.println("_____________________________________________________________________________________________________________________________________");
        System.out.println("                                                             GOLPES");
        System.out.println("+++ GOLPE 1 +++");
        System.out.printf("NOME\t\t" + this.monstro1.getNometGolpeMonstro() + "\t" + this.monstro2.getNometGolpeMonstro() + "\t" + this.monstro3.getNometGolpeMonstro() + "\t");
        System.out.println(this.monstro4.getNometGolpeMonstro() + "\t\t" + this.monstro5.getNometGolpeMonstro() + "\t" + this.monstro6.getNometGolpeMonstro());
        
        System.out.printf("PODER\t\t" + this.monstro1.getPodertGolpeMonstro() + "\t\t\t" + this.monstro2.getPodertGolpeMonstro() + "\t\t" + this.monstro3.getPodertGolpeMonstro() + "\t\t");
        System.out.println(this.monstro4.getPodertGolpeMonstro() + "\t\t" + this.monstro5.getPodertGolpeMonstro() + "\t\t\t" + this.monstro6.getPodertGolpeMonstro());
        
        System.out.printf("TIPO\t\t" + this.monstro1.getTipotGolpeMonstro() + "\t\t\t" + this.monstro2.getTipotGolpeMonstro() + "\t\t" + this.monstro3.getTipotGolpeMonstro() + "\t\t");
        System.out.println(this.monstro4.getTipotGolpeMonstro() + "\t\t" + this.monstro5.getTipotGolpeMonstro() + "\t\t\t" + this.monstro6.getTipotGolpeMonstro());
        
        System.out.println("\n+++ GOLPE 2 +++");
        System.out.printf("NOME\t\t" + this.monstro1.getNometGolpeMonstro2() + "\t\t" + this.monstro2.getNometGolpeMonstro2() + "\t" + this.monstro3.getNometGolpeMonstro2() + "\t");
        System.out.println(this.monstro4.getNometGolpeMonstro2() + "\t" + this.monstro5.getNometGolpeMonstro2() + "\t\t" + this.monstro6.getNometGolpeMonstro2());
        
        System.out.printf("PODER\t\t" + this.monstro1.getPodertGolpeMonstro2() + "\t\t\t" + this.monstro2.getPodertGolpeMonstro2() + "\t\t" + this.monstro3.getPodertGolpeMonstro2() + "\t\t");
        System.out.println(this.monstro4.getPodertGolpeMonstro2() + "\t\t" + this.monstro5.getPodertGolpeMonstro2() + "\t\t\t" + this.monstro6.getPodertGolpeMonstro2());
        
        System.out.printf("TIPO\t\t" + this.monstro1.getTipotGolpeMonstro2() + "\t\t\t" + this.monstro2.getTipotGolpeMonstro2() + "\t\t" + this.monstro3.getTipotGolpeMonstro2() + "\t\t");
        System.out.println(this.monstro4.getTipotGolpeMonstro2() + "\t\t" + this.monstro5.getTipotGolpeMonstro2() + "\t\t" + this.monstro6.getTipotGolpeMonstro2());
        
        System.out.println("=====================================================================================================================================");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nESCOLHAS DE MONSTROS \n(1) Monstro 1 \n(2) Monstro 2 \n(3) Monstro 3 \n(4) Monstro 4 \n(5) Monstro 5 \n(6) Monstro 6");
        
        System.out.println("\nJOGADOR 1, escolha seus 3 monstros de batalha de acordo com o seu respectivo numero");
        
        for(int i = 0; i < 3; i++){
            System.out.printf("%do Monstro: \n", i+1);
            escolhaJogador1[i] = Integer.parseInt(entrada.nextLine());

            while(escolhaJogador1[i] != 1 && escolhaJogador1[i] != 2 && escolhaJogador1[i] != 3 && escolhaJogador1[i] != 4 && escolhaJogador1[i] != 5 && escolhaJogador1[i] != 6){
                System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                escolhaJogador1[i] = Integer.parseInt(entrada.nextLine());
            }

            switch(escolhaJogador1[i]){
              case 1:
                monstrosJogador1[i] = this.monstro1;
              case 2:
                monstrosJogador1[i] = this.monstro2;
              case 3:
                monstrosJogador1[i] = this.monstro3;
              case 4:
                monstrosJogador1[i] = this.monstro4;
              case 5:
                monstrosJogador1[i] = this.monstro5;
              case 6:
                monstrosJogador1[i] = this.monstro6;
            }


            //System.out.println(escolhaJogador1[i]);
        }

        System.out.println("\nJOGADOR 2, escolha seus 3 monstros de batalha de acordo com o seu respectivo numero");
        
        for(int i = 0; i < 3; i++){
            System.out.printf("%do Monstro: \n", i+1);
            escolhaJogador2[i] = Integer.parseInt(entrada.nextLine());

            while(escolhaJogador2[i] != 1 && escolhaJogador2[i] != 2 && escolhaJogador2[i] != 3 && escolhaJogador2[i] != 4 && escolhaJogador2[i] != 5 && escolhaJogador2[i] != 6){
                System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                escolhaJogador2[i] = Integer.parseInt(entrada.nextLine());
            }

            switch(escolhaJogador2[i]){
              case 1:
                monstrosJogador2[i] = this.monstro1;
              case 2:
                monstrosJogador2[i] = this.monstro2;
              case 3:
                monstrosJogador2[i] = this.monstro3;
              case 4:
                monstrosJogador2[i] = this.monstro4;
              case 5:
                monstrosJogador2[i] = this.monstro5;
              case 6:
                monstrosJogador2[i] = this.monstro6;
            }
        }

        System.out.println("+++++++++++++++++++++ INICIO DA BATALHA +++++++++++++++++++++");

        System.out.println("JOGADOR 1, escolha o monstro que irá batalhar: ");
        
    }
            
}