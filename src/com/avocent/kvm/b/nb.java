package com.avocent.kvm.b;

import java.text.DecimalFormat;
import java.util.Properties;

public class nb extends Properties
{
    protected Properties a;
    protected DecimalFormat b;
    protected DecimalFormat c;
    protected DecimalFormat d;
    protected DecimalFormat e;
    protected Double f;
    protected Double g;
    protected Double h;
    protected Double i;
    protected String j;
    protected String k;
    protected String l;
    protected String m;
    private static final String[] z;
    
    public nb() {
        super();
        this.a = new Properties();
        this.b = new DecimalFormat(nb.z[1]);
        this.c = new DecimalFormat(nb.z[1]);
        this.d = new DecimalFormat(nb.z[1]);
        this.e = new DecimalFormat(nb.z[1]);
    }
    
    public void a(final Double f) {
        this.f = f;
        this.j = this.b.format((double)this.f);
        this.setProperty(nb.z[0], this.j);
    }
    
    public void b(final Double g) {
        this.g = g;
        this.k = this.c.format(this.g / 1024.0);
        this.setProperty(nb.z[2], this.k);
    }
    
    public void c(final Double h) {
        this.h = h;
        this.l = this.d.format((double)this.h);
        this.setProperty(nb.z[3], this.l);
    }
    
    public void d(final Double i) {
        this.i = i;
        this.m = this.e.format((double)this.i);
        this.setProperty(nb.z[4], this.m);
    }
    
    public String a() {
        return this.j;
    }
    
    public String b() {
        return this.k;
    }
    
    public String c() {
        return this.l;
    }
    
    public String d() {
        return this.m;
    }
    
    static {
        final String[] z2 = new String[5];
        final int n = 0;
        final char[] charArray = "es2:6Q`'2".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0096: {
                if (n2 > 1) {
                    break Label_0096;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\u0003';
                            break;
                        }
                        case 1: {
                            c2 = '\u0001';
                            break;
                        }
                        case 2: {
                            c2 = 'S';
                            break;
                        }
                        case 3: {
                            c2 = 'W';
                            break;
                        }
                        default: {
                            c2 = 'S';
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
        final char[] charArray2 = " \"pg}3".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0212: {
                if (n6 > 1) {
                    break Label_0212;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\u0003';
                            break;
                        }
                        case 1: {
                            c4 = '\u0001';
                            break;
                        }
                        case 2: {
                            c4 = 'S';
                            break;
                        }
                        case 3: {
                            c4 = 'W';
                            break;
                        }
                        default: {
                            c4 = 'S';
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
        final char[] charArray3 = "a`=3$je'?".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0328: {
                if (n10 > 1) {
                    break Label_0328;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '\u0003';
                            break;
                        }
                        case 1: {
                            c6 = '\u0001';
                            break;
                        }
                        case 2: {
                            c6 = 'S';
                            break;
                        }
                        case 3: {
                            c6 = 'W';
                            break;
                        }
                        default: {
                            c6 = 'S';
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
        final char[] charArray4 = "`n>'!fr ><mS2#:l".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0444: {
                if (n14 > 1) {
                    break Label_0444;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '\u0003';
                            break;
                        }
                        case 1: {
                            c8 = '\u0001';
                            break;
                        }
                        case 2: {
                            c8 = 'S';
                            break;
                        }
                        case 3: {
                            c8 = 'W';
                            break;
                        }
                        default: {
                            c8 = 'S';
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
        final char[] charArray5 = "s`0<6wS2#6".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0560: {
                if (n18 > 1) {
                    break Label_0560;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = '\u0003';
                            break;
                        }
                        case 1: {
                            c10 = '\u0001';
                            break;
                        }
                        case 2: {
                            c10 = 'S';
                            break;
                        }
                        case 3: {
                            c10 = 'W';
                            break;
                        }
                        default: {
                            c10 = 'S';
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
