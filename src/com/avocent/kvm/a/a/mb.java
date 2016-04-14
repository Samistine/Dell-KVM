// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class mb extends y {

    boolean j;
    private static final String[] z = {" Video connect status: ", "Video Connect Status"};

    public mb() {
        super(132);
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = (array2[0] == 0);
        System.out.println(mb.z[0] + this.j);
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = (byte) (this.j ? 0 : 1);
        return array;
    }

    @Override
    public String e() {
        return mb.z[1];
    }

}
