import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class ActivitySelection
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int start[] = {10, 12, 20};
        int end[] = {20, 25, 30};
        int activities[][]=new int [start.length][3];
        for(int i=0; i<activities.length; i++)
        {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        int maxAct = 0;
        ans.add(activities[0][0]);
        maxAct=1;
        int lastEnd = activities[0][2];
        for(int  i=1; i<end.length; i++)
        {
            if(activities[i][1] >= lastEnd)
            {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum Activites are:  "+maxAct);
        for(int i=0; i<ans.size(); i++)
            System.out.print("A"+ans.get(i)+"  ");

        System.out.println();
    }
}
