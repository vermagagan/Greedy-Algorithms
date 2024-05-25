import java.util.Arrays;
public class Indiancoins
{
    public static void indianCoins(int v, int [] coins)
    {
        Arrays.sort(coins);
        for(int i=0; i<coins.length/2; i++)
        {
            int temp = coins[i];
            coins[i] = coins[coins.length-i-1];
            coins[coins.length-i-1] = temp;
        }
        int a=0;
        while(v != 0)
        {
            if(a<coins.length && v >= coins[a])
            {
                while(coins[a] <= v)
                {
                    System.out.print(coins[a]+" ");
                    v -= coins[a];
                }
            }
            a++;
        }
    }
    public static void main(String args[])
    {
        int v = 121;
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        System.out.print("Coins required to make "+v+" are: ");
        indianCoins(v, coins);
    }
}
