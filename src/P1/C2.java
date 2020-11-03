package P1;

public class C2 {
    public void callC2() {
        System.out.println("call P1.C2");
        C3 c3 = new C3();
        c3.callC3();
    }
}
