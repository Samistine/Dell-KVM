// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class e extends b {

    protected int i;
    protected boolean j;
    private static final String z = "KeyboardDataRequest";

    public e() {
        super(512);
        this.b(16);
    }

    public e(final int i, final boolean j) {
        super(512);
        this.b(16);
        this.i = i;
        this.j = j;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = (array2[1] > 0);
        this.i = com.avocent.kvm.b.d.a.b(array2, 2);
    }

    @Override
    public byte[] b() {
        return new byte[]{0, !this.j, (byte) ((this.i & 0xFF00) >> 8), (byte) (this.i & 0xFF), 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return e.z;
    }

}
