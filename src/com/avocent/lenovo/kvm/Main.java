// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import com.avocent.kvm.b.f.e;
import com.avocent.a.a.s;
import com.avocent.a.d;
import com.avocent.kvm.b.f.b;

public class Main {

    private static final String z = "com.avocent.lenovo.kvm.Res";

    void a(String[] array) throws Exception {
        final e a = b.a();
        final f f = new f();
        final d d = new d();
        d.a(Main.z);
        final c c = new c();
        c.a(a);
        c.a(f, d, array);
        c.f();
    }

    public static void main(String[] array) {
        try {
            new Main().a(array);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }
}
