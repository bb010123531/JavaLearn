package work.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode extends Node {

    List<Node> children;

    public TreeNode(String value) {
        super(value);
        }

        @Override
        public String show() {
            // 叶子节点
            StringBuilder res = new StringBuilder();
                if (children == null) {
                    return this.value + "\n";
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Node child : children) {
                        sb.append(child.show());
                    }
                    String[] args = sb.toString().split("\n");
            for (String s : args) {
                res.append(" - " + s + "\n");
            }
            return this.value + "\n" + res.toString();
        }
    }

    public void addChild(Node node) {
        if (children == null) {
            children = new ArrayList<>();
        }
        this.children.add(node);
    }
}
