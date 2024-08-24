package Q5;

public class Cachorro extends AnimalTerrestreAB {
    public Cachorro(String nome, int idade, String habitat, double peso, double altura) {
        super(nome, idade, "Cachorro", habitat, peso, altura, 4);
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
