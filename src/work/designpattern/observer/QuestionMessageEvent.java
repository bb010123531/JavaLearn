package work.designpattern.observer;

public class QuestionMessageEvent implements MessageEvent {

    private Topic topic;

    private Comment comment;

    public QuestionMessageEvent(Topic topic, Comment comment) {
        this.topic = topic;
        this.comment = comment;
    }

    public Topic getTopic() {
        return topic;
    }

    public Comment getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "QuestionMessageEvent{" +
                "comment=" + comment +
                '}';
    }
}
