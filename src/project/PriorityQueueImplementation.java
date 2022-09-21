package project;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementation {

    //define method to declare and fill the queue
    public void testStringsByPriority(){
        //define a priority queue of messages
        Queue<String> stringPriorityQueue= new PriorityQueue<>();
        //add text to the messages
        stringPriorityQueue.add("abcd");
        stringPriorityQueue.add("1234");
        stringPriorityQueue.add("23bc");
        stringPriorityQueue.add("zzxx");
        stringPriorityQueue.add("abxy");

        //show the ordered queue
        System.out.println("The ordered strings are: ");
        while(!stringPriorityQueue.isEmpty()) {
            //this function retrieves and remove the latest item which should be the first to go out
            System.out.println(stringPriorityQueue.poll());
        }
    }
}
