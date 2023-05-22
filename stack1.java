import java.util.Scanner;
class MyStack1 {
    int Size_of_Stack= 4;
    int element[] = new int [Size_of_Stack];
    int tos= -1;

    void push(int item){
        if(tos>=Size_of_Stack-1){
            System.out.println("Stack is full or Overflow Condition error!");
            return;
        }
        else{
            //tos=tos+1;
            element[++tos]= item;
        }

    }
    boolean isEmpty(){
        if(tos== -1){
            return true;
        }
        else{
            return false;
        }
    }   
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty or Underflow Condition error!");
            return 0 ;
        }
        else{
            return element[tos--];
        }
    }
    void print(){
        int temp=0;
        if(!isEmpty()){
            temp= pop();
            System.out.println(temp);
            print();
        }
        push(temp);
    }
}
class stack1{
    public static void main(String[] args) {
        MyStack1 obj1 = new MyStack1();

        Scanner s = new Scanner(System.in);
        int type_of_op;
		int insertelement;

        while(true){
            System.out.println("\nEnter Your Choice");
            System.out.println("Enter 1 for Push Operation");
            System.out.println("Enter 2 for POP Operation");
            System.out.println("Enter 3 for Print Operation");
            System.out.println("Enter 4 for Exit \n");
            type_of_op= s.nextInt();


            switch(type_of_op){
                case 1: System.out.println("Enter the element which you want to push");
                       obj1.push(s.nextInt());
						System.out.println("element is push"+obj1.push(s.nextInt()));
                        break;
                case 2: System.out.println("Removed Element "+ obj1.pop());
                        break;
                case 3: System.out.println(" Stack Element are: ");
                        obj1.print();
                        break;
                default: System.out.println("Invalid Input !!");
                        return;
            }  

        }


    }
}