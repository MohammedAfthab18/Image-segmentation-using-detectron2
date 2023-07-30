import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int number = 1;
        //outer loop for rows
        for (int i =1 ; i<=n; i++){
            for (int j = 1; j <=i ; j++) {
                if  ((i+j)%2 ==0) {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
/*
class Main {
    static int max(int a, int b) { return (a > b) ? a : b; }
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
        else
            return max(val[n - 1]
                            + knapSack(W - wt[n - 1], wt,
                            val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }

    // Driver code
    public static void main(String args[])
    {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(W, weight, profit, n));
    }
}

 */
