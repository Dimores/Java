package classes;

public class Pilha {

    private int vetor[];

    public Pilha() {
        this.vetor = new int[1];
        //valor simbolico para indicar que a pilha est� vazia
        vetor[0] = -1;
    }

    public void Push(int elemento) {
        //Verifica se a pilha n�o � vazia, pois caso ela seja apenas deve substituir o -1 pelo valor que deve se empilhar
        if (!this.isEmpty()) {
            //Cria um vetor auxilar de mesmo tamanho da pilha para guardar o valores j� existentes
            int vetAux[] = new int[vetor.length];
            for (int i = 0; i < vetor.length; i++) {
                vetAux[i] = vetor[i];
            }

            //Aumenta em 1 o tamanho da pilha
            vetor = new int[vetor.length + 1];

            //Preenche a pilha com os elementos que ela j� possuia de tras pra frente deixando a primeira posi��o vazia
            for (int i = vetAux.length; i > 0; i--) {
                vetor[i] = vetAux[i - 1];
            }
        }
        //Armazena o parametro na primeira posi��o da pilha
        vetor[0] = elemento;
    }

    public int Pop() {
        if (vetor.length > 1) {
            //Cria um vetor auxilar de mesmo tamanho da pilha para guardar o valores j� existentes
            int vetAux[] = new int[vetor.length];
            for (int i = 0; i < vetor.length; i++) {
                vetAux[i] = vetor[i];
            }

            //Diminui em 1 o tamanho da pilha
            vetor = new int[vetor.length - 1];

            //Adiciona todos os valores depois da primeira posi��o da pilha anterior na pilha nova , assim excluindo o topo da pilha
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = vetAux[i + 1];
            }

            //retorna o valor que foi desempilhado
            return vetAux[0];
        } else {
            vetor[0] = -1;
            return -1;
        }
    }

    public boolean isEmpty() {
        if (vetor.length == 1 && vetor[0] == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void Print() {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
