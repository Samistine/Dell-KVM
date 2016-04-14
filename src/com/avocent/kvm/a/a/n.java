// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class n extends h {

    byte[] j;
    int k;
    private static final String z = "KeepAlive";

    public n() {
        super(1024);
        this.j = new byte[8];
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    public void c(final int k) {
        this.k = k;
    }

    @Override
    public byte[] b() {
        return new byte[]{(byte) (this.k >>> 24 & 0xFF), (byte) (this.k >>> 16 & 0xFF), (byte) (this.k >>> 8 & 0xFF), (byte) (this.k & 0xFF), 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return n.z;
    }

}
