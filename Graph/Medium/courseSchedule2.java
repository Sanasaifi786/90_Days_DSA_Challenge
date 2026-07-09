import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class courseSchedule2 {
    public static void main(String[] args) {
        //problem name - Course Schedule2
        int prerequisites[][] = {
            {1,0},{2,0},{3,1},{3,2}
        };
        int numCourses = 4;
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
        int count[] = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<indegree.length; i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int idx = 0;
        while(!q.isEmpty())
        {
            int node = q.poll();
            count[idx++] = node;
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
        if(idx != numCourses){
            System.out.println(new int[0]);
        }
        else{
            for(int i=0; i<count.length; i++)
            {
                System.out.print(count[i]+" ");
            }
        }
    }
}
