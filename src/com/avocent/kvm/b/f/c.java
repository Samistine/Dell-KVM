// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.f;

public class c {

    public int a;
    public int b;
    public int c;
    public int d;
    private static final String[] z;

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

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "z8`".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097:
            {
                if (n2 > 1) {
                    break Label_0097;
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
                            c2 = '\u0002';
                            break;
                        }
                        case 2: {
                            c2 = '@';
                            break;
                        }
                        case 3: {
                            c2 = '\\';
                            break;
                        }
                        default: {
                            c2 = 'I';
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
        final char[] charArray2 = "v\"".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213:
            {
                if (n6 > 1) {
                    break Label_0213;
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
                            c4 = '\u0002';
                            break;
                        }
                        case 2: {
                            c4 = '@';
                            break;
                        }
                        case 3: {
                            c4 = '\\';
                            break;
                        }
                        default: {
                            c4 = 'I';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
