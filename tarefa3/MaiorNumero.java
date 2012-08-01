public class MaiorNumero {
    public static void main (String[] args){
       if (args.length > 0) {
           double valor;
           double maior = Double.parseDouble(args[0]);
           double menor = Double.parseDouble(args[0]);
           for (int i=1; i < args.length; i++) {
               valor = Double.parseDouble(args[i]);
               if (valor > maior)
                   maior = valor;
               if (valor < menor)
                   menor = valor;
           }
           System.out.println("Maior valor = " + maior);
           System.out.println("Menor valor = " + menor);
       }
       else System.out.println("Entre com os valores na forma: java MaiorNumero n1 n2 n3 ...");
    }
}
