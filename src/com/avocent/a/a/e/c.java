// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import com.avocent.a.j;
import java.awt.event.WindowListener;
import java.awt.Frame;
import com.avocent.a.g;
import javax.swing.JDialog;
import java.awt.Component;
import com.avocent.a.e;
import com.avocent.kvm.b.nb;
import com.avocent.a.k;
import com.avocent.kvm.b.u;
import com.avocent.a.a.i;
import java.util.ArrayList;
import com.avocent.a.f;

public class c extends f {

    protected ArrayList o;
    protected i p;
    protected u q;
    protected k r;
    protected nb s;
    public static int t;
    private static final String z;

    public c(final i p) {
        super(z, p);//Sam
        this.o = new ArrayList();
        this.p = p;
        this.a(this.m());
    }

    public JDialog m() {
        final p p = new p(this, ((g) this.f).c(), true);
        p.addWindowListener(new l(this));
        return p;
    }

    public void a(final com.avocent.a.a.e.k k) {
        this.o.add(k);
        ((p) this.b).a(k);
        k.a(this);
    }

    public void n() {
        final int t = c.t;
        boolean enabled = false;
        int i = 0;
        while (i < this.o.size()) {
            if (((com.avocent.a.a.e.k) this.o.get(i)).f()) {
                enabled = true;
                if (t == 0) {
                    break;
                }
            }
            ++i;
            if (t != 0) {
                break;
            }
        }
        this.m.setEnabled(enabled);
    }

    public void a(final boolean enabled) {
        this.m.setEnabled(enabled);
    }

    @Override
    public void g() {
        this.q = this.p.a();
        if (this.q != null) {
            if (this.r != null) {
                this.r.b();
            }
            this.r = new k(this.q, (j) this.b);
            this.s = this.r.a();
            this.r.start();
        }
        if (!this.b.isVisible()) {
            final p p = (p) this.b;
            p.pack();
            p.setLocationRelativeTo(((g) this.f).c());
            this.p();
            this.n();
            this.b.setVisible(true);
            if (c.t == 0) {
                break;
            }
        }
        if (!this.b.isShowing()) {
            ((JDialog) this.b).toFront();
        }
    }

    public nb o() {
        return this.s;
    }

    public void p() {
        final int t = c.t;
        int i = 0;
        while (i < this.o.size()) {
            ((com.avocent.a.a.e.k) this.o.get(i)).c();
            ++i;
            if (t != 0) {
                break;
            }
        }
    }

    @Override
    public void i() {
        final int t = c.t;
        int i = 0;
        while (i < this.o.size()) {
            ((com.avocent.a.a.e.k) this.o.get(i)).a();
            ++i;
            if (t != 0) {
                break;
            }
        }
    }

    @Override
    public void j() {
        final int t = c.t;
        int i = 0;
        while (i < this.o.size()) {
            ((com.avocent.a.a.e.k) this.o.get(i)).b();
            ++i;
            if (t != 0) {
                break;
            }
        }
        super.j();
    }

    static {
        final char[] charArray = "1TT\u0017\u0012\u0001zF\u0001\u001e\n[E1\u001e\u0004YY\u0012".toCharArray();
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
                            c2 = 'e';
                            break;
                        }
                        case 1: {
                            c2 = '5';
                            break;
                        }
                        case 2: {
                            c2 = '6';
                            break;
                        }
                        case 3: {
                            c2 = 'u';
                            break;
                        }
                        default: {
                            c2 = 'w';
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
