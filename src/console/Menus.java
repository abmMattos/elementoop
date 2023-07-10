import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);
    
    public static int iniciar(){
        System.out.println("==========    Bem Vindo!  ==========");
        System.out.println("Para começar o jogo aperte  -->  1");
        System.out.println("Para sair do jogo aperte  -->  2");
        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                break;
            case 2:
                confirmar();
                iniciar();
            default:
                System.out.println("Opção inválida, tente novamente!");
                iniciar();
        }
        return escolha;
    } // Dá boas vindas e inicia o jogo

    public static int escolherCampeao(){
        System.out.println("==========================");
        System.out.println("Escolha seu campeão!");
        System.out.println("1 - StoneDev");
        System.out.println("2 - WaveNerd");
        System.out.println("3 - BurnCoder");
        System.out.println("4 - BreezeHacker");
        System.out.println("5 - Sair do jogo");
        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                confirmar();
                escolherCampeao();
        }
        return escolha;
    } // Menu para escolha do campeão

    public static void iniciarTorneio(){
        System.out.println("==========================");
        System.out.println("Para começar o torneio digite  -->  1");
        System.out.println("Para sair do programa digite  -->  2");
        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                break;
            case 2:
                confirmar();
                iniciarTorneio();
            default:
                System.out.println("Opção inválida, tente novamente!");
                iniciarTorneio();
        } // PERGUNTA SE O JOGADOR GOSTARIA DE INICIAR O TORNEIO

    }

    public static int escolherAtaque(){
        System.out.println("==========================");
        System.out.println("Sua vez!");
        System.out.println("1  --  Fazer um ataque elemental!");
        System.out.println("2  --  Fazer um ataque físico!");
        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                escolherAtaque();
        }
        return escolha;
    } // ESCOLHE O TIPO DE ATAQUE QUE O JOGADOR QUER FAZER
    
    private static void confirmar(){
        System.out.println("==========================");
        System.out.println("Tem certeza que deseja sair?");
        System.out.println("1 - SIM!");
        System.out.println("2 - NÃO!");
        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                System.exit(0);
                break;
            case 2:
                sc.nextLine();
                break;
        } 
    } // CONFIRMAR A SAÍDA DO JOGADOR

    public static void vitoria(){
        System.out.println("==========================");
        System.out.println("Parabéns!");
        System.out.println("Você é o grande vencedor do torneio!");
    } // PARABENIZA A VITÓRIA

    public static void derrota(){
        System.out.println("==========================");
        System.out.println("Sinto muito...");
        System.out.println("Não foi dessa vez!");
        System.exit(0);
    } // INFORMA A DERROTA
}
