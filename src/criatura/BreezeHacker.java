public class BreezeHacker extends Criatura {
    static final String NOME = "BreezeHacker";
    public BreezeHacker(){
        super(NOME, Tipo.AR);
    }

    @Override
    public void receberAtaquePorElemento(Criatura atacante){
    
        switch(atacante.getTipo()){
            case TERRA:
            case AGUA:
                receberDano((atacante.getAtaque() * atacante.getPoder()) / getDefesa());
                break;
            case FOGO:
                receberDano(((atacante.getAtaque() * atacante.getPoder()) / getDefesa()) * 2);
                break;
            default:
                System.out.println("ERROR!");
        }

    }// MÉTODO QUE CALCULA O VALOR DO DANO COM O FATOR DO ELEMENTO
    
    @Override
    public Criatura[] criarInimigos(){
        
        return new Criatura[]{new BurnCoder(), new StoneDev(), new WaveNerd()};

    } // MÉTODO QUE CRIA UM ARRAY DE INIMIGOS PARA O CONFRONTO

    @Override
	public String criarMensagemCriaturaCriada(){
		return "\nA poderosa criatura " + getNome() + " surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: " + getTipo().toString() + "\nPontos de vida: "+ getVida() + " \nPoder: " + getPoder() + "\nAtaque: " + getAtaque() + "\nDefesa: " + getDefesa() + "\nVelocidade: " + getVelocidade() + "\n\n";
	}

    @Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.printf("\nPrepare-se para ser varrido pela fúria dos ventos!\n");
	}

	@Override
	public void criarMensagemDeAtaqueElemental()    {
		System.out.printf("\nMeu ataque elemental fará você voar para longe, com a força do meu ciclone!\n");
	}
}
