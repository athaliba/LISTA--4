package Q5;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String habitat, double peso, double altura, int quantidadeNadadeiras) {
        super(nome, idade, "Peixe", habitat, peso, altura, quantidadeNadadeiras);
    }

    @Override
    public void nadar(double distanciaNadada) {
        this.distanciaPercorrida += distanciaNadada;
        System.out.println(nome + " nadou " + distanciaNadada + " metros.");
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