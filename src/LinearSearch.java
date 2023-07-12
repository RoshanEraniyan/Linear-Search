import java.util.*;
class Solution
{
    public int occurenceSearch(int size,int[] array,int b )
    {
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(array[i]==b)
            {
                count++;
            }
        }
        return count;
    }
}

class LinearSearch
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        int b=scanner.nextInt();
        Solution solution =new Solution();
        System.out.println(solution.occurenceSearch(n,array,b));
    }
}

