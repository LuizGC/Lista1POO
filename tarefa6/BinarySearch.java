public class BinarySearch {

	private static Boolean search(int[] a, int valor) {
		if (a == null || a.length == 0) {
			return false;
		}
		return binary(a, valor);
	}
	
	public static void sort(int[] a) {
		int n = a.length;
		int incr = n / 2;
		while (incr >= 1) {
			for (int i = incr; i < n; i++) {
				int temp = a[i];
				int j = i;
				while (j >= incr && temp < a[j - incr]) {
					a[j] = a[j - incr];
					j -= incr;
				}
				a[j] = temp;
			}
			incr /= 2;
		}
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	private static Boolean binary(int[] array, int valor) {
		int left = 0;
		int right = array.length - 1;
		int valorMeio;

		while (left <= right) {
			valorMeio = left + ((right - left) / 2);
			if (array[valorMeio] < valor) {
				left = valorMeio + 1;
			} else if (array[valorMeio] > valor) {
				right = valorMeio - 1;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			int[] a = new int[100];
			int valor;
			
			for (int i = 0; i < a.length; i++)
				a[i] = (int) (Math.random() * 100)+100;
			System.out.println("Vetor Gerado!");
			print(a);
			sort(a);
			System.out.println("\nRealizar Busca!");
			
			for (int i=1; i < args.length; i++) {
				valor = Integer.parseInt(args[i]);
				System.out.println(valor + " existe no vetor? " + (search(a, valor) ? "Sim" : "Não"));
	        }
		}else 
			System.out.println("Entre com os valores na forma: java BinarySearch n1 n2 n3 ...");
	}
}
