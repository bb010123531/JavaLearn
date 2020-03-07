package solution;

public class B extends A{
    B () {
        super();
        g();
    }

    private void g() {
        char begin_letter = 'A';
        for (int i = (int) begin_letter; i < begin_letter + 26; i++) {
            System.out.print(" " + (char) i);
        }
    }
}
