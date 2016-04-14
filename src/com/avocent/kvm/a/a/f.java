// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;

public class f extends b {

    private static final String z = "Keyboard LED Request";

    public f() {
        super(516);
        this.e = 16;
    }

    @Override
    public byte[] b() {
        return new byte[8];
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
    }

    @Override
    public String e() {
        return f.z;
    }

}
