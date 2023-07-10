public class BurnCoder extends Criatura{
    static final String NOME = "BurnCoder";
    public BurnCoder(){
        super(NOME, Tipo.FOGO);
    }

    @Override
    public void receberAtaquePorElemento(Criatura atacante){
        
        switch(atacante.getTipo()){
            case TERRA:
            case AR:
                receberDano((atacante.getAtaque() * atacante.getPoder()) / getDefesa());
                break;
            case AGUA:
                receberDano(((atacante.getAtaque() * atacante.getPoder()) / getDefesa()) * 2);
                break;
            default:
                System.out.println("ERROR!");
        }
        
    }// MÉTODO QUE CALCULA O VALOR DO DANO COM O FATOR DO ELEMENTO
    
    @Override
    public Criatura[] criarInimigos(){
       
        return new Criatura[]{new WaveNerd(), new StoneDev(), new BreezeHacker()};
    
    } // MÉTODO QUE CRIA UM ARRAY DE INIMIGOS PARA O CONFRONTO

    @Override
	public String criarMensagemCriaturaCriada(){
		return "\nA poderosa criatura " + getNome() + " surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: " + getTipo().toString() + "\nPontos de vida: "+ getVida() + " \nPoder: " + getPoder() + "\nAtaque: " + getAtaque() + "\nDefesa: " + getDefesa() + "\nVelocidade: " + getVelocidade() + "\n\n";
	}

    @Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.printf("\nSinta o calor da minha ira!\n");
	}

	@Override
	public void criarMensagemDeAtaqueElemental()	{
		System.out.printf("\nMeu ataque elemental fará você ser carbonizado pela pela minha chuva de lava!\n");
	}

}
