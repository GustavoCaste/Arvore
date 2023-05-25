package arvore;

import java.util.Scanner;

public class Arvore {
	Scanner sc = new Scanner(System.in);
	
	
	public No raiz;
	public int tamanho;

	public Arvore() {
		raiz = null;
	}

	public boolean inserir(int info) {
// O no local inicia como raiz
		No local = raiz;
// Cria o no
		No no = new No(info);
		tamanho++;
		
// Se nao existe nenhum elemento na lista, coloca-o como raiz
		if (raiz == null) {
			raiz = no;
			return true;
		}
// Enquanto local nao for nulo
		while (local != null) {
// o pai do no vai ser o local
			no.pai = local;
			
			if (info == local.info) {
// se ja existir, nao insere e retorna falso
				tamanho--;
				return false;
			} else if (info < local.info) {
				// se for menor que o local, entao eh filho da esquerda
				local = local.esquerda;
				
				if (local == null) {
					// se ao ir para esquerda for nulo, coloca ali
					no.pai.esquerda = no;
					
					return true;
				}
			}
			else {
				// senao eh filho da direita
				local = local.direita;
				
				if (local == null) {
					// se for para direita e for nulo, coloca o no nesse local
					no.pai.direita = no;
					
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void imprimirTamanho(Arvore arvore) {
		System.out.println("Tamanho da arvore: "+arvore.tamanho);
	}
	
	public void inserirEsquerda(int n) {
		
		if(raiz == null) {
			raiz = new No(n);
			return;
		}
		No atual = raiz;
		while(atual.esquerda != null) {
			atual = atual.esquerda;
		}
		atual.esquerda = new No(n);
		tamanho++;
	}
	
public void inserirDireita(int n) {
		
		if(raiz == null) {
			raiz = new No(n);
			return;
		}
		No atual = raiz;
		while(atual.direita != null) {
			atual = atual.direita;
		}
		atual.direita = new No(n);
		tamanho++;
	}

public void retirarEsquerda() {
	No atual = raiz;
	No pai = raiz;
	while(atual.esquerda != null) {
		pai = atual;
		atual = atual.esquerda;
	}atual = pai;
	atual.esquerda = null;
}
public void retirarDireita() {
	No atual = raiz;
	No pai = raiz;
	while(atual.direita != null) {
		pai = atual;
		atual = atual.direita;
	}atual = pai;
	atual.direita = null;
}

public boolean verificarFolha(int novo) {
	No atual = new No(novo);
	
	acharNo(atual, atual.info);
	
	if(atual.esquerda != null || atual.direita != null) {
		System.out.println("Não é uma folha");
		return false;
	}else {
		System.out.println("É uma folha");
		return true;
	}
	
}
	
	
	public void emOrdem(No atual) {
		if(atual != null) {
			emOrdem(atual.esquerda);
			System.out.println(atual.info);
			emOrdem(atual.direita);
		}
	}
	public void posOrdem(No atual) {
		if(atual != null) {
			posOrdem(atual.esquerda);
			posOrdem(atual.direita);
			System.out.println(atual.info);
		}
	}
	public void preOrdem(No atual) {
		if(atual != null) {
			System.out.println(atual.info);
			preOrdem(atual.esquerda);
			preOrdem(atual.direita);
		}
	}
	public void imprimirEsquerda(No atual) {
		if(atual.esquerda != null) {
			emOrdem(atual.esquerda);
			
		}}
	
	
	
	
	// Método para percorrer a árvore usando busca em profundidade (DFS)
    public boolean acharNo(No atual, int valor) {
        // Caso base: se o nó atual for nulo, retornamos falso
        if (atual == null) {
            return false;
        }

        // Verificamos se o valor está no nó atual
        if (atual.info == valor) {
            return true;
        }

        // Chamamos a recursão para os filhos esquerdo e direito
        boolean acharEsquerda = acharNo(atual.esquerda, valor);
        boolean acharDireita = acharNo(atual.direita, valor);

        // Retornamos verdadeiro se o valor foi encontrado em algum dos lados
        return acharEsquerda || acharDireita;
    }
	
	
	
	
	
	
}