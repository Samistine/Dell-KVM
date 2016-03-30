package com.avocent.kvm.b;

import java.awt.image.ColorModel;
import com.avocent.kvm.b.f.c;
import java.util.Vector;

public abstract class h implements fb
{
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected Vector g;
    protected int h;
    protected boolean i;
    protected String j;
    protected boolean k;
    protected c l;
    private static final String z;
    
    public h() {
        super();
        this.a = 801;
        this.b = 601;
        this.c = 1;
        this.d = 0;
        this.e = 0;
        this.f = 2560000;
        this.g = new Vector();
        this.h = -1;
        this.i = false;
        this.j = h.z;
        this.k = false;
        this.l = new c();
    }
    
    public void a(final cb cb) {
        this.g.add(cb);
    }
    
    public void b(final cb cb) {
        this.g.remove(cb);
    }
    
    public int c() {
        return this.a;
    }
    
    public int d() {
        return this.b;
    }
    
    public void a(final int n, final int n2) {
        if ((n != this.a || n2 != this.b) && n <= 1600) {
            if (n2 <= 1600) {
                this.b = n2;
                this.a = n;
                this.d = n;
                this.e = n2;
                this.f = n * n2;
                this.m();
                this.b(n, n2);
            }
        }
    }
    
    public int i() {
        return this.d;
    }
    
    public int j() {
        return this.e;
    }
    
    public void b(final int n, final int n2) {
        final boolean t = g.t;
        int i = 0;
        while (i < this.g.size()) {
            ((cb)this.g.elementAt(i)).a(n, n2);
            ++i;
            if (t) {
                break;
            }
        }
    }
    
    public void k() {
        final boolean t = g.t;
        synchronized (this) {
            int i = 0;
            while (i < this.g.size()) {
                ((cb)this.g.elementAt(i)).a();
                ++i;
                if (t) {
                    break;
                }
            }
            this.m();
        }
    }
    
    public void a() {
        final boolean t = g.t;
        int i = 0;
        while (i < this.g.size()) {
            ((cb)this.g.elementAt(i)).b();
            ++i;
            if (t) {
                break;
            }
        }
    }
    
    public ColorModel f() {
        return ColorModel.getRGBdefault();
    }
    
    public int g() {
        return this.h;
    }
    
    public void b(final boolean b) {
        if (b) {
            this.l.a(0, 0, this.i(), this.j());
            if (!g.t) {
                return;
            }
        }
        this.l.a(this.i(), this.j(), 0, 0);
    }
    
    public boolean l() {
        return this.l != null && !this.l.a();
    }
    
    public void a(final boolean i) {
        this.i = i;
    }
    
    public void b() {
        final boolean t = g.t;
        if (this.l()) {
            final c l = this.l;
            int i = 0;
            while (i < this.g.size()) {
                ((cb)this.g.elementAt(i)).a(l.a, l.b, l.c, l.d);
                ++i;
                if (t) {
                    break;
                }
            }
            this.m();
        }
    }
    
    public c h() {
        return this.l;
    }
    
    public void m() {
        final c l = this.l;
        final c i = this.l;
        final boolean b = false;
        i.d = (b ? 1 : 0);
        l.c = (b ? 1 : 0);
        this.l.a = this.c();
        this.l.b = this.d();
    }
    
    public int n() {
        return (this.h == -1) ? 0 : this.h;
    }
    
    static {
        final char[] charArray = "}%\u001cJxj\u0015\u0007MAu8\tN{".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094: {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u0013';
                            break;
                        }
                        case 1: {
                            c2 = 'J';
                            break;
                        }
                        case 2: {
                            c2 = 'h';
                            break;
                        }
                        case 3: {
                            c2 = '#';
                            break;
                        }
                        default: {
                            c2 = '\u001e';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
