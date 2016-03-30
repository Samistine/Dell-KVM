package com.avocent.kvm.b.d;

import java.io.IOException;

public abstract class b implements d
{
    protected int a;
    protected int b;
    protected int c;
    public boolean d;
    protected boolean e;
    
    public b(final int a) {
        super();
        this.e = false;
        this.a = a;
    }
    
    public boolean a(final d d) {
        if (this.e) {
            this.a(this.g() + d.g(), this.h() + d.h());
            if (!g.f) {
                return true;
            }
        }
        this.a(d.g(), d.h());
        return true;
    }
    
    public int i() {
        return this.a;
    }
    
    public int g() {
        return this.b;
    }
    
    public int h() {
        return this.c;
    }
    
    public boolean c() {
        return this.d;
    }
    
    public void a(final int b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public void a(final boolean d) {
        this.d = d;
    }
    
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.a(array, array2, array2.length);
    }
}
