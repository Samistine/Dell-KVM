// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.d;

import java.io.IOException;
import java.util.Vector;
import java.io.OutputStream;
import com.avocent.kvm.b.u;

public class e {

    protected u a;
    protected OutputStream b;
    protected Vector c;
    protected int d;
    protected int e;
    protected int f;
    protected h g;
    private static final String[] z;

    public e(final u a, final OutputStream b, final int d, final int e) {
        this.c = new Vector();
        this.d = -1;
        this.a = a;
        this.b = b;
        (this.g = new h(this)).start();
        this.d = d;
        this.e = e;
    }

    public void a(final d d) {
        final boolean f = com.avocent.kvm.b.d.g.f;
        synchronized (this.c) {
            if ((d.i() & 0x4) <= 0 && (d.i() & 0x8) <= 0) {
                int i = this.c.size() - 1;
                while (i >= 0) {
                    final d d2 = (d) this.c.elementAt(i);//Sam
                    if (d2.i() == d.i() && !d.c()) {
                        if (d2.a(d)) {
                            break;
                        }
                        break;
                    } else {
                        --i;
                        if (f) {
                            break;
                        }
                        continue;
                    }
                }
            }
            d.a(true);
            this.c.addElement(d);
            this.c.notifyAll();
        }
    }

    protected void b(final d d) throws IOException {
        final boolean f = com.avocent.kvm.b.d.g.f;
        while (this.e != -1 && this.f > this.e) {
            if (this.f > this.e) {
                this.a.i().a(com.avocent.kvm.b.d.e.z[1] + this.e + com.avocent.kvm.b.d.e.z[2]);
            }
            synchronized (this) {
                try {
                    this.wait(1000L);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (f) {
                break;
            }
        }
        if (this.b != null) {
            synchronized (this.b) {
                final byte[] a = d.a();
                if (a != null) {
                    this.b.write(a);
                }
                final byte[] b = d.b();
                if (b != null) {
                    this.b.write(b);
                }
                this.b.flush();
            }
        }
        ++this.f;
    }

    public synchronized void a(final int n) {
        this.f -= n;
        this.notifyAll();
    }

    protected void a(final Throwable t) {
        this.a.i().a(com.avocent.kvm.b.d.e.z[0] + t.getMessage());
        t.printStackTrace();
    }

    public void a() {
        this.g.a();
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "R\u001dy\u0011S?\u0002m\u0001]z\u0006,\u000fWq\u0013k\u0007D3RI\u0010Dp\u00006B".toCharArray();
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
                            c2 = '\u001f';
                            break;
                        }
                        case 1: {
                            c2 = 'r';
                            break;
                        }
                        case 2: {
                            c2 = '\f';
                            break;
                        }
                        case 3: {
                            c2 = 'b';
                            break;
                        }
                        default: {
                            c2 = '6';
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
        final char[] charArray2 = "??m\u001a\u0016j\u001cm\u0001]q\u001d{\u000eS{\u0015i\u0006\u0016o\u0013o\tSkRo\rCq\u0006,\rP?".toCharArray();
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
                            c4 = '\u001f';
                            break;
                        }
                        case 1: {
                            c4 = 'r';
                            break;
                        }
                        case 2: {
                            c4 = '\f';
                            break;
                        }
                        case 3: {
                            c4 = 'b';
                            break;
                        }
                        default: {
                            c4 = '6';
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
        final char[] charArray3 = "?\u0000i\u0003Uw\u0017hL".toCharArray();
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
                            c6 = '\u001f';
                            break;
                        }
                        case 1: {
                            c6 = 'r';
                            break;
                        }
                        case 2: {
                            c6 = '\f';
                            break;
                        }
                        case 3: {
                            c6 = 'b';
                            break;
                        }
                        default: {
                            c6 = '6';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 <= n12) {
                z2[n9] = new String(charArray3).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
