package view;
import controller.VetorNegativos;
public class Principal {

	public static void main(String[] args) {
		VetorNegativos pc = new VetorNegativos();
		int vetor[] = {-8, 3 , -5, -10, 7};
		int i = vetor.length - 1; //i é o parâmetro que define o tamanho do vetor na classe construtora
		int negativos = pc.vetornegativos(vetor,i,0);
		System.out.println("quantidade de valores negativos: " +negativos);
}
}