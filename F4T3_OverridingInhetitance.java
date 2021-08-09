import org.w3c.dom.ls.LSOutput;

public class F4T3_OverridingInhetitance {
    public static void main(String[] args) {
        Figure f = new Figure(5500, 1250);
        Rectangle r = new Rectangle(6000, 6000);
        Figure luas;
        luas = f;
        System.out.println("Area adalah: "+luas.area());
        luas = r;
        System.out.println("Area adalah: "+luas.area());
    }
}

class Figure {
    int panjang, lebar;
    Figure(int a, int b) {
        panjang = a;
        lebar = b;
    }
    int area() {
        System.out.println("Luas area figure ");
        return (panjang * lebar);
    }
}

class Rectangle extends Figure {
    Rectangle(int a, int b){
        super(a,b);
        }
        int area (){
            System.out.println("Luas area rectangle ");
            return (panjang*lebar);
        }
    }