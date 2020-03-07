package solution;

public class Q3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Q3 q3 = new Q3();

        int[] r = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int[] res = q3.removeZero(r);

        for (int a : res) {
            System.out.println(a);
        }
    }

    private int[] removeZero(int[] req) {
        if (req == null || req.length == 0) {
            return new int[0];
        }

        int count = 0;
        for (int a : req) {
            if (a != 0) {
                count++;
            }
        }

        int index = 0;
        int[] res = new int[count];
        for (int a : req) {
            if (a != 0) {
                res[index++] = a;
            }
        }

        return res;
    }

}
