import java.util.Random;

public class VetorPalavraImagem {

    private int tamanho; //referente ao tamanho atual do arquivo
    private PalavraImagem vetor[]; //referente ao segredo e a figura que serao armazenados no vetor

    //metodo contrutor que cria um vetor de registro com o tamanho dado, mas com tamana=ho atual 0
    public VetorPalavraImagem(int t) {
        this.vetor = new PalavraImagem[t];
        this.tamanho = 0;
    }

    //metodo que insere um registro no vetor
    public void insereVetor(PalavraImagem registro) {
        this.vetor[this.tamanho] = registro;
        this.tamanho++;
    }

    //metodo para sortear aleatoriamente um elemento no vetor
    public PalavraImagem sorteio() {
        Random posicao = new Random();
        int ind = posicao.nextInt(this.tamanho);
        return this.vetor[ind];
    }

    //metodo que retorna o tamanho do vetor
    public int getTamanho() {
        return this.vetor.length;
    }

    //metodo que retorna uma determinada posicao do vetor
    public PalavraImagem getIndVetor(int ind) {
        return this.vetor[ind];
    }
}
