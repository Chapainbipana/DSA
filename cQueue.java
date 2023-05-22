public class cQueue{
    int size=5;
    int front,rear;
    int items[]=new int[size];
    cQueue(){
        front=-1;
        rear=-1;

    }
    boolean isFull(){
        if(front==0 && rear==size-1){
            return true;
        }
        if(front==rear+1){
            return true;
        }
        
            return false;
        
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
            if(front==-1)
            front=0;
            rear=(rear+1)%size;
           items[rear]=element;
           System.out.println("inserted  "+element);
        }
    }
    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("queue is empty");
            return(-1);
        }
        else{
            element=items[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return (element);
        }
    }
    void display(){
    int i;
    if(isEmpty()){
        System.out.println("Empty Queue");
    }
    else{
        System.out.println("front->"+front);
        System.out.println("item->");
        for(i=front;i!=rear;i=(i+1)%size)
        {
            System.out.println(items[i]+" ");
            System.out.println(items[i]);
            System.out.println("Rear->"+rear);
        }
    }
    }
    public static void main(String args[])
    {
        cQueue c=new cQueue();
        c.deQueue();
        c.emQueue(1);
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