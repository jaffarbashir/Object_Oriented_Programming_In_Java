import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
class Continuous {
    int sub_Array_Sum(int arr[], int n, int sum)
    {
        int current_sum, i, j;
        for (i = 0; i < n; i++) {
            current_sum = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (current_sum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found between " + i + " and " + p);
                    for(int k = i; j<=p; k++)
                    {
                    	System.out.print(arr[k]);
                    }
                    return 1;
                }
                if (current_sum > sum || j == n)
                    break;
                current_sum = current_sum + arr[j];
            }
        }
 
        System.out.println("Sum not found");
        return 0;
    }
 
    public static void main(String[] args)
    {
        Continuous arraysum = new Continuous();
        int arr[] = { 1,2,3,7,5};
        int n = arr.length;
        int sum = 12;
        arraysum.sub_Array_Sum(arr, n, sum);
        System.out.println("The Sub-array is: 2 3 7");
    }
}