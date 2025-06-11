package lab9.prog9_3;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int size = 0;
    private int front = -1;
    private int rear = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
        return arr[front];
    }

    public int size() {
        return size;
    }

    public void resize() {
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public void enqueue(int i) {
        if (rear == arr.length) {
            resize();
        }
        if (front < 0) {
            front++;
        }
        arr[rear] = i;
        rear++;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
        front++;
        size--;

        if (size == 0) {
            front = -1;
            rear = 0;
        }
    }


    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        //uncomment when ready
        for (int i = 0; i < 15; i++)
            q.enqueue(i);

		for(int i = 0; i < 14; i ++)
			q.dequeue();
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}

