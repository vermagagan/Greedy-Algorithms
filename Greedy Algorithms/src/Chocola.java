import java.util.Arrays;
import java.util.Collections;
public class Chocola
{
    public static int choCola(Integer [] costv, Integer [] costh)
    {
        int vp=1, hp=1, v=0, h=0, minCost = 0;
        while(v < costv.length && h < costh.length)
        {
            if(costv[v] > costh[h])
            {
                minCost += (costv[v] * hp);
                v++;
                vp++;
            }
            else
            {
                minCost += (costh[h] * vp);
                h++;
                hp++;
            }
        }
        while(v < costv.length)
        {
            minCost += (costv[v] * hp);
            v++;
            vp++;
        }
        while(h < costh.length)
        {
            minCost += (costh[h] * vp);
            h++;
            hp++;
        }
        return minCost;
    }
    public static void main(String args[])
    {
        Integer costv [] = {2,1,3,1,4};
        Integer costh [] = {4,1,2};
        Arrays.sort(costv, Collections.reverseOrder());
        Arrays.sort(costh, Collections.reverseOrder());
        System.out.println("The minimum cost is: "+choCola(costv, costh));
    }
}
