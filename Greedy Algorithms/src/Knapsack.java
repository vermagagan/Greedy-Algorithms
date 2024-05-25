import java.util.Arrays;
import java.util.Comparator;
public class Knapsack
{
    public static void knapSack(int val[], int weights[], int W)
    {
        double ratio [][] = new double[val.length][2];

        for(int i=0; i<val.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/weights[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int cap = W;
        int finalval = 0;
        for(int i=ratio.length-1; i>=0; i--)
        {
            int idx = (int) ratio[i][0];
            if(cap >= weights[idx])
            {
                finalval += val[idx];
                cap -= weights[idx];
            }
            else
            {
                finalval += (ratio[i][1] *  cap);
                cap = 0;
                break;
            }
        }
        System.out.println("The maximum value of knapsack is: "+finalval);

    }
    public static void main(String args[])
    {
        int val[] = {60, 100, 120};
        int weights[] = {10, 20, 30};
        int W = 50;
        
        knapSack(val, weights, W);
    }
}
