public class QuestaoErro {
	//public static void main(int[] args) { Não segue a convenção de classe main em java, o parametro deve ser uma array de string.
	public static void main(String[] args) {
		double d = 4.5;
		double d2;
		int i = 10;
		char c = (char) 64;
		d2 = d * 10.5;
		i += c;
		int k = i + (int) d * i++;
		do {
			// k = i / d2; Não pode converter d2 para inteiro.
			k = i / (int) d2;
			i++;
		} while (i < 10);
		System.out.println("K="+k);
		for (int j = 0; j < i; j++) {
			System.out.println("j = " + j);
		}
		// System.out.println(j+i); O atributo j foi criado centro do bloco
		// "for", potanto não existe fora dele.
	}
}
