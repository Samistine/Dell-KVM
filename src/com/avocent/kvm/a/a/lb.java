// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class lb extends y {

    private static final String[] z = {"User Priviledge Parameters", "Not implemented"};

    public lb(final int n) {
        super(n);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(lb.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(lb.z[1]);
    }

    @Override
    public String e() {
        return lb.z[0];
    }

}
