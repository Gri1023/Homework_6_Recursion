public class Main {
    public static void main (String[] args)
    {
    /*    final int N = 3;
        int[] bits = new int [N];
        for (bits [0] = 0; bits [0] <= 1; bits [0]++)
            for (bits [1] = 0; bits [1] <= 1; bits [1]++)
                for (bits [2] = 0; bits [2] <= 1; bits [2]++)
                    System.out.println (java.util.Arrays.toString (bits)); */

        final int N = 4;
        int[] bits = new int [N];
        int i = 0;
        checkBits(i,N,bits);

    }
    static int checkBits (int i, final int N, int[] bits) {
        if (i==N)
        {
            System.out.println (java.util.Arrays.toString (bits));
            return 0;
        }
        for (bits[i] = 0; bits[i] <= 1; bits[i]++) {
            checkBits(i+1,N,bits);
        }
        return 0;
    }
}