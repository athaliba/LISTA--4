package Q4;

import Q2.AnimalAB;
public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssas;

    // Construtor
    public AnimalVoadorAB(String nome, String tipoAnimal, int quantidadeAssas, double envergaduraAssas) {
        super(nome, tipoAnimal);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssas = envergaduraAssas;
    }

}
