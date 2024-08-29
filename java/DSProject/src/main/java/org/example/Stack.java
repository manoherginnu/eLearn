package org.example;

public class Stack<T>{

    private T[] array;
    private int trackIndex;

    Stack(Integer size){
        array = (T[]) new Object[size];
    }

 public void push(T elelemt){
      if(trackIndex<=array.length-1) {
          array[trackIndex] = elelemt;
          trackIndex++;
      } else{
          System.out.println("Stack is full");
      }
 }

 public T pop(){
        T ele = null;
        if(!IsEmptyStack()){
           ele = array[--trackIndex];
        } else{
            System.out.println("Stack is empty");
        }
        return ele;
 }

    private boolean IsEmptyStack() {

        return trackIndex<=0;
    }
}
