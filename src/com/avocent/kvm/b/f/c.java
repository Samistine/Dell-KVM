// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.f;

public class c {

    public int a;
    public int b;
    public int c;
    public int d;
    private static final String[] z = {" : ",", "};

    public c() {
        final int n = Integer.MAX_VALUE;
        this.b = n;
        this.a = n;
        final boolean b = false;
        this.d = (b ? 1 : 0);
        this.c = (b ? 1 : 0);
    }

    public c(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public synchronized void a(final c c) {
        this.a = c.a;
        this.b = c.b;
        this.c = c.c;
        this.d = c.d;
    }

    public synchronized void a(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public synchronized void b(final c c) {
        this.a = ((c.a < this.a) ? c.a : this.a);
        this.b = ((c.b < this.b) ? c.b : this.b);
        this.c = ((c.c > this.c) ? c.c : this.c);
        this.d = ((c.d > this.d) ? c.d : this.d);
    }

    public synchronized void b(final int n, final int n2, final int n3, final int n4) {
        this.a = ((this.a < n) ? this.a : n);
        this.b = ((this.b < n2) ? this.b : n2);
        this.c = ((this.c > n3) ? this.c : n3);
        this.d = ((this.d > n4) ? this.d : n4);
    }

    public synchronized boolean a() {
        return this.c - this.a <= 0 || this.d - this.b <= 0;
    }

    public int b() {
        return this.c - this.a;
    }

    public int c() {
        return this.d - this.b;
    }

    @Override
    public synchronized String toString() {
        return "" + this.a + com.avocent.kvm.b.f.c.z[1] + this.b + com.avocent.kvm.b.f.c.z[0] + this.c + com.avocent.kvm.b.f.c.z[1] + this.d;
    }

    }
