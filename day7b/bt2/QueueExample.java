package day7b.bt2;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Gỉa sử có 10 tin nhắn cùng gửi vào hệ thống
        // Hệ thông chỉ có thể xử lý 3s/1 tin
        // Để lưu trữ được các tin nhắn trên -> đưa vào hàng đơi
        //  Giống người đi xếp hàng mua đồ....

        Queue<Message> queue = new ArrayDeque<>();
        queue.add(new Message(1, "msg 1"));
        queue.add(new Message(2, "msg 2"));
        queue.add(new Message(3, "msg 3"));
        queue.add(new Message(4, "msg 4"));
        queue.add(new Message(5, "msg 5"));
        queue.add(new Message(6, "msg 6"));
        queue.add(new Message(7, "msg 7"));
        queue.add(new Message(8, "msg 8"));
        queue.add(new Message(9, "msg 9"));
        queue.add(new Message(10, "msg 10"));

        while (!queue.isEmpty()){
            Message msg = queue.poll();
            System.out.println(msg);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
