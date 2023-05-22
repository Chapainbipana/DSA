class doublelink{
  Node head;
  class Node{
	  int data;
	  Node Next;
	  Node prev;
	  Node(int d)
	  {
		  data = d;
	  }
  }
  void insertion( int New_data)
  {
	  Node New_Node=new Node( New_data);
	  New_Node.Next= head;
	  head= New_Node;
  }
  void deleted(int position){
	  Node tnode=head;
	  for(int i=0; tnode!=null&& i<= position;i++){
		  tnode=tnode.Next;
	  }
	  //Node Next= tnode.Next.Next;
	  //tnode.Next=Next;
	  //Node prev= tnode.prev.prev;
	  //tnode.prev=prev;
	  tnode.prev.Next=tnode.Next;
	  tnode.Next.prev=tnode.prev;
	  
  }
  void printlist(){
	  Node tmp=head;
	  while(tmp!=null)
	  {
		  System.out.println(tmp.data);
		  tmp=tmp.Next;
	  }
  }
  public static void main(String args[])
  {
	  doublelink d=new doublelink();
	  d.insertion(2);
	  d.insertion(3);
	  d.insertion(4);
	  d.insertion(5);
	  d.printlist();
	  System.out.println("the deleted element");
	  d.deleted(0);
	   d.printlist();
  }
  
	
	  
}