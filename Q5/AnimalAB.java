package Q5;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected int idade;
    protected String tipoAnimal;
    protected String habitat;
    protected double peso;
    protected double altura;
    protected double comidaConsumida;
    protected int horasDormidas;
    protected double distanciaPercorrida;

    public AnimalAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.peso = peso;
        this.altura = altura;
        this.comidaConsumida = 0;
        this.horasDormidas = 0;
        this.distanciaPercorrida = 0;
    }

    @Override
    public void comer(double quantidadeComida) {
        comidaConsumida += quantidadeComida;
        peso += quantidadeComida; 
        System.out.println(nome + " comeu " + quantidadeComida + "kg de comida.");
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        System.out.println(nome + " andou " + distanciaPercorrida + " metros.");
    }

    @Override
    public void dormir(int horasSono) {
        this.horasDormidas += horasSono;
        System.out.println(nome + " dormiu por " + horasSono + " horas.");
    }
}