package work.designpattern.observer;

import com.google.common.eventbus.EventBus;

import java.util.*;

// FIXME need check unlogin user
public class ForumManager {
    public void unregister(Role role, Topic topic) {
        topic.unregister(role);
    }

    public Topic doPostTopic(Role role, String title, String content) {
        Topic topic = new Topic(UUID.randomUUID().toString(), role, title, content);

        // 作者加入到关注列表
        doAttentionTopic(role, topic);
        return topic;
    }

    // 发表评论
    public void doComment(Role role, Topic topic, String msg) {
        Comment comment = new Comment(UUID.randomUUID().toString(), role, msg);
        topic.addComment(comment);

        // 评论文章，自动加入关注
        doAttentionTopic(role, topic);
    }

    private void doAttentionTopic(Role role, Topic topic) {
        topic.register(role);
    }
}
