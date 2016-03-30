// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class o extends h {

    protected byte j;
    protected String k;

    public o(final int n, final String k, final byte j) {
        super(n);
        this.e = 16;
        this.j = j;
        this.k = k;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = (byte) (array2[0] & 0xFF);
    }

    @Override
    public String e() {
        return this.k + "(" + this.j + ")";
    }

    @Override
    public String toString() {
        return this.e();
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = this.j;
        return array;
    }
}
