// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a;

import com.avocent.a.d;
import com.avocent.a.e;
import com.avocent.a.l;
import com.avocent.a.m;
import com.avocent.a.n;
import com.avocent.a.o;
import com.avocent.a.p;
import com.avocent.kvm.b.d.a;
import java.awt.Component;
import java.awt.Dialog;
import javax.swing.Action;

public class f extends e {

    protected Action j;
    protected Action k;
    protected Action l;
    protected Action m;
    protected Action n;

    public f(final String s, final e e) {
        super(/*s,*/ e);
        int i = com.avocent.a.e.i;
        this.j = new l(this, com.avocent.a.d.b(z[3]));
        this.k = new m(this, com.avocent.a.d.b(z[1]));
        this.l = new n(this, com.avocent.a.d.b(z[2]));
        this.m = new o(this, com.avocent.a.d.b(z[0]));
        this.n = new p(this, com.avocent.a.d.b(z[4]));
        if (i != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    public Action a() {
        return this.j;
    }

    public Action c() {
        return this.l;
    }

    public Action f() {
        return this.m;
    }

    public void g() {
        ((Dialog) this.component_b).pack();
        this.component_b.setVisible(true);
    }

    public void h() {
        this.i();
        this.k();
    }

    public void i() {
    }

    public void j() {
        this.getComponent_b().setVisible(false);
    }

    public void k() {
        this.getComponent_b().setVisible(false);
    }

    public void l() {
    }

    static {
        final String[] z2 = new String[5];
        final int n = 0;
        final char[] charArray = "\t\u000b5W\\\u0001\u001f#]Z".toCharArray();
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
                            c2 = '@';
                            break;
                        }
                        case 1: {
                            c2 = 'O';
                            break;
                        }
                        case 2: {
                            c2 = 's';
                            break;
                        }
                        case 3: {
                            c2 = '\u0011';
                            break;
                        }
                        default: {
                            c2 = '\u0003';
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
        final char[] charArray2 = "\t\u000b5W\\\u0003\u0003<BF".toCharArray();
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
                            c4 = '@';
                            break;
                        }
                        case 1: {
                            c4 = 'O';
                            break;
                        }
                        case 2: {
                            c4 = 's';
                            break;
                        }
                        case 3: {
                            c4 = '\u0011';
                            break;
                        }
                        default: {
                            c4 = '\u0003';
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
        final char[] charArray3 = "\t\u000b5W\\\u0003\u000e=RF\f".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329:
            {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '@';
                            break;
                        }
                        case 1: {
                            c6 = 'O';
                            break;
                        }
                        case 2: {
                            c6 = 's';
                            break;
                        }
                        case 3: {
                            c6 = '\u0011';
                            break;
                        }
                        default: {
                            c6 = '\u0003';
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
        final char[] charArray4 = "\t\u000b5W\\\u000f\u0004".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0445:
            {
                if (n14 > 1) {
                    break Label_0445;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '@';
                            break;
                        }
                        case 1: {
                            c8 = 'O';
                            break;
                        }
                        case 2: {
                            c8 = 's';
                            break;
                        }
                        case 3: {
                            c8 = '\u0011';
                            break;
                        }
                        default: {
                            c8 = '\u0003';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 > n16) {
                continue;
            }
            break;
        }
        z2[n13] = new String(charArray4).intern();
        final int n17 = 4;
        final char[] charArray5 = "\t\u000b5W\\\b\n?A".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0561:
            {
                if (n18 > 1) {
                    break Label_0561;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = '@';
                            break;
                        }
                        case 1: {
                            c10 = 'O';
                            break;
                        }
                        case 2: {
                            c10 = 's';
                            break;
                        }
                        case 3: {
                            c10 = '\u0011';
                            break;
                        }
                        default: {
                            c10 = '\u0003';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 <= n20) {
                z2[n17] = new String(charArray5).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
