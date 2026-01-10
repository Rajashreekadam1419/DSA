/*
Wave Array Program
Description: Converts an array into a wave form such that arr[0] >= arr[1] <= arr[2] >= arr[3]...
Time Complexity: O(n) - single pass through the array
Space Complexity: O(1) - in-place swaps
*/



import java.util.Scanner;

class WaveArray
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");
        int n=scanner.nextInt();

        int[] arr = new int[n];

        //Input Array Element

        System.out.println("Enter array element");
        for(int i=0 ; i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        //crete wave array

        for(int i=1 ;i<n;i+=2)
        {
            //compare with left element
            if(arr[i]<arr[i-1])
            {
                int temp =arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;

            }

            //compare with right element
            if(i+1<n && arr[i] < arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;


            }
        }

        System.out.println("Wave Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

scanner.close();
        
    }
}

