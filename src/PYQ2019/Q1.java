package PYQ2019;

public class Q1 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.addFirst(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);
        System.out.println(list1);

        MyLinkedList<Integer> list2 =  new MyLinkedList<>();
        list2.addFirst(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        System.out.println(list2);

        MyLinkedList<Integer> combineList = combine(list1, list2);
        System.out.println(combineList);
        
    }

    public static MyLinkedList<Integer> combine(MyLinkedList<Integer> list1, MyLinkedList<Integer> list2) {
        MyLinkedList<Integer> combinedList = new MyLinkedList<>();
        Integer num1 = list1.removeFirst();
        Integer num2 = list2.removeFirst();
        while (num1 != null && num2 != null) {
            
            if(num1 > num2) {
                combinedList.addLast(num2);
                num2 = list2.removeFirst();
            } else {
                combinedList.addLast(num1);
                num1 = list1.removeFirst();
            }
        }

        if(num1 != null) combinedList.addLast(num1);
        else combinedList.addLast(num2);

        while (list1.getSize() > 0) {
            combinedList.addFirst(list1.removeFirst());
        }

        while (list2.getSize() > 0) {
            combinedList.addFirst(list2.removeFirst());
        }

        return combinedList;
    }
}
