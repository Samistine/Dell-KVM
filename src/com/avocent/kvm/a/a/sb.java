package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class sb extends b
{
    protected String i;
    protected int j;
    private static final String[] z;
    
    public sb() {
        super(1060);
    }
    
    public void a(final byte[] array, final byte[] array2) {
        final int b = a.b(array2, 0);
        this.i = a.a(array2, 2, b);
        this.j = (array2[2 + b] & 0xFF);
    }
    
    public void a(final String i) {
        this.i = i;
        this.e = 8 + this.i.length() + 3;
    }
    
    public void a(final Object o) {
        final int h = b.h;
        if (o == sb.z[0]) {
            this.j = 1;
            if (h == 0) {
                return;
            }
        }
        if (o == sb.z[2]) {
            this.j = 2;
            if (h == 0) {
                return;
            }
        }
        if (o == sb.z[1]) {
            this.j = 3;
            if (h == 0) {
                return;
            }
        }
        if (o == sb.z[3]) {
            this.j = 4;
            if (h == 0) {
                return;
            }
        }
        throw new RuntimeException(sb.z[4] + o);
    }
    
    public byte[] b() {
        final byte[] array = new byte[2 + this.i.length() + 1];
        a.c(this.j, array, a.a(this.i, array, a.a(this.i.length(), array, 0), this.i.length()));
        return array;
    }
    
    public String e() {
        return sb.z[5];
    }
    
    static {
        final String[] z2 = new String[6];
        final int n = 0;
        final char[] charArray = "\u0014Y;Afdy\"".toCharArray();
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
                            c2 = 'D';
                            break;
                        }
                        case 1: {
                            c2 = '6';
                            break;
                        }
                        case 2: {
                            c2 = 'L';
                            break;
                        }
                        case 3: {
                            c2 = '$';
                            break;
                        }
                        default: {
                            c2 = '\u0014';
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
        final char[] charArray2 = "\u0014Y;Afdu5Gx!".toCharArray();
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
                            c4 = 'D';
                            break;
                        }
                        case 1: {
                            c4 = '6';
                            break;
                        }
                        case 2: {
                            c4 = 'L';
                            break;
                        }
                        case 3: {
                            c4 = '$';
                            break;
                        }
                        default: {
                            c4 = '\u0014';
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
        final char[] charArray3 = "\u0014Y;Afdy*B".toCharArray();
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
                            c6 = 'D';
                            break;
                        }
                        case 1: {
                            c6 = '6';
                            break;
                        }
                        case 2: {
                            c6 = 'L';
                            break;
                        }
                        case 3: {
                            c6 = '$';
                            break;
                        }
                        default: {
                            c6 = '\u0014';
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
        final char[] charArray4 = "\u0016S.K{0".toCharArray();
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
                            c8 = 'D';
                            break;
                        }
                        case 1: {
                            c8 = '6';
                            break;
                        }
                        case 2: {
                            c8 = 'L';
                            break;
                        }
                        case 3: {
                            c8 = '$';
                            break;
                        }
                        default: {
                            c8 = '\u0014';
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
        final char[] charArray5 = "\u0011X?Qd4Y>Pq \u0016<Kc!DlW`%B)\u001e4".toCharArray();
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
                            c10 = 'D';
                            break;
                        }
                        case 1: {
                            c10 = '6';
                            break;
                        }
                        case 2: {
                            c10 = 'L';
                            break;
                        }
                        case 3: {
                            c10 = '$';
                            break;
                        }
                        default: {
                            c10 = '\u0014';
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
        final char[] charArray6 = "\u0017S8t{3S>w`%B)".toCharArray();
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
                            c12 = 'D';
                            break;
                        }
                        case 1: {
                            c12 = '6';
                            break;
                        }
                        case 2: {
                            c12 = 'L';
                            break;
                        }
                        case 3: {
                            c12 = '$';
                            break;
                        }
                        default: {
                            c12 = '\u0014';
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
