package com.avocent.kvm.b;

import java.io.IOException;

class lb extends Thread
{
    boolean a;
    final k b;
    private static final String[] z;
    
    public lb(final k b) {
        this.b = b;
        super(lb.z[0]);
        this.a = false;
    }
    
    public void a() {
        this.a = true;
        synchronized (this) {
            this.notifyAll();
        }
        this.interrupt();
    }
    
    public void run() {
        final boolean t = g.t;
        this.b.b.i().a(lb.z[2]);
        this.b.n();
        while (!this.a) {
            try {
                if (this.b.a == 103 && this.b.s == 0 && this.b.t == 0) {
                    synchronized (this) {
                        this.wait();
                    }
                }
                if (this.b.e == null) {
                    this.b.a = 103;
                    if (!t) {
                        continue;
                    }
                }
                if (this.b.a == 101) {
                    final int d = this.b.e.d();
                    Label_0273: {
                        if (d == -4) {
                            this.b.n();
                            if (!t) {
                                break Label_0273;
                            }
                        }
                        if (d == -1) {
                            final k b = this.b;
                            ++b.g;
                            if (this.b.g > 300) {
                                throw new IOException(lb.z[3]);
                            }
                            this.b.n();
                            if (!t) {
                                break Label_0273;
                            }
                        }
                        if (this.b.g != 0) {
                            this.b.g = 0;
                        }
                        final k b2 = this.b;
                        b2.o += d;
                        final k b3 = this.b;
                        b3.n += d * this.b.e.e();
                    }
                    if (!t) {
                        continue;
                    }
                }
                if (this.b.a != 103 || (this.b.s <= 0 && this.b.t <= 0)) {
                    continue;
                }
                int i = 0;
                while (true) {
                    synchronized (this) {
                        i += this.b.s;
                        this.b.s = 0;
                    }
                    if (i == 0 && this.b.t == 0) {
                        break;
                    }
                    while (i > 0) {
                        final int d2 = this.b.e.d();
                        --i;
                        Label_0440: {
                            if (d2 == -4) {
                                this.b.n();
                                if (!t) {
                                    break Label_0440;
                                }
                            }
                            final k b4 = this.b;
                            b4.o += d2;
                            final k b5 = this.b;
                            b5.n += d2 * this.b.e.e();
                        }
                        if (t) {
                            break;
                        }
                    }
                    while (this.b.t > 0) {
                        final int d3 = this.b.e.d();
                        if (d3 == -4) {
                            this.b.n();
                            if (!t) {
                                continue;
                            }
                        }
                        final k b6 = this.b;
                        b6.o += d3;
                        final k b7 = this.b;
                        b7.n += d3 * this.b.e.e();
                    }
                }
                this.b.b(this.b.e);
                this.b.e.c().b();
                continue;
            }
            catch (Throwable t2) {
                t2.printStackTrace();
                if (this.b.a(t2)) {
                    if (!t) {
                        continue;
                    }
                }
            }
            break;
        }
        System.out.println(lb.z[1]);
        this.b.a = 102;
        this.b.m();
        this.b.k();
    }
    
    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "f\u0018\u0017%9\u00105\u0016#9T\u0014\u0001".toCharArray();
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
                            c2 = '0';
                            break;
                        }
                        case 1: {
                            c2 = 'q';
                            break;
                        }
                        case 2: {
                            c2 = 's';
                            break;
                        }
                        case 3: {
                            c2 = '@';
                            break;
                        }
                        default: {
                            c2 = 'V';
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
        final char[] charArray2 = "\u00105\u0016#9T\u0014\u0001`%U\u0002\u0000)9^Q\u000049@\u0001\u0016$x".toCharArray();
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
                            c4 = '0';
                            break;
                        }
                        case 1: {
                            c4 = 'q';
                            break;
                        }
                        case 2: {
                            c4 = 's';
                            break;
                        }
                        case 3: {
                            c4 = '@';
                            break;
                        }
                        default: {
                            c4 = 'V';
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
        final char[] charArray3 = "f\u0018\u0017%9\u0010\"\u00163%Y\u001e\u001dzvc\u0005\u00122\"Y\u001f\u0014`%U\u0002\u0000)9^Q\u0007($U\u0010\u0017n".toCharArray();
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
                            c6 = '0';
                            break;
                        }
                        case 1: {
                            c6 = 'q';
                            break;
                        }
                        case 2: {
                            c6 = 's';
                            break;
                        }
                        case 3: {
                            c6 = '@';
                            break;
                        }
                        default: {
                            c6 = 'V';
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
        final char[] charArray4 = "t\u0014\u0010/2U\u0003S%$B\u001e\u0001".toCharArray();
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
                            c8 = '0';
                            break;
                        }
                        case 1: {
                            c8 = 'q';
                            break;
                        }
                        case 2: {
                            c8 = 's';
                            break;
                        }
                        case 3: {
                            c8 = '@';
                            break;
                        }
                        default: {
                            c8 = 'V';
                            break;
                        }
                    }
                    charArray4[length4] = (char)(c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 <= n16) {
                z2[n13] = new String(charArray4).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
