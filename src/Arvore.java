import java.util.LinkedList;
import java.util.Queue;

public class Arvore {

    No raiz;

    public int contadordenosdaarvore(No raiz) {
        if (raiz == null) {
            return 0;
        }
        return 1 + contadordenosdaarvore(raiz.esquerda) + contadordenosdaarvore(raiz.direita);
    }

    public void PreOrdem(No raiz) {
        if (raiz != null) {
            System.out.println(raiz.valor + " ");
            PreOrdem(raiz.esquerda);
            PreOrdem(raiz.direita);
        }
    }

    public void EmOrdem(No raiz) {
        if (raiz != null) {
            EmOrdem(raiz.esquerda);
            System.out.println(raiz.valor + " ");
            EmOrdem(raiz.direita);
        }
    }

    public void PosOrdem(No raiz) {
        if (raiz != null) {
            PosOrdem(raiz.esquerda);
            PosOrdem(raiz.direita);
            System.out.println(raiz.valor + " ");
        }
    }

    public void buscaEmNivel() {
        if (raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.println(atual.valor + " ");

            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
    }

    public int contarNos(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.esquerda) + contarNos(no.direita);
    }

    public int contarFolhas(No no) {
        if (no == null) {
            return 0;
        }
        if (no.esquerda == null && no.direita == null) {
            return 1;
        }
        return contarFolhas(no.esquerda) + contarFolhas(no.direita);
    }
}

