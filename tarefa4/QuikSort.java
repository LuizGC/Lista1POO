public class QuikSort {

	public static void sort(int[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		quicksort(0, values.length - 1, values);
	}

	private static void quicksort(int low, int high, int[] values) {
		int i = low, j = high;
		int pivot = values[low + (high - low) / 2];

		while (i <= j) {

			while (values[i] < pivot) {
				i++;
			}

			while (values[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchange(i, j, values);
				i++;
				j--;
			}
		}

		if (low < j)
			quicksort(low, j, values);
		if (i < high)
			quicksort(i, high, values);
	}

	private static void exchange(int i, int j, int[] values) {
		int temp = values[i];
		values[i] = values[j];
		values[j] = temp;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int[] a = new int[10];
		int i;

		for (i = 0; i < a.length; i++)
			a[i] = (int) (Math.random() * 100);
		print(a);
		sort(a);
		print(a);
	}
}
