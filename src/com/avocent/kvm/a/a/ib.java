// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class ib extends y {

    private static final String[] z = {"Reserved", "Not implemented"};

    public ib(final int n) {
        super(n);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(ib.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(ib.z[1]);
    }

    @Override
    public String e() {
        return ib.z[0];
    }

}
