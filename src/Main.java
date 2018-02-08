public class Main {
    public final static int SAMPLE_SIZE = 1000;
    public final static int LIMIT = 10;

    public static void main(String[] args) {
        int[] count = new int[LIMIT];

        for (int i = 0; i < SAMPLE_SIZE; i++) {
            int n = (int) (Math.random() * LIMIT) + 1;
            count[n-1]++;
        }

        for (int i = 0; i < LIMIT; i++) {
            System.out.println((i+1) + " = " + count[i]);
        }
    }
}
