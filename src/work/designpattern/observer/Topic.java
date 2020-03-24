package work.designpattern.observer;

import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class Topic {

    private String uuid;

    private Role owner;

    private String title;

    private String content;

    private List<Comment> comments = new ArrayList<>();

    private EventBus syncBus;

    public Topic(String uuid, Role role, String title, String content) {
        this.uuid = uuid;
        this.owner = role;
        this.title = title;
        this.content = content;
        this.syncBus = new EventBus("文章[" + title + "]");
        this.syncBus.register(role);
    }

    public Role getOwner() {
        return owner;
    }

    public String getTitle() {
        return title;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
        // 添加评论后 发送消息
        this.syncBus.post(new QuestionMessageEvent(this, comment));
    }

    public void register(Role role) {
        this.syncBus.register(role);
    }
    public void unregister(Role role) {
        this.syncBus.unregister(role);
    }

    @Override
    public String toString() {
        return "Topic{" +
                "uuid='" + uuid + '\'' +
                ", owner=" + owner +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
