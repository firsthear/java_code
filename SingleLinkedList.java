class Node{
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SingleLinkedList {
    public Node head;//保存单链表的头节点的引用
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            //第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            //第一次插入
            this.head = node;
            return;
        }
        Node tmp = this.head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }
    //找到index位置的前一个节点的地址
    private Node searchIndex(int index) {
        //判断index位置合不合法
        if(index < 0 || index >this.size()) {
            throw new RuntimeException("index位置不合法!");
        }
        Node tmp = this.head;
        int count = 0;
        while(index - 1 != count) {
            tmp = tmp.next;
           count++;
        }
        /*while(index - 1 != 0) {
            tmp = tmp.next;
            index--;
        }*/
        return tmp;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index == 0) {
            this.addFirst(data);
            return;
        }
        if(index == this.size()) {
            this.addLast(data);
            return;
        }
        Node node = new Node(data);
        Node tmp = searchIndex(index);
        node.next = tmp.next;
        tmp.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node tmp = this.head;
        while(tmp != null) {
            if(key == tmp.data) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
    //找key的前驱
    private Node searchPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(50);
        if(prev == null) {
            System.out.println("未找到要删除的节点");
            return;
        }
        prev.next = prev.next.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node tmp = prev.next;//代表要删除的节点
        while(tmp != null) {
            if(tmp.data == key) {
                prev.next = tmp.next;
            }else {
                prev = tmp;
            }
            tmp = tmp.next;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //得到单链表的长度
    public int size() {
        int length = 0;
        Node tmp = this.head;
        while(tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }
    //打印单链表
    public void display() {
        Node tmp = this.head;
        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
    //清楚单链表里的元素
    public void clear() {
        this.head = null;
    }


    //反转单链表(遍历一遍单链表)
    //eg : 1 -> 2 -> 3 -> 4 -> null
    //     4 -> 3 -> 2 -> 1 -> null
    public Node reverseList() {
        Node tmp = this.head;//代表当前需要反转的节点
        Node prev = null;
        Node newHead = null;//代表反转后新的头节点
        while(tmp != null) {
            Node tmpNext = tmp.next;//代表下一个需要反转的节点
            if(tmpNext == null) {
                newHead = tmp;
            }
            tmp.next = prev;
            prev = tmp;
            tmp = tmpNext;
        }
        return newHead;
    }
    public void display2(Node newHead) {
        Node tmp = newHead;
        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点(遍历一遍单链表)
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点(遍历一遍单链表)
    public Node findKthToTail(int k) {
        if(k <= 0) {
            System.out.println("k的值不合法");
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while((k - 1) > 0) {
            if(fast != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个结点!");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前.注意:分割以后保持原来的顺序不变(遍历一遍单链表)
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node tmp = this.head;
        while(tmp != null) {
            if(tmp.data < x) {
                if(bs == null) {
                    //第一次插入
                    bs = tmp;
                    be = tmp;
                }else {
                    be.next = tmp;
                    be = be.next;
                }
            }else {
                if(as == null) {
                    //第一次插入
                    as = tmp;
                    ae = tmp;
                }else {
                    ae.next = tmp;
                    ae = ae.next;
                }
            }
            tmp = tmp.next;
        }
        //判断bs是否为空  如果bs == null  返回as
        if(bs == null) {
            return as;
        }
        //如果bs不为空  需要进行拼接
        be.next = as;
        //如果ae不为空  需要将ae.next置为空
        if(ae != null) {
            ae.next = null;
        }
        return bs;
    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    //1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
    //1 -> 2 -> 5
    public Node deleteDuplication() {
        Node newHead = new Node(-1);//一个虚拟的头节点
        Node tmp = this.head;
        Node cur = newHead;
        while(tmp != null) {
            if(tmp.next != null && tmp.data == tmp.next.data) {
                while(tmp.next != null && tmp.data == tmp.next.data) {
                    tmp =tmp.next;
                }
            }else {
                cur.next = tmp;
                cur = cur.next;
            }
            tmp =tmp.next;
        }
        cur.next = null;
        return newHead.next;
    }
}
