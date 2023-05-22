public class lqueue
{
   int size=5;
   int item[]=new int[size];
   int front;
   int rear;
   lqueue()
   {
      rear=-1;
	  front=-1;
   }
     boolean isFull(){
        if(rear==size-1){
            return true;
        }
		else{
            return false;
        }
    }
	 boolean isEmpty(){
     if(front==-1)
     return true;
     else
     return false;
    }
	void emQueue(int element)
    {
        if(isFull())
        {
            System.out.println("queue is full");
        }
        else{
            
            rear++;
            item[rear]=element;
		    
           System.out.println("inserted  "+element);
        }
    }
	int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("queue is empty  ");
            return(-1);
        }
        else{
            element=item[front];
                front--;   
		}
            return (element);
        }
    
	void display(){
    int i;
    if(isEmpty()){
        System.out.println("Empty Queue");
    }
    else{
        System.out.println("front "+front);
        System.out.println("item->"+item);
        //for(i=front;i!=rear;i++)
        //{
          //  System.out.println(item[i]+" ");
            //System.out.println(item[i]);
            //System.out.println("Rear->"+rear);
        //}
    }
	}
	public static void main(String args[])
    {
        lqueue c=new lqueue();
        c.deQueue();
        c.emQueue(0);
        c.emQueue(2);
        c.emQueue(3);
        c.emQueue(4);
        c.emQueue(5);
        c.emQueue(6);
        c.display();
        c.emQueue(7);
        c.display();
        c.emQueue(8);

    }
}