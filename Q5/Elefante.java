package Q5;

public class Elefante extends AnimalTerrestreAB {
    public Elefante(String nome, int idade, String habitat, double peso, double altura) {
        super(nome, idade, "Elefante", habitat, peso, altura, 4);
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