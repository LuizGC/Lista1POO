public class Impressao {
	public static void main(String[] args) {
		String[] args2 = args;
		args2[3] = "30.8";
		double[] d = { 2, 4, 4.5 };
		double[] d2 = new double[d.length];
		int i;
		for (i = 0; i < d.length; i += (int) d[i]) {
			d[i] = Double.parseDouble(args[i + 1]);
		}
		i = 0;
		while (i < d.length - 1) {
			d2[i] = d[i] + Double.parseDouble(args[i]);
			i++;
		}
		d2[d.length - 1] = d[d.length - 1];
		for (i = 0; i < args2.length; i++)
			System.out.print(args2[i] + " ");
		System.out.println();
		for (i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
		for (i = 0; i < d2.length; i++)
			System.out.print(d2[i] + " ");
		System.out.println();
		switch ((int) d[0]) {
		case 3:
			System.out.println("string 3");
			break;
		case 4:
			System.out.println("string 4");
			break;
		case 20:
			System.out.println("string 20");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
