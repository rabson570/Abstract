abstract class huawie {
    public void ring () {
        System.out.println("ring");
    }
    public abstract void turnup ();
        }
class mate30 extends huawie {
    public void turnup (){
        System.out.println("turnup");
    }
}
public class Main {
    public static void main(String[] args) {
        mate30 M30 = new mate30();
        M30.turnup();
        M30.ring();

    }
}
