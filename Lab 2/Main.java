package com.company;

public class Main {

    public static void main(String[] args) {
        //BoxEx();
        //TestQueue();
    }

    public static void BoxEx() {
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(3, 2, 6);
        Box[] arr = new Box[]{box1, box2, box3};
        for (Box el : arr) {
            System.out.println("Height: " + el.height + " Width: " + el.width + " Depth: " + el.depth);
        }
    }

    public static void TestQueue() {
        Queue queue1 = new Queue();
        queue1.push(5);
        queue1.push(6);
        queue1.push(7);
        queue1.push(8);
        queue1.push(9);
        int a[] = queue1.array;
        for (int i = 0; a[i] != 0; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        queue1.pop();
        queue1.pop();
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
        }
    }
}