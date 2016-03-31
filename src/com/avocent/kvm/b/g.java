// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.io.IOException;
import java.beans.PropertyChangeListener;
import com.avocent.kvm.b.a.a;
import com.avocent.kvm.b.f.f;
import java.util.ArrayList;
import com.avocent.kvm.b.b.Stream_c;
import java.util.HashMap;
import java.io.OutputStream;
import com.avocent.kvm.b.f.e;
import java.beans.PropertyChangeSupport;
import java.util.Vector;

public abstract class g implements u {

    protected eb a;
    protected fb b;
    protected Vector c;
    protected PropertyChangeSupport d;
    protected boolean e;
    protected e f;
    protected int g;
    protected OutputStream h;
    public static boolean i;
    protected HashMap j;
    protected r k;
    protected bb l;
    protected s m;
    protected Stream_c n;
    protected boolean o;
    protected int p;
    protected ArrayList q;
    protected ib r;
    protected jb s;
    public static boolean t;
    private static final String[] z;

    public g() {
        this.c = new Vector();
        this.e = false;
        this.f = com.avocent.kvm.b.f.f.c();
        this.j = new HashMap();
        this.p = 0;
        this.q = new ArrayList();
        this.d = new PropertyChangeSupport(this);
        this.a(com.avocent.kvm.b.g.z[0], Boolean.FALSE);
        final String property = System.getProperty(com.avocent.kvm.b.g.z[2]);
        if (property != null) {
            this.a(com.avocent.kvm.b.g.z[1], Boolean.valueOf(property.trim()));
        }
    }

    @Override
    public void a(final a a) {
        if (!this.c.contains(a)) {
            this.d.addPropertyChangeListener(a);
            this.c.addElement(a);
            if (!com.avocent.kvm.b.g.t) {
                return;
            }
        }
        this.i().a(com.avocent.kvm.b.g.z[3]);
    }

    @Override
    public void b(final a a) {
        this.c.remove(a);
        this.d.removePropertyChangeListener(a);
    }

    public w a(final int n) {
        return this.q.get(n);
    }

    public void j() {
        final boolean t = com.avocent.kvm.b.g.t;
        this.p = 2;
        if (this.l != null) {
            this.l.a(this.e());
        }
        if (this.m != null) {
            this.m.a(this.d());
        }
        int i = 0;
        while (i < this.c.size()) {
            ((a) this.c.elementAt(i)).a(this);
            ++i;
            if (t) {
                break;
            }
        }
    }

    public void k() {
        final boolean t = com.avocent.kvm.b.g.t;
        int i = 0;
        while (i < this.c.size()) {
            ((a) this.c.elementAt(i)).b(this);
            ++i;
            if (t) {
                break;
            }
        }
    }

    public void a(final r r, final r r2) {
        final boolean t = com.avocent.kvm.b.g.t;
        int i = 0;
        while (i < this.c.size()) {
            ((a) this.c.elementAt(i)).a(this, r, r2);
            ++i;
            if (t) {
                break;
            }
        }
    }

    @Override
    public void f() throws IOException {
    }

    @Override
    public eb b() {
        return this.a;
    }

    @Override
    public fb c() {
        return this.b;
    }

    @Override
    public abstract void a() throws IOException;

    public void l() {
        this.a.b();
    }

    public void a(final db db) {
        this.a.a(db);
        if (this.p == 0) {
            this.p = 1;
        }
        this.b(db);
    }

    @Override
    public ib d() {
        return this.r;
    }

    @Override
    public jb e() {
        return this.s;
    }

    public void b(final db db) {
        final boolean t = com.avocent.kvm.b.g.t;
        int i = 0;
        while (i < this.c.size()) {
            ((a) this.c.elementAt(i)).a(this, db);
            ++i;
            if (t) {
                break;
            }
        }
    }

    @Override
    public void a(final r k) {
        final r i = this.k;
        (this.k = k).a(this);
        this.a(i, k);
    }

    @Override
    public r g() {
        return this.k;
    }

    @Override
    public bb h() {
        return this.l;
    }

    @Override
    public void a(final String s, final Object o) {
        final Object value = this.j.get(s);
        this.j.put(s, o);
        this.a(s, value, o);
    }

    public void b(final String s, final Object o) {
        this.j.get(s);
        this.j.put(s, o);
    }

    @Override
    public Object a(final String s) {
        return this.j.get(s);
    }

    @Override
    public String b(final String s) {
        final Object value = this.j.get(s);
        return (value == null) ? null : value.toString();
    }

    @Override
    public Integer a(final String s, final Integer n) {
        final Integer value = (Integer) this.j.get(s);//Sam
        Integer value2;
        if (value == null) {
            value2 = n;
        } else if (value instanceof Integer) {
            value2 = value;
        } else {
            value2 = Integer.valueOf(value.toString().trim());
        }
        return value2;
    }

    @Override
    public void a(final String s, final Object o, final Object o2) {
        this.d.firePropertyChange(s, o, o2);
    }

    @Override
    public e i() {
        return this.f;
    }

    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "\b%\u001eV?\u001e)\u0013^2\u001b#\tP;\u001f".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098:
            {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'Z';
                            break;
                        }
                        case 1: {
                            c2 = '`';
                            break;
                        }
                        case 2: {
                            c2 = ']';
                            break;
                        }
                        case 3: {
                            c2 = '\u0019';
                            break;
                        }
                        default: {
                            c2 = 'm';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n4;
                } while (n2 == 0);
            }
            if (n2 > n4) {
                continue;
            }
            break;
        }
        z2[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "(\u0005;|\u001f?\u000e>|>9\u00128|\u0003\u0015\u000e\u001eq\b9\u000b.l\u0000\u001f\u0012/v\u001f".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214:
            {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'Z';
                            break;
                        }
                        case 1: {
                            c4 = '`';
                            break;
                        }
                        case 2: {
                            c4 = ']';
                            break;
                        }
                        case 3: {
                            c4 = '\u0019';
                            break;
                        }
                        default: {
                            c4 = 'm';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 > n8) {
                continue;
            }
            break;
        }
        z2[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "(\u0005;k\b)\b\u0012w((\u00122k".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330:
            {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'Z';
                            break;
                        }
                        case 1: {
                            c6 = '`';
                            break;
                        }
                        case 2: {
                            c6 = ']';
                            break;
                        }
                        case 3: {
                            c6 = '\u0019';
                            break;
                        }
                        default: {
                            c6 = 'm';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 > n12) {
                continue;
            }
            break;
        }
        z2[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = "z$(i\u00013\u0003<m\bz\u00019}M5\u0006}R;\u001738j\u001e3\u000f3U\u0004)\u00148w\b(N".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0446:
            {
                if (n14 > 1) {
                    break Label_0446;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'Z';
                            break;
                        }
                        case 1: {
                            c8 = '`';
                            break;
                        }
                        case 2: {
                            c8 = ']';
                            break;
                        }
                        case 3: {
                            c8 = '\u0019';
                            break;
                        }
                        default: {
                            c8 = 'm';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 <= n16) {
                z2[n13] = new String(charArray4).intern();
                z = z2;
                g.i = false;
                break;
            }
            continue;
        }
    }
}
