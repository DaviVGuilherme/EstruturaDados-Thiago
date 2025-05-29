public class No {
    int valor;
    No esquerda;
    No direita;
    int fatorBalanceamento;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.fatorBalanceamento = 0;
    }
}
