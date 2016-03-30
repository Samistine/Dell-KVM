// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.io.IOException;
import com.avocent.kvm.b.f.a;

public abstract class v implements db, cb {

    private final boolean a = true;
    protected eb b;
    protected boolean c;
    protected a d;
    protected boolean e;
    protected boolean f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected long k;
    protected String l;
    protected fb m;

    public v() {
        this.c = false;
        this.e = false;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0L;
    }

    @Override
    public void a(final boolean c) {
        this.c = c;
    }

    @Override
    public void a(final a d) {
        this.d = d;
    }

    @Override
    public fb c() {
        return this.m;
    }

    @Override
    public void b() {
    }

    @Override
    public void a() {
        ++this.g;
        this.e = false;
        this.j = 0;
    }

    @Override
    public void a(final int n, final int n2) {
    }

    @Override
    public void a(final int n, final int n2, final int n3, final int n4) {
    }

    @Override
    public void a(final eb b) {
        this.b = b;
    }

    @Override
    public abstract int d() throws IOException;

    @Override
    public void a(final fb m) {
        if (this.m != null) {
            this.m.b(this);
        }
        (this.m = m).a(this);
    }
}
