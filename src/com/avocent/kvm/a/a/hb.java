// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class hb extends y {

    int j;
    int k;
    private static final String[] z = {"Protocol Version", "Not implemented"};

    public hb(final int n) {
        super(n);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = array2[0];
        this.k = array2[1];
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(hb.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(hb.z[1]);
    }

    @Override
    public String e() {
        return hb.z[0];
    }

}
