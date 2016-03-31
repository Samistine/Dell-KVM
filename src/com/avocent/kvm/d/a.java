// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.d;

import com.avocent.kvm.b.kb;
import java.io.IOException;
import com.avocent.kvm.b.fb;
import com.avocent.kvm.b.j;
import com.avocent.kvm.b.db;
import com.avocent.kvm.b.v;

public class a extends v implements db {

    protected int n;
    protected b o;
    protected boolean p;
    protected boolean q;
    protected j r;
    protected c s;
    protected boolean t;
    protected boolean u;
    boolean v;
    protected int w;
    protected int[] x;
    protected int y;
    protected int z;
    protected int A;
    protected int B;
    private static final String[] C;

    @Override
    public void a(final fb fb) {
        if (fb instanceof j) {
            this.r = (j) fb;
            if (com.avocent.kvm.d.c.Xb == 0) {
                /*break;*/return;//Sam
            }
        }
        throw new RuntimeException(a.C[0] + fb.getClass().getName());
    }

    public a() {
        this.p = false;
        this.q = false;
        this.s = new c();
        this.t = false;
        this.u = false;
        this.v = false;
        this.y = 0;
        this.z = -1;
        this.A = -1;
        this.B = -1;
    }

    @Override
    public void a(final int n, final byte[] array, final int n2) {
        final b o = new b(n);
        o.a(array, array, n2);
        o.b(array, 12, n2 - 12);
        if (o.j()) {
            (this.o = o).b(1);
        }
        if (o.k() && this.o != null) {
            this.o.a(o);
            this.o.t();
            Label_0246:
            {
                if (this.o.q() == 3 || this.o.q() == 2) {
                    this.a(this.o.p(), this.o.q(), this.o.h(), this.o.i(), this.o.u(), this.o.v());
                    if (com.avocent.kvm.d.c.Xb == 0) {
                        break Label_0246;
                    }
                }
                this.a(this.o.h(), this.o.i(), this.o.q(), this.o.s(), this.o.r(), this.o.u(), this.o.v(), this.o.p(), this.o.l(), this.o.m(), this.o.n(), this.o.o());
            }
            this.o = null;
        }
        if (!o.j() && !o.k() && this.o != null) {
            this.o.a(o);
            this.o.t();
        }
    }

    @Override
    public int e() {
        return 4;
    }

    public boolean f() {
        return this.s.hb * 4 <= this.w && !this.u;
    }

    public int g() {
        return this.s.jb * this.y;
    }

    public int h() {
        return this.s.kb * this.y;
    }

    public int i() {
        return this.y;
    }

    public int j() {
        return this.y;
    }

    public boolean a(final int n, final int n2, final int n3, final int n4, final byte[] array, final int n5) {
        final int xb = com.avocent.kvm.d.c.Xb;
        this.p = true;
        if (array == null || (n2 != 3 && n2 != 2)) {
            return false;
        }
        if (n5 < n3 * n4 * 2) {
            return false;
        }
        final short[] array2 = new short[n3 * n4];
        int i = 0;
        while (i < n3 * n4) {
            final int n6 = i * 2;
            array2[i] = (short) ((array[n6] & 0xFF) | (array[n6 + 1] & 0xFF) << 8);
            ++i;
            if (xb != 0) {
                break;
            }
        }
        return this.r.a(n, n2, n3, n4, array2);
    }

    public void a(final int n, final int n2, int z, final int a, final int b, final byte[] array, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.p = false;
        this.q = true;
        this.n = 0;
        n3 /= 4;
        this.u = false;
        if (n % 8 != 0) {
            System.out.println(/*a.*/C[3] + n + /*a.*/C[6] + n2);
            System.out.println(/*a.*/C[2]);
            /*break;*/return;//Sam
        }
        z &= 0x1;
        if (this.z != z || this.A != a || this.B != b) {
            System.out.println(/*a.*/C[1] + z + /*a.*/C[4] + a + /*a.*/C[5] + b);
            this.s.a(z, a, b);
            this.b.a().a(/*a.*/C[9], Integer.toString(z));
            this.b.a().a(/*a.*/C[7], Integer.toString(a));
            this.b.a().a(/*a.*/C[8], Integer.toString(b));
            this.z = z;
            this.A = a;
            this.B = b;
        }
        if ((this.s.fb == 0L && this.s.gb == 0L) || this.s.fb != n || this.s.gb != n2) {
            this.s.c(n, n2);
            this.v = true;
        }
        this.w = n3 * 4;
        this.s.a(array, 0, n3);
        this.r.a(n4, n5, n6, n7, n8);
        Label_0460:
        {
            if ((this.x == null || this.x.length < n * n2) && (z & 0x1) == 0x1 && n2 == 600) {
                this.s.c(n, n2);
                this.x = new int[n * 608];
                if (com.avocent.kvm.d.c.Xb == 0) {
                    break Label_0460;
                }
            }
            if (this.x == null || this.x.length < n * n2) {
                this.x = new int[n * n2];
            }
        }
        this.s.fb = n;
        this.s.gb = n2;
        this.s.nb = this.s.ib[0];
        this.s.mb = this.s.ib[1];
        this.s.hb = 2;
        this.s.jb = 0;
        this.s.kb = 0;
        this.s.ob = 32L;
        this.s.P[0] = 0;
        this.s.Q[0] = 0;
        this.s.R[0] = 0;
        this.y = ((this.s.ab == 1) ? 16 : 8);
        this.s.ub.a();
        this.r.a(n, n2);
        this.r.p();
        this.r.k();
    }

    public void k() {
        this.s.e();
    }

    @Override
    public int d() throws IOException, kb {
        final int xb = com.avocent.kvm.d.c.Xb;
        if (this.p) {
            return -4;
        }
        if (!this.q) {
            return -4;
        }
        boolean b = false;
        final int n = this.s.hb * 4;
        int n2 = this.y * this.y;
        final int n3 = (int) (this.s.nb >> 28);
        this.s.getClass();
        final int n5;
        final int n4 = n5 = (n3 & 0xF);
        this.s.getClass();
        Label_3209:
        {
            if (n5 == 0) {
                if (this.t) {
                    System.out.println(a.C[25] + this.s.jb + "," + this.s.kb + a.C[11]);
                }
                final c s = this.s;
                this.s.getClass();
                s.a(4);
                if (!this.s.a(this.s.jb, this.s.kb, this.x, '\0')) {
                    System.out.println(a.C[20] + n4);
                    return -4;
                }
            } else {
                final int n6 = n4;
                this.s.getClass();
                if (n6 == 9) {
                    this.u = true;
                    n2 = 0;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n7 = n4;
                this.s.getClass();
                if (n7 == 8) {
                    if (this.t) {
                        System.out.println(a.C[13] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    this.s.jb = (int) (this.s.nb & 0xFF00000L) >> 20;
                    this.s.kb = (int) (this.s.nb & 0xFF000L) >> 12;
                    final c s2 = this.s;
                    this.s.getClass();
                    s2.a(20);
                    if (!this.s.a(this.s.jb, this.s.kb, this.x, '\0')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n8 = n4;
                this.s.getClass();
                if (n8 == 5) {
                    if (this.t) {
                        System.out.println(a.C[19] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    final c s3 = this.s;
                    this.s.getClass();
                    s3.a(4);
                    this.s.ub.c = 0;
                    int i = 0;
                    while (i < 1) {
                        final int[] b2 = this.s.ub.b;
                        final int n9 = i;
                        final int n10 = (int) (this.s.nb >> 29);
                        this.s.getClass();
                        b2[n9] = (n10 & 0x3);
                        final int n11 = (int) (this.s.nb >> 31);
                        this.s.getClass();
                        final int n12 = n11 & 0x1;
                        this.s.getClass();
                        Label_0743:
                        {
                            if (n12 == 0) {
                                final c s4 = this.s;
                                this.s.getClass();
                                s4.a(3);
                                if (xb == 0) {
                                    break Label_0743;
                                }
                            }
                            final long[] a = this.s.ub.a;
                            final int n13 = this.s.ub.b[i];
                            final long n14 = this.s.nb >> 5;
                            this.s.getClass();
                            a[n13] = (int) (n14 & 0xFFFFFFL);
                            final c s5 = this.s;
                            this.s.getClass();
                            s5.a(27);
                        }
                        ++i;
                        if (xb != 0) {
                            break;
                        }
                    }
                    if (!this.s.b(this.s.jb, this.s.kb, this.x, '\0')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n15 = n4;
                this.s.getClass();
                if (n15 == 13) {
                    if (this.t) {
                        System.out.println(a.C[14] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    this.s.jb = (int) (this.s.nb & 0xFF00000L) >> 20;
                    this.s.kb = (int) (this.s.nb & 0xFF000L) >> 12;
                    final c s6 = this.s;
                    this.s.getClass();
                    s6.a(20);
                    this.s.ub.c = 0;
                    int j = 0;
                    while (j < 1) {
                        final int[] b3 = this.s.ub.b;
                        final int n16 = j;
                        final int n17 = (int) (this.s.nb >> 29);
                        this.s.getClass();
                        b3[n16] = (n17 & 0x3);
                        final long n18 = this.s.nb >> 31;
                        this.s.getClass();
                        final long n19 = n18 & 0x1L;
                        this.s.getClass();
                        Label_1142:
                        {
                            if (n19 == 0L) {
                                final c s7 = this.s;
                                this.s.getClass();
                                s7.a(3);
                                if (xb == 0) {
                                    break Label_1142;
                                }
                            }
                            final long[] a2 = this.s.ub.a;
                            final int n20 = this.s.ub.b[j];
                            final long n21 = this.s.nb >> 5;
                            this.s.getClass();
                            a2[n20] = (int) (n21 & 0xFFFFFFL);
                            final c s8 = this.s;
                            this.s.getClass();
                            s8.a(27);
                        }
                        ++j;
                        if (xb != 0) {
                            break;
                        }
                    }
                    if (!this.s.b(this.s.jb, this.s.kb, this.x, '\0')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n22 = n4;
                this.s.getClass();
                if (n22 == 6) {
                    if (this.t) {
                        System.out.println(a.C[17] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    final c s9 = this.s;
                    this.s.getClass();
                    s9.a(4);
                    this.s.ub.c = 1;
                    int k = 0;
                    while (k < 2) {
                        final int[] b4 = this.s.ub.b;
                        final int n23 = k;
                        final long n24 = this.s.nb >> 29;
                        this.s.getClass();
                        b4[n23] = (int) (n24 & 0x3L);
                        final long n25 = this.s.nb >> 31;
                        this.s.getClass();
                        final long n26 = n25 & 0x1L;
                        this.s.getClass();
                        Label_1498:
                        {
                            if (n26 == 0L) {
                                final c s10 = this.s;
                                this.s.getClass();
                                s10.a(3);
                                if (xb == 0) {
                                    break Label_1498;
                                }
                            }
                            final long[] a3 = this.s.ub.a;
                            final int n27 = this.s.ub.b[k];
                            final long n28 = this.s.nb >> 5;
                            this.s.getClass();
                            a3[n27] = (int) (n28 & 0xFFFFFFL);
                            final c s11 = this.s;
                            this.s.getClass();
                            s11.a(27);
                        }
                        ++k;
                        if (xb != 0) {
                            break;
                        }
                    }
                    if (!this.s.b(this.s.jb, this.s.kb, this.x, '\0')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n29 = n4;
                this.s.getClass();
                if (n29 == 14) {
                    if (this.t) {
                        System.out.println(a.C[10] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    this.s.jb = (int) (this.s.nb & 0xFF00000L) >> 20;
                    this.s.kb = (int) (this.s.nb & 0xFF000L) >> 12;
                    final c s12 = this.s;
                    this.s.getClass();
                    s12.a(20);
                    this.s.ub.c = 1;
                    int l = 0;
                    while (l < 2) {
                        final int[] b5 = this.s.ub.b;
                        final int n30 = l;
                        final long n31 = this.s.nb >> 29;
                        this.s.getClass();
                        b5[n30] = (int) (n31 & 0x3L);
                        final long n32 = this.s.nb >> 31;
                        this.s.getClass();
                        final long n33 = n32 & 0x1L;
                        this.s.getClass();
                        Label_1898:
                        {
                            if (n33 == 0L) {
                                final c s13 = this.s;
                                this.s.getClass();
                                s13.a(3);
                                if (xb == 0) {
                                    break Label_1898;
                                }
                            }
                            final long[] a4 = this.s.ub.a;
                            final int n34 = this.s.ub.b[l];
                            final int n35 = (int) (this.s.nb >> 5);
                            this.s.getClass();
                            a4[n34] = (n35 & 0xFFFFFF);
                            final c s14 = this.s;
                            this.s.getClass();
                            s14.a(27);
                        }
                        ++l;
                        if (xb != 0) {
                            break;
                        }
                    }
                    if (!this.s.b(this.s.jb, this.s.kb, this.x, '\0')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n36 = n4;
                this.s.getClass();
                if (n36 == 7) {
                    if (this.t) {
                        System.out.println(a.C[16] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    final c s15 = this.s;
                    this.s.getClass();
                    s15.a(4);
                    this.s.ub.c = 2;
                    int n37 = 0;
                    while (n37 < 4) {
                        final int[] b6 = this.s.ub.b;
                        final int n38 = n37;
                        final long n39 = this.s.nb >> 29;
                        this.s.getClass();
                        b6[n38] = (int) (n39 & 0x3L);
                        final long n40 = this.s.nb >> 31;
                        this.s.getClass();
                        final long n41 = n40 & 0x1L;
                        this.s.getClass();
                        Label_2254:
                        {
                            if (n41 == 0L) {
                                final c s16 = this.s;
                                this.s.getClass();
                                s16.a(3);
                                if (xb == 0) {
                                    break Label_2254;
                                }
                            }
                            final long[] a5 = this.s.ub.a;
                            final int n42 = this.s.ub.b[n37];
                            final long n43 = this.s.nb >> 5;
                            this.s.getClass();
                            a5[n42] = (int) (n43 & 0xFFFFFFL);
                            final c s17 = this.s;
                            this.s.getClass();
                            s17.a(27);
                        }
                        ++n37;
                        if (xb != 0) {
                            break;
                        }
                    }
                    if (!this.s.b(this.s.jb, this.s.kb, this.x, '\0')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n44 = n4;
                this.s.getClass();
                if (n44 == 15) {
                    if (this.t) {
                        System.out.println(a.C[15] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    this.s.jb = (int) (this.s.nb & 0xFF00000L) >> 20;
                    this.s.kb = (int) (this.s.nb & 0xFF000L) >> 12;
                    final c s18 = this.s;
                    this.s.getClass();
                    s18.a(20);
                    this.s.ub.c = 2;
                    int n45 = 0;
                    while (n45 < 4) {
                        final int[] b7 = this.s.ub.b;
                        final int n46 = n45;
                        final long n47 = this.s.nb >> 29;
                        this.s.getClass();
                        b7[n46] = (int) (n47 & 0x3L);
                        final long n48 = this.s.nb >> 31;
                        this.s.getClass();
                        final long n49 = n48 & 0x1L;
                        this.s.getClass();
                        Label_2655:
                        {
                            if (n49 == 0L) {
                                final c s19 = this.s;
                                this.s.getClass();
                                s19.a(3);
                                if (xb == 0) {
                                    break Label_2655;
                                }
                            }
                            final long[] a6 = this.s.ub.a;
                            final int n50 = this.s.ub.b[n45];
                            final long n51 = this.s.nb >> 5;
                            this.s.getClass();
                            a6[n50] = (int) (n51 & 0xFFFFFFL);
                            final c s20 = this.s;
                            this.s.getClass();
                            s20.a(27);
                        }
                        ++n45;
                        if (xb != 0) {
                            break;
                        }
                    }
                    if (!this.s.b(this.s.jb, this.s.kb, this.x, '\0')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n52 = n4;
                this.s.getClass();
                if (n52 == 4) {
                    if (this.t) {
                        System.out.println(a.C[12] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    final c s21 = this.s;
                    this.s.getClass();
                    s21.a(4);
                    if (!this.s.a(this.s.jb, this.s.kb, this.x, '\u0002')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                final int n53 = n4;
                this.s.getClass();
                if (n53 == 12) {
                    if (this.t) {
                        System.out.println(a.C[18] + this.s.jb + "," + this.s.kb + a.C[11]);
                    }
                    this.s.jb = (int) (this.s.nb & 0xFF00000L) >> 20;
                    this.s.kb = (int) (this.s.nb & 0xFF000L) >> 12;
                    final c s22 = this.s;
                    this.s.getClass();
                    s22.a(20);
                    if (!this.s.a(this.s.jb, this.s.kb, this.x, '\u0002')) {
                        System.out.println(a.C[20] + n4);
                        return -4;
                    }
                    ++this.n;
                    if (xb == 0) {
                        break Label_3209;
                    }
                }
                n2 = 0;
                b = true;
                System.out.println(a.C[22] + n4 + a.C[24] + this.s.jb + "," + this.s.kb + a.C[11]);
            }
        }
        if (n2 > 0) {
            final int g = this.g();
            final int h = this.h();
            final int m = this.i();
            final int j2 = this.j();
            if (this.c) {
                this.l = a.C[21] + this.n + a.C[23] + g + "," + h + "," + m + "x" + j2;
            }
            this.r.b(g, h, m, j2, this.x);
        }
        this.i += n2;
        this.k();
        ++this.h;
        this.k += this.s.hb * 4 - n;
        if (this.u) {
            this.r.q();
            this.r.a();
            this.j = 0;
            this.q = false;
        }
        if (b) {
            return -1;
        }
        return this.f() ? n2 : -4;
    }

    static {
        final String[] c = new String[26];
        final int n = 0;
        final char[] charArray = "m}OffMw\u0019qc@vV'gKw\\k*PjIb*Wc\\dcBz\\c0\u0004".toCharArray();
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
                    final char c2 = charArray[n3];
                    char c3 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c3 = '$';
                            break;
                        }
                        case 1: {
                            c3 = '\u0013';
                            break;
                        }
                        case 2: {
                            c3 = '9';
                            break;
                        }
                        case 3: {
                            c3 = '\u0007';
                            break;
                        }
                        default: {
                            c3 = '\n';
                            break;
                        }
                    }
                    charArray[length] = (char) (c2 ^ c3);
                    ++n4;
                } while (n2 == 0);
            }
            if (n2 > n4) {
                continue;
            }
            break;
        }
        c[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "`vZhnA3ZokJt\\'*i|]b*".toCharArray();
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
                    final char c4 = charArray2[n7];
                    char c5 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c5 = '$';
                            break;
                        }
                        case 1: {
                            c5 = '\u0013';
                            break;
                        }
                        case 2: {
                            c5 = '9';
                            break;
                        }
                        case 3: {
                            c5 = '\u0007';
                            break;
                        }
                        default: {
                            c5 = '\n';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c4 ^ c5);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 > n8) {
                continue;
            }
            break;
        }
        c[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "fr]'xA`Vk\u007fPzVi*E}]'o\\zMt*.\u0019".toCharArray();
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
                    final char c6 = charArray3[n11];
                    char c7 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c7 = '$';
                            break;
                        }
                        case 1: {
                            c7 = '\u0013';
                            break;
                        }
                        case 2: {
                            c7 = '9';
                            break;
                        }
                        case 3: {
                            c7 = '\u0007';
                            break;
                        }
                        default: {
                            c7 = '\n';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c6 ^ c7);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 > n12) {
                continue;
            }
            break;
        }
        c[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = ".\u0019\u0019Pc@gQ'7\u0004".toCharArray();
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
                    final char c8 = charArray4[n15];
                    char c9 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c9 = '$';
                            break;
                        }
                        case 1: {
                            c9 = '\u0013';
                            break;
                        }
                        case 2: {
                            c9 = '9';
                            break;
                        }
                        case 3: {
                            c9 = '\u0007';
                            break;
                        }
                        default: {
                            c9 = '\n';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c8 ^ c9);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 > n16) {
                continue;
            }
            break;
        }
        c[n13] = new String(charArray4).intern();
        final int n17 = 4;
        final char[] charArray5 = "\u0004J\u0019".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0562:
            {
                if (n18 > 1) {
                    break Label_0562;
                }
                length5 = (n19 = n20);
                do {
                    final char c10 = charArray5[n19];
                    char c11 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c11 = '$';
                            break;
                        }
                        case 1: {
                            c11 = '\u0013';
                            break;
                        }
                        case 2: {
                            c11 = '9';
                            break;
                        }
                        case 3: {
                            c11 = '\u0007';
                            break;
                        }
                        default: {
                            c11 = '\n';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c10 ^ c11);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 > n20) {
                continue;
            }
            break;
        }
        c[n17] = new String(charArray5).intern();
        final int n21 = 5;
        final char[] charArray6 = "\u0004Fo'".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0678:
            {
                if (n22 > 1) {
                    break Label_0678;
                }
                length6 = (n23 = n24);
                do {
                    final char c12 = charArray6[n23];
                    char c13 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c13 = '$';
                            break;
                        }
                        case 1: {
                            c13 = '\u0013';
                            break;
                        }
                        case 2: {
                            c13 = '9';
                            break;
                        }
                        case 3: {
                            c13 = '\u0007';
                            break;
                        }
                        default: {
                            c13 = '\n';
                            break;
                        }
                    }
                    charArray6[length6] = (char) (c12 ^ c13);
                    ++n24;
                } while (n22 == 0);
            }
            if (n22 > n24) {
                continue;
            }
            break;
        }
        c[n21] = new String(charArray6).intern();
        final int n25 = 6;
        final char[] charArray7 = "\u0004[\\nmLg\u0019:*".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0798:
            {
                if (n26 > 1) {
                    break Label_0798;
                }
                length7 = (n27 = n28);
                do {
                    final char c14 = charArray7[n27];
                    char c15 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c15 = '$';
                            break;
                        }
                        case 1: {
                            c15 = '\u0013';
                            break;
                        }
                        case 2: {
                            c15 = '9';
                            break;
                        }
                        case 3: {
                            c15 = '\u0007';
                            break;
                        }
                        default: {
                            c15 = '\n';
                            break;
                        }
                    }
                    charArray7[length7] = (char) (c14 ^ c15);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 > n28) {
                continue;
            }
            break;
        }
        c[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "}GXefA".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0918:
            {
                if (n30 > 1) {
                    break Label_0918;
                }
                length8 = (n31 = n32);
                do {
                    final char c16 = charArray8[n31];
                    char c17 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c17 = '$';
                            break;
                        }
                        case 1: {
                            c17 = '\u0013';
                            break;
                        }
                        case 2: {
                            c17 = '9';
                            break;
                        }
                        case 3: {
                            c17 = '\u0007';
                            break;
                        }
                        default: {
                            c17 = '\n';
                            break;
                        }
                    }
                    charArray8[length8] = (char) (c16 ^ c17);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 > n32) {
                continue;
            }
            break;
        }
        c[n29] = new String(charArray8).intern();
        final int n33 = 8;
        final char[] charArray9 = "qEmfhHv".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1038:
            {
                if (n34 > 1) {
                    break Label_1038;
                }
                length9 = (n35 = n36);
                do {
                    final char c18 = charArray9[n35];
                    char c19 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c19 = '$';
                            break;
                        }
                        case 1: {
                            c19 = '\u0013';
                            break;
                        }
                        case 2: {
                            c19 = '9';
                            break;
                        }
                        case 3: {
                            c19 = '\u0007';
                            break;
                        }
                        default: {
                            c19 = '\n';
                            break;
                        }
                    }
                    charArray9[length9] = (char) (c18 ^ c19);
                    ++n36;
                } while (n34 == 0);
            }
            if (n34 > n36) {
                continue;
            }
            break;
        }
        c[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = "g|TwxA`JneJ^Vco".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1158:
            {
                if (n38 > 1) {
                    break Label_1158;
                }
                length10 = (n39 = n40);
                do {
                    final char c20 = charArray10[n39];
                    char c21 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c21 = '$';
                            break;
                        }
                        case 1: {
                            c21 = '\u0013';
                            break;
                        }
                        case 2: {
                            c21 = '9';
                            break;
                        }
                        case 3: {
                            c21 = '\u0007';
                            break;
                        }
                        default: {
                            c21 = '\n';
                            break;
                        }
                    }
                    charArray10[length10] = (char) (c20 ^ c21);
                    ++n40;
                } while (n38 == 0);
            }
            if (n38 > n40) {
                continue;
            }
            break;
        }
        c[n37] = new String(charArray10).intern();
        final int n41 = 10;
        final char[] charArray11 = "\u007fRiWW\u0004W\\de@zW`*B|K'\\uLjLCtL\u000bXIk_vUUg\\}B&\u007f".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1278:
            {
                if (n42 > 1) {
                    break Label_1278;
                }
                length11 = (n43 = n44);
                do {
                    final char c22 = charArray11[n43];
                    char c23 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c23 = '$';
                            break;
                        }
                        case 1: {
                            c23 = '\u0013';
                            break;
                        }
                        case 2: {
                            c23 = '9';
                            break;
                        }
                        case 3: {
                            c23 = '\u0007';
                            break;
                        }
                        default: {
                            c23 = '\n';
                            break;
                        }
                    }
                    charArray11[length11] = (char) (c22 ^ c23);
                    ++n44;
                } while (n42 == 0);
            }
            if (n42 > n44) {
                continue;
            }
            break;
        }
        c[n41] = new String(charArray11).intern();
        final int n45 = 11;
        final char[] charArray12 = "y=\u0017)".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1398:
            {
                if (n46 > 1) {
                    break Label_1398;
                }
                length12 = (n47 = n48);
                do {
                    final char c24 = charArray12[n47];
                    char c25 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c25 = '$';
                            break;
                        }
                        case 1: {
                            c25 = '\u0013';
                            break;
                        }
                        case 2: {
                            c25 = '9';
                            break;
                        }
                        case 3: {
                            c25 = '\u0007';
                            break;
                        }
                        default: {
                            c25 = '\n';
                            break;
                        }
                    }
                    charArray12[length12] = (char) (c24 ^ c25);
                    ++n48;
                } while (n46 == 0);
            }
            if (n46 > n48) {
                continue;
            }
            break;
        }
        c[n45] = new String(charArray12).intern();
        final int n49 = 12;
        final char[] charArray13 = "\u007fRiWW\u0004W\\de@zW`*B|K'FkDfMZaTfIE{@rNZ{PvCO\bH".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1518:
            {
                if (n50 > 1) {
                    break Label_1518;
                }
                length13 = (n51 = n52);
                do {
                    final char c26 = charArray13[n51];
                    char c27 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c27 = '$';
                            break;
                        }
                        case 1: {
                            c27 = '\u0013';
                            break;
                        }
                        case 2: {
                            c27 = '9';
                            break;
                        }
                        case 3: {
                            c27 = '\u0007';
                            break;
                        }
                        default: {
                            c27 = '\n';
                            break;
                        }
                    }
                    charArray13[length13] = (char) (c26 ^ c27);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 > n52) {
                continue;
            }
            break;
        }
        c[n49] = new String(charArray13).intern();
        final int n53 = 13;
        final char[] charArray14 = "\u007fRiWW\u0004W\\de@zW`*B|K'@tV~XYoZiXIkW|+Q".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1638:
            {
                if (n54 > 1) {
                    break Label_1638;
                }
                length14 = (n55 = n56);
                do {
                    final char c28 = charArray14[n55];
                    char c29 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c29 = '$';
                            break;
                        }
                        case 1: {
                            c29 = '\u0013';
                            break;
                        }
                        case 2: {
                            c29 = '9';
                            break;
                        }
                        case 3: {
                            c29 = '\u0007';
                            break;
                        }
                        default: {
                            c29 = '\n';
                            break;
                        }
                    }
                    charArray14[length14] = (char) (c28 ^ c29);
                    ++n56;
                } while (n54 == 0);
            }
            if (n54 > n56) {
                continue;
            }
            break;
        }
        c[n53] = new String(charArray14).intern();
        final int n57 = 14;
        final char[] charArray15 = "\u007fRiWW\u0004W\\de@zW`*B|K'\\uLjLCtL\bXIk_vUUg\\}B&\u007f".toCharArray();
        int length15;
        int n59;
        final int n58 = n59 = (length15 = charArray15.length);
        int n60 = 0;
        while (true) {
            Label_1758:
            {
                if (n58 > 1) {
                    break Label_1758;
                }
                length15 = (n59 = n60);
                do {
                    final char c30 = charArray15[n59];
                    char c31 = '\0';
                    switch (n60 % 5) {
                        case 0: {
                            c31 = '$';
                            break;
                        }
                        case 1: {
                            c31 = '\u0013';
                            break;
                        }
                        case 2: {
                            c31 = '9';
                            break;
                        }
                        case 3: {
                            c31 = '\u0007';
                            break;
                        }
                        default: {
                            c31 = '\n';
                            break;
                        }
                    }
                    charArray15[length15] = (char) (c30 ^ c31);
                    ++n60;
                } while (n58 == 0);
            }
            if (n58 > n60) {
                continue;
            }
            break;
        }
        c[n57] = new String(charArray15).intern();
        final int n61 = 15;
        final char[] charArray16 = "\u007fRiWW\u0004W\\de@zW`*B|K'\\uLjLCtL\rXIk_vUUg\\}B&\u007f".toCharArray();
        int length16;
        int n63;
        final int n62 = n63 = (length16 = charArray16.length);
        int n64 = 0;
        while (true) {
            Label_1878:
            {
                if (n62 > 1) {
                    break Label_1878;
                }
                length16 = (n63 = n64);
                do {
                    final char c32 = charArray16[n63];
                    char c33 = '\0';
                    switch (n64 % 5) {
                        case 0: {
                            c33 = '$';
                            break;
                        }
                        case 1: {
                            c33 = '\u0013';
                            break;
                        }
                        case 2: {
                            c33 = '9';
                            break;
                        }
                        case 3: {
                            c33 = '\u0007';
                            break;
                        }
                        default: {
                            c33 = '\n';
                            break;
                        }
                    }
                    charArray16[length16] = (char) (c32 ^ c33);
                    ++n64;
                } while (n62 == 0);
            }
            if (n62 > n64) {
                continue;
            }
            break;
        }
        c[n61] = new String(charArray16).intern();
        final int n65 = 16;
        final char[] charArray17 = "\u007fRiWW\u0004W\\de@zW`*B|K'\\uLwHUwXpWU\u0010LzHFkAfDE`V\u0015\\".toCharArray();
        int length17;
        int n67;
        final int n66 = n67 = (length17 = charArray17.length);
        int n68 = 0;
        while (true) {
            Label_1998:
            {
                if (n66 > 1) {
                    break Label_1998;
                }
                length17 = (n67 = n68);
                do {
                    final char c34 = charArray17[n67];
                    char c35 = '\0';
                    switch (n68 % 5) {
                        case 0: {
                            c35 = '$';
                            break;
                        }
                        case 1: {
                            c35 = '\u0013';
                            break;
                        }
                        case 2: {
                            c35 = '9';
                            break;
                        }
                        case 3: {
                            c35 = '\u0007';
                            break;
                        }
                        default: {
                            c35 = '\n';
                            break;
                        }
                    }
                    charArray17[length17] = (char) (c34 ^ c35);
                    ++n68;
                } while (n66 == 0);
            }
            if (n66 > n68) {
                continue;
            }
            break;
        }
        c[n65] = new String(charArray17).intern();
        final int n69 = 17;
        final char[] charArray18 = "\u007fRiWW\u0004W\\de@zW`*B|K'\\uLwHUwXpWU\u0016LzHFkAfDE`V\u0015\\".toCharArray();
        int length18;
        int n71;
        final int n70 = n71 = (length18 = charArray18.length);
        int n72 = 0;
        while (true) {
            Label_2118:
            {
                if (n70 > 1) {
                    break Label_2118;
                }
                length18 = (n71 = n72);
                do {
                    final char c36 = charArray18[n71];
                    char c37 = '\0';
                    switch (n72 % 5) {
                        case 0: {
                            c37 = '$';
                            break;
                        }
                        case 1: {
                            c37 = '\u0013';
                            break;
                        }
                        case 2: {
                            c37 = '9';
                            break;
                        }
                        case 3: {
                            c37 = '\u0007';
                            break;
                        }
                        default: {
                            c37 = '\n';
                            break;
                        }
                    }
                    charArray18[length18] = (char) (c36 ^ c37);
                    ++n72;
                } while (n70 == 0);
            }
            if (n70 > n72) {
                continue;
            }
            break;
        }
        c[n69] = new String(charArray18).intern();
        final int n73 = 18;
        final char[] charArray19 = "\u007fRiWW\u0004W\\de@zW`*B|K'FkDfMZaTfTAmCfDE`V\u0015\\".toCharArray();
        int length19;
        int n75;
        final int n74 = n75 = (length19 = charArray19.length);
        int n76 = 0;
        while (true) {
            Label_2238:
            {
                if (n74 > 1) {
                    break Label_2238;
                }
                length19 = (n75 = n76);
                do {
                    final char c38 = charArray19[n75];
                    char c39 = '\0';
                    switch (n76 % 5) {
                        case 0: {
                            c39 = '$';
                            break;
                        }
                        case 1: {
                            c39 = '\u0013';
                            break;
                        }
                        case 2: {
                            c39 = '9';
                            break;
                        }
                        case 3: {
                            c39 = '\u0007';
                            break;
                        }
                        default: {
                            c39 = '\n';
                            break;
                        }
                    }
                    charArray19[length19] = (char) (c38 ^ c39);
                    ++n76;
                } while (n74 == 0);
            }
            if (n74 > n76) {
                continue;
            }
            break;
        }
        c[n73] = new String(charArray19).intern();
        final int n77 = 19;
        final char[] charArray20 = "\u007fRiWW\u0004W\\de@zW`*B|K'\\uLwHUwXpWU\u0015LzHFkAfDE`V\u0015\\".toCharArray();
        int length20;
        int n79;
        final int n78 = n79 = (length20 = charArray20.length);
        int n80 = 0;
        while (true) {
            Label_2358:
            {
                if (n78 > 1) {
                    break Label_2358;
                }
                length20 = (n79 = n80);
                do {
                    final char c40 = charArray20[n79];
                    char c41 = '\0';
                    switch (n80 % 5) {
                        case 0: {
                            c41 = '$';
                            break;
                        }
                        case 1: {
                            c41 = '\u0013';
                            break;
                        }
                        case 2: {
                            c41 = '9';
                            break;
                        }
                        case 3: {
                            c41 = '\u0007';
                            break;
                        }
                        default: {
                            c41 = '\n';
                            break;
                        }
                    }
                    charArray20[length20] = (char) (c40 ^ c41);
                    ++n80;
                } while (n78 == 0);
            }
            if (n78 > n80) {
                continue;
            }
            break;
        }
        c[n77] = new String(charArray20).intern();
        final int n81 = 20;
        final char[] charArray21 = "F\u007fVdalvXcoVEXk\u007fA3\u0004'".toCharArray();
        int length21;
        int n83;
        final int n82 = n83 = (length21 = charArray21.length);
        int n84 = 0;
        while (true) {
            Label_2478:
            {
                if (n82 > 1) {
                    break Label_2478;
                }
                length21 = (n83 = n84);
                do {
                    final char c42 = charArray21[n83];
                    char c43 = '\0';
                    switch (n84 % 5) {
                        case 0: {
                            c43 = '$';
                            break;
                        }
                        case 1: {
                            c43 = '\u0013';
                            break;
                        }
                        case 2: {
                            c43 = '9';
                            break;
                        }
                        case 3: {
                            c43 = '\u0007';
                            break;
                        }
                        default: {
                            c43 = '\n';
                            break;
                        }
                    }
                    charArray21[length21] = (char) (c42 ^ c43);
                    ++n84;
                } while (n82 == 0);
            }
            if (n82 > n84) {
                continue;
            }
            break;
        }
        c[n81] = new String(charArray21).intern();
        final int n85 = 21;
        final char[] charArray22 = "pzUb\"".toCharArray();
        int length22;
        int n87;
        final int n86 = n87 = (length22 = charArray22.length);
        int n88 = 0;
        while (true) {
            Label_2598:
            {
                if (n86 > 1) {
                    break Label_2598;
                }
                length22 = (n87 = n88);
                do {
                    final char c44 = charArray22[n87];
                    char c45 = '\0';
                    switch (n88 % 5) {
                        case 0: {
                            c45 = '$';
                            break;
                        }
                        case 1: {
                            c45 = '\u0013';
                            break;
                        }
                        case 2: {
                            c45 = '9';
                            break;
                        }
                        case 3: {
                            c45 = '\u0007';
                            break;
                        }
                        default: {
                            c45 = '\n';
                            break;
                        }
                    }
                    charArray22[length22] = (char) (c44 ^ c45);
                    ++n88;
                } while (n86 == 0);
            }
            if (n86 > n88) {
                continue;
            }
            break;
        }
        c[n85] = new String(charArray22).intern();
        final int n89 = 22;
        final char[] charArray23 = "\u007fRiWW\u0004W\\de@zW`*B|K'\u007fJxWh}J3[keGxqbk@vKQkHf\\'".toCharArray();
        int length23;
        int n91;
        final int n90 = n91 = (length23 = charArray23.length);
        int n92 = 0;
        while (true) {
            Label_2718:
            {
                if (n90 > 1) {
                    break Label_2718;
                }
                length23 = (n91 = n92);
                do {
                    final char c46 = charArray23[n91];
                    char c47 = '\0';
                    switch (n92 % 5) {
                        case 0: {
                            c47 = '$';
                            break;
                        }
                        case 1: {
                            c47 = '\u0013';
                            break;
                        }
                        case 2: {
                            c47 = '9';
                            break;
                        }
                        case 3: {
                            c47 = '\u0007';
                            break;
                        }
                        default: {
                            c47 = '\n';
                            break;
                        }
                    }
                    charArray23[length23] = (char) (c46 ^ c47);
                    ++n92;
                } while (n90 == 0);
            }
            if (n90 > n92) {
                continue;
            }
            break;
        }
        c[n89] = new String(charArray23).intern();
        final int n93 = 23;
        final char[] charArray24 = "\r)\u0019".toCharArray();
        int length24;
        int n95;
        final int n94 = n95 = (length24 = charArray24.length);
        int n96 = 0;
        while (true) {
            Label_2838:
            {
                if (n94 > 1) {
                    break Label_2838;
                }
                length24 = (n95 = n96);
                do {
                    final char c48 = charArray24[n95];
                    char c49 = '\0';
                    switch (n96 % 5) {
                        case 0: {
                            c49 = '$';
                            break;
                        }
                        case 1: {
                            c49 = '\u0013';
                            break;
                        }
                        case 2: {
                            c49 = '9';
                            break;
                        }
                        case 3: {
                            c49 = '\u0007';
                            break;
                        }
                        default: {
                            c49 = '\n';
                            break;
                        }
                    }
                    charArray24[length24] = (char) (c48 ^ c49);
                    ++n96;
                } while (n94 == 0);
            }
            if (n94 > n96) {
                continue;
            }
            break;
        }
        c[n93] = new String(charArray24).intern();
        final int n97 = 24;
        final char[] charArray25 = "dH".toCharArray();
        int length25;
        int n99;
        final int n98 = n99 = (length25 = charArray25.length);
        int n100 = 0;
        while (true) {
            Label_2958:
            {
                if (n98 > 1) {
                    break Label_2958;
                }
                length25 = (n99 = n100);
                do {
                    final char c50 = charArray25[n99];
                    char c51 = '\0';
                    switch (n100 % 5) {
                        case 0: {
                            c51 = '$';
                            break;
                        }
                        case 1: {
                            c51 = '\u0013';
                            break;
                        }
                        case 2: {
                            c51 = '9';
                            break;
                        }
                        case 3: {
                            c51 = '\u0007';
                            break;
                        }
                        default: {
                            c51 = '\n';
                            break;
                        }
                    }
                    charArray25[length25] = (char) (c50 ^ c51);
                    ++n100;
                } while (n98 == 0);
            }
            if (n98 > n100) {
                continue;
            }
            break;
        }
        c[n97] = new String(charArray25).intern();
        final int n101 = 25;
        final char[] charArray26 = "\u007fRiWW\u0004W\\de@zW`*B|K'@tV~XDkLjLCtLzHNa?b".toCharArray();
        int length26;
        int n103;
        final int n102 = n103 = (length26 = charArray26.length);
        int n104 = 0;
        while (true) {
            Label_3078:
            {
                if (n102 > 1) {
                    break Label_3078;
                }
                length26 = (n103 = n104);
                do {
                    final char c52 = charArray26[n103];
                    char c53 = '\0';
                    switch (n104 % 5) {
                        case 0: {
                            c53 = '$';
                            break;
                        }
                        case 1: {
                            c53 = '\u0013';
                            break;
                        }
                        case 2: {
                            c53 = '9';
                            break;
                        }
                        case 3: {
                            c53 = '\u0007';
                            break;
                        }
                        default: {
                            c53 = '\n';
                            break;
                        }
                    }
                    charArray26[length26] = (char) (c52 ^ c53);
                    ++n104;
                } while (n102 == 0);
            }
            if (n102 <= n104) {
                c[n101] = new String(charArray26).intern();
                C = c;
                break;
            }
            continue;
        }
    }
}
