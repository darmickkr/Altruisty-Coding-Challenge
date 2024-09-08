import java.util.HashSet;
import java.util.Set;

public class Question_2 
{

    public static int canSegmentString(String s, Set<String> dictionary) 
    {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        
        dp[0] = true;
        
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (dp[j] && dictionary.contains(s.substring(j, i)))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n] ? 1 : 0;
    }

    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("sam");
        dictionary.add("sung");
        dictionary.add("samsung");
        dictionary.add("mobile");
        
        String s1 = "ilike";
        String s2 = "ilikesamsung";
        
        System.out.println(canSegmentString(s1, dictionary));  
        System.out.println(canSegmentString(s2, dictionary)); 
    }
}
