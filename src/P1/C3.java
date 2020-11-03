package P1;

import P2.C8;
import P3.C12;

public class C3 {
    public void callC3() {
        System.out.println("call P1.C3");
        C8 c8 = new C8();
        c8.callC8();

        C12 c12 = new C12();
        c12.callC12();
    }
}
