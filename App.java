import java.util.Scanner;

public class App {
    public int algoritmoFibonacci(int n) {
        if (n <= 1) return 1;
        int[] index = new int [n + 1];
        index[0] = 0;
        index[1] = 1;
        for (int i = 2; i <= n; i++) {
            index[i] = index[i - 1] + index[i - 2];
        }
        return index[n];
    }

    public static void main(String[] args) {
        System.out.println("Hoje, o apresentado é o algoritmo fibonacci com Programação dinâmicama, com a sobreposição de subproblemas evitando repetição de cálculo.\n Digite o índice de fibonatti que quer receber: ");
        Scanner sc = new Scanner(System.in);
        int indexFibonacci = sc.nextInt();
        System.out.println("O valor do índice "+ indexFibonacci + " no algoritmo de fibonacci é: " +  new App().algoritmoFibonacci(indexFibonacci));

    }
}
