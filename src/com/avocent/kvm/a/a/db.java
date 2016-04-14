// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class db extends y {

    private static final String[] z = {"Locked", "Not implemented"};

    public db(final int n) {
        super(n);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(db.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(db.z[1]);
    }

    @Override
    public String e() {
        return db.z[0];
    }

}
