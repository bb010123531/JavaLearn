package work.designpattern.composite;

public class TestTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("root");

        TreeNode rootChild1 = new TreeNode("rootChild1");
        TreeNode rootChild2 = new TreeNode("rootChild2");
        TreeNode rootChild3 = new TreeNode("rootChild3");
        TreeNode rootChild4 = new TreeNode("rootChild4");
        root.addChild(rootChild1);
        root.addChild(rootChild2);
        root.addChild(rootChild3);
        root.addChild(rootChild4);

        TreeNode rootChild1Child1 = new TreeNode("rootChild1Child1");
        TreeNode rootChild1Child2 = new TreeNode("rootChild1Child2");
        rootChild1.addChild(rootChild1Child1);
        rootChild1.addChild(rootChild1Child2);

        TreeNode rootChild3Child1 = new TreeNode("rootChild3Child1");
        TreeNode rootChild3Child2 = new TreeNode("rootChild3Child2");
        TreeNode rootChild3Child3 = new TreeNode("rootChild3Child3");
        rootChild3.addChild(rootChild3Child1);
        rootChild3.addChild(rootChild3Child2);
        rootChild3.addChild(rootChild3Child3);

        TreeNode rootChild3Child2Child1 = new TreeNode("rootChild3Child2Child1");
        rootChild3Child2.addChild(rootChild3Child2Child1);

        System.out.println(root.show());
    }
}
