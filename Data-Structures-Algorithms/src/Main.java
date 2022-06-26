public class Main {
    public static void main(String[] args) {
        printItemsSquared(10);
    }

    /**
     * Example of the O(1) Algorithm.
     * Best case - 1 operation.
     * @param n:
     */
    public static void printItemsDirect(int n){
        System.out.println(n + n);
    }

    /**
     * Example of the O(n) Algorithm.
     * Execute n amount of operations.
     * @param n: times ONE for-lus runs.
     */
    public static void printItemsLineair(int n){
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    int[] sortedArray = {1,2,3,4,5,6,7,8,9};
    /**
     Example of the O(log n) Algorithm
     * Divide and conquer.
     * @param n: value to find in the (sorted) array.
     */
    public static void printItemsLogged(int n){
        //sortedArray;
    }

    /**
     * Example of the O(n^2) Algorithm
     * n * n = O(n^2)
     * @param n: times BOTH (nested)for-lus run.
     */
    public static void printItemsSquared(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}