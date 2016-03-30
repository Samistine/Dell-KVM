// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.a.a.wb;
import com.avocent.kvm.b.d.e;
import com.avocent.kvm.b.d.d;
import com.avocent.kvm.a.a.vb;
import java.io.IOException;
import com.avocent.kvm.b.d.c;
import com.avocent.kvm.a.a.g;
import com.avocent.kvm.b.jb;

public class f implements jb {

    l a;
    boolean b;
    int c;
    int d;
    float e;

    public f(final l a) {
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 1.0f;
        this.a = a;
    }

    @Override
    public void a() throws IOException {
        final g g = new g();
        final com.avocent.kvm.b.d.g x = this.a.x();
        if (x != null) {
            x.a(g);
        }
    }

    @Override
    public void a(int n, int n2, final int n3, final boolean b, final boolean b2, final boolean b3, final int n4) throws IOException {
        if (this.a != null) {
            int w = this.a.w();
            if (b) {
                w |= 0x1;
            }
            if (b2) {
                w |= 0x4;
            }
            if (b3) {
                w |= 0x2;
            }
            this.a.g(w);
            final int n5 = 4;
            n *= (int) this.e;
            n2 *= (int) this.e;
            final vb vb = new vb(n, n2, n3, w, n5);
            final e v = this.a.v();
            if (v != null) {
                v.a(vb);
            }
        }
    }

    @Override
    public void c(int n, int n2, final int n3, final boolean b, final boolean b2, final boolean b3, final int n4) throws IOException {
        if (this.a != null) {
            int w = this.a.w();
            if (b) {
                w |= 0x1;
            }
            if (b2) {
                w |= 0x4;
            }
            if (b3) {
                w |= 0x2;
            }
            this.a.g(w);
            final int n5 = 4;
            n *= (int) this.e;
            n2 *= (int) this.e;
            final wb wb = new wb(n, n2, 0, w, n5);
            final e v = this.a.v();
            if (v != null) {
                v.a(wb);
            }
        }
    }

    @Override
    public void b(int n, int n2, final int n3, final boolean b, final boolean b2, final boolean b3, final int n4) throws IOException {
        if (this.a != null) {
            int w = this.a.w();
            if (b) {
                w &= 0xFFFFFFFE;
            }
            if (b2) {
                w &= 0xFFFFFFFB;
            }
            if (b3) {
                w &= 0xFFFFFFFD;
            }
            this.a.g(w);
            final int n5 = 8;
            n *= (int) this.e;
            n2 *= (int) this.e;
            final vb vb = new vb(n, n2, 0, w, n5);
            final e v = this.a.v();
            if (v != null) {
                v.a(vb);
            }
        }
    }

    @Override
    public void d(int n, int n2, final int n3, final boolean b, final boolean b2, final boolean b3, final int n4) throws IOException {
        if (this.a != null) {
            int w = this.a.w();
            if (b) {
                w &= 0xFFFFFFFE;
            }
            if (b2) {
                w &= 0xFFFFFFFB;
            }
            if (b3) {
                w &= 0xFFFFFFFD;
            }
            this.a.g(w);
            final int n5 = 8;
            n *= (int) this.e;
            n2 *= (int) this.e;
            final wb wb = new wb(n, n2, 0, w, n5);
            final e v = this.a.v();
            if (v != null) {
                v.a(wb);
            }
        }
    }

    @Override
    public void a(int n, int n2) throws IOException {
        if (this.a != null) {
            final boolean b = true;
            n *= (int) this.e;
            n2 *= (int) this.e;
            final vb vb = new vb(n, n2, 0, this.a.w(), b ? 1 : 0);
            final e v = this.a.v();
            if (v != null) {
                v.a(vb);
            }
        }
    }

    @Override
    public void b(int n, int n2) throws IOException {
        if (this.a != null) {
            final int n3 = 2;
            n *= (int) this.e;
            n2 *= (int) this.e;
            final wb wb = new wb(n, n2, 0, this.a.w(), n3);
            final e v = this.a.v();
            if (v != null) {
                v.a(wb);
            }
        }
    }

    @Override
    public void c(final int n, final int n2) throws IOException {
        this.a.a(4, null, null);
        this.a(n, n2);
    }

    @Override
    public void d(final int n, final int n2) throws IOException {
        this.a(n, n2);
    }
}
