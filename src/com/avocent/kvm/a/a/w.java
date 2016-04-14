// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class w extends h {

    int j;
    private static final String z = "Video Ack";

    public w(final int j) {
        super(0);
        this.j = j;
        this.e = 16;
    }

    public void c(final int j) {
        this.j = j;
    }

    public void d(final int n) {
        this.j += n;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] b() {
        return new byte[]{(byte) (this.j & 0xFF), 0, 0, 0, 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return w.z;
    }

}
