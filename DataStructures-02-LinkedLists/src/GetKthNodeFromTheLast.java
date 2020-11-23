public class GetKthNodeFromTheLast {





    public static void main(String[] args) {

        var myLinkedList= new MyLinkedList();

        for(int j=1; j<=10;j++) myLinkedList.addLast(j);
        myLinkedList.printLinkedList();

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.first);
        System.out.println(myLinkedList.first.next);
        System.out.println(myLinkedList.first.value);


    }
}
