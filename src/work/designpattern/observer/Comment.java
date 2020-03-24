package work.designpattern.observer;

public class Comment {

    private String uuid;

    private Role owner;

    private String content;

    public Comment(String uuid, Role owner, String content) {
        this.uuid = uuid;
        this.owner = owner;
        this.content = content;
    }

    public String getUuid() {
        return uuid;
    }

    public Role getOwner() {
        return owner;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "uuid='" + uuid + '\'' +
                ", owner=" + owner +
                ", content='" + content + '\'' +
                '}';
    }
}
