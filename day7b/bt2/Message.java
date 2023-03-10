package day7b.bt2;


public class Message {
    private  int id;
    private  String name;

    public Message(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
