public class KthlargestOdd {
    public static int klargestOdd(int l, int r, int k) {
        // Calculate number of odd numbers in the range
        int countOfOdds = (r - l) / 2 + 1;
        if (l % 2 == 0 && r % 2 == 0) {
            countOfOdds--;
        }
        
        // If k is greater than the count of odd numbers, return 0
        if (k > countOfOdds) {
            return 0;
        }
        
        // Find the k-th largest odd number directly
        int start = (r % 2 == 0) ? r - 1 : r;
        return start - 2 * (k - 1);
    }
    
    public static void main(String[] args) {
        int l = -3, r = 2, k = 1;
        System.out.println("The Kth Largest odd number in range is: " + klargestOdd(l, r, k));
    }
}
