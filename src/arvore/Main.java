package arvore;

public class Main {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		int [] info = { 5, 7, 2, 1, 8, 9, 8, 7, 3 , 0 };
		// Caso um elemento ja exista, ele pode ser excluido da lista, para apenas conter elementos nao repetidos.
		for (int i = 0; i < 10; i++) {
		boolean inseriu = arvore.inserir(info[i]);
		System.out.println("inseriu " + info[i] + " : " + inseriu);
		}
		System.out.println("In-Ordem: ");
		arvore.emOrdem(arvore.raiz);
		System.out.println("\n\nPos-Ordem");
		arvore.posOrdem(arvore.raiz);
		System.out.println("\n\nPre-Ordem");
		arvore.preOrdem(arvore.raiz);
		}
		}