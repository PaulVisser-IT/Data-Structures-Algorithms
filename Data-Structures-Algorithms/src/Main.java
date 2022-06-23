public class Main {
    public static void main(String[] args) {
        printItemsSquared(10);
    }

    /**
     * Example of the O(n) Algorithm.
     * @param n: times the for-lus runs.
     */
    public static void printItemsLineair(int n){
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    /**
     * Example of the O(n^2) Algorithm
     * n * n = O(n^2)
     * @param n: times the for-lus runs.
     */
    public static void printItemsSquared(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}