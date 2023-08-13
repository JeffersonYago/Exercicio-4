package controller;
public class VetorNegativos {
public VetorNegativos() {
		super();
	}
public int vetornegativos(int vet[], int i, int neg) {
	  if(i < 0) {
// i foi definido como parâmetro de busca no vetor, se ele for menor que 0, a busca será encerrada
	return neg;
			  }
	  if(vet[i] < 0) {
		    neg = neg+1;
//verificando se o valor é negativo
}
	  return vetornegativos(vet, i-1, neg);
}
}