import java.util.Arrays;
import java.util.Comparator;
public class Chainpairs
{
    public static void main(String[] args)
    {
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int count = 1;
        int last = pairs[0][1];
        for(int i=0; i<pairs.length; i++)
        {
            if(pairs[i][0] > last)
            {
                count++;
                last = pairs[i][1];
            }
        }
        System.out.println("Length of  chain :"+count);
    }
}
