public class OneTime {

	public static int eliminaRepetidos(int[] vet) {
		int numElemRep = 0;
		for (int numElemUnico = 1; numElemUnico < vet.length - numElemRep; numElemUnico++) {
			for (int i = 0; i < numElemUnico; i++) {
				if (vet[i] == vet[numElemUnico]) {
					numElemRep++;
					vet[numElemUnico] = vet[numElemUnico]
							+ vet[vet.length - numElemRep];
					vet[vet.length - numElemRep] = vet[numElemUnico]
							- vet[vet.length - numElemRep];
					vet[numElemUnico] = vet[numElemUnico]
							- vet[vet.length - numElemRep];
					numElemUnico--;
					break;
				}
			}
		}
		return vet.length - numElemRep;
	}

	public static void imprime(int[] vet, int numElem) {
		for (int i = 0; i < numElem; i++)
			System.out.print(vet[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++)
			a[i] = (int) (Math.random() * 9)+12;
		System.out.print("Vetor com repetidos: ");
		imprime(a, a.length);
		System.out.print("Vetor sem repetidos: ");
		imprime(a, eliminaRepetidos(a));
	}
}
