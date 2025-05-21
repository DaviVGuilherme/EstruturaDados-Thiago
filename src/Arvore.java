public class Arvore {

    No raiz;

    public int contadordenosdaarvore(No raiz) {
        if (raiz == null) return 0;
        return 1 + contadordenosdaarvore(raiz.esquerda) + contadordenosdaarvore(raiz.direita);



        }
    }
