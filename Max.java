import java.util.Scanner;
public class Max{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Max = "+max);
    }
}
