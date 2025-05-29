public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        // Criando manualmente a árvore
        arvore.raiz = new No(1);
        arvore.raiz.esquerda = new No(2);
        arvore.raiz.direita = new No(3);
        arvore.raiz.esquerda.esquerda = new No(4);
        arvore.raiz.esquerda.direita = new No(5);

        System.out.println("Pré-Ordem:");
        arvore.PreOrdem(arvore.raiz);

        System.out.println("\nEm-Ordem:");
        arvore.EmOrdem(arvore.raiz);

        System.out.println("\nPós-Ordem:");
        arvore.PosOrdem(arvore.raiz);

        System.out.println("\nTotal de nós (contadordenosdaarvore): " + arvore.contadordenosdaarvore(arvore.raiz));
        System.out.println("Total de nós (contarNos): " + arvore.contarNos(arvore.raiz));
        System.out.println("Total de nós folha: " + arvore.contarFolhas(arvore.raiz));
    }
}
