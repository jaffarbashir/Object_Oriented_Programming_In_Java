import java.util.Scanner;
class SubarraySum {
    int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum, i, j;
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found between " + i + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }
 
        System.out.println("Sum not found");
        return 0;
    }
 
    public static void main(String[] args)
    {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = { 1,2,3,7,5};
        int n = arr.length;
        int sum = 12;
        arraysum.subArraySum(arr, n, sum);
    }
}