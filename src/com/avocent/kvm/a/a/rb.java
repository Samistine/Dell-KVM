// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;
import com.avocent.kvm.a.j;

public class rb extends b {

    protected j i;
    private static final String[] z = {"Method not implemented.", "ServerStatusUpdate"};

    public rb() {
        super(33842);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        int n = 0;
        final int b = com.avocent.kvm.b.d.a.b(array2, n);
        n += 2;
        this.i.a(com.avocent.kvm.b.d.a.a(array2, n, b));
        int n2 = n + b;
        this.i.a(com.avocent.kvm.b.d.a.b(array2, n2));
        n2 += 2;
        this.i.b(com.avocent.kvm.b.d.a.b(array2, n2));
        n2 += 2;
        final int b2 = com.avocent.kvm.b.d.a.b(array2, n2);
        n2 += 2;
        this.i.b(com.avocent.kvm.b.d.a.a(array2, n2, b2));
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(rb.z[0]);
    }

    @Override
    public String e() {
        return rb.z[1];
    }

}
