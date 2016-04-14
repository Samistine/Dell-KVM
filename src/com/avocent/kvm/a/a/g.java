// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;

public class g extends b {

    private static final String z = "MouseOrigin";

    public g() {
        super(514);
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
    }

    @Override
    public byte[] a() {
        return b.a(this.d, 16);
    }

    @Override
    public byte[] b() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return g.z;
    }

}
