import java.util.Scanner;

public class Selectionsort {

    public static int[] selectionsort(int[] arr, int n) {
        // outer Loop
        // Why n-2 , n-1 is last element and you dont have to swap the only element . i.e n-2
        for (int i = 0; i < n - 2; i++) {
            int mini = i;
            for (int j = i; j < n - 1; j++) {
                if (arr[j] < arr[mini])
                {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of the array to Perform Selection Sort : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sorted_arr =  selectionsort(arr, n);
        for(int i :  sorted_arr)
        {
            System.out.print( i + " ");
        }

        sc.close();
    }
}