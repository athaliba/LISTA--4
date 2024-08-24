package Q3;

public class zEXEMPLO {
    public static void main(String[] args) {
        Cachorro rex = new Cachorro("Rex");
        Gato mimi = new Gato("Mimi");
        Elefante dumbo = new Elefante("Dumbo");
        Leão simba = new Leão("Simba");

        rex.comer(150);// Comendo 150g de comida
        rex.moverse(300);// Andando 300m
        rex.dormir(6);// Dormindo por 6 horas

        mimi.comer(100);
        mimi.moverse(50);
        mimi.dormir(12);

        dumbo.comer(500);
        dumbo.moverse(200);
        dumbo.dormir(8);

        simba.comer(250);
        simba.moverse(400);
        simba.dormir(7);
    }
}
