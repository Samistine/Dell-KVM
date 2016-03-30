// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a;

import com.avocent.kvm.b.eb;
import javax.swing.SwingUtilities;
import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.nb;
import com.avocent.kvm.b.u;

public class k extends Thread {

    protected boolean a;
    protected j b;
    protected u c;
    protected nb d;
    protected int[] e;
    protected int[] f;
    protected long[] g;
    protected long[] h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected i m;
    private static final String z;

    public k(final u c, final j b) {
        super(com.avocent.a.k.z);
        int i = com.avocent.a.e.i;
        this.a = false;
        this.d = new nb();
        this.i = 10;
        this.j = 1000;
        this.k = 0;
        this.l = -1;
        this.m = new i(this);
        this.c = c;
        this.b = b;
        this.a(5, 1000);
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.a.e.i = ++i;
        }
    }

    public nb a() {
        return this.d;
    }

    public synchronized void a(final int i, final int j) {
        this.i = i;
        this.j = j;
        this.k = 0;
        this.l = -1;
        this.e = new int[i];
        this.f = new int[i];
        this.h = new long[i];
        this.g = new long[i];
    }

    public void b() {
        this.a = true;
    }

    @Override
    public void run() {
        final int i = com.avocent.a.e.i;
        eb b = null;
        while (!this.a) {
            try {
                try {
                    Thread.sleep(this.j);
                } catch (InterruptedException ex) {
                }
                synchronized (this) {
                    if (this.c == null) {
                        // monitorexit(this)
                        if (i == 0) {
                            continue;
                        }
                    }
                    if (b == null) {
                        final eb b2 = this.c.b();
                        if (b2 != null) {
                            b = b2;
                            b.i();
                        }
                        // monitorexit(this)
                        if (i == 0) {
                            continue;
                        }
                    }
                    b = this.c.b();
                    if (++this.l >= this.i) {
                        this.l = 0;
                    }
                    this.e[this.l] = b.h();
                    this.f[this.l] = b.g();
                    this.g[this.l] = b.f();
                    this.h[this.l] = b.e();
                    b.i();
                    if (this.l + 1 > this.k) {
                        this.k = this.l + 1;
                    }
                    int n = 0;
                    int n2 = 0;
                    double n3 = 0.0;
                    double n4 = 0.0;
                    int j = 0;
                    while (j < this.k) {
                        n += this.e[j];
                        n2 += this.f[j];
                        n3 += this.h[j];
                        n4 += this.g[j];
                        ++j;
                        if (i != 0) {
                            break;
                        }
                    }
                    final double n5 = this.k * this.j / 1000;
                    final double n6 = n / n5;
                    final double n7 = n2 / n5;
                    final double n8 = (n4 == 0.0) ? 0.0 : ((n4 - n3) / n4 * 100.0);
                    final double n9 = (int) (n3 / n5);
                    this.d.a(new Double(n6));
                    this.d.d(new Double(n7));
                    this.d.c(new Double(n8));
                    this.d.b(new Double(n9));
                    SwingUtilities.invokeLater(this.m);
                }
                continue;
            } catch (Throwable t) {
                t.printStackTrace();
                if (i == 0) {
                    continue;
                }
            }
            break;
        }
    }

    static {
        final char[] charArray = "\\\u001a8<1d?\u001c\u0000:7\u001f\u0001\u000e dl \u001f0v8\u0010".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094:
            {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u0017';
                            break;
                        }
                        case 1: {
                            c2 = 'L';
                            break;
                        }
                        case 2: {
                            c2 = 'u';
                            break;
                        }
                        case 3: {
                            c2 = 'o';
                            break;
                        }
                        default: {
                            c2 = 'T';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                break;
            }
            continue;
        }
    }
}
