package Q3;

import Q2.AnimalAB;
public class Leão extends AnimalAB {
    public Leão(String nome) {
        super(nome, "Leão");
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