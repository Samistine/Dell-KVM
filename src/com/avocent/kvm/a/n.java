// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.a.a.b;
import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.u;
import com.avocent.kvm.b.d.g;

class n extends g {

    final l g;
    private static final String[] z = {").", ") name (", " Primary >>> packet type( 0x", ") of length (", " Bad packet length for: "};

    n(final l g, final u u, final OutputStream outputStream) {
        super(u, outputStream);
        this.g = g;
    }

    @Override
    public void a(final c c) {
        if (this.g.yb != null) {
            this.g.yb.println(n.z[2] + Integer.toHexString(c.d()) + n.z[1] + c.e() + n.z[3] + c.f() + n.z[0]);
        }
        if (c instanceof b && ((b) c).g() == 0) {
            this.g.i().a(n.z[4] + c.e());
        }
        super.a(c);
    }
}
