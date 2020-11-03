package P3;

import P2.C6;

public class C10 {
    public void callC10() {
        System.out.println("call P3.C10");

        C6 c6 = new C6();
        c6.callC6();
    }
}
