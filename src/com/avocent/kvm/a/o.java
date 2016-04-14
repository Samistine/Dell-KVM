// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.a.a.b;
import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.u;
import com.avocent.kvm.b.d.g;

class o extends g {

    final l g;
    private static final String[] z = {" Primary >>> packet type( 0x", ").", ") name (", ") of length (", " Bad packet length for: "};

    o(final l g, final u u, final OutputStream outputStream) {
        super(u, outputStream);
        this.g = g;
    }

    @Override
    public void a(final c c) {
        if (this.g.yb != null) {
            this.g.yb.println(o.z[0] + Integer.toHexString(c.d()) + o.z[2] + c.e() + o.z[3] + c.f() + o.z[1]);
        }
        if (c instanceof b && ((b) c).g() == 0) {
            this.g.i().a(o.z[4] + c.e());
        }
        super.a(c);
    }
}
