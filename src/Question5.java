public class Question_5 {

    public static int getMaxToys(int[] prices, int money) {
        int maxToys = 0;
        int currentSum = 0;
        int start = 0;
        
        for (int end = 0; end < prices.length; end++) {
            currentSum += prices[end];
            
            while (currentSum > money) {
                currentSum -= prices[start];
                start++;
            }
            
            maxToys = Math.max(maxToys, end - start + 1);
        }
        
        return maxToys;
    }

    public static void main(String[] args) {
        int[] prices = {1, 4, 5, 3, 2, 1, 6};
        int money = 6;
        
        System.out.println(getMaxToys(prices, money));
    }
}
