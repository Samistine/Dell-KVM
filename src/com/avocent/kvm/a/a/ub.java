// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class ub extends b {

    int i;
    int j;
    private static final String z = "SharingResponse";

    public ub() {
        super(1043);
        this.e = 16;
    }

    public void c(final int i) {
        this.i = i;
    }

    public void d(final int j) {
        this.j = j;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] b() {
        return new byte[]{(byte) (this.j & 0xFF), 0, (byte) (this.i >>> 8 & 0xFF), (byte) (this.i & 0xFF), 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return ub.z;
    }

}
