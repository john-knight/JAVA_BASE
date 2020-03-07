package structure;

public class Linkedlist {
    public static void main(String[] args) {
        Node list, tail, newNode;
        list=tail=null;
        for (int i = 0; i < 10; i++) {
            newNode = new Node(i);
           if(list==null){
               list=tail=newNode;
           }
           else {
               tail.next=newNode;
               tail=newNode;
           }
        }
        while (list.next!=null)
        {
          list=list.next;
        }
        System.out.println(list.value);
    }
}
