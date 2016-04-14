// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;

public class j extends h {

    protected int j;
    protected boolean k;
    protected boolean l;
    private static final String z = "DVCColorModeResponse";

    public j() {
        super(33284);
    }

    public int h() {
        return this.j;
    }

    public boolean i() {
        return this.k;
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        com.avocent.kvm.b.d.a.c(this.l ? 1 : 0, array, com.avocent.kvm.b.d.a.c((int) (this.k ? 1 : 0), array, com.avocent.kvm.b.d.a.c(this.j, array, 0)));
        return array;
    }

    @Override
    public String e() {
        return com.avocent.kvm.a.a.j.z;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.j = (array2[0] & 0xFF);
        this.k = ((array2[1] & 0xFF) > 0);
        this.l = ((array2[2] & 0xFF) > 0);
    }

}
