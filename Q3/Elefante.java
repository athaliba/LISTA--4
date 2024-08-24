package Q3;

import Q2.AnimalAB;
public class Elefante extends AnimalAB {
    public Elefante(String nome) {
        super(nome, "Elefante");
    }

    @Override
    public void comer(double quantidadeComida) {
        super.comer(quantidadeComida);
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        super.moverse(distanciaPercorrida);
    }

    @Override
    public void dormir(int horasSono) {
        super.dormir(horasSono);
    }
}