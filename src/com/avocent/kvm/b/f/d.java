// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.f;

public class d implements e {

    f a;
    protected boolean b;
    private static final String z = ": ";

    public d() {
        this.b = false;
        this.a = f.c();
    }

    @Override
    public void a(final boolean b) {
        if (this.a != null) {
            this.a.a(b);
        }
    }

    @Override
    public boolean a() {
        return this.b;
    }

    @Override
    public void a(final String s) {
        if (this.b) {
            this.a.a(s);
        }
    }

    @Override
    public void a(final String s, final String s2) {
        if (this.b) {
            this.a.a(s + d.z + s2);
        }
    }

    @Override
    public void b(final boolean b) {
        this.b = b;
    }

    }
