// Classe base do desafio Nível Novato
public class Personagem {

    // Atributos exigidos pelas especificações do desafio
    String nome;
    String classe;
    int nivel;
   int pontosDeVida;
    double poderBase;

    // Método responsável por exibir no console as informações formatadas
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
       System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println(); // Pula uma linha entre os personagens
    }
}

