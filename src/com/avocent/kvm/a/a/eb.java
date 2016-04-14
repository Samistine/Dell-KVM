// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class eb extends y {

    int j;
    private static final String[] z = {"Not implemented", "MouseAccelResponse"};

    public eb() {
        super(33026);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = (byte) (array2[0] & 0xFF);
    }

    public int h() {
        return this.j;
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(eb.z[0]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(eb.z[0]);
    }

    @Override
    public String e() {
        return eb.z[1];
    }

}
