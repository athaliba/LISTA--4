package Q2;

import Q1.AnimalIF;
public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected double quantidadeComida;
    protected double distanciaPercorrida;
    protected int horasSono;

    // Construtor
    public AnimalAB(String nome, String tipoAnimal) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.quantidadeComida = 0;
        this.distanciaPercorrida = 0;
        this.horasSono = 0;
    }

    @Override
    public void comer(double quantidadeComida) {
        this.quantidadeComida += quantidadeComida;
        imprimirEstado();
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        imprimirEstado();
    }

    @Override
    public void dormir(int horasSono) {
        this.horasSono += horasSono;
        imprimirEstado();
    }

    // Estado atual do animal
    protected void imprimirEstado() {
        System.out.println(nome + " (" + tipoAnimal + ") - Comida ingerida: " + quantidadeComida + "g, Distância percorrida: " + distanciaPercorrida + "m, Horas de sono: " + horasSono);
    }
}