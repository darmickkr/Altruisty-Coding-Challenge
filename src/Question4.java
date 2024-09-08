public class Question_4 {

    public static void main(String[] args) {
        String ticketPrice = "203";
        int k = 2;
        
        System.out.println(TicketPriceReduction.minimizePrice(ticketPrice, k));
    }
    
    public static class TicketPriceReduction {

        public static String minimizePrice(String price, int k) {
            StringBuilder result = new StringBuilder();
            
            for (char digit : price.toCharArray()) {
                while (k > 0 && result.length() > 0 && result.charAt(result.length() - 1) > digit) {
                    result.deleteCharAt(result.length() - 1);
                    k--;
                }
                result.append(digit);
            }
            
            while (k > 0) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            
            String finalResult = result.toString().replaceAll("^0+", "");
            
            return finalResult.isEmpty() ? "0" : finalResult;
        }
    }
}
