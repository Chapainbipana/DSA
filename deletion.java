public class deletion {
    node head;
     class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
     }
     void deletfrist(int poistion)
     {
        if(head==null)
          return;

        node temp=head;
        if(poistion==0){
            head=temp.next;
        }
        node next=temp.next.next;
        temp.next=next;

     }
     void printlist()
     {
       if(head==null)
       {
         System.out.println("link is empty");
       }
       node current=head;
       while(current.next!=null){
         System.out.println(current.data+"->");
         current=current.next;
         
       }
       System.out.println("Null");
       
     }
   
    public static void main(String[] args) {
        deletion de=new deletion();
        de.deletfrist(2);  
        de.printlist();     

    }    
}
