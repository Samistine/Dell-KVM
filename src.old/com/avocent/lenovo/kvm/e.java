// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import com.avocent.kvm.a.l;
import com.avocent.kvm.a.k;

public class e implements k {

    protected c a;

    public e(c a) {
        this.a = a;
    }

    @Override
    public void a(int n, int n2, String s) {
        int a = new com.avocent.lenovo.kvm.b.e(this.a).a(s);
        l l = (l) this.a.a();
        try {
            l.a(n, a);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
