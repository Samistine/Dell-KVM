// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.awt.image.ColorModel;
import java.awt.Color;

public class i extends h {

    protected int[] m;
    protected int[] n;

    public i() {
        this.m = new int[2560000];
        this.n = new int[1024];
        this.o();
    }

    public void o() {
        final boolean t = com.avocent.kvm.b.g.t;
        final int n = 0xFF000000 & Color.black.getRGB();
        int i = 0;
        while (i < this.m.length) {
            this.m[i] = n;
            ++i;
            if (t) {
                break;
            }
        }
        this.b(true);
    }

    @Override
    public ColorModel f() {
        return ColorModel.getRGBdefault();
    }

    @Override
    public Object e() {
        return this.m;
    }
}
