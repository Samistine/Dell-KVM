// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class cb extends y {

    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private static final String z = "Keyboard LED";

    public cb(final int n) {
        super(n);
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public void a(final byte[] array, final byte[] array2, final int n) {
        final byte b = array2[0];
        this.j = ((b & 0x1) > 0);
        this.k = ((b & 0x2) > 0);
        this.l = ((b & 0x4) > 0);
        this.m = ((b & 0x8) > 0);
        this.n = ((b & 0x10) > 0);
    }

    @Override
    public byte[] b() {
        return new byte[8];
    }

    @Override
    public String e() {
        return cb.z;
    }

}
