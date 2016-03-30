package com.avocent.kvm.b;

public class j extends i
{
    protected int o;
    protected int p;
    protected short[][] q;
    protected int[] r;
    protected boolean s;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    protected int x;
    protected boolean y;
    protected int z;
    protected int A;
    protected int[] B;
    protected int C;
    protected int D;
    
    public j() {
        final boolean t = g.t;
        super();
        this.y = false;
        this.o();
        this.q = new short[16][];
        int i = 0;
        while (i < 16) {
            this.q[i++] = new short[1];
            if (t) {
                break;
            }
        }
        this.r = new int[16];
        this.s = false;
    }
    
    public void a(final int n, final int n2, final int n3, final int n4, final int[] array) {
        final boolean t = g.t;
        int i = 0;
        while (i < n4) {
            final int n5 = (n2 + i) * this.d + n;
            if (n5 + n3 < this.m.length) {
                System.arraycopy(array, i * n3, this.m, n5, n3);
            }
            ++i;
            if (t) {
                break;
            }
        }
        this.l.b(n, n2, n + n3, n2 + n4);
    }
    
    public void b(final int n, final int n2, final int n3, final int n4, final int[] array) {
        final boolean t = g.t;
        int i = 0;
        while (i < n4) {
            final int n5 = (n2 + i) * this.d + n;
            if (n5 + n3 < this.m.length) {
                System.arraycopy(array, n5, this.m, n5, n3);
            }
            ++i;
            if (t) {
                break;
            }
        }
        this.l.b(n, n2, n + n3, n2 + n4);
    }
    
    public void c(final int n, final int n2, final int n3, final int n4, final int[] array) {
        final boolean t = g.t;
        int i = 0;
        while (i < n4) {
            System.arraycopy(this.m, (i + n2) * this.d + n, array, i * n3, n3);
            ++i;
            if (t) {
                break;
            }
        }
        this.l.b(n, n2, n + n3, n2 + n4);
    }
    
    public boolean a(final int n, final int n2, final int o, final int p5, final short[] array) {
        if (o <= 64 && p5 <= 64 && n >= 1 && n <= 16) {
            this.o = o;
            this.p = p5;
            System.arraycopy(array, 0, this.q[n - 1] = new short[o * p5], 0, o * p5);
            this.r[n - 1] = n2;
            return true;
        }
        return false;
    }
    
    public boolean a(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n < 1 || n > 16) {
            this.s = false;
            this.t = 0;
            this.u = n2;
            this.v = n3;
            this.w = n4;
            this.x = n5;
            if (!g.t) {
                return false;
            }
        }
        this.s = true;
        this.t = n - 1;
        this.u = n2;
        this.v = n3;
        this.w = n4;
        this.x = n5;
        return true;
    }
    
    public void p() {
        if (this.y) {
            this.a(this.C, this.D, this.z, this.A, this.B);
            this.y = false;
        }
    }
    
    public void q() {
        final boolean t = g.t;
        if (this.s && this.u < this.d && this.v < this.e) {
            if (this.B == null || this.o * this.p > this.z * this.A) {
                this.B = new int[this.o * this.p];
            }
            this.C = this.u;
            this.z = this.o - this.w;
            if (this.C + this.z >= this.d) {
                this.z = this.d - this.C - 1;
            }
            this.D = this.v;
            this.A = this.p - this.x;
            if (this.D + this.A >= this.e) {
                this.A = this.e - this.D - 1;
            }
            this.y = true;
            this.c(this.C, this.D, this.z, this.A, this.B);
            int i = 0;
            while (i < this.A) {
                if (i + this.D < this.e) {
                    int j = 0;
                    while (j < this.z) {
                        if (j + this.C < this.d) {
                            final int n = (i + this.D) * this.d + (j + this.C);
                            final short n2 = (short)(this.q[this.t][(i + this.x) * this.o + (j + this.w)] & 0xFFFF);
                            final int n3 = (n2 & 0xF00) >> 4;
                            final short n4 = (short)(n2 & 0xF0);
                            final int n5 = (n2 & 0xF) << 4;
                            final int n6 = this.m[n];
                            final int n7 = (n6 & 0xFF0000) >> 16;
                            final int n8 = (n6 & 0xFF00) >> 8;
                            final int n9 = n6 & 0xFF;
                            if (this.r[this.t] == 3) {
                                final int n10 = (n2 & 0xF000) >> 12;
                                if (n10 != 0) {
                                    this.m[n] = -16777216 + (((15 - n10) * n7 + n10 * n3) / 15 << 16) + (((15 - n10) * n8 + n10 * n4) / 15 << 8) + ((15 - n10) * n9 + n10 * n5) / 15;
                                }
                            }
                            if (this.r[this.t] == 2) {
                                final int n11 = (n2 & 0x8000) >> 15;
                                final int n12 = (n2 & 0x4000) >> 14;
                                if ((n11 != 0 || t) && (n12 != 0 || t)) {}
                            }
                        }
                        ++j;
                        if (t) {
                            break;
                        }
                    }
                }
                ++i;
                if (t) {
                    break;
                }
            }
        }
    }
}
