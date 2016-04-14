// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class fb extends y {

    int j;
    private static final String[] z = {"MouseAcknowledgeResponse", "Not implemented"};

    public fb() {
        super(33025);
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
        throw new RuntimeException(fb.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(fb.z[1]);
    }

    @Override
    public String e() {
        return fb.z[0];
    }

}
