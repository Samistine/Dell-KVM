// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;

public class ab extends y {

    int j;
    int k;
    private static final String[] z = {"Display Resolution Response", "Not implemented"};

    public ab() {
        super(33281);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.j = ((array2[0] & 0xFF) << 8 | (array2[1] & 0xFF));
        this.k = ((array2[2] & 0xFF) << 8 | (array2[3] & 0xFF));
    }

    public int h() {
        return this.j;
    }

    public int i() {
        return this.k;
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(ab.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(ab.z[1]);
    }

    @Override
    public String e() {
        return ab.z[0];
    }

}
