package com.avocent.lenovo.kvm;

import com.avocent.a.a.m;
import com.avocent.kvm.b.bb;
import java.awt.Component;
import com.avocent.a.a.b.d;
import javax.swing.JMenuBar;
import com.avocent.a.a.b.e;
import javax.swing.JFrame;
import com.avocent.kvm.b.e.a;
import com.avocent.a.a.e.q;
import com.avocent.a.a.e.k;
import com.avocent.a.a.e.c;
import com.avocent.a.f;
import com.avocent.a.a.i;
import com.avocent.kvm.b.x;
import com.avocent.kvm.nativekeyboard.g;
import com.avocent.kvm.b.r;
import com.avocent.kvm.b.f.b;
import com.avocent.kvm.b.qb;
import com.avocent.kvm.b.pb;
import com.avocent.kvm.b.ob;
import com.avocent.kvm.b.hb;
import com.avocent.a.a.s;

public class f implements s
{
    private static final String[] z;
    
    public hb a(final String s) {
        final boolean cb = c.cb;
        final String property = System.getProperty(f.z[4]);
        ob ob = null;
        Label_0097: {
            if (property == null) {
                ob = new ob(s);
                if (!cb) {
                    break Label_0097;
                }
            }
            if (property.equalsIgnoreCase(f.z[2])) {
                ob = new pb(s);
                if (!cb) {
                    break Label_0097;
                }
            }
            if (property != null && property.equalsIgnoreCase(f.z[3])) {
                ob = new qb(s);
                if (!cb) {
                    break Label_0097;
                }
            }
            ob = new ob(s);
        }
        b.a().a(f.z[1] + ob.getClass().getName());
        return ob;
    }
    
    public r a(final Object o) {
        try {
            return new g();
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            System.out.println(f.z[5]);
            return new x();
        }
    }
    
    public f a(final i i) {
        final c c = new c(i);
        c.a((k)new com.avocent.a.a.e.s(i));
        c.a((k)new q(i, false));
        c.a((k)new com.avocent.a.a.e.r(i));
        return c;
    }
    
    public JFrame b(final i i) {
        final e e = new e(i);
        e.setJMenuBar(new n(i, i.q(), false));
        return e;
    }
    
    public JFrame c(final i i) {
        final d d = new d(i);
        d.setJMenuBar(new n(i, i.q(), true));
        return d;
    }
    
    public bb a(final i i, final Component component) {
        if (i.b(f.z[0], null) != null) {
            return new bb();
        }
        return new com.avocent.kvm.nativekeyboard.c(i, component);
    }
    
    public m a() {
        return new d(this);
    }
    
    static {
        final String[] z2 = new String[6];
        final int n = 0;
        final char[] charArray = "\u0012m:Z7\u0010m".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097: {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'b';
                            break;
                        }
                        case 1: {
                            c2 = '\u0001';
                            break;
                        }
                        case 2: {
                            c2 = '[';
                            break;
                        }
                        case 3: {
                            c2 = '#';
                            break;
                        }
                        default: {
                            c2 = 'B';
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
        final char[] charArray2 = "BW2G'\r!+B,\u0007m{W;\u0012da\u0003".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213: {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'b';
                            break;
                        }
                        case 1: {
                            c4 = '\u0001';
                            break;
                        }
                        case 2: {
                            c4 = '[';
                            break;
                        }
                        case 3: {
                            c4 = '#';
                            break;
                        }
                        default: {
                            c4 = 'B';
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
        final char[] charArray3 = "\u0003b8F.".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329: {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'b';
                            break;
                        }
                        case 1: {
                            c6 = '\u0001';
                            break;
                        }
                        case 2: {
                            c6 = '[';
                            break;
                        }
                        case 3: {
                            c6 = '#';
                            break;
                        }
                        default: {
                            c6 = 'B';
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
        final char[] charArray4 = "\u0006n.A.\u0007c.E$".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0445: {
                if (n14 > 1) {
                    break Label_0445;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'b';
                            break;
                        }
                        case 1: {
                            c8 = '\u0001';
                            break;
                        }
                        case 2: {
                            c8 = '[';
                            break;
                        }
                        case 3: {
                            c8 = '#';
                            break;
                        }
                        default: {
                            c8 = 'B';
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
        final char[] charArray5 = "\u0014h?F-2`5F.6x+F".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0561: {
                if (n18 > 1) {
                    break Label_0561;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'b';
                            break;
                        }
                        case 1: {
                            c10 = '\u0001';
                            break;
                        }
                        case 2: {
                            c10 = '[';
                            break;
                        }
                        case 3: {
                            c10 = '#';
                            break;
                        }
                        default: {
                            c10 = 'B';
                            break;
                        }
                    }
                    charArray5[length5] = (char)(c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 > n20) {
                continue;
            }
            break;
        }
        z2[n17] = new String(charArray5).intern();
        final int n21 = 5;
        final char[] charArray6 = "BG:J.\u0007e{W-Bm4B&Bo:W+\u0014d{H'\u001bc4B0\u0006!7J \u0010`)Zl".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0677: {
                if (n22 > 1) {
                    break Label_0677;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = 'b';
                            break;
                        }
                        case 1: {
                            c12 = '\u0001';
                            break;
                        }
                        case 2: {
                            c12 = '[';
                            break;
                        }
                        case 3: {
                            c12 = '#';
                            break;
                        }
                        default: {
                            c12 = 'B';
                            break;
                        }
                    }
                    charArray6[length6] = (char)(c11 ^ c12);
                    ++n24;
                } while (n22 == 0);
            }
            if (n22 <= n24) {
                z2[n21] = new String(charArray6).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
