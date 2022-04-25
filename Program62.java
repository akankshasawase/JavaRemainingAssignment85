import java.util.Arrays;
class Program62 {
         
    static boolean checkIsAP(int arr[], int n)
    {
        if (n == 1)
            return true;
         
       
        Arrays.sort(arr);
         
        int d = arr[1] - arr[0];
        for (int i = 2; i < n; i++)
            if (arr[i] - arr[i-1] != d)
                return false;
         
        return true;
    }
     
 
    public static void main (String[] args)
    {
        int arr[] = { 20, 15, 5, 0, 10 };
        int n = arr.length;
     
        if(checkIsAP(arr, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}