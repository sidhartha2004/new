import java.util.*;
public class Main
{
   
    public static int find_maximum(int arr[],int length)
    {
       /*Function to find the maximum in the array 
          return the maximum value*/
int max = arr[0];

        for (int i = 0; i < arr.length; i++) {  
            if(arr[i] > max){ 
               max = arr[i]; 
            }
        }  
         return max;
        
        
        
       
       
        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length; i++);
        System.out.println("find_maximum="+max);
    }
}