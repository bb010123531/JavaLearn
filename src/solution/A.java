package solution;

public class A {
    A() {
        f();
    }
    private void f() {
        char begin_letter = 'a';
        for (int i = (int) begin_letter; i < begin_letter + 26; i++) {
            System.out.print(" " + (char) i);
        }
    }
}
