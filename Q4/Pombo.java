package Q4;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int quantidadeAssas, double envergaduraAssas) {
        super(nome, "Pombo", quantidadeAssas, envergaduraAssas);
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