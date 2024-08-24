package Q5;

public class TestecomExemplos {
        public static void main(String[] args) {
            // Criando instâncias de animais terrestres
            Cachorro cachorro = new Cachorro("Rex", 5, "Casa", 25.0, 0.5);
            Gato gato = new Gato("Mittens", 3, "Apartamento", 4.0, 0.3);
            Elefante elefante = new Elefante("Dumbo", 10, "Savanna", 5000.0, 3.0);
            Leão leão = new Leão("Simba", 7, "Selva", 190.0, 1.2);
    
            // Criando instâncias de animais marinhos e voadores
            Peixe peixe = new Peixe("Nemo", 2, "Oceano", 0.5, 0.1, 2);
            Pombo pombo = new Pombo("Pipo", 1, "Cidade", 0.3, 0.4, 2, 0.6);
    
            // Demonstração das ações dos animais
            System.out.println("Ações do Cachorro:");
            cachorro.comer(2.0);
            cachorro.moverse(10.0);
            cachorro.dormir(8);
    
            System.out.println(); // Linha em branco para melhor visualização
    
            System.out.println("Ações do Gato:");
            gato.comer(0.5);
            gato.moverse(5.0);
            gato.dormir(12);
    
            System.out.println(); // Linha em branco para melhor visualização
    
            System.out.println("Ações do Elefante:");
            elefante.comer(50.0);
            elefante.moverse(20.0);
            elefante.dormir(6);
    
            System.out.println(); // Linha em branco para melhor visualização
    
            System.out.println("Ações do Leão:");
            leão.comer(15.0);
            leão.moverse(12.0);
            leão.dormir(10);
    
            System.out.println(); // Linha em branco para melhor visualização
    
            System.out.println("Ações do Peixe:");
            peixe.comer(0.1);
            peixe.nadar(15.0);
            peixe.dormir(7);
    
            System.out.println(); // Linha em branco para melhor visualização
    
            System.out.println("Ações do Pombo:");
            pombo.comer(0.05);
            pombo.voar(50.0);
            pombo.dormir(9);
        }
    }
    