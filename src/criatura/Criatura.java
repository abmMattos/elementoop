import java.util.Random;

public abstract class Criatura {
    Random random = new Random();
    private String nome;
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int vida;
    private int vidaInicial;
    private Tipo tipo;

    public Criatura(String nome, Tipo tipo){
        this.nome = nome;
        this.poder = 10 + random.nextInt(21);
		this.ataque = 5 + random.nextInt(11);
		this.defesa = 5 + random.nextInt(11);
		this.velocidade = 1 + random.nextInt(10);
		this.vida = 200 + random.nextInt(201);
		this.vidaInicial = this.vida;
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public int getPoder(){
        return this.poder;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public int getDefesa(){
        return this.defesa;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public int getVida(){
        return this.vida;
    }
    public Tipo getTipo(){
        return this.tipo;
    } // FIM DOS GETTERS

    public void setReporVida(){
        this.vida = vidaInicial;
    } // REPÕE VIDA INICIAL

    public void receberDano(int dano) {
        this.vida -= dano;
    } // RETIRA PONTOS DE VIDA DA CRIATURA APÓS UM ATAQUE

    public abstract void receberAtaquePorElemento(Criatura atacante); // MÉTODO ABSTRATO PARA GERAR ATAQUE ELEMENTAL NAS CRIATURAS

    public abstract Criatura[] criarInimigos(); // MÉTODO ABSTRATO QUE CRIA UM ARRAY DE INIMIGOS PARA O CONFRONTO

    public abstract String criarMensagemCriaturaCriada();

    public abstract void criarMensagemDeAtaqueFisico();

    public abstract void criarMensagemDeAtaqueElemental();

}
