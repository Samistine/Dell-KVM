// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class z extends y {

    byte[] j;
    private static final String[] z = {"Not implemented", "Video Packet"};

    public z(final int n) {
        super(n);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        System.arraycopy(array2, 8, this.j = new byte[array2.length - 8], 0, this.j.length);
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(com.avocent.kvm.a.a.z.z[0]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(com.avocent.kvm.a.a.z.z[0]);
    }

    @Override
    public String e() {
        return com.avocent.kvm.a.a.z.z[1];
    }

}
