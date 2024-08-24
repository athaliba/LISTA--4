package Q3;

import Q2.AnimalAB;
public class Cachorro extends AnimalAB {
    public Cachorro(String nome) {
        super(nome, "Cachorro");
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