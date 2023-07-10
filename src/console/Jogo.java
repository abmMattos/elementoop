public class Jogo {

    private Criatura minhaCriatura;
    private Criatura[] criaturasAdversarias;
    private final int NUMERO_DE_BATALHAS = 3;
    private boolean venceu = true; 

    public void iniciar(){
        Menus.iniciar();
        int escolha = Menus.escolherCampeao();
        escolherCampeao(escolha);
        Menus.iniciarTorneio();
        iniciarBatalha();
    } 

    public void escolherCampeao(int escolha){
        
        switch(escolha){
            case 1:
                escolherStoneDev();
                break;
            case 2:
                escolherWaveNerd();
                break;
            case 3:
                escolherBurnCoder();
                break;
            case 4:
                escolherBreezeHacker();
                break;
        }
    } 

    public void iniciarBatalha(){
        for (int i = 0; i < NUMERO_DE_BATALHAS; i++) {
            minhaCriatura.setReporVida(); // RESTAURA VIDA INICIAL NO COMEÇO DE CADA BATALHA
            if (!venceu) {
                Menus.derrota();
                System.exit(0);
            }else if (venceu && i < NUMERO_DE_BATALHAS){
                venceu = Batalha.batalhar(minhaCriatura, criaturasAdversarias[i]);
            }
        }

        Menus.vitoria();

    } // INICIA A BATALHA CONTRA UM ADVERSARIO ATÉ PERDER

    private void escolherStoneDev(){
        minhaCriatura = new StoneDev();
        criaturasAdversarias = minhaCriatura.criarInimigos();
        System.out.println(minhaCriatura.criarMensagemCriaturaCriada());
    }

    private void escolherWaveNerd(){
        minhaCriatura = new WaveNerd();
        criaturasAdversarias = minhaCriatura.criarInimigos();
        System.out.println(minhaCriatura.criarMensagemCriaturaCriada());
    }

    private void escolherBurnCoder(){
        minhaCriatura = new BurnCoder();
        criaturasAdversarias = minhaCriatura.criarInimigos();
        System.out.println(minhaCriatura.criarMensagemCriaturaCriada());
    }

    private void escolherBreezeHacker(){
        minhaCriatura = new BreezeHacker();
        criaturasAdversarias = minhaCriatura.criarInimigos();
        System.out.println(minhaCriatura.criarMensagemCriaturaCriada());
    } // FIM DOS MÉTODOS QUE CRIAM O OBJETO DO CAMPEÃO E SEUS ADVERSÁRIOS

}
