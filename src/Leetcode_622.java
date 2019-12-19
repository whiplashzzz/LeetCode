public class Leetcode_622 {
    public static void main(String[]args){
//        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
//
//        System.out.println(circularQueue.enQueue(1));; // 返回 true
//
//        System.out.println(circularQueue.enQueue(2));; // 返回 true
//
//        System.out.println(circularQueue.enQueue(3));; // 返回 true
//
//        System.out.println(circularQueue.enQueue(4));; // 返回 false，队列已满
//
//        System.out.println(circularQueue.Rear());; // 返回 3
//
//        System.out.println(circularQueue.isFull());; // 返回 true
//
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());
//       System.out.println(circularQueue.deQueue());; // 返回 true
//
//        System.out.println(circularQueue.enQueue(4));; // 返回 true
//
//        System.out.println(circularQueue.Rear());; // 返回 4
//        System.out.println(circularQueue.Front());
    }

}

class Solution_622 {//队列特点：先进先出，后进后出(FIFO)；
    int length,front = 0,rear = -1;
    int[] queue;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public Solution_622(int k) {//注意此处新建立的queue因为重新创建，是新的变量，不是类自带属性;
        int[] queue = new int[k];
        this.queue = queue;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {//插入是在队尾,，队尾在添加时上移。注意一定要先将指针移位再赋值,以及rear和length的关系;
        if(rear == queue.length-1 && length < queue.length) {
            rear = -1;
        }
        if(length < queue.length){
            rear++;
            queue[rear] = value;
            length++;
            return true;
        }
        return false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {//删除是在队首，队首在删除时上移；
        if(length == 0){
            return false;
        }
        else if(length != 0){
            if(front == queue.length-1){
                front = 0;
            }
            front++;
            length--;
        }
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(length == 0){
            return -1;
        }
        return queue[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(length == 0){
            return -1;
        }
        return queue[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(length == 0){
            return true;
        }
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(length == queue.length){
            return true;
        }
        return false;
    }
}

