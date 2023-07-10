import java.util.Random;

public class Turno {
    static Random random = new Random();
    private static boolean estaVivo = true;
    public static boolean fazerTurno(Criatura minhaCriatura, Criatura criaturaAdversaria){
        
        if(minhaCriatura.getVelocidade() > criaturaAdversaria.getVelocidade()){ // QUEM TIVER MAIOR VELOCIDADE INICIA O TURNO
            do{
                
                fazerAtaque(minhaCriatura, criaturaAdversaria);
                if(criaturaAdversaria.getVida() > 0){
                    receberAtaque(minhaCriatura, criaturaAdversaria);
                }

            }while(minhaCriatura.getVida() > 0 && criaturaAdversaria.getVida() > 0);  

        }else{
            do{
                receberAtaque(minhaCriatura, criaturaAdversaria);
                if(minhaCriatura.getVida() > 0){
                    fazerAtaque(minhaCriatura, criaturaAdversaria);
                    
                }
                
            }while(minhaCriatura.getVida() > 0 && criaturaAdversaria.getVida() > 0);
        }
        if(minhaCriatura.getVida() > 0){
            return estaVivo;
        }else{
            return estaVivo = false;
        }
    } // REALIZA OS ATAQUES ENTRE AS CRIATURAS CHAMANDO MÉTODOS DE ATAQUE

    private static void fazerAtaque(Criatura minhaCriatura, Criatura adversaria){
        int escolha = Menus.escolherAtaque();
        switch(escolha){
            case 1:
                minhaCriatura.criarMensagemDeAtaqueElemental();
                adversaria.receberAtaquePorElemento(minhaCriatura);
                mensagemDanoRecebido(minhaCriatura, adversaria);
                break;
            case 2:
                minhaCriatura.criarMensagemDeAtaqueFisico();
                adversaria.receberDano((minhaCriatura.getAtaque() * minhaCriatura.getPoder()) / adversaria.getDefesa());     
                mensagemDanoRecebido(minhaCriatura, adversaria);
                break;
        }
    } // JOGADOR ESCOLHE A OPÇÃO DE ATAQUE

    private static void receberAtaque(Criatura minhaCriatura, Criatura adversaria){
        switch(1 + random.nextInt(2)){
            case 1:
                adversaria.criarMensagemDeAtaqueElemental();
                minhaCriatura.receberAtaquePorElemento(adversaria);
                mensagemDanoRecebido(adversaria, minhaCriatura);
                break;
            case 2:
                adversaria.criarMensagemDeAtaqueFisico();
                minhaCriatura.receberDano((adversaria.getAtaque() * adversaria.getPoder()) / minhaCriatura.getDefesa());
                mensagemDanoRecebido(adversaria, minhaCriatura);
                break;
        }
    } // MÁQ. ESCOLHE OPÇÃO DE ATAQUE RANDOM

    private static void mensagemDanoRecebido(Criatura atacando, Criatura atacada){
        System.out.printf("\n%s atacou %s deixando ela com %d de vida!\n",atacando.getNome(),atacada.getNome(),atacada.getVida());
    }
} 
