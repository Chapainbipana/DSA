class linkedlist{
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
		linkedlist li=new linkedlist();
		li.insertion(4);
		li.insertion(5);
		li.insertion(6);
		li.insertion(7);
		li.printlist();
	  }
	 
	 }
	
	
	