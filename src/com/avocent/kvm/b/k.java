package com.avocent.kvm.b;

import java.io.IOException;
import com.avocent.kvm.b.a.c;
import java.util.Vector;
import java.util.List;
import com.avocent.kvm.b.f.a;
import java.util.ArrayList;

public class k implements eb
{
    int a;
    protected u b;
    protected ArrayList c;
    protected a d;
    protected db e;
    protected lb f;
    protected int g;
    protected List h;
    protected ArrayList i;
    protected Vector j;
    public int k;
    protected int l;
    protected long m;
    protected long n;
    protected long o;
    protected Object p;
    protected gb q;
    protected Object r;
    protected int s;
    protected int t;
    protected cb u;
    protected int v;
    protected boolean w;
    
    public k(final u b) {
        final boolean t = g.t;
        super();
        this.a = 100;
        this.c = new ArrayList();
        this.g = 0;
        this.h = new Vector();
        this.i = new ArrayList(50);
        this.j = new Vector();
        this.k = 0;
        this.l = 0;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = new Object();
        this.r = new Object();
        this.s = 0;
        this.t = 0;
        this.u = new l(this);
        this.v = 0;
        this.w = false;
        this.b = b;
        this.b.c().a(this.u);
        this.j();
        if (com.avocent.kvm.b.d.a.c != 0) {
            g.t = !t;
        }
    }
    
    protected void j() {
        final boolean t = g.t;
        int i = 0;
        while (i < 50) {
            this.i.add(new gb(0));
            ++i;
            if (t) {
                break;
            }
        }
    }
    
    public int h() {
        return this.k;
    }
    
    public long e() {
        return this.m;
    }
    
    public long f() {
        return this.n;
    }
    
    public int g() {
        return this.l;
    }
    
    public u a() {
        return this.b;
    }
    
    public void i() {
        this.k = 0;
        this.m = 0L;
        this.n = 0L;
        this.l = 0;
        this.o = 0L;
    }
    
    public void a(final db e) {
        this.c.add(e);
        if (this.e == null) {
            this.e = e;
        }
        if (this.d != null) {
            e.a(this.d);
        }
        e.a(this);
        e.a(this.b.c());
        e.a(this.w);
    }
    
    public void k() {
        final boolean t = g.t;
        int i = 0;
        while (i < this.h.size()) {
            ((c)this.h.get(i)).a(this);
            ++i;
            if (t) {
                break;
            }
        }
    }
    
    public void b(final db db) {
        final boolean t = g.t;
        int i = 0;
        while (i < this.h.size()) {
            ((c)this.h.get(i)).a(this, db);
            ++i;
            if (t) {
                break;
            }
        }
    }
    
    public void l() {
        final boolean t = g.t;
        int i = 0;
        while (i < this.h.size()) {
            ((c)this.h.get(i)).b(this);
            ++i;
            if (t) {
                break;
            }
        }
    }
    
    public boolean m() {
        return this.a == 102;
    }
    
    public void b() {
        if (this.f != null) {
            this.f.a();
            this.f.interrupt();
        }
    }
    
    public void c() {
        if (this.a == 101) {
            return;
        }
        Label_0091: {
            if (this.f != null && this.a == 103) {
                synchronized (this.f) {
                    this.a = 101;
                    this.f.notifyAll();
                }
                if (!g.t) {
                    break Label_0091;
                }
            }
            this.f = new lb(this);
            this.a = 101;
            this.f.start();
            this.k();
        }
        this.k();
    }
    
    protected boolean a(final Throwable t) {
        t.printStackTrace();
        return !(t instanceof IOException);
    }
    
    public gb d() {
        final boolean t = g.t;
        synchronized (this.i) {
            while (this.i.size() == 0) {
                try {
                    this.i.wait();
                    continue;
                }
                catch (InterruptedException ex) {
                    if (!t) {
                        continue;
                    }
                }
                break;
            }
            return this.i.remove(0);
        }
    }
    
    public void a(final gb gb) {
        synchronized (this.j) {
            this.j.addElement(gb);
            this.j.notifyAll();
        }
    }
    
    public void b(final gb gb) {
        synchronized (this.i) {
            this.i.add(gb);
            this.i.notifyAll();
        }
    }
    
    public void n() {
        final boolean t = g.t;
        if (this.q != null) {
            this.b(this.q);
            this.q = null;
        }
        while (this.j.size() == 0) {
            synchronized (this.r) {
                this.r.notifyAll();
            }
            try {
                synchronized (this.j) {
                    this.j.wait(1000L);
                }
                continue;
            }
            catch (InterruptedException ex) {
                if (!t) {
                    continue;
                }
            }
            break;
        }
        synchronized (this.j) {
            this.q = this.j.remove(0);
        }
        synchronized (this.p) {
            this.p.notifyAll();
        }
        ++this.l;
        this.m += this.q.g();
    }
    
    public void a(final int n) {
        synchronized (this.r) {
            try {
                if (this.j.size() != 0) {
                    this.r.wait(n);
                }
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }
}
