package com.avocent.a.a;

import java.awt.Component;
import javax.swing.JOptionPane;
import com.avocent.kvm.b.ob;
import javax.swing.SwingUtilities;
import com.avocent.kvm.a.l;
import java.io.IOException;
import com.avocent.a.c.c;
import java.beans.PropertyChangeListener;
import com.avocent.a.e;
import com.avocent.a.d;
import com.avocent.a.f;
import com.avocent.a.a.c.b;
import com.avocent.kvm.b.u;
import java.util.prefs.Preferences;
import com.avocent.kvm.b.bb;
import com.avocent.kvm.b.hb;
import javax.swing.JFrame;
import com.avocent.kvm.b.e.a;
import com.avocent.a.g;

public class i extends g implements a
{
    protected JFrame k;
    protected JFrame l;
    protected hb m;
    protected hb n;
    protected bb o;
    protected bb p;
    protected Preferences q;
    protected u r;
    protected b s;
    protected r t;
    protected f u;
    protected k v;
    protected j w;
    protected l x;
    protected f y;
    protected com.avocent.a.c.b z;
    protected t A;
    protected s B;
    protected boolean C;
    protected boolean D;
    protected long E;
    protected boolean F;
    public static boolean G;
    private static final String[] H;
    
    public i() {
        super(i.H[0]);
        this.y = new f(this);
        this.z = new n(this);
        this.A = new t(this);
        this.C = false;
        this.D = false;
        this.F = false;
    }
    
    public void a(final s b, final d j, final String[] array) {
        final boolean g = i.G;
        this.B = b;
        this.j = j;
        b.a().a(array, this);
        if (this.b() != null) {
            final String a = this.a(i.H[46], i.H[45]);
            final boolean b2 = !a.equalsIgnoreCase(i.H[45]) && !a.equalsIgnoreCase("0");
            this.b().b(b2);
            this.b().a(b2);
            if (b2) {
                this.b().a(i.H[44]);
                int i = 0;
                while (i < array.length) {
                    this.b().a(" " + array[i]);
                    ++i;
                    if (g) {
                        break;
                    }
                }
            }
        }
        this.s = new b(this);
        this.v = new k(this);
        this.w = new j(this);
        this.a(this.A);
    }
    
    public void f() throws Exception {
        final boolean g = i.G;
        if (this.a(i.H[15], new Integer(0)) == 1) {
            this.r.c().a(true);
        }
        this.m = this.B.a(i.H[13]);
        this.n = this.B.a(i.H[12]);
        final Boolean a = this.a(i.H[11], Boolean.FALSE);
        this.m.b(a);
        this.n.b(a);
        this.j();
        this.u = this.B.a(this);
        final h h = new h(this);
        if (this.h()) {
            this.b().a(i.H[17]);
            System.exit(0);
        }
        this.t = new r(this);
        this.r.a(this.t);
        this.t.a(h);
        h.g();
        this.m.a(this.r);
        this.n.a(this.r);
        this.v.a();
        this.E = System.currentTimeMillis();
        this.i();
        this.r.a(this.B.a((Object)null));
        this.o.a(this.r.e());
        this.p.a(this.r.e());
        this.a(i.H[14], (Object)Boolean.FALSE);
        final Boolean a2 = this.a(i.H[16], Boolean.FALSE);
        this.r.g().a(this.n, true);
        this.r.g().a(this.m, a2);
        if (com.avocent.kvm.b.d.a.c != 0) {
            i.G = !g;
        }
    }
    
    public void g() {
        this.a(this.a(i.H[14], Boolean.FALSE));
    }
    
    public boolean h() {
        try {
            return new c().a((i.H[3] + this.e(i.H[5]) + "_" + this.a(i.H[4], new Integer(8192)) + "_" + this.a(i.H[7], new Integer(2068)) + "_" + System.getProperty(i.H[6])).replace(' ', '_'), this.z);
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public void i() throws Exception {
        final boolean g = i.G;
        this.x = new l(this);
        final l l = (l)this.a();
        l.a(this.x);
        final String e = this.e(i.H[41]);
        final String e2 = this.e(i.H[38]);
        final String e3 = this.e(i.H[5]);
        final Integer a = this.a(i.H[7], new Integer(2068));
        final Integer a2 = this.a(i.H[4], new Integer(8192));
        final Boolean a3 = this.a(i.H[36], Boolean.FALSE);
        final Integer a4 = this.a(i.H[35], new Integer(1));
        final Boolean a5 = this.a(i.H[40], Boolean.FALSE);
        this.e(i.H[34]);
        final String e4 = this.e(i.H[31]);
        final Integer a6 = this.a(i.H[39], new Integer(0));
        final Integer a7 = this.a(i.H[33], new Integer(1));
        final Boolean a8 = this.a(i.H[42], Boolean.FALSE);
        l.a(e, e2);
        l.c(a2);
        l.d(a);
        l.h(a4);
        l.b(a3);
        l.c(a5);
        q.a(i.H[37] + e3 + i.H[32] + a2 + i.H[43] + a);
        if (e4 != null) {
            l.a(e3, e4, a6, a3, a8);
            if (!g) {
                return;
            }
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
        l.a(e3, a7, a6, a3, a8);
    }
    
    void j() throws Exception {
        final p p = new p(this);
        if (SwingUtilities.isEventDispatchThread()) {
            p.run();
            if (!i.G) {
                return;
            }
        }
        SwingUtilities.invokeAndWait(p);
    }
    
    public j k() {
        return this.w;
    }
    
    public bb l() {
        return this.o;
    }
    
    public bb m() {
        return this.p;
    }
    
    public f n() {
        return this.u;
    }
    
    public u a() {
        return this.r;
    }
    
    public hb o() {
        return this.m;
    }
    
    public hb p() {
        return this.n;
    }
    
    public b q() {
        return this.s;
    }
    
    public JFrame r() {
        return this.k;
    }
    
    public JFrame c() {
        JFrame jFrame = null;
        if (this.l != null && this.l.isVisible()) {
            jFrame = this.l;
        }
        else if (this.k != null) {
            jFrame = this.k;
        }
        return jFrame;
    }
    
    public void a(final boolean b) {
        final o o = new o(this, b);
        if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeLater(o);
            if (!i.G) {
                return;
            }
        }
        o.run();
    }
    
    public void s() {
        this.d();
        this.f(d.b(i.H[30]));
        System.exit(0);
    }
    
    public void a(final u u) {
        if (this.C) {
            this.b().a(i.H[20]);
            System.out.flush();
            u.b().a(0);
            final double n = (System.currentTimeMillis() - this.E) / 1000.0;
            this.b().a(i.H[28] + n + i.H[22]);
            final hb o = this.o();
            if (o instanceof ob) {
                final ob ob = (ob)o;
                this.b().a(i.H[26]);
                this.b().a(i.H[29] + ob.o);
                this.b().a(i.H[18] + ob.p);
                this.b().a(i.H[19] + ob.q);
                this.b().a(i.H[24] + ob.r);
                this.b().a(i.H[25] + (ob.r - ob.q));
                this.b().a(i.H[21] + ob.r / n);
                this.b().a(i.H[27] + ob.r / n);
            }
            System.exit(0);
            if (!i.G) {
                return;
            }
        }
        if (!this.F) {
            this.k.setVisible(true);
            this.l.setVisible(false);
            JOptionPane.showMessageDialog(null, d.b(i.H[23]), d.b(i.H[1]), 0);
            System.exit(0);
        }
    }
    
    public void t() {
        try {
            final String b = this.r.b(i.H[8]);
            Label_0061: {
                if (b != null && b.equalsIgnoreCase(i.H[9])) {
                    this.v.c();
                    if (!i.G) {
                        break Label_0061;
                    }
                }
                this.b().a(i.H[10]);
            }
            this.F = true;
            this.k.setVisible(false);
            this.l.setVisible(false);
            this.a().f();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void f(final String s) {
        JOptionPane.showMessageDialog(this.c(), s, d.b(i.H[1]), 1);
    }
    
    public void a(final String s) {
        JOptionPane.showMessageDialog(this.c(), s, d.b(i.H[2]), 0);
    }
    
    static {
        final String[] h = new String[47];
        final int n = 0;
        final char[] charArray = "!>yY:\u0005\u001a}G148rZ-\u0018;pK-".toCharArray();
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
                            c2 = 'w';
                            break;
                        }
                        case 1: {
                            c2 = 'W';
                            break;
                        }
                        case 2: {
                            c2 = '\u001c';
                            break;
                        }
                        case 3: {
                            c2 = '.';
                            break;
                        }
                        default: {
                            c2 = '_';
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
        h[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "3>}B0\u0010\bQK,\u00046{K".toCharArray();
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
                            c4 = 'w';
                            break;
                        }
                        case 1: {
                            c4 = 'W';
                            break;
                        }
                        case 2: {
                            c4 = '\u001c';
                            break;
                        }
                        case 3: {
                            c4 = '.';
                            break;
                        }
                        default: {
                            c4 = '_';
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
        h[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "3>}B0\u0010\bY\\-\u0018%".toCharArray();
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
                            c6 = 'w';
                            break;
                        }
                        case 1: {
                            c6 = 'W';
                            break;
                        }
                        case 2: {
                            c6 = '\u001c';
                            break;
                        }
                        case 3: {
                            c6 = '.';
                            break;
                        }
                        default: {
                            c6 = '_';
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
        h[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = "\u0005:qq4\u0001:CM3\u001e2rZ\u0000".toCharArray();
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
                            c8 = 'w';
                            break;
                        }
                        case 1: {
                            c8 = 'W';
                            break;
                        }
                        case 2: {
                            c8 = '\u001c';
                            break;
                        }
                        case 3: {
                            c8 = '.';
                            break;
                        }
                        default: {
                            c8 = '_';
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
        h[n13] = new String(charArray4).intern();
        final int n17 = 4;
        final char[] charArray5 = "<\u001aLa\r#".toCharArray();
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
                            c10 = 'w';
                            break;
                        }
                        case 1: {
                            c10 = 'W';
                            break;
                        }
                        case 2: {
                            c10 = '\u001c';
                            break;
                        }
                        case 3: {
                            c10 = '.';
                            break;
                        }
                        default: {
                            c10 = '_';
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
        h[n17] = new String(charArray5).intern();
        final int n21 = 5;
        final char[] charArray6 = "?\u0018Oz".toCharArray();
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
                            c12 = 'w';
                            break;
                        }
                        case 1: {
                            c12 = 'W';
                            break;
                        }
                        case 2: {
                            c12 = '\u001c';
                            break;
                        }
                        case 3: {
                            c12 = '.';
                            break;
                        }
                        default: {
                            c12 = '_';
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
        h[n21] = new String(charArray6).intern();
        final int n25 = 6;
        final char[] charArray7 = "\u0002$y\\q\u00196qK".toCharArray();
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
                            c14 = 'w';
                            break;
                        }
                        case 1: {
                            c14 = 'W';
                            break;
                        }
                        case 2: {
                            c14 = '\u001c';
                            break;
                        }
                        case 3: {
                            c14 = '.';
                            break;
                        }
                        default: {
                            c14 = '_';
                            break;
                        }
                    }
                    charArray7[length7] = (char)(c13 ^ c14);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 > n28) {
                continue;
            }
            break;
        }
        h[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "!\u0007S|\u000b".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0918: {
                if (n30 > 1) {
                    break Label_0918;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = 'w';
                            break;
                        }
                        case 1: {
                            c16 = 'W';
                            break;
                        }
                        case 2: {
                            c16 = '\u001c';
                            break;
                        }
                        case 3: {
                            c16 = '.';
                            break;
                        }
                        default: {
                            c16 = '_';
                            break;
                        }
                    }
                    charArray8[length8] = (char)(c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 > n32) {
                continue;
            }
            break;
        }
        h[n29] = new String(charArray8).intern();
        final int n33 = 8;
        final char[] charArray9 = "$\u0012O}\u00168\u0019C}\u000b6\u0003Y".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1038: {
                if (n34 > 1) {
                    break Label_1038;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'w';
                            break;
                        }
                        case 1: {
                            c18 = 'W';
                            break;
                        }
                        case 2: {
                            c18 = '\u001c';
                            break;
                        }
                        case 3: {
                            c18 = '.';
                            break;
                        }
                        default: {
                            c18 = '_';
                            break;
                        }
                    }
                    charArray9[length9] = (char)(c17 ^ c18);
                    ++n36;
                } while (n34 == 0);
            }
            if (n34 > n36) {
                continue;
            }
            break;
        }
        h[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = "%\u0002R`\u00169\u0010".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1158: {
                if (n38 > 1) {
                    break Label_1158;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'w';
                            break;
                        }
                        case 1: {
                            c20 = 'W';
                            break;
                        }
                        case 2: {
                            c20 = '\u001c';
                            break;
                        }
                        case 3: {
                            c20 = '.';
                            break;
                        }
                        default: {
                            c20 = '_';
                            break;
                        }
                    }
                    charArray10[length10] = (char)(c19 ^ c20);
                    ++n40;
                } while (n38 == 0);
            }
            if (n38 > n40) {
                continue;
            }
            break;
        }
        h[n37] = new String(charArray10).intern();
        final int n41 = 10;
        final char[] charArray11 = "W\u0004hA/\u0007>rI\u007f\u00148r@:\u0014#uA1W'nA<\u0012$o\u0000qY".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1278: {
                if (n42 > 1) {
                    break Label_1278;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'w';
                            break;
                        }
                        case 1: {
                            c22 = 'W';
                            break;
                        }
                        case 2: {
                            c22 = '\u001c';
                            break;
                        }
                        case 3: {
                            c22 = '.';
                            break;
                        }
                        default: {
                            c22 = '_';
                            break;
                        }
                    }
                    charArray11[length11] = (char)(c21 ^ c22);
                    ++n44;
                } while (n42 == 0);
            }
            if (n42 > n44) {
                continue;
            }
            break;
        }
        h[n41] = new String(charArray11).intern();
        final int n45 = 11;
        final char[] charArray12 = "\u0015;sM4\u001e9{~>\u001e9h".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1398: {
                if (n46 > 1) {
                    break Label_1398;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = 'w';
                            break;
                        }
                        case 1: {
                            c24 = 'W';
                            break;
                        }
                        case 2: {
                            c24 = '\u001c';
                            break;
                        }
                        case 3: {
                            c24 = '.';
                            break;
                        }
                        default: {
                            c24 = '_';
                            break;
                        }
                    }
                    charArray12[length12] = (char)(c23 ^ c24);
                    ++n48;
                } while (n46 == 0);
            }
            if (n46 > n48) {
                continue;
            }
            break;
        }
        h[n45] = new String(charArray12).intern();
        final int n49 = 12;
        final char[] charArray13 = "\u0011\"pB\f\u0014%yK1!>xK0'6rK3".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1518: {
                if (n50 > 1) {
                    break Label_1518;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = 'w';
                            break;
                        }
                        case 1: {
                            c26 = 'W';
                            break;
                        }
                        case 2: {
                            c26 = '\u001c';
                            break;
                        }
                        case 3: {
                            c26 = '.';
                            break;
                        }
                        default: {
                            c26 = '_';
                            break;
                        }
                    }
                    charArray13[length13] = (char)(c25 ^ c26);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 > n52) {
                continue;
            }
            break;
        }
        h[n49] = new String(charArray13).intern();
        final int n53 = 13;
        final char[] charArray14 = "\u0000>rJ0\u00002xx6\u00132s~>\u00192p".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1638: {
                if (n54 > 1) {
                    break Label_1638;
                }
                length14 = (n55 = n56);
                do {
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = 'w';
                            break;
                        }
                        case 1: {
                            c28 = 'W';
                            break;
                        }
                        case 2: {
                            c28 = '\u001c';
                            break;
                        }
                        case 3: {
                            c28 = '.';
                            break;
                        }
                        default: {
                            c28 = '_';
                            break;
                        }
                    }
                    charArray14[length14] = (char)(c27 ^ c28);
                    ++n56;
                } while (n54 == 0);
            }
            if (n54 > n56) {
                continue;
            }
            break;
        }
        h[n53] = new String(charArray14).intern();
        final int n57 = 14;
        final char[] charArray15 = "1\u0002Pb\f4\u0005Yk\u0011".toCharArray();
        int length15;
        int n59;
        final int n58 = n59 = (length15 = charArray15.length);
        int n60 = 0;
        while (true) {
            Label_1758: {
                if (n58 > 1) {
                    break Label_1758;
                }
                length15 = (n59 = n60);
                do {
                    final char c29 = charArray15[n59];
                    char c30 = '\0';
                    switch (n60 % 5) {
                        case 0: {
                            c30 = 'w';
                            break;
                        }
                        case 1: {
                            c30 = 'W';
                            break;
                        }
                        case 2: {
                            c30 = '\u001c';
                            break;
                        }
                        case 3: {
                            c30 = '.';
                            break;
                        }
                        default: {
                            c30 = '_';
                            break;
                        }
                    }
                    charArray15[length15] = (char)(c29 ^ c30);
                    ++n60;
                } while (n58 == 0);
            }
            if (n58 > n60) {
                continue;
            }
            break;
        }
        h[n57] = new String(charArray15).intern();
        final int n61 = 15;
        final char[] charArray16 = "\u0016\"hA\u001a\u00181".toCharArray();
        int length16;
        int n63;
        final int n62 = n63 = (length16 = charArray16.length);
        int n64 = 0;
        while (true) {
            Label_1878: {
                if (n62 > 1) {
                    break Label_1878;
                }
                length16 = (n63 = n64);
                do {
                    final char c31 = charArray16[n63];
                    char c32 = '\0';
                    switch (n64 % 5) {
                        case 0: {
                            c32 = 'w';
                            break;
                        }
                        case 1: {
                            c32 = 'W';
                            break;
                        }
                        case 2: {
                            c32 = '\u001c';
                            break;
                        }
                        case 3: {
                            c32 = '.';
                            break;
                        }
                        default: {
                            c32 = '_';
                            break;
                        }
                    }
                    charArray16[length16] = (char)(c31 ^ c32);
                    ++n64;
                } while (n62 == 0);
            }
            if (n62 > n64) {
                continue;
            }
            break;
        }
        h[n61] = new String(charArray16).intern();
        final int n65 = 16;
        final char[] charArray17 = "'\u0016O}\u000b?\u0005S{\u0018?".toCharArray();
        int length17;
        int n67;
        final int n66 = n67 = (length17 = charArray17.length);
        int n68 = 0;
        while (true) {
            Label_1998: {
                if (n66 > 1) {
                    break Label_1998;
                }
                length17 = (n67 = n68);
                do {
                    final char c33 = charArray17[n67];
                    char c34 = '\0';
                    switch (n68 % 5) {
                        case 0: {
                            c34 = 'w';
                            break;
                        }
                        case 1: {
                            c34 = 'W';
                            break;
                        }
                        case 2: {
                            c34 = '\u001c';
                            break;
                        }
                        case 3: {
                            c34 = '.';
                            break;
                        }
                        default: {
                            c34 = '_';
                            break;
                        }
                    }
                    charArray17[length17] = (char)(c33 ^ c34);
                    ++n68;
                } while (n66 == 0);
            }
            if (n66 > n68) {
                continue;
            }
            break;
        }
        h[n65] = new String(charArray17).intern();
        final int n69 = 17;
        final char[] charArray18 = "W\u0012dG+\u001e9{\u0002\u007f\u00169<K'\u001e$hG1\u0010w}^/W }]\u007f\u00118i@;Y".toCharArray();
        int length18;
        int n71;
        final int n70 = n71 = (length18 = charArray18.length);
        int n72 = 0;
        while (true) {
            Label_2118: {
                if (n70 > 1) {
                    break Label_2118;
                }
                length18 = (n71 = n72);
                do {
                    final char c35 = charArray18[n71];
                    char c36 = '\0';
                    switch (n72 % 5) {
                        case 0: {
                            c36 = 'w';
                            break;
                        }
                        case 1: {
                            c36 = 'W';
                            break;
                        }
                        case 2: {
                            c36 = '\u001c';
                            break;
                        }
                        case 3: {
                            c36 = '.';
                            break;
                        }
                        default: {
                            c36 = '_';
                            break;
                        }
                    }
                    charArray18[length18] = (char)(c35 ^ c36);
                    ++n72;
                } while (n70 == 0);
            }
            if (n70 > n72) {
                continue;
            }
            break;
        }
        h[n69] = new String(charArray18).intern();
        final int n73 = 18;
        final char[] charArray19 = "Ww<\u000e\u001c\u0016;p]\u007f\u00038<[/\u00136hK\u007f%\"r@>\u0015;y\u0014".toCharArray();
        int length19;
        int n75;
        final int n74 = n75 = (length19 = charArray19.length);
        int n76 = 0;
        while (true) {
            Label_2238: {
                if (n74 > 1) {
                    break Label_2238;
                }
                length19 = (n75 = n76);
                do {
                    final char c37 = charArray19[n75];
                    char c38 = '\0';
                    switch (n76 % 5) {
                        case 0: {
                            c38 = 'w';
                            break;
                        }
                        case 1: {
                            c38 = 'W';
                            break;
                        }
                        case 2: {
                            c38 = '\u001c';
                            break;
                        }
                        case 3: {
                            c38 = '.';
                            break;
                        }
                        default: {
                            c38 = '_';
                            break;
                        }
                    }
                    charArray19[length19] = (char)(c37 ^ c38);
                    ++n76;
                } while (n74 == 0);
            }
            if (n74 > n76) {
                continue;
            }
            break;
        }
        h[n73] = new String(charArray19).intern();
        final int n77 = 19;
        final char[] charArray20 = "Ww<\u000e\u007fWw<\u000e\u007fWw<\u000e\u001c\u0016;p]\u007f\u00038<^>\u001e9h\u0014".toCharArray();
        int length20;
        int n79;
        final int n78 = n79 = (length20 = charArray20.length);
        int n80 = 0;
        while (true) {
            Label_2358: {
                if (n78 > 1) {
                    break Label_2358;
                }
                length20 = (n79 = n80);
                do {
                    final char c39 = charArray20[n79];
                    char c40 = '\0';
                    switch (n80 % 5) {
                        case 0: {
                            c40 = 'w';
                            break;
                        }
                        case 1: {
                            c40 = 'W';
                            break;
                        }
                        case 2: {
                            c40 = '\u001c';
                            break;
                        }
                        case 3: {
                            c40 = '.';
                            break;
                        }
                        default: {
                            c40 = '_';
                            break;
                        }
                    }
                    charArray20[length20] = (char)(c39 ^ c40);
                    ++n80;
                } while (n78 == 0);
            }
            if (n78 > n80) {
                continue;
            }
            break;
        }
        h[n77] = new String(charArray20).intern();
        final int n81 = 20;
        final char[] charArray21 = "W\u0012rJ\u007f\u00181<H6\u001b2<\\:\u00164tK;[wkO6\u0003>rI\u007f\u00118n\u000e;\u00124sJ:\u0005whA\u007f\u00148r]*\u001a2<Z7\u0012wu@/\u0002#<_*\u0012\"y\u0000".toCharArray();
        int length21;
        int n83;
        final int n82 = n83 = (length21 = charArray21.length);
        int n84 = 0;
        while (true) {
            Label_2478: {
                if (n82 > 1) {
                    break Label_2478;
                }
                length21 = (n83 = n84);
                do {
                    final char c41 = charArray21[n83];
                    char c42 = '\0';
                    switch (n84 % 5) {
                        case 0: {
                            c42 = 'w';
                            break;
                        }
                        case 1: {
                            c42 = 'W';
                            break;
                        }
                        case 2: {
                            c42 = '\u001c';
                            break;
                        }
                        case 3: {
                            c42 = '.';
                            break;
                        }
                        default: {
                            c42 = '_';
                            break;
                        }
                    }
                    charArray21[length21] = (char)(c41 ^ c42);
                    ++n84;
                } while (n82 == 0);
            }
            if (n82 > n84) {
                continue;
            }
            break;
        }
        h[n81] = new String(charArray21).intern();
        final int n85 = 21;
        final char[] charArray22 = "Ww<h-\u0016:y]\u007f\u00072n\u000e,\u00124s@;M".toCharArray();
        int length22;
        int n87;
        final int n86 = n87 = (length22 = charArray22.length);
        int n88 = 0;
        while (true) {
            Label_2598: {
                if (n86 > 1) {
                    break Label_2598;
                }
                length22 = (n87 = n88);
                do {
                    final char c43 = charArray22[n87];
                    char c44 = '\0';
                    switch (n88 % 5) {
                        case 0: {
                            c44 = 'w';
                            break;
                        }
                        case 1: {
                            c44 = 'W';
                            break;
                        }
                        case 2: {
                            c44 = '\u001c';
                            break;
                        }
                        case 3: {
                            c44 = '.';
                            break;
                        }
                        default: {
                            c44 = '_';
                            break;
                        }
                    }
                    charArray22[length22] = (char)(c43 ^ c44);
                    ++n88;
                } while (n86 == 0);
            }
            if (n86 > n88) {
                continue;
            }
            break;
        }
        h[n85] = new String(charArray22).intern();
        final int n89 = 22;
        final char[] charArray23 = "\u00042\u007fA1\u0013$2".toCharArray();
        int length23;
        int n91;
        final int n90 = n91 = (length23 = charArray23.length);
        int n92 = 0;
        while (true) {
            Label_2718: {
                if (n90 > 1) {
                    break Label_2718;
                }
                length23 = (n91 = n92);
                do {
                    final char c45 = charArray23[n91];
                    char c46 = '\0';
                    switch (n92 % 5) {
                        case 0: {
                            c46 = 'w';
                            break;
                        }
                        case 1: {
                            c46 = 'W';
                            break;
                        }
                        case 2: {
                            c46 = '\u001c';
                            break;
                        }
                        case 3: {
                            c46 = '.';
                            break;
                        }
                        default: {
                            c46 = '_';
                            break;
                        }
                    }
                    charArray23[length23] = (char)(c45 ^ c46);
                    ++n92;
                } while (n90 == 0);
            }
            if (n90 > n92) {
                continue;
            }
            break;
        }
        h[n89] = new String(charArray23).intern();
        final int n93 = 23;
        final char[] charArray24 = ":6u@\b\u001e9xA((\u0014s@1\u00124hG0\u0019\u0013nA/\u00072x".toCharArray();
        int length24;
        int n95;
        final int n94 = n95 = (length24 = charArray24.length);
        int n96 = 0;
        while (true) {
            Label_2838: {
                if (n94 > 1) {
                    break Label_2838;
                }
                length24 = (n95 = n96);
                do {
                    final char c47 = charArray24[n95];
                    char c48 = '\0';
                    switch (n96 % 5) {
                        case 0: {
                            c48 = 'w';
                            break;
                        }
                        case 1: {
                            c48 = 'W';
                            break;
                        }
                        case 2: {
                            c48 = '\u001c';
                            break;
                        }
                        case 3: {
                            c48 = '.';
                            break;
                        }
                        default: {
                            c48 = '_';
                            break;
                        }
                    }
                    charArray24[length24] = (char)(c47 ^ c48);
                    ++n96;
                } while (n94 == 0);
            }
            if (n94 > n96) {
                continue;
            }
            break;
        }
        h[n93] = new String(charArray24).intern();
        final int n97 = 24;
        final char[] charArray25 = "Ww<\u000e\u007fWw<\u000e\u007fWw<\u000e\u0019\u00056qK,W\u0013yM0\u00132x\u0014".toCharArray();
        int length25;
        int n99;
        final int n98 = n99 = (length25 = charArray25.length);
        int n100 = 0;
        while (true) {
            Label_2958: {
                if (n98 > 1) {
                    break Label_2958;
                }
                length25 = (n99 = n100);
                do {
                    final char c49 = charArray25[n99];
                    char c50 = '\0';
                    switch (n100 % 5) {
                        case 0: {
                            c50 = 'w';
                            break;
                        }
                        case 1: {
                            c50 = 'W';
                            break;
                        }
                        case 2: {
                            c50 = '\u001c';
                            break;
                        }
                        case 3: {
                            c50 = '.';
                            break;
                        }
                        default: {
                            c50 = '_';
                            break;
                        }
                    }
                    charArray25[length25] = (char)(c49 ^ c50);
                    ++n100;
                } while (n98 == 0);
            }
            if (n98 > n100) {
                continue;
            }
            break;
        }
        h[n97] = new String(charArray25).intern();
        final int n101 = 25;
        final char[] charArray26 = "Ww<\u000e\u007fWw<\u000e\u007fWw<\u000e\u007fW\u0012dZ-\u0016wz\\>\u001a2o\u0014".toCharArray();
        int length26;
        int n103;
        final int n102 = n103 = (length26 = charArray26.length);
        int n104 = 0;
        while (true) {
            Label_3078: {
                if (n102 > 1) {
                    break Label_3078;
                }
                length26 = (n103 = n104);
                do {
                    final char c51 = charArray26[n103];
                    char c52 = '\0';
                    switch (n104 % 5) {
                        case 0: {
                            c52 = 'w';
                            break;
                        }
                        case 1: {
                            c52 = 'W';
                            break;
                        }
                        case 2: {
                            c52 = '\u001c';
                            break;
                        }
                        case 3: {
                            c52 = '.';
                            break;
                        }
                        default: {
                            c52 = '_';
                            break;
                        }
                    }
                    charArray26[length26] = (char)(c51 ^ c52);
                    ++n104;
                } while (n102 == 0);
            }
            if (n102 > n104) {
                continue;
            }
            break;
        }
        h[n101] = new String(charArray26).intern();
        final int n105 = 26;
        final char[] charArray27 = "W\u0001uJ:\u0018wLO1\u0012;<}+\u0016#o".toCharArray();
        int length27;
        int n107;
        final int n106 = n107 = (length27 = charArray27.length);
        int n108 = 0;
        while (true) {
            Label_3198: {
                if (n106 > 1) {
                    break Label_3198;
                }
                length27 = (n107 = n108);
                do {
                    final char c53 = charArray27[n107];
                    char c54 = '\0';
                    switch (n108 % 5) {
                        case 0: {
                            c54 = 'w';
                            break;
                        }
                        case 1: {
                            c54 = 'W';
                            break;
                        }
                        case 2: {
                            c54 = '\u001c';
                            break;
                        }
                        case 3: {
                            c54 = '.';
                            break;
                        }
                        default: {
                            c54 = '_';
                            break;
                        }
                    }
                    charArray27[length27] = (char)(c53 ^ c54);
                    ++n108;
                } while (n106 == 0);
            }
            if (n106 > n108) {
                continue;
            }
            break;
        }
        h[n105] = new String(charArray27).intern();
        final int n109 = 27;
        final char[] charArray28 = "Ww<~>\u001e9h]\u007f\u00072n\u000e,\u00124s@;M".toCharArray();
        int length28;
        int n111;
        final int n110 = n111 = (length28 = charArray28.length);
        int n112 = 0;
        while (true) {
            Label_3318: {
                if (n110 > 1) {
                    break Label_3318;
                }
                length28 = (n111 = n112);
                do {
                    final char c55 = charArray28[n111];
                    char c56 = '\0';
                    switch (n112 % 5) {
                        case 0: {
                            c56 = 'w';
                            break;
                        }
                        case 1: {
                            c56 = 'W';
                            break;
                        }
                        case 2: {
                            c56 = '\u001c';
                            break;
                        }
                        case 3: {
                            c56 = '.';
                            break;
                        }
                        default: {
                            c56 = '_';
                            break;
                        }
                    }
                    charArray28[length28] = (char)(c55 ^ c56);
                    ++n112;
                } while (n110 == 0);
            }
            if (n110 > n112) {
                continue;
            }
            break;
        }
        h[n109] = new String(charArray28).intern();
        final int n113 = 28;
        final char[] charArray29 = "W\u0004y],\u001e8r\u000e-\u00169<H0\u0005w&\u000e".toCharArray();
        int length29;
        int n115;
        final int n114 = n115 = (length29 = charArray29.length);
        int n116 = 0;
        while (true) {
            Label_3438: {
                if (n114 > 1) {
                    break Label_3438;
                }
                length29 = (n115 = n116);
                do {
                    final char c57 = charArray29[n115];
                    char c58 = '\0';
                    switch (n116 % 5) {
                        case 0: {
                            c58 = 'w';
                            break;
                        }
                        case 1: {
                            c58 = 'W';
                            break;
                        }
                        case 2: {
                            c58 = '\u001c';
                            break;
                        }
                        case 3: {
                            c58 = '.';
                            break;
                        }
                        default: {
                            c58 = '_';
                            break;
                        }
                    }
                    charArray29[length29] = (char)(c57 ^ c58);
                    ++n116;
                } while (n114 == 0);
            }
            if (n114 > n116) {
                continue;
            }
            break;
        }
        h[n113] = new String(charArray29).intern();
        final int n117 = 29;
        final char[] charArray30 = "Ww<\u000e\u007fW\u0014}B3\u0004whA\u007f\u00044nK:\u0019wi^;\u0016#y\u0014".toCharArray();
        int length30;
        int n119;
        final int n118 = n119 = (length30 = charArray30.length);
        int n120 = 0;
        while (true) {
            Label_3558: {
                if (n118 > 1) {
                    break Label_3558;
                }
                length30 = (n119 = n120);
                do {
                    final char c59 = charArray30[n119];
                    char c60 = '\0';
                    switch (n120 % 5) {
                        case 0: {
                            c60 = 'w';
                            break;
                        }
                        case 1: {
                            c60 = 'W';
                            break;
                        }
                        case 2: {
                            c60 = '\u001c';
                            break;
                        }
                        case 3: {
                            c60 = '.';
                            break;
                        }
                        default: {
                            c60 = '_';
                            break;
                        }
                    }
                    charArray30[length30] = (char)(c59 ^ c60);
                    ++n120;
                } while (n118 == 0);
            }
            if (n118 > n120) {
                continue;
            }
            break;
        }
        h[n117] = new String(charArray30).intern();
        final int n121 = 30;
        final char[] charArray31 = "48r@:\u0014#uA13>}B0\u0010\bPA8\u001e9ZO6\u001b2x".toCharArray();
        int length31;
        int n123;
        final int n122 = n123 = (length31 = charArray31.length);
        int n124 = 0;
        while (true) {
            Label_3678: {
                if (n122 > 1) {
                    break Label_3678;
                }
                length31 = (n123 = n124);
                do {
                    final char c61 = charArray31[n123];
                    char c62 = '\0';
                    switch (n124 % 5) {
                        case 0: {
                            c62 = 'w';
                            break;
                        }
                        case 1: {
                            c62 = 'W';
                            break;
                        }
                        case 2: {
                            c62 = '\u001c';
                            break;
                        }
                        case 3: {
                            c62 = '.';
                            break;
                        }
                        default: {
                            c62 = '_';
                            break;
                        }
                    }
                    charArray31[length31] = (char)(c61 ^ c62);
                    ++n124;
                } while (n122 == 0);
            }
            if (n122 > n124) {
                continue;
            }
            break;
        }
        h[n121] = new String(charArray31).intern();
        final int n125 = 31;
        final char[] charArray32 = "%\u001eL".toCharArray();
        int length32;
        int n127;
        final int n126 = n127 = (length32 = charArray32.length);
        int n128 = 0;
        while (true) {
            Label_3798: {
                if (n126 > 1) {
                    break Label_3798;
                }
                length32 = (n127 = n128);
                do {
                    final char c63 = charArray32[n127];
                    char c64 = '\0';
                    switch (n128 % 5) {
                        case 0: {
                            c64 = 'w';
                            break;
                        }
                        case 1: {
                            c64 = 'W';
                            break;
                        }
                        case 2: {
                            c64 = '\u001c';
                            break;
                        }
                        case 3: {
                            c64 = '.';
                            break;
                        }
                        default: {
                            c64 = '_';
                            break;
                        }
                    }
                    charArray32[length32] = (char)(c63 ^ c64);
                    ++n128;
                } while (n126 == 0);
            }
            if (n126 > n128) {
                continue;
            }
            break;
        }
        h[n125] = new String(charArray32).intern();
        final int n129 = 32;
        final char[] charArray33 = "[wHm\u000fW\u0007s\\+\u0004w_A1\u0003%sBeW".toCharArray();
        int length33;
        int n131;
        final int n130 = n131 = (length33 = charArray33.length);
        int n132 = 0;
        while (true) {
            Label_3918: {
                if (n130 > 1) {
                    break Label_3918;
                }
                length33 = (n131 = n132);
                do {
                    final char c65 = charArray33[n131];
                    char c66 = '\0';
                    switch (n132 % 5) {
                        case 0: {
                            c66 = 'w';
                            break;
                        }
                        case 1: {
                            c66 = 'W';
                            break;
                        }
                        case 2: {
                            c66 = '\u001c';
                            break;
                        }
                        case 3: {
                            c66 = '.';
                            break;
                        }
                        default: {
                            c66 = '_';
                            break;
                        }
                    }
                    charArray33[length33] = (char)(c65 ^ c66);
                    ++n132;
                } while (n130 == 0);
            }
            if (n130 > n132) {
                continue;
            }
            break;
        }
        h[n129] = new String(charArray33).intern();
        final int n133 = 33;
        final char[] charArray34 = "'\u0018Nz".toCharArray();
        int length34;
        int n135;
        final int n134 = n135 = (length34 = charArray34.length);
        int n136 = 0;
        while (true) {
            Label_4038: {
                if (n134 > 1) {
                    break Label_4038;
                }
                length34 = (n135 = n136);
                do {
                    final char c67 = charArray34[n135];
                    char c68 = '\0';
                    switch (n136 % 5) {
                        case 0: {
                            c68 = 'w';
                            break;
                        }
                        case 1: {
                            c68 = 'W';
                            break;
                        }
                        case 2: {
                            c68 = '\u001c';
                            break;
                        }
                        case 3: {
                            c68 = '.';
                            break;
                        }
                        default: {
                            c68 = '_';
                            break;
                        }
                    }
                    charArray34[length34] = (char)(c67 ^ c68);
                    ++n136;
                } while (n134 == 0);
            }
            if (n134 > n136) {
                continue;
            }
            break;
        }
        h[n133] = new String(charArray34).intern();
        final int n137 = 34;
        final char[] charArray35 = "$\u0012Nx\u001a%\bWk\u0006".toCharArray();
        int length35;
        int n139;
        final int n138 = n139 = (length35 = charArray35.length);
        int n140 = 0;
        while (true) {
            Label_4158: {
                if (n138 > 1) {
                    break Label_4158;
                }
                length35 = (n139 = n140);
                do {
                    final char c69 = charArray35[n139];
                    char c70 = '\0';
                    switch (n140 % 5) {
                        case 0: {
                            c70 = 'w';
                            break;
                        }
                        case 1: {
                            c70 = 'W';
                            break;
                        }
                        case 2: {
                            c70 = '\u001c';
                            break;
                        }
                        case 3: {
                            c70 = '.';
                            break;
                        }
                        default: {
                            c70 = '_';
                            break;
                        }
                    }
                    charArray35[length35] = (char)(c69 ^ c70);
                    ++n140;
                } while (n138 == 0);
            }
            if (n138 > n140) {
                continue;
            }
            break;
        }
        h[n137] = new String(charArray35).intern();
        final int n141 = 35;
        final char[] charArray36 = "6\u0001O~\u0000!\u0012N}\u00168\u0019".toCharArray();
        int length36;
        int n143;
        final int n142 = n143 = (length36 = charArray36.length);
        int n144 = 0;
        while (true) {
            Label_4278: {
                if (n142 > 1) {
                    break Label_4278;
                }
                length36 = (n143 = n144);
                do {
                    final char c71 = charArray36[n143];
                    char c72 = '\0';
                    switch (n144 % 5) {
                        case 0: {
                            c72 = 'w';
                            break;
                        }
                        case 1: {
                            c72 = 'W';
                            break;
                        }
                        case 2: {
                            c72 = '\u001c';
                            break;
                        }
                        case 3: {
                            c72 = '.';
                            break;
                        }
                        default: {
                            c72 = '_';
                            break;
                        }
                    }
                    charArray36[length36] = (char)(c71 ^ c72);
                    ++n144;
                } while (n142 == 0);
            }
            if (n142 > n144) {
                continue;
            }
            break;
        }
        h[n141] = new String(charArray36).intern();
        final int n145 = 36;
        final char[] charArray37 = "\"\u0004Yq\u001e'\u0014L".toCharArray();
        int length37;
        int n147;
        final int n146 = n147 = (length37 = charArray37.length);
        int n148 = 0;
        while (true) {
            Label_4398: {
                if (n146 > 1) {
                    break Label_4398;
                }
                length37 = (n147 = n148);
                do {
                    final char c73 = charArray37[n147];
                    char c74 = '\0';
                    switch (n148 % 5) {
                        case 0: {
                            c74 = 'w';
                            break;
                        }
                        case 1: {
                            c74 = 'W';
                            break;
                        }
                        case 2: {
                            c74 = '\u001c';
                            break;
                        }
                        case 3: {
                            c74 = '.';
                            break;
                        }
                        default: {
                            c74 = '_';
                            break;
                        }
                    }
                    charArray37[length37] = (char)(c73 ^ c74);
                    ++n148;
                } while (n146 == 0);
            }
            if (n146 > n148) {
                continue;
            }
            break;
        }
        h[n145] = new String(charArray37).intern();
        final int n149 = 37;
        final char[] charArray38 = "W\u0014s@1\u00124hG1\u0010whA\u007f".toCharArray();
        int length38;
        int n151;
        final int n150 = n151 = (length38 = charArray38.length);
        int n152 = 0;
        while (true) {
            Label_4518: {
                if (n150 > 1) {
                    break Label_4518;
                }
                length38 = (n151 = n152);
                do {
                    final char c75 = charArray38[n151];
                    char c76 = '\0';
                    switch (n152 % 5) {
                        case 0: {
                            c76 = 'w';
                            break;
                        }
                        case 1: {
                            c76 = 'W';
                            break;
                        }
                        case 2: {
                            c76 = '\u001c';
                            break;
                        }
                        case 3: {
                            c76 = '.';
                            break;
                        }
                        default: {
                            c76 = '_';
                            break;
                        }
                    }
                    charArray38[length38] = (char)(c75 ^ c76);
                    ++n152;
                } while (n150 == 0);
            }
            if (n150 > n152) {
                continue;
            }
            break;
        }
        h[n149] = new String(charArray38).intern();
        final int n153 = 38;
        final char[] charArray39 = "'\u0016O}\b8\u0005X".toCharArray();
        int length39;
        int n155;
        final int n154 = n155 = (length39 = charArray39.length);
        int n156 = 0;
        while (true) {
            Label_4638: {
                if (n154 > 1) {
                    break Label_4638;
                }
                length39 = (n155 = n156);
                do {
                    final char c77 = charArray39[n155];
                    char c78 = '\0';
                    switch (n156 % 5) {
                        case 0: {
                            c78 = 'w';
                            break;
                        }
                        case 1: {
                            c78 = 'W';
                            break;
                        }
                        case 2: {
                            c78 = '\u001c';
                            break;
                        }
                        case 3: {
                            c78 = '.';
                            break;
                        }
                        default: {
                            c78 = '_';
                            break;
                        }
                    }
                    charArray39[length39] = (char)(c77 ^ c78);
                    ++n156;
                } while (n154 == 0);
            }
            if (n154 > n156) {
                continue;
            }
            break;
        }
        h[n153] = new String(charArray39).intern();
        final int n157 = 39;
        final char[] charArray40 = "4\u001f]`\u00112\u001b".toCharArray();
        int length40;
        int n159;
        final int n158 = n159 = (length40 = charArray40.length);
        int n160 = 0;
        while (true) {
            Label_4758: {
                if (n158 > 1) {
                    break Label_4758;
                }
                length40 = (n159 = n160);
                do {
                    final char c79 = charArray40[n159];
                    char c80 = '\0';
                    switch (n160 % 5) {
                        case 0: {
                            c80 = 'w';
                            break;
                        }
                        case 1: {
                            c80 = 'W';
                            break;
                        }
                        case 2: {
                            c80 = '\u001c';
                            break;
                        }
                        case 3: {
                            c80 = '.';
                            break;
                        }
                        default: {
                            c80 = '_';
                            break;
                        }
                    }
                    charArray40[length40] = (char)(c79 ^ c80);
                    ++n160;
                } while (n158 == 0);
            }
            if (n158 > n160) {
                continue;
            }
            break;
        }
        h[n157] = new String(charArray40).intern();
        final int n161 = 40;
        final char[] charArray41 = "$\u0004Pxl".toCharArray();
        int length41;
        int n163;
        final int n162 = n163 = (length41 = charArray41.length);
        int n164 = 0;
        while (true) {
            Label_4878: {
                if (n162 > 1) {
                    break Label_4878;
                }
                length41 = (n163 = n164);
                do {
                    final char c81 = charArray41[n163];
                    char c82 = '\0';
                    switch (n164 % 5) {
                        case 0: {
                            c82 = 'w';
                            break;
                        }
                        case 1: {
                            c82 = 'W';
                            break;
                        }
                        case 2: {
                            c82 = '\u001c';
                            break;
                        }
                        case 3: {
                            c82 = '.';
                            break;
                        }
                        default: {
                            c82 = '_';
                            break;
                        }
                    }
                    charArray41[length41] = (char)(c81 ^ c82);
                    ++n164;
                } while (n162 == 0);
            }
            if (n162 > n164) {
                continue;
            }
            break;
        }
        h[n161] = new String(charArray41).intern();
        final int n165 = 41;
        final char[] charArray42 = "\"\u0004Y|\u00116\u001aY".toCharArray();
        int length42;
        int n167;
        final int n166 = n167 = (length42 = charArray42.length);
        int n168 = 0;
        while (true) {
            Label_4998: {
                if (n166 > 1) {
                    break Label_4998;
                }
                length42 = (n167 = n168);
                do {
                    final char c83 = charArray42[n167];
                    char c84 = '\0';
                    switch (n168 % 5) {
                        case 0: {
                            c84 = 'w';
                            break;
                        }
                        case 1: {
                            c84 = 'W';
                            break;
                        }
                        case 2: {
                            c84 = '\u001c';
                            break;
                        }
                        case 3: {
                            c84 = '.';
                            break;
                        }
                        default: {
                            c84 = '_';
                            break;
                        }
                    }
                    charArray42[length42] = (char)(c83 ^ c84);
                    ++n168;
                } while (n166 == 0);
            }
            if (n166 > n168) {
                continue;
            }
            break;
        }
        h[n165] = new String(charArray42).intern();
        final int n169 = 42;
        final char[] charArray43 = "$\u001f]|\u001a3\bOk\f$\u001eS`".toCharArray();
        int length43;
        int n171;
        final int n170 = n171 = (length43 = charArray43.length);
        int n172 = 0;
        while (true) {
            Label_5118: {
                if (n170 > 1) {
                    break Label_5118;
                }
                length43 = (n171 = n172);
                do {
                    final char c85 = charArray43[n171];
                    char c86 = '\0';
                    switch (n172 % 5) {
                        case 0: {
                            c86 = 'w';
                            break;
                        }
                        case 1: {
                            c86 = 'W';
                            break;
                        }
                        case 2: {
                            c86 = '\u001c';
                            break;
                        }
                        case 3: {
                            c86 = '.';
                            break;
                        }
                        default: {
                            c86 = '_';
                            break;
                        }
                    }
                    charArray43[length43] = (char)(c85 ^ c86);
                    ++n172;
                } while (n170 == 0);
            }
            if (n170 > n172) {
                continue;
            }
            break;
        }
        h[n169] = new String(charArray43).intern();
        final int n173 = 43;
        final char[] charArray44 = "[wJG;\u00128&\u000e".toCharArray();
        int length44;
        int n175;
        final int n174 = n175 = (length44 = charArray44.length);
        int n176 = 0;
        while (true) {
            Label_5238: {
                if (n174 > 1) {
                    break Label_5238;
                }
                length44 = (n175 = n176);
                do {
                    final char c87 = charArray44[n175];
                    char c88 = '\0';
                    switch (n176 % 5) {
                        case 0: {
                            c88 = 'w';
                            break;
                        }
                        case 1: {
                            c88 = 'W';
                            break;
                        }
                        case 2: {
                            c88 = '\u001c';
                            break;
                        }
                        case 3: {
                            c88 = '.';
                            break;
                        }
                        default: {
                            c88 = '_';
                            break;
                        }
                    }
                    charArray44[length44] = (char)(c87 ^ c88);
                    ++n176;
                } while (n174 == 0);
            }
            if (n174 > n176) {
                continue;
            }
            break;
        }
        h[n173] = new String(charArray44).intern();
        final int n177 = 44;
        final char[] charArray45 = "Ww_A2\u001a6rJ\u007f\u001b>rK\u007f\u0016%{[2\u00129h]e".toCharArray();
        int length45;
        int n179;
        final int n178 = n179 = (length45 = charArray45.length);
        int n180 = 0;
        while (true) {
            Label_5358: {
                if (n178 > 1) {
                    break Label_5358;
                }
                length45 = (n179 = n180);
                do {
                    final char c89 = charArray45[n179];
                    char c90 = '\0';
                    switch (n180 % 5) {
                        case 0: {
                            c90 = 'w';
                            break;
                        }
                        case 1: {
                            c90 = 'W';
                            break;
                        }
                        case 2: {
                            c90 = '\u001c';
                            break;
                        }
                        case 3: {
                            c90 = '.';
                            break;
                        }
                        default: {
                            c90 = '_';
                            break;
                        }
                    }
                    charArray45[length45] = (char)(c89 ^ c90);
                    ++n180;
                } while (n178 == 0);
            }
            if (n178 > n180) {
                continue;
            }
            break;
        }
        h[n177] = new String(charArray45).intern();
        final int n181 = 45;
        final char[] charArray46 = "\u00181z".toCharArray();
        int length46;
        int n183;
        final int n182 = n183 = (length46 = charArray46.length);
        int n184 = 0;
        while (true) {
            Label_5478: {
                if (n182 > 1) {
                    break Label_5478;
                }
                length46 = (n183 = n184);
                do {
                    final char c91 = charArray46[n183];
                    char c92 = '\0';
                    switch (n184 % 5) {
                        case 0: {
                            c92 = 'w';
                            break;
                        }
                        case 1: {
                            c92 = 'W';
                            break;
                        }
                        case 2: {
                            c92 = '\u001c';
                            break;
                        }
                        case 3: {
                            c92 = '.';
                            break;
                        }
                        default: {
                            c92 = '_';
                            break;
                        }
                    }
                    charArray46[length46] = (char)(c91 ^ c92);
                    ++n184;
                } while (n182 == 0);
            }
            if (n182 > n184) {
                continue;
            }
            break;
        }
        h[n181] = new String(charArray46).intern();
        final int n185 = 46;
        final char[] charArray47 = "3\u0012^{\u0018".toCharArray();
        int length47;
        int n187;
        final int n186 = n187 = (length47 = charArray47.length);
        int n188 = 0;
        while (true) {
            Label_5598: {
                if (n186 > 1) {
                    break Label_5598;
                }
                length47 = (n187 = n188);
                do {
                    final char c93 = charArray47[n187];
                    char c94 = '\0';
                    switch (n188 % 5) {
                        case 0: {
                            c94 = 'w';
                            break;
                        }
                        case 1: {
                            c94 = 'W';
                            break;
                        }
                        case 2: {
                            c94 = '\u001c';
                            break;
                        }
                        case 3: {
                            c94 = '.';
                            break;
                        }
                        default: {
                            c94 = '_';
                            break;
                        }
                    }
                    charArray47[length47] = (char)(c93 ^ c94);
                    ++n188;
                } while (n186 == 0);
            }
            if (n186 <= n188) {
                h[n185] = new String(charArray47).intern();
                H = h;
                return;
            }
            continue;
        }
    }
}
