// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.d.d;
import com.avocent.kvm.b.d.b;

public class wb extends b implements d {

    int f;
    int g;
    private static final String z = "Mouse Delta Request";

    public wb() {
        super(63);
        this.e = true;
    }

    public wb(final int b, final int c, final int f, final int g, final int n) {
        super(n);
        this.e = true;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public byte[] a() {
        return com.avocent.kvm.a.a.b.a(521, 16);
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = 0;
        array[1] = (byte) (this.g & 0xFF);
        final int g = this.g();
        array[2] = (byte) (g >> 8 & 0xFF);
        array[3] = (byte) (g & 0xFF);
        final int h = this.h();
        array[4] = (byte) (h >> 8 & 0xFF);
        array[5] = (byte) (h & 0xFF);
        final int f = this.f;
        array[6] = (byte) (f >> 8 & 0xFF);
        array[7] = (byte) (f & 0xFF);
        return array;
    }

    @Override
    public void a(final byte[] array, final byte[] array2, final int n) throws IOException {
        this.g = array2[1];
        this.b = com.avocent.kvm.b.d.a.b(array2, 2);
        this.c = com.avocent.kvm.b.d.a.b(array2, 4);
        this.f = com.avocent.kvm.b.d.a.b(array2, 6);
    }

    @Override
    public String e() {
        return wb.z;
    }

    @Override
    public int f() {
        return 16;
    }

}
