public class WaveNerd extends Criatura{
    static final String NOME = "WaveNerd";
    public WaveNerd(){
        super(NOME, Tipo.AGUA);
    }

    @Override
    public void receberAtaquePorElemento(Criatura atacante){

        switch(atacante.getTipo()){
            case AR:
            case FOGO:
                receberDano((atacante.getAtaque() * atacante.getPoder()) / getDefesa());
                break;
            case TERRA:
                receberDano(((atacante.getAtaque() * atacante.getPoder()) / getDefesa()) * 2);
                break;
            default:
                System.out.println("ERROR!");
        }
        
    }// MÉTODO QUE CALCULA O VALOR DO DANO COM O FATOR DO ELEMENTO
    
    @Override
    public Criatura[] criarInimigos(){
        
        return new Criatura[]{new BurnCoder(), new StoneDev(), new BreezeHacker()};

    } // MÉTODO QUE CRIA UM ARRAY DE INIMIGOS PARA O CONFRONTO
    
    @Override
	public String criarMensagemCriaturaCriada(){
		return "\nA poderosa criatura " + getNome() + " surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: " + getTipo().toString() + "\nPontos de vida: "+ getVida() + " \nPoder: " + getPoder() + "\nAtaque: " + getAtaque() + "\nDefesa: " + getDefesa() + "\nVelocidade: " + getVelocidade() + "\n\n";
	}

    @Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.printf("\nPrepare-se para ser engolido pelas ondas implacáveis!\n");
	}

	@Override
	public void criarMensagemDeAtaqueElemental()	{
		System.out.printf("\nMeu ataque elemental é um grande maremoto, acho melhor você procurar um lugar em terra firme!\n");
	}
    
}
