class Stack{
    int stck[] = new int [10];
    int top;

    Stack(){
        top=-1;
    }
    public void push(int item){
        if(top == 9){
            System.out.println("Stack is full");
        }else{
            stck[++top] = item;
        }

    }
    public int pop(){
        if(top<0){
            System.out.println("Stack is empty");
            return 0;
        }else{
            return stck[top--];
        }
    }

    public static void main(String [] args){
        Stack obj1 = new Stack();
        Stack obj2 = new Stack();
        for(int i=0;i<10;i++) obj1.push(i);
        for(int j=10;j<20;j++) obj2.push(j);
        System.out.println("Elements of obj1:");
        for(int i=0;i<10;i++){
            System.out.println(obj1.pop());
        }
        System.out.println("Elements of obj2 :");
        for(int i=0;i<10;i++){
            System.out.println(obj2.pop());
        }

    }
}