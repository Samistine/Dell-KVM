package com.avocent.lenovo.kvm;

import java.util.Iterator;
import javax.swing.Action;
import javax.swing.JMenuItem;
import com.avocent.a.a.c.d;
import javax.swing.JMenu;
import com.avocent.a.a.c.b;
import com.avocent.a.a.i;
import com.avocent.a.a.d.a;

public class n extends a
{
    private static final String[] z;
    
    public n(final i i, final b b, final boolean b2) {
        super(i, b, b2);
    }
    
    protected void b() {
        final boolean cb = c.cb;
        super.b();
        final JMenu jMenu = new JMenu(this.a.b(n.z[2]));
        final JMenu jMenu2 = new JMenu(this.a.b(n.z[1]));
        final Iterator a = this.q.a(n.z[3]);
        while (a != null && a.hasNext()) {
            jMenu.add(new JMenuItem(new d(this.q, a.next())));
            if (cb) {
                break;
            }
        }
        this.d().add(jMenu);
        final Iterator a2 = this.q.a(n.z[0]);
        while (a2 != null && a2.hasNext()) {
            jMenu2.add(new JMenuItem(new d(this.q, a2.next())));
            if (cb) {
                break;
            }
        }
        this.d().add(jMenu2);
        if (com.avocent.kvm.b.d.a.c != 0) {
            c.cb = !cb;
        }
    }
    
    protected void a() {
        super.a();
        final c c = (c)this.a;
        final JMenu jMenu = new JMenu(this.a.b(n.z[4]));
    }
    
    static {
        final String[] z2 = new String[5];
        final int n = 0;
        final char[] charArray = "*;~_\u007f(#xU\u007f$.oAo6(~\\u9".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098: {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'i';
                            break;
                        }
                        case 1: {
                            c2 = 'o';
                            break;
                        }
                        case 2: {
                            c2 = ',';
                            break;
                        }
                        case 3: {
                            c2 = '\u0013';
                            break;
                        }
                        default: {
                            c2 = ' ';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
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
        final char[] charArray2 = "$.oAo6\"i]u6,xAl(#xU".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214: {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'i';
                            break;
                        }
                        case 1: {
                            c4 = 'o';
                            break;
                        }
                        case 2: {
                            c4 = ',';
                            break;
                        }
                        case 3: {
                            c4 = '\u0013';
                            break;
                        }
                        default: {
                            c4 = ' ';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
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
        final char[] charArray3 = "$.oAo6\"i]u6.`Gf".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330: {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'i';
                            break;
                        }
                        case 1: {
                            c6 = 'o';
                            break;
                        }
                        case 2: {
                            c6 = ',';
                            break;
                        }
                        case 3: {
                            c6 = '\u0013';
                            break;
                        }
                        default: {
                            c6 = ' ';
                            break;
                        }
                    }
                    charArray3[length3] = (char)(c5 ^ c6);
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
        final char[] charArray4 = "(#xU\u007f$.oAo6(~\\u9".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0446: {
                if (n14 > 1) {
                    break Label_0446;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'i';
                            break;
                        }
                        case 1: {
                            c8 = 'o';
                            break;
                        }
                        case 2: {
                            c8 = ',';
                            break;
                        }
                        case 3: {
                            c8 = '\u0013';
                            break;
                        }
                        default: {
                            c8 = ' ';
                            break;
                        }
                    }
                    charArray4[length4] = (char)(c7 ^ c8);
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
        final char[] charArray5 = "$.e]\u007f$*bF\u007f9 {Vr".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0562: {
                if (n18 > 1) {
                    break Label_0562;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'i';
                            break;
                        }
                        case 1: {
                            c10 = 'o';
                            break;
                        }
                        case 2: {
                            c10 = ',';
                            break;
                        }
                        case 3: {
                            c10 = '\u0013';
                            break;
                        }
                        default: {
                            c10 = ' ';
                            break;
                        }
                    }
                    charArray5[length5] = (char)(c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 <= n20) {
                z2[n17] = new String(charArray5).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
