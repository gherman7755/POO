package com.company;

public class Queue {
   int first, last, current_size;
   int size;
   int array[];

    public Queue(){
        this.size = 1_000_000;
        first = this.current_size = 0;
        last = size - 1;
        array = new int[this.size];
    }


    public Queue(int size){
       this.size = size;
       first = this.current_size = 0;
       last = size - 1;
       array = new int[this.size];
   }

   boolean full(Queue queue){
       return (queue.current_size == queue.size);
   }

   boolean empty(Queue queue){
       return (queue.current_size == 0);
   }

   void push(int element){
       if(full(this)){
           System.out.println("It is full");
           return;
       }
       this.last = (this.last + 1) % this.size;
       this.array[this.last] = element;
       this.current_size += 1;
   }

   void pop(){
        if(empty(this)){
            System.out.println("It is empty");
            return;
        }
        int element = this.array[this.first];
        this.array[this.first] = 0;
        this.first = (this.first + 1) % this.size;
        this.current_size -= 1;
       System.out.println("Element - " + element + " is deleted");
   }
}
