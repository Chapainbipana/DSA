class insertion
{
    node head;
     class node{
         int data ;
         node next;
         node(int d){
            data =d;
            next=null;
         }
     }
     //add frist node
     void insertfrist(int new_data)
     {
        node new_node=new node(new_data);
        if(head==null){
          head=new_node;
          return;
        }
         new_node.next=head;
         head=new_node;
     }
 void insertlast(int new_data)
     {
        node new_node=new node(new_data);
        node current=head;
        if(head==null){
          new_node.next=head;
          return;
        }
		while(current.next!=null){
         current=current.next;
		}		 
	 current.next=new_node;
	 }
     void insertpoistion(int poistion,int new_data)
     {
        node new_node=new node(new_data);
        node current=head;
        if(head==null){
          new_node.next=head;
          return;
        }
        for(int i=0;current.next!=null && i<=poistion;i++)
		{

         current=current.next;
		}	
        new_node.next=current.next;
	    current.next=new_node;
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


    public static void main (String args[])
    {
        insertion ll=new insertion();
		ll.insertfrist(9);
        ll.insertfrist(8);
		ll.insertlast(10);
        ll.insertpoistion(3,3);
		ll.printlist();
    }
}