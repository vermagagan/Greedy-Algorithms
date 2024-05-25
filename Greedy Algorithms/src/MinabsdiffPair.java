import java.util.Arrays;
public class MinabsdiffPair
{
    public static void main(String[] args)
    {
        int A[] = {1,2,3,5,6,7,8,9};
        int B[] = {2,1,3,12,4,6,5,7};
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++)
        {
            sum += Math.abs(A[i]-B[i]);
        }
        System.out.println("The minimum absolute sum of difference pair is: "+sum);
    }
}
