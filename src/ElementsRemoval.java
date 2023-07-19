import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ElementsRemoval {
    static void removal(int arr[],int n)
    {
        int cost=0;
        Arrays.sort(arr);
        int repeat=1;
        for (int i=n-1;i>=0;i--)
        {
            cost=cost+repeat*arr[i];
            repeat++;
        }
        System.out.println(cost);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        removal(arr,n);

    }
}
