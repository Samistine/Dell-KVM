package com.avocent.a.a;

import com.avocent.a.d;
import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.r;
import com.avocent.kvm.b.db;
import com.avocent.kvm.b.u;
import com.avocent.kvm.b.a.a;

public class r implements a
{
    protected i a;
    protected h b;
    protected boolean c;
    private static final String[] z;
    
    r(final i a) {
        super();
        this.c = false;
        this.a = a;
    }
    
    public r() {
        super();
        this.c = false;
    }
    
    public void a(final u u) {
        this.a.b().a(r.z[6]);
        this.a.g();
    }
    
    public void a(final u u, final db db) {
    }
    
    public void a(final u u, final r r, final r r2) {
    }
    
    public void b(final u u) {
        if (!this.c) {
            this.c = true;
            this.a.a(u);
        }
    }
    
    public void a(final h b) {
        this.b = b;
    }
    
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final boolean g = i.G;
        final String propertyName = propertyChangeEvent.getPropertyName();
        final String string = propertyChangeEvent.getNewValue().toString();
        if (string.equalsIgnoreCase(r.z[0])) {
            this.a.s();
            if (!g) {
                return;
            }
        }
        if (string.equalsIgnoreCase(r.z[3])) {
            final i a = this.a;
            this.a.d();
            a.f(d.b(r.z[1]));
            System.exit(0);
            if (!g) {
                return;
            }
        }
        if (string.equalsIgnoreCase(r.z[2])) {
            if (this.b == null) {
                return;
            }
            this.b.m();
            if (!g) {
                return;
            }
        }
        if (propertyName.equalsIgnoreCase(r.z[4])) {
            this.a.b().a(r.z[5]);
            this.a.r().pack();
        }
    }
    
    static {
        final String[] z2 = new String[7];
        final int n = 0;
        final char[] charArray = "+)\u0017\u0016y+2\u0010\u0017r7*\u0016\u001fu&9\u001f\u0019u$#\u001d".toCharArray();
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
                            c2 = 'h';
                            break;
                        }
                        case 1: {
                            c2 = 'f';
                            break;
                        }
                        case 2: {
                            c2 = 'Y';
                            break;
                        }
                        case 3: {
                            c2 = 'X';
                            break;
                        }
                        default: {
                            c2 = '<';
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
        final char[] charArray2 = "+\t76Y\u000b\u001207R,\u000f84S\u000f9\u00177\u007f\u0000\u000776Y\u0004\u0015\u0018.]\u0001\n8:P\r".toCharArray();
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
                            c4 = 'h';
                            break;
                        }
                        case 1: {
                            c4 = 'f';
                            break;
                        }
                        case 2: {
                            c4 = 'Y';
                            break;
                        }
                        case 3: {
                            c4 = 'X';
                            break;
                        }
                        default: {
                            c4 = '<';
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
        final char[] charArray3 = ":3\u0017\u0016u&!".toCharArray();
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
                            c6 = 'h';
                            break;
                        }
                        case 1: {
                            c6 = 'f';
                            break;
                        }
                        case 2: {
                            c6 = 'Y';
                            break;
                        }
                        case 3: {
                            c6 = 'X';
                            break;
                        }
                        default: {
                            c6 = '<';
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
        final char[] charArray4 = ")*\u0015\u0007\u007f '\u0017\u0016y$5\u0006\u0011r73\n\u001d".toCharArray();
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
                            c8 = 'h';
                            break;
                        }
                        case 1: {
                            c8 = 'f';
                            break;
                        }
                        case 2: {
                            c8 = 'Y';
                            break;
                        }
                        case 3: {
                            c8 = 'X';
                            break;
                        }
                        default: {
                            c8 = '<';
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
        final char[] charArray5 = ">/\u001d\u001ds76\u0018\u0016y$9\n\u0011f-9\u001a\u0010}&!\u001c\u001c".toCharArray();
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
                            c10 = 'h';
                            break;
                        }
                        case 1: {
                            c10 = 'f';
                            break;
                        }
                        case 2: {
                            c10 = 'Y';
                            break;
                        }
                        case 3: {
                            c10 = 'X';
                            break;
                        }
                        default: {
                            c10 = '<';
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
        final char[] charArray6 = "#0\u0014xp\u0001\u0015-=R\r\u0014cxJ\u0001\u0002<7\u001c\u0018\u00077=PH\u00150\"YH\u000519R\u000f\u0003y<Y\u001c\u0003:,Y\fH".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0678: {
                if (n22 > 1) {
                    break Label_0678;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = 'h';
                            break;
                        }
                        case 1: {
                            c12 = 'f';
                            break;
                        }
                        case 2: {
                            c12 = 'Y';
                            break;
                        }
                        case 3: {
                            c12 = 'X';
                            break;
                        }
                        default: {
                            c12 = '<';
                            break;
                        }
                    }
                    charArray6[length6] = (char)(c11 ^ c12);
                    ++n24;
                } while (n22 == 0);
            }
            if (n22 > n24) {
                continue;
            }
            break;
        }
        z2[n21] = new String(charArray6).intern();
        final int n25 = 6;
        final char[] charArray7 = "H-\u000f\u0015\u001c\u001b\u0003*+U\u0007\by1OH\u0014,6R\u0001\b>v".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0798: {
                if (n26 > 1) {
                    break Label_0798;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = 'h';
                            break;
                        }
                        case 1: {
                            c14 = 'f';
                            break;
                        }
                        case 2: {
                            c14 = 'Y';
                            break;
                        }
                        case 3: {
                            c14 = 'X';
                            break;
                        }
                        default: {
                            c14 = '<';
                            break;
                        }
                    }
                    charArray7[length7] = (char)(c13 ^ c14);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 <= n28) {
                z2[n25] = new String(charArray7).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
