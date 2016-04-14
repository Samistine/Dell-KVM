// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;
import java.io.IOException;

public class bb extends y {

    int j;
    int k;
    private static final String z = "Input Resolution Response";

    public bb() {
        super(33280);
        this.e = 16;
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
    public byte[] b() {
        final byte[] array = new byte[8];
        com.avocent.kvm.b.d.a.a(this.j, array, 0);
        com.avocent.kvm.b.d.a.a(this.k, array, 2);
        return array;
    }

    @Override
    public String e() {
        return bb.z;
    }

}
