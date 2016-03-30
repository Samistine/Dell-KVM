// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

public class a extends com.avocent.a.e {

    protected f j;
    protected b k;
    protected e l;
    protected c m;
    protected com.avocent.kvm.b.e.a n;
    public static int o;
    private static final String[] z;

    public a(final com.avocent.kvm.b.e.a a) {
        super(z[3], (com.avocent.a.e) a);
        int n = o;
        this.n = a;
        this.k = new b(this);
        this.l = new e(this);
        this.m = new c(this);
        if (com.avocent.kvm.b.d.a.c != 0) {
            o = ++n;
        }
    }

    public com.avocent.kvm.b.e.a a() {
        return this.n;
    }

    public void a(final boolean visible) {
        if (visible && this.j == null) {
            this.j = new f(this, this.n.c());
            final String a = this.n.a(com.avocent.lenovo.kvm.a.a.z[0], "");
            final String a2 = this.n.a(com.avocent.lenovo.kvm.a.a.z[1], "");
            this.j.setTitle(com.avocent.lenovo.kvm.a.a.z[2] + a);
            this.j.a(a2);
        }
        this.j.setVisible(visible);
    }

    public void c() {
    }

    public void f() {
    }

    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "o`\u001bI".toCharArray();
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
                            c2 = '\'';
                            break;
                        }
                        case 1: {
                            c2 = '/';
                            break;
                        }
                        case 2: {
                            c2 = 'H';
                            break;
                        }
                        case 3: {
                            c2 = '\u001d';
                            break;
                        }
                        default: {
                            c2 = '\u0018';
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
        final char[] charArray2 = "r|\rOVfb\r".toCharArray();
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
                            c4 = '\'';
                            break;
                        }
                        case 1: {
                            c4 = '/';
                            break;
                        }
                        case 2: {
                            c4 = 'H';
                            break;
                        }
                        case 3: {
                            c4 = '\u001d';
                            break;
                        }
                        default: {
                            c4 = '\u0018';
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
        final char[] charArray3 = "nbr=".toCharArray();
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
                            c6 = '\'';
                            break;
                        }
                        case 1: {
                            c6 = '/';
                            break;
                        }
                        case 2: {
                            c6 = 'H';
                            break;
                        }
                        case 3: {
                            c6 = '\u001d';
                            break;
                        }
                        default: {
                            c6 = '\u0018';
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
        final char[] charArray4 = "nb\ftyK@/".toCharArray();
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
                            c8 = '\'';
                            break;
                        }
                        case 1: {
                            c8 = '/';
                            break;
                        }
                        case 2: {
                            c8 = 'H';
                            break;
                        }
                        case 3: {
                            c8 = '\u001d';
                            break;
                        }
                        default: {
                            c8 = '\u0018';
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
                break;
            }
            continue;
        }
    }
}
