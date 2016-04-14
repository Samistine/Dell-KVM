// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class d extends b {

    boolean i;
    private static final String z = "FocusControl";

    public d() {
        super(520);
        this.e = 16;
    }

    public d(final boolean i) {
        super(520);
        this.i = i;
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.i = ((array2[0] & 0xFF) > 0);
    }

    @Override
    public byte[] b() {
        return new byte[]{this.i, 0, 0, 0, 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return d.z;
    }

}
