import java.util.LinkedList;
import java.util.Queue;

public class Question_3 {

    public static void findSteppingNumbers(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        
       
        for (int i = 0; i <= 9; i++) {
            if (i >= start && i <= end) {
                System.out.print(i + " ");
            }
            if (i != 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int num = queue.poll();

            if (num >= end) {
                continue;
            }

            int lastDigit = num % 10;

           
            if (lastDigit > 0) {
                int stepDown = num * 10 + (lastDigit - 1);
                if (stepDown <= end && stepDown >= start) {
                    System.out.print(stepDown + " ");
                }
                if (stepDown < end) {
                    queue.add(stepDown);
                }
            }
            
            if (lastDigit < 9) {
                int stepUp = num * 10 + (lastDigit + 1);
                if (stepUp <= end && stepUp >= start) {
                    System.out.print(stepUp + " ");
                }
                if (stepUp < end) {
                    queue.add(stepUp);
                }
            }
        }
    }

    public static void main(String[] args) {
        int start = 100;  
        int end = 500;    

        findSteppingNumbers(start, end);
    }
}
