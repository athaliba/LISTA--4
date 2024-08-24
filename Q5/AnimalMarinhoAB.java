package Q5;

public abstract class AnimalMarinhoAB extends AnimalAB {
    protected int quantidadeNadadeiras;

    public AnimalMarinhoAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int quantidadeNadadeiras) {
        super(nome, idade, tipoAnimal, habitat, peso, altura);
        this.quantidadeNadadeiras = quantidadeNadadeiras;
    }
    
    public abstract void nadar(double distanciaNadada);
}
