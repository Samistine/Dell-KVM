package com.avocent.kvm.b;

import java.io.IOException;
import com.avocent.kvm.b.f.a;

public abstract class v implements db, cb
{
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
        super();
        this.c = false;
        this.e = false;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0L;
    }
    
    public void a(final boolean c) {
        this.c = c;
    }
    
    public void a(final a d) {
        this.d = d;
    }
    
    public fb c() {
        return this.m;
    }
    
    public void b() {
    }
    
    public void a() {
        ++this.g;
        this.e = false;
        this.j = 0;
    }
    
    public void a(final int n, final int n2) {
    }
    
    public void a(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void a(final eb b) {
        this.b = b;
    }
    
    public abstract int d() throws IOException;
    
    public void a(final fb m) {
        if (this.m != null) {
            this.m.b(this);
        }
        (this.m = m).a(this);
    }
}
