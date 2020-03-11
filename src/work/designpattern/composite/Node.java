package work.designpattern.composite;

public abstract class Node {
    protected String value;

    protected Node(String value) {
        this.value = value;
    }

    public abstract String show();
}
