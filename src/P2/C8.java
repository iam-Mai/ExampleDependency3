package P2;

import P1.C3;
import P3.C10;
import P3.C11;
import P3.C12;

public class C8 {
    public void callC8() {
        System.out.println("call P2.C8");

        C3 c3 = new C3();
        c3.callC3();

        C10 c10 = new C10();
        c10.callC10();

        C11 c11 = new C11();
        c11.callC11();

        C12 c12 = new C12();
        c12.callC12();
    }
}
