import java.util.Arrays;
import java.util.Comparator;
public class Jobsequencing
{
    public static void jobSequencing(int deadline[], int profit[])
    {
        int jobs[][] = new int[profit.length][3];
        for(int i=0; i<profit.length; i++)
        {
            jobs[i][0] = 65+i;
            jobs[i][1] = deadline[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[2]));
        
        int currtime = 0;
        for(int i=profit.length-1; i>=0; i--)
        {
            if(currtime < jobs[i][1])
            {
                System.out.println("Job "+(char)jobs[i][0]+" = "+jobs[i][1]+","+jobs[i][2]);
                currtime++;
            }
        }
    }
    public static void main(String[] args)
    {
        int deadline[] = {4,1,1,1};
        int profit[] = {20,10,40,30};
        jobSequencing(deadline, profit);
    }
}
