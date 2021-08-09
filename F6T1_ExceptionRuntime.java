public class F6T1_ExceptionRuntime {
    static  void f(){
        throw new RuntimeException("from f()");
    }
    static  void g() {
        f();
    }
    public static void main(String[] args) {
    g();
    }
}
