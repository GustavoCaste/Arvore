package arvore;

public class No {
public No pai;
public No esquerda;
public No direita;
public int info;
public No(int info) {
pai = null;
esquerda = null;
direita = null;
this.info = info;
}
}
