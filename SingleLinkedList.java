class Node{
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SingleLinkedList {
    public Node head;//���浥�����ͷ�ڵ������
    //ͷ�巨
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            //��һ�β���ڵ�
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //β�巨
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            //��һ�β���
            this.head = node;
            return;
        }
        Node tmp = this.head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }
    //�ҵ�indexλ�õ�ǰһ���ڵ�ĵ�ַ
    private Node searchIndex(int index) {
        //�ж�indexλ�úϲ��Ϸ�
        if(index < 0 || index >this.size()) {
            throw new RuntimeException("indexλ�ò��Ϸ�!");
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
    //����λ�ò���,��һ�����ݽڵ�Ϊ0���±�
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
    //�����Ƿ�����ؼ���key�Ƿ��ڵ�������
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
    //��key��ǰ��
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
    //ɾ����һ�γ��ֹؼ���Ϊkey�Ľڵ�
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
            System.out.println("δ�ҵ�Ҫɾ���Ľڵ�");
            return;
        }
        prev.next = prev.next.next;
    }
    //ɾ������ֵΪkey�Ľڵ�
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node tmp = prev.next;//����Ҫɾ���Ľڵ�
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
    //�õ�������ĳ���
    public int size() {
        int length = 0;
        Node tmp = this.head;
        while(tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }
    //��ӡ������
    public void display() {
        Node tmp = this.head;
        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
    //������������Ԫ��
    public void clear() {
        this.head = null;
    }


    //��ת������(����һ�鵥����)
    //eg : 1 -> 2 -> 3 -> 4 -> null
    //     4 -> 3 -> 2 -> 1 -> null
    public Node reverseList() {
        Node tmp = this.head;//����ǰ��Ҫ��ת�Ľڵ�
        Node prev = null;
        Node newHead = null;//����ת���µ�ͷ�ڵ�
        while(tmp != null) {
            Node tmpNext = tmp.next;//������һ����Ҫ��ת�Ľڵ�
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

    //����һ������ͷ��� head �ķǿյ���������������м��㡣����������м��㣬�򷵻صڶ����м���(����һ�鵥����)
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //����һ����������������е�����k�����(����һ�鵥����)
    public Node findKthToTail(int k) {
        if(k <= 0) {
            System.out.println("k��ֵ���Ϸ�");
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while((k - 1) > 0) {
            if(fast != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("û��������!");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //��д���룬�Ը���ֵxΪ��׼������ָ�������֣�����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ.ע��:�ָ��Ժ󱣳�ԭ����˳�򲻱�(����һ�鵥����)
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node tmp = this.head;
        while(tmp != null) {
            if(tmp.data < x) {
                if(bs == null) {
                    //��һ�β���
                    bs = tmp;
                    be = tmp;
                }else {
                    be.next = tmp;
                    be = be.next;
                }
            }else {
                if(as == null) {
                    //��һ�β���
                    as = tmp;
                    ae = tmp;
                }else {
                    ae.next = tmp;
                    ae = ae.next;
                }
            }
            tmp = tmp.next;
        }
        //�ж�bs�Ƿ�Ϊ��  ���bs == null  ����as
        if(bs == null) {
            return as;
        }
        //���bs��Ϊ��  ��Ҫ����ƴ��
        be.next = as;
        //���ae��Ϊ��  ��Ҫ��ae.next��Ϊ��
        if(ae != null) {
            ae.next = null;
        }
        return bs;
    }

    //��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ��
    //1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
    //1 -> 2 -> 5
    public Node deleteDuplication() {
        Node newHead = new Node(-1);//һ�������ͷ�ڵ�
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
