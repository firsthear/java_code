public class TestDemo1 {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        /*singleLinkedList.addFirst(50);
        singleLinkedList.addFirst(40);
        //singleLinkedList.addFirst(30);
        singleLinkedList.addFirst(20);
        singleLinkedList.addFirst(10);
        //singleLinkedList.display();

        singleLinkedList.addLast(60);
        singleLinkedList.addLast(70);
        singleLinkedList.addLast(80);
        //singleLinkedList.display();
        //System.out.println();

        //System.out.println(singleLinkedList.contains(50));
        //System.out.println(singleLinkedList.contains(100));

        //System.out.println(singleLinkedList.size());

        singleLinkedList.addIndex(2,30);
        singleLinkedList.addIndex(0,0);
        singleLinkedList.addIndex(9,90);
        //singleLinkedList.display();

        //singleLinkedList.remove(50);
        //singleLinkedList.remove(0);
        //singleLinkedList.display();

        //singleLinkedList.addIndex(5,50);
        //singleLinkedList.addLast(50);
        //singleLinkedList.removeAllKey(50);
        //singleLinkedList.display();

        //singleLinkedList.clear();
        //singleLinkedList.display();

        //singleLinkedList.display2(singleLinkedList.reverseList());

        //System.out.println(singleLinkedList.middleNode().data);

        //System.out.println(singleLinkedList.findKthToTail(3).data);*/


        /*singleLinkedList.addLast(13);
        singleLinkedList.addLast(21);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(41);
        singleLinkedList.addLast(15);
        singleLinkedList.addLast(63);
        singleLinkedList.display2(singleLinkedList.partition(17));*/

        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);
        singleLinkedList.addLast(5);
        singleLinkedList.display2(singleLinkedList.deleteDuplication());
    }
}
