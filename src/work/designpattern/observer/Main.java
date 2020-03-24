package work.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        // 论坛初始化
        ForumManager forum = new ForumManager();

        User tom = new User("Tom");
        User jerry = new User("jerry");
        User mic = new User("mic");
        User q2687 = new User("q2687");

        Topic topicTom1 = forum.doPostTopic(tom, "tom的文章1", "这是tom的第一个文章");
        forum.doComment(jerry, topicTom1, "写的好");
        forum.doComment(mic, topicTom1, "楼上说的好！");

        System.out.println("jerry 表示消息太多，屏蔽了这个文章的消息 XXXXXXXXXXXXXXXXXXX");
        forum.unregister(jerry, topicTom1);

        forum.doComment(q2687, topicTom1, "+1");
    }
}
