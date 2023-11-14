package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt a = new ArvoreInt();
		int [] vetor = {30, 15, 60, 10, 20, 40, 80};
		for (int i: vetor) {
			a.insert(i);
		}
		try {
			a.prefixSearch();
			a.infixSearch();
			a.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("O atravessamento que apresenta os dados em ordem crescente é o Em Ordem");
		try {
			a.remove(60);
			a.infixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
