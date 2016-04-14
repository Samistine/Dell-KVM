// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class x extends h {

    boolean j;
    int k;
    private static final String z = "Video Enable Request";

    public x(final boolean j) {
        super(782);
        this.k = 1;
        this.j = j;
        this.e = 16;
    }

    public x() {
        super(782);
        this.k = 1;
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = (array2[0] > 0);
    }

    @Override
    public String e() {
        return x.z;
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = (byte) (this.j ? 1 : 0);
        return array;
    }

}
