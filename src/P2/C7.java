package P2;

public class C7 {
    public void callC7() {
        System.out.println("call P2.C7");

        C4 c4 = new C4();
        c4.callC4();

        C6 c6 = new C6();
        c6.callC6();
    }
}
