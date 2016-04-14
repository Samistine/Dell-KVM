// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class jb extends y {

    private static final String[] z = {"Scaling", "Not implemented"};

    public jb(final int n) {
        super(n);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(jb.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(jb.z[1]);
    }

    @Override
    public String e() {
        return jb.z[0];
    }

}
