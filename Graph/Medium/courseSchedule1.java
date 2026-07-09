import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class courseSchedule1 {
    public static void main(String[] args) {
        // Problem name = Course Schedule1
        // int prerequisites[][] = {
        //     {0,1}
        // };
        int prerequisites[][] = {
            {0,1},
            {1,0}
        };
        int numCourses = 2;
        if(prerequisites.length==0)
        {
            System.out.println(true);
            return;
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numCourses; i++)
        {
            list.add(new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        for(int i[]: prerequisites)
        {
            int a = i[0];
            int b = i[1];
            list.get(b).add(a);
            indegree[a]++;
        }
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<indegree.length; i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            int node = q.poll();
            count++;
            // System.out.println(count+" "+node);
            for(Integer i: list.get(node))
            {
                if(indegree[i]!=0)
                {
                    indegree[i]--;
                }
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
        // System.out.println(count);
        if(count==numCourses)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
