package msd.fhj.at;

public class App {
    public static void main(String[] args) {
        // Test MyStackArray
        MyStackArray<Integer> stackArray = new MyStackArray<>();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        System.out.println("StackArray Pop: " + stackArray.pop()); // 3

        // Test MyStackList
        MyStackList<String> stackList = new MyStackList<>();
        stackList.push("A");
        stackList.push("B");
        stackList.push("C");
        System.out.println("StackList Pop: " + stackList.pop()); // C

        // Test MyQueueArray
        MyQueueArray<Double> queueArray = new MyQueueArray<>();
        queueArray.put(1.1);
        queueArray.put(2.2);
        queueArray.put(3.3);
        System.out.println("QueueArray Get: " + queueArray.get()); // 1.1

        // Test MyQueueList
        MyQueueList<Character> queueList = new MyQueueList<>();
        queueList.put('X');
        queueList.put('Y');
        queueList.put('Z');
        System.out.println("QueueList Get: " + queueList.get()); // X
    }
}
