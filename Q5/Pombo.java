package Q5;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String habitat, double peso, double altura, int quantidadeAsas, double envergaduraAsas) {
        super(nome, idade, "Pombo", habitat, peso, altura, quantidadeAsas, envergaduraAsas);
    }

    @Override
    public void voar(double distanciaVoadora) {
        this.distanciaPercorrida += distanciaVoadora;
        System.out.println(nome + " voou " + distanciaVoadora + " metros.");
    }

    @Override
    public void comer(double quantidadeComida) {
        super.comer(quantidadeComida);
    }

    @Override
    public void dormir(int horasSono) {
        super.dormir(horasSono);
    }
}