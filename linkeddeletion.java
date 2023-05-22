class linkeddeletion{
   Node head;
   class Node{
    int data;
	Node next;
	Node(int d)
	{
	 data=d;
	 next=null;
	 }
	 }
	 public void insertion(int new_data)
	 {
		 Node New_node=new Node(new_data);
		 New_node.next = head;
		 head = New_node;
	 }
	 public void delete(int position)
	 {
		 Node current=head;
		 //if(head==null)
			// return;
		 for(int i=0;current!=null&&i<=position;i++)
		 {
			 current=current.next;
		 }
		 Node next = current.next.next;
         current.next= next;
		 
	 }
	 public void printlist()
	 {
		 Node temp=head;
		 while(temp!=null)
		 {
			 System.out.println(temp.data+"");
			temp=temp.next;
		 }
	 }
	 
    public static void main(String args[])
	  { 
		linkeddeletion li=new linkeddeletion();
		li.insertion(4);
		li.insertion(5);
		li.insertion(6);
		li.insertion(7);
		li.insertion(8);
		li.insertion(9);
			li.printlist();
	
		System.out.println("detelet the node :");
		li.delete(1);
			li.printlist();
		
	  }
	 
	 }
	
	
	