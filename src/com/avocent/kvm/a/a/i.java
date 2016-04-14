// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;

public class i extends h {

    protected boolean j;
    protected int k;
    protected boolean l;
    protected boolean m;
    private static final String z = "SetDVCColorDepthMessage";

    public i() {
        super(1027);
        this.j = true;
        this.b(16);
    }

    public void c(final int k) {
        this.k = k;
    }

    public void b(final boolean l) {
        this.l = l;
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        com.avocent.kvm.b.d.a.c(this.m ? 1 : 0, array, com.avocent.kvm.b.d.a.c((int) (this.l ? 1 : 0), array, com.avocent.kvm.b.d.a.c(this.k, array, com.avocent.kvm.b.d.a.c((int) (this.j ? 0 : 1), array, 0))));
        return array;
    }

    @Override
    public String e() {
        return i.z;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.j = ((array2[0] & 0xFF) > 0);
        this.k = (array2[1] & 0xFF);
        this.l = ((array2[2] & 0xFF) > 0);
        this.m = ((array2[3] & 0xFF) > 0);
    }

}
