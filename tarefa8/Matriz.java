public class Matriz {

	
	private static void imprimir(int[][] a){
		for(int i = 0; i < a.length ;i++){
			System.out.print("|");
			for(int j = 0; j < a[i].length-1; j++){
				System.out.print(" "+a[i][j]+" -");
			}
			System.out.print(" "+a[i][a[i].length-1]+" ");
			System.out.println("|");
		}
		System.out.println();
	}
	
	public static Boolean simetrica(int[][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j] != a[j][i]){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		for(int i = 0; i < a.length ;i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = (int) (Math.random() * 4);
			}
		}
		imprimir(a);
		System.out.println("Essa matriz é simétrica? " + (simetrica(a) ? "Sim":"Não"));
		
	}
	
}
