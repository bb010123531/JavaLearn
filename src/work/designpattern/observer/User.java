package work.designpattern.observer;

import com.google.common.eventbus.Subscribe;

public class User implements Role, MessageListener {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Subscribe
    public void receiveMsg(QuestionMessageEvent question) {
        System.out.println("======== " + this.name + "的通知信箱 =====================");
        System.out.println(question.getTopic().getOwner().getName() + "的文章: <<" + question.getTopic().getTitle() +">> 收到了来自 " + question.getComment().getOwner().getName() + " 的回复 : \n       " + question.getComment().getContent());
        System.out.println("=========================================================");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
