public class Main {

    public static void main(String[] args) {
        
        // 1. Instanciando o primeiro personagem (utilizando new)
        Personagem heroi1 = new Personagem();
        
        // 2. Atribuindo valores diretamente aos atributos
        heroi1.nome = "Arthemis";
        heroi1.classe = "Arqueira";
        heroi1.nivel = 5;
        heroi1.pontosDeVida = 80;
        heroi1.poderBase = 12.5;

        // 1. Instanciando o segundo personagem (utilizando new)
        Personagem heroi2 = new Personagem();
        
        // 2. Atribuindo valores para o segundo personagem
        heroi2.nome = "Geralt";
        heroi2.classe = "Guerreiro";
        heroi2.nivel = 8;
        heroi2.pontosDeVida = 120;
        heroi2.poderBase = 25.0;

        // 3. Chamando o método exibirStatus() para cada personagem
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}