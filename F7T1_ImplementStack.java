public class F7T1_ImplementStack {
    private int mazSize;
    private long[] stackArray;
    private int top;
    public F7T1_ImplementStack(int s){
        mazSize=s;
        stackArray = new long[mazSize];
        top = -1;
    }
    public void push(long j){
        stackArray[++top]=j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == mazSize-1);
    }

    public static void main(String[] args) {
        F7T1_ImplementStack theStack = new F7T1_ImplementStack(550);
        for (int a=1; a<=550; a++){
            theStack.push(a);
        }
        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.print("");
    }
}
