package ch04;

public class MyQueue {
    private int[] queueArray;   // 큐
    private int front;          // 큐의 맨 앞 값의 인덱스
    private int rear;           // 큐 맨 뒤 값의 다음 인덱스
    private int capacity;       // 큐의 최대 용량
    private int count;          // 큐에 저장된 데이터의 수

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = 0;
        count = 0;
    }

    // 큐에 추가하는 메소드
    public void enqueue(int item) {
        if(count == capacity) {
            System.out.println("큐가 가득 찼습니다.");
        } else {
            queueArray[rear] = item;
            rear++;  //선형큐 이부분을 수정해서 원형 큐로 변환
            count++;
        }
    }

    // 큐에서 item을 반환하고, 삭제해주는 메소드
    public int dequeue() {
        if(count == 0) {
            System.out.println("큐가 비었습니다.");
            return -1;
        } else {
            int item = queueArray[front];
            front = (front + 1) % capacity;
            count--;
            return item;
        }
    }

    public int peek() {
        if(count == 0) {
            System.out.println("큐가 비었습니다.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());    // 1이 나오면 맞음
        System.out.println(queue.peek());       // 2가 나오면 맞음
        System.out.println(queue.dequeue());    // 2가 나오면 맞음
        queue.enqueue(4);
        System.out.println(queue.dequeue());    // 3이 나오면 맞음
        queue.enqueue(5);
        queue.enqueue(6);
    }
}
