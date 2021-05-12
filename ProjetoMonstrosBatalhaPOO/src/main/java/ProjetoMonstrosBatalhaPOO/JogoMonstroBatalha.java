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
        int[] escolhaMonstroJogador1 = new int[3];
        int[] escolhaMonstroJogador2 = new int[3];

        int golpeMonstroJogador1, golpeMonstroJogador2, vezJogador1Atacar = 1, vezJogador2Atacar = 0;
        int acaoJogador1, acaoJogador2, monstroBatalhandoJog1, monstroBatalhandoJog2, monstrosVivosJogador1 = 3, monstrosVivosJogador2 = 3;
        int superEfetivoJogador1 = 0, superEfetivoJogador2 = 0;
        
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
        
        System.out.printf("VELOCIDADE\t" + this.monstro1.getVelocidadeMonstro() + "\t\t\t" + this.monstro2.getVelocidadeMonstro() + "\t\t" + this.monstro3.getVelocidadeMonstro() + "\t\t");
        System.out.println(this.monstro4.getVelocidadeMonstro() + "\t\t" + this.monstro5.getVelocidadeMonstro() + "\t\t\t" + this.monstro6.getVelocidadeMonstro());
        
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
            escolhaMonstroJogador1[i] = Integer.parseInt(entrada.nextLine());

            while(escolhaMonstroJogador1[i] != 1 && escolhaMonstroJogador1[i] != 2 && escolhaMonstroJogador1[i] != 3 && escolhaMonstroJogador1[i] != 4 && escolhaMonstroJogador1[i] != 5 && escolhaMonstroJogador1[i] != 6){
                System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                escolhaMonstroJogador1[i] = Integer.parseInt(entrada.nextLine());
            }

            while(i == 1 && escolhaMonstroJogador1[i] == escolhaMonstroJogador1[i-1] || i == 2 && escolhaMonstroJogador1[i] == escolhaMonstroJogador1[i-1] || i == 2 && escolhaMonstroJogador1[i] == escolhaMonstroJogador1[i-2]){

              System.out.println("OPCAO INVALIDA! VOCE PRECISA ESCOLHER MONSTROS DIFERENTES UM DO OUTRO. Digite o numero do Monstro desejado: ");
              escolhaMonstroJogador1[i] = Integer.parseInt(entrada.nextLine());
              
            }

            switch(escolhaMonstroJogador1[i]){
              case 1:
                monstrosJogador1[i] = this.monstro1;
                break;
              case 2:
                monstrosJogador1[i] = this.monstro2;
                break;
              case 3:
                monstrosJogador1[i] = this.monstro3;
                break;
              case 4:
                monstrosJogador1[i] = this.monstro4;
                break;
              case 5:
                monstrosJogador1[i] = this.monstro5;
                break;
              case 6:
                monstrosJogador1[i] = this.monstro6;
                break;
            }

        }

        System.out.println("\nJOGADOR 2, escolha seus 3 monstros de batalha de acordo com o seu respectivo numero");
        
        for(int i = 0; i < 3; i++){
            System.out.printf("%do Monstro: \n", i+1);
            escolhaMonstroJogador2[i] = Integer.parseInt(entrada.nextLine());

            while(escolhaMonstroJogador2[i] != 1 && escolhaMonstroJogador2[i] != 2 && escolhaMonstroJogador2[i] != 3 && escolhaMonstroJogador2[i] != 4 && escolhaMonstroJogador2[i] != 5 && escolhaMonstroJogador2[i] != 6){
                System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                escolhaMonstroJogador2[i] = Integer.parseInt(entrada.nextLine());
            }

            while(i == 1 && escolhaMonstroJogador2[i] == escolhaMonstroJogador2[i-1] || i == 2 && escolhaMonstroJogador2[i] == escolhaMonstroJogador2[i-1] || i == 2 && escolhaMonstroJogador2[i] == escolhaMonstroJogador2[i-2]){

              System.out.println("OPCAO INVALIDA! VOCE PRECISA ESCOLHER MONSTROS DIFERENTES UM DO OUTRO. Digite o numero do Monstro desejado: ");
              escolhaMonstroJogador2[i] = Integer.parseInt(entrada.nextLine());
              
            }

            switch(escolhaMonstroJogador2[i]){
              case 1:
                monstrosJogador2[i] = this.monstro1;
                break;
              case 2:
                monstrosJogador2[i] = this.monstro2;
                break;
              case 3:
                monstrosJogador2[i] = this.monstro3;
                break;
              case 4:
                monstrosJogador2[i] = this.monstro4;
                break;
              case 5:
                monstrosJogador2[i] = this.monstro5;
                break;
              case 6:
                monstrosJogador2[i] = this.monstro6;
                break;
            }

        }

        System.out.println("+++++++++++++++++++++ INICIO DA BATALHA +++++++++++++++++++++");

        System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
        System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
        
        monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
        
        while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3){
          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
        }

        System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
        System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
        
        monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
        
        while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3){
          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
        }

        while(monstrosVivosJogador1 > 0 && monstrosVivosJogador2 > 0){
          System.out.println("\nJOGADOR 1, o que deseja fazer? \n(1) - ATACAR \n(2) - TROCAR DE MONSTRO");
          acaoJogador1 = Integer.parseInt(entrada.nextLine());

          while(acaoJogador1 != 1 && acaoJogador1 != 2){
          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                acaoJogador1 = Integer.parseInt(entrada.nextLine());
          }

          System.out.println("\nJOGADOR 2, o que deseja fazer? \n(1) - ATACAR \n(2) - TROCAR DE MONSTRO");
          acaoJogador2 = Integer.parseInt(entrada.nextLine());

          while(acaoJogador2 != 1 && acaoJogador2 != 2){
          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado: ");
                acaoJogador2 = Integer.parseInt(entrada.nextLine());
          }

          if(acaoJogador1 == 2 || acaoJogador2 == 2){
            if(acaoJogador1 == 2){
              System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
              System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
              
              monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
              ///////////////////////////////////
              while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que não tenha sido eliminado: ");
                monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
              }
              
            }

            if(acaoJogador2 == 2){
              System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
              System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
              
              monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
              ////////////////////////////////

              while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
              }

            }
            continue;
          }
          
          else if(acaoJogador1 == 1 && acaoJogador2 == 1){
            System.out.println("AMBOS ATACAM");
            if(monstrosJogador1[monstroBatalhandoJog1-1].getVelocidadeMonstro() > monstrosJogador2[monstroBatalhandoJog2-1].getVelocidadeMonstro()){
              vezJogador1Atacar = 1;
              vezJogador2Atacar = 2;

              System.out.println("MONSTRO DO JOGADOR 1 EH MAIS RAPIDO");

            }
            else if(monstrosJogador1[monstroBatalhandoJog1-1].getVelocidadeMonstro() < monstrosJogador2[monstroBatalhandoJog2-1].getVelocidadeMonstro()){
              vezJogador1Atacar = 2;
              vezJogador2Atacar = 1;

              System.out.println("MONSTRO DO JOGADOR 2 EH MAIS RAPIDO");

            }
            else if(monstrosJogador1[monstroBatalhandoJog1-1].getForcaMonstro() > monstrosJogador2[monstroBatalhandoJog2-1].getForcaMonstro()){
              vezJogador1Atacar = 1;
              vezJogador2Atacar = 2;

              System.out.println("MONSTRO DO JOGADOR 1 POSSUI MAIS FORCA");

            }
            else if(monstrosJogador1[monstroBatalhandoJog1-1].getForcaMonstro() < monstrosJogador2[monstroBatalhandoJog2-1].getForcaMonstro()){
              vezJogador1Atacar = 2;
              vezJogador2Atacar = 1;

              System.out.println("MONSTRO DO JOGADOR 2 POSSUI MAIS FORCA");
            }
            else if(monstrosJogador1[monstroBatalhandoJog1-1].getDefesaMonstro() > monstrosJogador2[monstroBatalhandoJog2-1].getDefesaMonstro()){
              vezJogador1Atacar = 1;
              vezJogador2Atacar = 2;

              System.out.println("MONSTRO DO JOGADOR 1 POSSUI MAIOR DEFESA");
            }
            else if(monstrosJogador1[monstroBatalhandoJog1-1].getDefesaMonstro() < monstrosJogador2[monstroBatalhandoJog2-1].getDefesaMonstro()){
              vezJogador1Atacar = 2;
              vezJogador2Atacar = 1;

              System.out.println("MONSTRO DO JOGADOR 2 POSSUI MAIOR DEFESA");
            }
          }
          
          
          if(acaoJogador1 == 1 && vezJogador1Atacar == 1){//else if(acaoJogador1 == 1){
            
            System.out.println("\nJOGADOR 1, SELECIONE O GOLPE DESEJADO: \n(1) - Golpe 1 \n(2) - Golpe 2");
            golpeMonstroJogador1 = Integer.parseInt(entrada.nextLine());
            
            while(golpeMonstroJogador1 != 1 && golpeMonstroJogador1 != 2){
            System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Golpe desejado: ");
                  golpeMonstroJogador1 = Integer.parseInt(entrada.nextLine());
            }
            
            if(golpeMonstroJogador1 == 1){
                if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() > 0 && monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro() > 0){//if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() >= monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro()){

                monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro());

                if(monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Grama" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Agua" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Agua" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Fogo" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Fogo" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Grama" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Ar" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Terrestre" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Eletrico" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Ar"){
                
                    monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro());
                    
                    System.out.println("SUPER EFETIVO!!!");


                    superEfetivoJogador1 = 1;

                    if(superEfetivoJogador1 == 1){
                      if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                      System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro()*2 + "\nMonstro eliminado...");

                      monstrosVivosJogador2 -= 1;
                        if(monstrosVivosJogador2 == 0){
                        break;
                      }

                      System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                      System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                      
                      monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                      
                      while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                        System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                        monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());

                      }

                      }
                      else{
                        System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro()*2 + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                      }
                  }


                }

                if(superEfetivoJogador1 == 0){
                  if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                  System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro() + "\nMonstro eliminado...");

                  monstrosVivosJogador2 -= 1;
                  if(monstrosVivosJogador2 == 0){
                    break;
                  }

                  System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                  System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                  
                  monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                  
                  while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                    System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                    monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                  }

                  
                  }
                  else{
                    System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro() + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                  }
                }
                superEfetivoJogador1 = 0;
              }
              else{
                System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
              }
                
            }
            
            else if(golpeMonstroJogador1 == 2){
              if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() > 0 && monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro() > 0){//if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() >= monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro()){

                monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2());

                if(monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Grama" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Agua" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Agua" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Fogo" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Fogo" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Grama" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Ar" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Terrestre" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Eletrico" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Ar"){
                
                    monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2());
                    System.out.println("SUPER EFETIVO!!!");



                    superEfetivoJogador1 = 1;

                    if(superEfetivoJogador1 == 1){
                      if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                      System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2()*2 + "\nMonstro eliminado...");

                      monstrosVivosJogador2 -= 1;
                        if(monstrosVivosJogador2 == 0){
                        break;
                      }

                      System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                      System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                      
                      monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                      
                      while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                        System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                        monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());

                      }

                      }
                      else{
                        System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2()*2 + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                      }
                  }


                }

                if(superEfetivoJogador1 == 0){
                  if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                  System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2() + "\nMonstro eliminado...");

                  monstrosVivosJogador2 -= 1;
                  if(monstrosVivosJogador2 == 0){
                    break;
                  }

                  System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                  System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                  
                  monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                  
                  while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                    System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                    monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                  }

                  
                  }
                  else{
                    System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2() + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                  }
                }
                superEfetivoJogador1 = 0;
                
              }

              else{
                System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
              }
            
            }


            if(vezJogador1Atacar == 1){

              System.out.println("\nJOGADOR 2, SELECIONE O GOLPE DESEJADO: \n(1) - Golpe 1 \n(2) - Golpe 2");
              golpeMonstroJogador2 = Integer.parseInt(entrada.nextLine());
              
              while(golpeMonstroJogador2 != 1 && golpeMonstroJogador2 != 2){
              System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Golpe desejado: ");
                    golpeMonstroJogador2 = Integer.parseInt(entrada.nextLine());
              }
              
              if(golpeMonstroJogador2 == 1){
                  if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() > 0 && monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro() > 0){//if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() >= monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro()){

                  monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro());

                  if(monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Grama" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Agua" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Agua" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Fogo" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Fogo" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Grama" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Ar" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Terrestre" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Eletrico" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Ar"){
                  
                      monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro());
                      
                      System.out.println("SUPER EFETIVO!!!");


                      superEfetivoJogador2 = 1;

                      if(superEfetivoJogador2 == 1){
                        if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                        System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro()*2 + "\nMonstro eliminado...");

                        monstrosVivosJogador1 -= 1;
                          if(monstrosVivosJogador1 == 0){
                          break;
                        }

                        System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                        System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                        
                        monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                        
                        while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                          monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());

                        }

                        }
                        else{
                          System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro()*2 + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                        }
                    }


                  }

                  if(superEfetivoJogador2 == 0){
                    if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                    System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro() + "\nMonstro eliminado...");

                    monstrosVivosJogador1 -= 1;
                    if(monstrosVivosJogador1 == 0){
                      break;
                    }

                    System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                    System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                    
                    monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                    
                    while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                      System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                      monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                    }

                    
                    }
                    else{
                      System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro() + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                    }
                  }
                  superEfetivoJogador2 = 0;
                }

                else{
                  System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
                }
                  
              }
              
              else if(golpeMonstroJogador2 == 2){
                if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() > 0 && monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro() > 0){//if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() >= monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro()){

                  monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2());

                  if(monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Grama" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Agua" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Agua" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Fogo" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Fogo" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Grama" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Ar" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Terrestre" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Eletrico" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Ar"){
                  
                      monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2());
                      System.out.println("SUPER EFETIVO!!!");



                      superEfetivoJogador2 = 1;

                      if(superEfetivoJogador2 == 1){
                        if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                        System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2()*2 + "\nMonstro eliminado...");

                        monstrosVivosJogador1 -= 1;
                          if(monstrosVivosJogador1 == 0){
                          break;
                        }

                        System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                        System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                        
                        monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                        
                        while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                          monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());

                        }

                        }
                        else{
                          System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2()*2 + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                        }
                    }


                  }

                  if(superEfetivoJogador2 == 0){
                    if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                    System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2() + "\nMonstro eliminado...");

                    monstrosVivosJogador1 -= 1;
                    if(monstrosVivosJogador1 == 0){
                      break;
                    }

                    System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                    System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                    
                    monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                    
                    while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                      System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                      monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                    }

                    
                    }
                    else{
                      System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2() + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                    }
                  }
                  superEfetivoJogador2 = 0;
                  
                }

                else{
                  System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
                }
              
              }
              vezJogador1Atacar = 1;
            }


          }

          
          if(acaoJogador2 == 1 || vezJogador2Atacar == 1){ 
            
            if(vezJogador2Atacar == 2){
              continue;
            }  
            
            System.out.println("\nJOGADOR 2, SELECIONE O GOLPE DESEJADO: \n(1) - Golpe 1 \n(2) - Golpe 2");
            golpeMonstroJogador2 = Integer.parseInt(entrada.nextLine());
            
            while(golpeMonstroJogador2 != 1 && golpeMonstroJogador2 != 2){
            System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Golpe desejado: ");
                  golpeMonstroJogador2 = Integer.parseInt(entrada.nextLine());
            }
            
            if(golpeMonstroJogador2 == 1){
                if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() > 0 && monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro() > 0){//if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() >= monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro()){

                monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro());

                if(monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Grama" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Agua" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Agua" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Fogo" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Fogo" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Grama" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Ar" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Terrestre" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro() == "Eletrico" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Ar"){
                
                    monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro());
                    
                    System.out.println("SUPER EFETIVO!!!");


                    superEfetivoJogador2 = 1;

                    if(superEfetivoJogador2 == 1){
                      if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                      System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro()*2 + "\nMonstro eliminado...");

                      monstrosVivosJogador1 -= 1;
                        if(monstrosVivosJogador1 == 0){
                        break;
                      }

                      System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                      System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                      
                      monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                      
                      while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                        System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                        monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());

                      }

                      }
                      else{
                        System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro()*2 + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                      }
                  }


                }

                if(superEfetivoJogador2 == 0){
                  if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                  System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro() + "\nMonstro eliminado...");

                  monstrosVivosJogador1 -= 1;
                  if(monstrosVivosJogador1 == 0){
                    break;
                  }

                  System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                  System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                  
                  monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                  
                  while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                    System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                    monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                  }

                  
                  }
                  else{
                    System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro() + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                  }
                }
                superEfetivoJogador2 = 0;
              }

              else{
                System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
              }
                
            }
           
            else if(golpeMonstroJogador2 == 2){
              if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() > 0 && monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro() > 0){//if(monstrosJogador2[monstroBatalhandoJog2 - 1].getForcaMonstro() >= monstrosJogador1[monstroBatalhandoJog1 - 1].getDefesaMonstro()){

                monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2());

                if(monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Grama" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Agua" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Agua" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Fogo" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Fogo" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Grama" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Ar" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Terrestre" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador2[monstroBatalhandoJog2 - 1].getTipotGolpeMonstro2() == "Eletrico" && monstrosJogador1[monstroBatalhandoJog1 - 1].getTipoMonstro() == "Ar"){
                
                    monstrosJogador1[monstroBatalhandoJog1 - 1].setVidaMonstro(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() - monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2());
                    System.out.println("SUPER EFETIVO!!!");



                    superEfetivoJogador2 = 1;

                    if(superEfetivoJogador2 == 1){
                      if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                      System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2()*2 + "\nMonstro eliminado...");

                      monstrosVivosJogador1 -= 1;
                        if(monstrosVivosJogador1 == 0){
                        break;
                      }

                      System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                      System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                      
                      monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                      
                      while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                        System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                        monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());

                      }

                      }
                      else{
                        System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2()*2 + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                      }
                  }


                }

                if(superEfetivoJogador2 == 0){
                  if(monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                  System.out.println("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2() + "\nMonstro eliminado...");

                  monstrosVivosJogador1 -= 1;
                  if(monstrosVivosJogador1 == 0){
                    break;
                  }

                  System.out.println("\nJOGADOR 1, escolha o monstro que irá batalhar: ");
                  System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                  
                  monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                  
                  while(monstroBatalhandoJog1 != 1 && monstroBatalhandoJog1 != 2 && monstroBatalhandoJog1 != 3 || monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro() <= 0){
                    System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                    monstroBatalhandoJog1 = Integer.parseInt(entrada.nextLine());
                  }

                  
                  }
                  else{
                    System.out.printf("\nMonstro do JOGADOR 1 sofreu dano \n\nDano recebido: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getPodertGolpeMonstro2() + "\nPontos de vida atuais: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getVidaMonstro());
                  }
                }
                superEfetivoJogador2 = 0;
                
              }

              else{
                System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
              }
            
            }


            if(vezJogador2Atacar == 1){

              System.out.println("\nJOGADOR 1, SELECIONE O GOLPE DESEJADO: \n(1) - Golpe 1 \n(2) - Golpe 2");
              golpeMonstroJogador1 = Integer.parseInt(entrada.nextLine());
              
              while(golpeMonstroJogador1 != 1 && golpeMonstroJogador1 != 2){
              System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Golpe desejado: ");
                    golpeMonstroJogador1 = Integer.parseInt(entrada.nextLine());
              }
              
              if(golpeMonstroJogador1 == 1){
                  if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() > 0 && monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro() > 0){//if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() >= monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro()){

                  monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro());

                  if(monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Grama" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Agua" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Agua" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Fogo" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Fogo" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Grama" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Ar" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Terrestre" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro() == "Eletrico" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Ar"){
                  
                      monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro());
                      
                      System.out.println("SUPER EFETIVO!!!");


                      superEfetivoJogador1 = 1;

                      if(superEfetivoJogador1 == 1){
                        if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                        System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro()*2 + "\nMonstro eliminado...");

                        monstrosVivosJogador2 -= 1;
                          if(monstrosVivosJogador2 == 0){
                          break;
                        }

                        System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                        System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                        
                        monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                        
                        while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                          monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());

                        }

                        }
                        else{
                          System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro()*2 + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                        }
                    }


                  }

                  if(superEfetivoJogador1 == 0){
                    if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                    System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro() + "\nMonstro eliminado...");

                    monstrosVivosJogador2 -= 1;
                    if(monstrosVivosJogador2 == 0){
                      break;
                    }

                    System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                    System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                    
                    monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                    
                    while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                      System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                      monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                    }

                    
                    }
                    else{
                      System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro() + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                    }
                  }
                  superEfetivoJogador1 = 0;
                }
                else{
                  System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
                }
                  
              }
              
              else if(golpeMonstroJogador1 == 2){
                if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() > 0 && monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro() > 0){//if(monstrosJogador1[monstroBatalhandoJog1 - 1].getForcaMonstro() >= monstrosJogador2[monstroBatalhandoJog2 - 1].getDefesaMonstro()){

                  monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2());

                  if(monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Grama" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Agua" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Agua" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Fogo" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Fogo" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Grama" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Ar" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Terrestre" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Terrestre" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Eletrico" || monstrosJogador1[monstroBatalhandoJog1 - 1].getTipotGolpeMonstro2() == "Eletrico" && monstrosJogador2[monstroBatalhandoJog2 - 1].getTipoMonstro() == "Ar"){
                  
                      monstrosJogador2[monstroBatalhandoJog2 - 1].setVidaMonstro(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() - monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2());
                      System.out.println("SUPER EFETIVO!!!");



                      superEfetivoJogador1 = 1;

                      if(superEfetivoJogador1 == 1){
                        if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                        System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2()*2 + "\nMonstro eliminado...");

                        monstrosVivosJogador2 -= 1;
                          if(monstrosVivosJogador2 == 0){
                          break;
                        }

                        System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                        System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                        
                        monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                        
                        while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                          System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                          monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());

                        }

                        }
                        else{
                          System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2()*2 + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                        }
                    }


                  }

                  if(superEfetivoJogador1 == 0){
                    if(monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                    System.out.println("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2() + "\nMonstro eliminado...");

                    monstrosVivosJogador2 -= 1;
                    if(monstrosVivosJogador2 == 0){
                      break;
                    }

                    System.out.println("\nJOGADOR 2, escolha o monstro que irá batalhar: ");
                    System.out.println("(1) 1o monstro escolhido \n(2) 2o monstro escollhido \n(3) 3o monstro escolhido");
                    
                    monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                    
                    while(monstroBatalhandoJog2 != 1 && monstroBatalhandoJog2 != 2 && monstroBatalhandoJog2 != 3 || monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro() <= 0){
                      System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE. Digite o numero do Monstro desejado e que nao tenha sido eliminado: ");
                      monstroBatalhandoJog2 = Integer.parseInt(entrada.nextLine());
                    }

                    
                    }
                    else{
                      System.out.printf("\nMonstro do JOGADOR 2 sofreu dano \n\nDano recebido: " + monstrosJogador1[monstroBatalhandoJog1 - 1].getPodertGolpeMonstro2() + "\nPontos de vida atuais: " + monstrosJogador2[monstroBatalhandoJog2 - 1].getVidaMonstro());
                    }
                  }
                  superEfetivoJogador1 = 0;
                  
                }

                else{
                  System.out.println("Monstro do JOGADOR 2 não sofreu dano...");
                }
              
              }

              vezJogador2Atacar = 0;

            }


          }


        }

        if(monstrosVivosJogador2 == 0){
          System.out.println("O JOGADOR 1 VENCEU!!!" + monstrosVivosJogador2);
        }
        else if(monstrosVivosJogador1 == 0){
          System.out.println("O JOGADOR 2 VENCEU!!!" + monstrosVivosJogador1);
        }

        

    }
                    
}