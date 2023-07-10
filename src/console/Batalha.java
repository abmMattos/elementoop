public class Batalha {
    
    public static boolean batalhar(Criatura minhaCriatura, Criatura adversaria){
        criarMensagemInicioBatalha(minhaCriatura, adversaria);
        boolean comecarOutraBatalha = Turno.fazerTurno(minhaCriatura, adversaria);
        if (comecarOutraBatalha) {
            criarMensagemVitoriaBatalha();
            return comecarOutraBatalha;
        }else{
            criarMensagemDerrotaBatalha();
            return comecarOutraBatalha;
        }
    }

    private static void criarMensagemInicioBatalha(Criatura minhaCriatura, Criatura adversaria){
        System.out.printf("\nQue comece a batalha entre:\n%s\tVS\n%s\n",minhaCriatura.criarMensagemCriaturaCriada(),adversaria.criarMensagemCriaturaCriada());
    }

    private static void criarMensagemVitoriaBatalha() {
        System.out.printf("\nParabéns! Você venceu a batalha!\n");
    }

    private static void criarMensagemDerrotaBatalha() {
        System.out.printf("\nQue pena, você perdeu a batalha!\n");
    }
}