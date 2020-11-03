package P2;

public class C4 {
    public void callC4() {
        System.out.println("call P2.C4");

        C5 c5 = new C5();
        c5.callC5();

        C7 c7 = new C7();
        c7.callC7();
    }
}
