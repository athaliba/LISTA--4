package Q4;

import Q2.AnimalAB;
public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    // Construtor
    public AnimalTerrestreAB(String nome, String tipoAnimal, int quantidadePatas) {
        super(nome, tipoAnimal);
        this.quantidadePatas = quantidadePatas;
    }

}
