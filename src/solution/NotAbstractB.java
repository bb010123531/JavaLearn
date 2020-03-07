package solution;

public class NotAbstractB extends AbstractA {

    @Override
    public void method() {
        for (int i = 2 ; i <= 1000 ; i++) {
            if (isPerfectNum(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPerfectNum(int n) {
        boolean isperfectnumner = false;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // 如果相等
        if (sum == n) {
            isperfectnumner = true;// 是完数
        }
        return isperfectnumner;

    }
}
