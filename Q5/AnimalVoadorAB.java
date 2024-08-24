package Q5;


public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAsas;
    protected double envergaduraAsas;

    public AnimalVoadorAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int quantidadeAsas, double envergaduraAsas) {
        super(nome, idade, tipoAnimal, habitat, peso, altura);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public abstract void voar(double distanciaVoadora);
}
