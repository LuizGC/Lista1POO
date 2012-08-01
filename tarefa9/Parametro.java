public class Parametro {
	public static void main(String[] args) {
		int[] v = new int[4];
		v[0] = (int) 5.25;
		v[1] = 1;
		v[2] = 2;
		v[3] = 3;
		troca1(v[0], v[1]);
		imprime(v);
		troca2(v);
		imprime(v);
	}

	public static void troca1(int a, int b) {
		int aux = a;
		a = b;
		b = aux;
	}

	public static void troca2(int[] v) {
		int aux;
		for (int i = 0; i < v.length / 2; i++) {
			aux = v[i];
			v[i] = v[v.length - i - 1];
			v[v.length - i - 1] = aux;
		}
	}

	public static void imprime(int[] v) {
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
	}
}
