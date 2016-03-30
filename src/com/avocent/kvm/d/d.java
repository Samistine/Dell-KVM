// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.d;

public class d {

    long[] a;
    int[] b;
    byte c;
    final c d;

    public d(final c d) {
        this.d = d;
        this.a = new long[4];
        this.b = new int[4];
    }

    public void a() {
        final int xb = com.avocent.kvm.d.c.Xb;
        int i = 0;
        while (i < 4) {
            this.b[i] = i;
            ++i;
            if (xb != 0) {
                break;
            }
        }
        this.a[0] = 32896L;
        this.a[1] = 16744576L;
        this.a[2] = 8421504L;
        this.a[3] = 12615808L;
    }
}
