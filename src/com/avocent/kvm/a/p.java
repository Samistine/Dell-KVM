// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.a.a.b;
import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.u;
import com.avocent.kvm.b.d.g;

class p extends g {

    final l g;
    private static final String[] z = {") of length (", " Bad packet length for: ", " Video >>> packet type( 0x", ").", ") name ("};

    p(final l g, final u u, final OutputStream outputStream) {
        super(u, outputStream);
        this.g = g;
    }

    @Override
    public void a(final c c) {
        if (this.g.yb != null) {
            this.g.yb.println(p.z[2] + Integer.toHexString(c.d()) + p.z[4] + c.e() + p.z[0] + c.f() + p.z[3]);
        }
        if (c instanceof b && ((b) c).g() == 0) {
            this.g.i().a(p.z[1] + c.e());
        }
        super.a(c);
    }
}
