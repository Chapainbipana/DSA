class example
{
   int size=5;
   int tos=0;
   int element[]=new int[size];
   void push(int data)
   {
	   if(tos>size){
	       System.out.println("stack is full");	   
	   }
	   else{
		   element[tos]=data;
		   System.out.println("the insertes the element is "+element[tos]);
		   tos++;   
	   }
   }
   void pop(){
	   if(tos==0){
		   System.out.println("stack is empty");
		   
	   }
	  else{
		 int pop_element=element[tos];
		 System.out.println("pop element"+pop_element);
		  tos--;
	  }
	   
	   
   }
}
class example1{
	public static void main(String args[])
	{
		example e=new example();
		e.push(4);
		e.push(2);
		e.pop();
	}
}