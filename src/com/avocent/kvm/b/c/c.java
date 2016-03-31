// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.c;

import com.avocent.kvm.b.f.f;
import java.util.Hashtable;
import java.util.Locale;
import java.awt.Component;

public class c {

    protected Component a;
    protected Locale b;
    protected Hashtable c;
    protected Locale d;
    public static boolean e;
    private static final String[] z;

    public c(final Component a) {
        final boolean e = com.avocent.kvm.b.c.c.e;
        this.d = null;
        this.a = a;
        final String property = System.getProperty(com.avocent.kvm.b.c.c.z[9]);
        Label_0335:
        {
            if (property != null) {
                if (property.equalsIgnoreCase(com.avocent.kvm.b.c.c.z[3])) {
                    this.d = new Locale(com.avocent.kvm.b.c.c.z[16], com.avocent.kvm.b.c.c.z[8]);
                    if (!e) {
                        break Label_0335;
                    }
                }
                if (property.equalsIgnoreCase(com.avocent.kvm.b.c.c.z[1])) {
                    this.d = new Locale(com.avocent.kvm.b.c.c.z[7], com.avocent.kvm.b.c.c.z[5]);
                    if (!e) {
                        break Label_0335;
                    }
                }
                if (property.equalsIgnoreCase(com.avocent.kvm.b.c.c.z[2])) {
                    this.d = new Locale(com.avocent.kvm.b.c.c.z[15], com.avocent.kvm.b.c.c.z[11]);
                    if (!e) {
                        break Label_0335;
                    }
                }
                if (property.equalsIgnoreCase(com.avocent.kvm.b.c.c.z[0])) {
                    this.d = new Locale(com.avocent.kvm.b.c.c.z[18], com.avocent.kvm.b.c.c.z[19]);
                    if (!e) {
                        break Label_0335;
                    }
                }
                if (property.equalsIgnoreCase(com.avocent.kvm.b.c.c.z[4])) {
                    this.d = new Locale(com.avocent.kvm.b.c.c.z[10], com.avocent.kvm.b.c.c.z[17]);
                    if (!e) {
                        break Label_0335;
                    }
                }
                if (property.equalsIgnoreCase(com.avocent.kvm.b.c.c.z[6])) {
                    this.d = new Locale(com.avocent.kvm.b.c.c.z[20], com.avocent.kvm.b.c.c.z[14]);
                    if (!e) {
                        break Label_0335;
                    }
                }
                f.c().a(com.avocent.kvm.b.c.c.z[12] + property + com.avocent.kvm.b.c.c.z[13]);
                if (!e) {
                    break Label_0335;
                }
            }
            if (a == null) {
                this.d = new Locale(com.avocent.kvm.b.c.c.z[16], com.avocent.kvm.b.c.c.z[8]);
            }
        }
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.kvm.b.c.c.e = !e;
        }
    }

    public int a(final int n, final char c, final int n2) {
        final boolean e = c.e;
        final Locale b = (this.d != null) ? this.d : this.a.getInputContext().getLocale();
        if (b == null) {
            return -1;
        }
        if (this.b != b) {
            final String iso3Language = b.getISO3Language();
            Label_0186:
            {
                if (iso3Language.equalsIgnoreCase(c.z[3])) {
                    this.c = com.avocent.kvm.b.c.d.i;
                    if (!e) {
                        break Label_0186;
                    }
                }
                if (iso3Language.equalsIgnoreCase(c.z[0])) {
                    this.c = com.avocent.kvm.b.c.d.c;
                    if (!e) {
                        break Label_0186;
                    }
                }
                if (iso3Language.equalsIgnoreCase(c.z[2])) {
                    this.c = com.avocent.kvm.b.c.d.g;
                    if (!e) {
                        break Label_0186;
                    }
                }
                if (iso3Language.equalsIgnoreCase(c.z[4])) {
                    this.c = com.avocent.kvm.b.c.d.a;
                    if (!e) {
                        break Label_0186;
                    }
                }
                if (iso3Language.equalsIgnoreCase(c.z[1])) {
                    this.c = com.avocent.kvm.b.c.d.e;
                    if (!e) {
                        break Label_0186;
                    }
                }
                this.c = com.avocent.kvm.b.c.d.i;
            }
            this.b = b;
        }
        final Integer value = this.c.get(new b(n, c, n2));
        int n3 = (value != null) ? value : 0;
        if (n3 == 0) {
            Label_0714:
            {
                switch (n) {
                    case 414865: {
                        n3 = 102;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 414854: {
                        n3 = 116;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 414868: {
                        n3 = 117;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65482: {
                        n3 = 118;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65480: {
                        n3 = 120;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 414852: {
                        n3 = 119;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65481: {
                        n3 = 121;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65483: {
                        n3 = 122;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 414864: {
                        n3 = 127;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65489: {
                        n3 = 123;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65485: {
                        n3 = 124;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65487: {
                        n3 = 125;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 65488: {
                        n3 = 126;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 414866: {
                        n3 = 128;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 414867: {
                        n3 = 129;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417792: {
                        n3 = 138;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417793: {
                        n3 = 139;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417794: {
                        n3 = 135;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417795: {
                        n3 = 137;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417796: {
                        n3 = 227;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417797: {
                        n3 = 101;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417799: {
                        n3 = 230;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417798: {
                        n3 = 226;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417801: {
                        n3 = 228;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417800: {
                        n3 = 224;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417803: {
                        n3 = 229;
                        if (e) {
                            break Label_0714;
                        }
                        break;
                    }
                    case 417802: {
                        n3 = 225;
                        break;
                    }
                }
            }
        }
        return n3;
    }

    public int b(final int n, final char c, final int n2) {
        final boolean e = c.e;
        final Integer value = com.avocent.kvm.b.c.d.k.get(new b(n, c, n2));
        final int n3 = (value != null) ? ((int) value) : c;
        if (e) {
            int c2 = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c2;
        }
        return n3;
    }

    static {
        final String[] z2 = new String[21];
        final int n = 0;
        final char[] charArray = "tr_".toCharArray();
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
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\u0010';
                            break;
                        }
                        case 1: {
                            c2 = '\u0017';
                            break;
                        }
                        case 2: {
                            c2 = '*';
                            break;
                        }
                        case 3: {
                            c2 = '\r';
                            break;
                        }
                        default: {
                            c2 = 'y';
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
        final char[] charArray2 = "cgK".toCharArray();
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
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\u0010';
                            break;
                        }
                        case 1: {
                            c4 = '\u0017';
                            break;
                        }
                        case 2: {
                            c4 = '*';
                            break;
                        }
                        case 3: {
                            c4 = '\r';
                            break;
                        }
                        default: {
                            c4 = 'y';
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
        final char[] charArray3 = "veK".toCharArray();
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
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '\u0010';
                            break;
                        }
                        case 1: {
                            c6 = '\u0017';
                            break;
                        }
                        case 2: {
                            c6 = '*';
                            break;
                        }
                        case 3: {
                            c6 = '\r';
                            break;
                        }
                        default: {
                            c6 = 'y';
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
        final char[] charArray4 = "uyM".toCharArray();
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
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '\u0010';
                            break;
                        }
                        case 1: {
                            c8 = '\u0017';
                            break;
                        }
                        case 2: {
                            c8 = '*';
                            break;
                        }
                        case 3: {
                            c8 = '\r';
                            break;
                        }
                        default: {
                            c8 = 'y';
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
        final char[] charArray5 = "ycK".toCharArray();
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
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = '\u0010';
                            break;
                        }
                        case 1: {
                            c10 = '\u0017';
                            break;
                        }
                        case 2: {
                            c10 = '*';
                            break;
                        }
                        case 3: {
                            c10 = '\r';
                            break;
                        }
                        default: {
                            c10 = 'y';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c9 ^ c10);
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
        final char[] charArray6 = "UD".toCharArray();
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
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = '\u0010';
                            break;
                        }
                        case 1: {
                            c12 = '\u0017';
                            break;
                        }
                        case 2: {
                            c12 = '*';
                            break;
                        }
                        case 3: {
                            c12 = '\r';
                            break;
                        }
                        default: {
                            c12 = 'y';
                            break;
                        }
                    }
                    charArray6[length6] = (char) (c11 ^ c12);
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
        final char[] charArray7 = "tvD".toCharArray();
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
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = '\u0010';
                            break;
                        }
                        case 1: {
                            c14 = '\u0017';
                            break;
                        }
                        case 2: {
                            c14 = '*';
                            break;
                        }
                        case 3: {
                            c14 = '\r';
                            break;
                        }
                        default: {
                            c14 = 'y';
                            break;
                        }
                    }
                    charArray7[length7] = (char) (c13 ^ c14);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 > n28) {
                continue;
            }
            break;
        }
        z2[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "ud".toCharArray();
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
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = '\u0010';
                            break;
                        }
                        case 1: {
                            c16 = '\u0017';
                            break;
                        }
                        case 2: {
                            c16 = '*';
                            break;
                        }
                        case 3: {
                            c16 = '\r';
                            break;
                        }
                        default: {
                            c16 = 'y';
                            break;
                        }
                    }
                    charArray8[length8] = (char) (c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 > n32) {
                continue;
            }
            break;
        }
        z2[n29] = new String(charArray8).intern();
        final int n33 = 8;
        final char[] charArray9 = "UY".toCharArray();
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
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = '\u0010';
                            break;
                        }
                        case 1: {
                            c18 = '\u0017';
                            break;
                        }
                        case 2: {
                            c18 = '*';
                            break;
                        }
                        case 3: {
                            c18 = '\r';
                            break;
                        }
                        default: {
                            c18 = 'y';
                            break;
                        }
                    }
                    charArray9[length9] = (char) (c17 ^ c18);
                    ++n36;
                } while (n34 == 0);
            }
            if (n34 > n36) {
                continue;
            }
            break;
        }
        z2[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = "sxG#\u0018fxIh\u0017d9A{\u0014>tE\u007f\u001c>|Ot\u001b\u007fvXiW|xIl\u0015u".toCharArray();
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
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = '\u0010';
                            break;
                        }
                        case 1: {
                            c20 = '\u0017';
                            break;
                        }
                        case 2: {
                            c20 = '*';
                            break;
                        }
                        case 3: {
                            c20 = '\r';
                            break;
                        }
                        default: {
                            c20 = 'y';
                            break;
                        }
                    }
                    charArray10[length10] = (char) (c19 ^ c20);
                    ++n40;
                } while (n38 == 0);
            }
            if (n38 > n40) {
                continue;
            }
            break;
        }
        z2[n37] = new String(charArray10).intern();
        final int n41 = 10;
        final char[] charArray11 = "yc".toCharArray();
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
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = '\u0010';
                            break;
                        }
                        case 1: {
                            c22 = '\u0017';
                            break;
                        }
                        case 2: {
                            c22 = '*';
                            break;
                        }
                        case 3: {
                            c22 = '\r';
                            break;
                        }
                        default: {
                            c22 = 'y';
                            break;
                        }
                    }
                    charArray11[length11] = (char) (c21 ^ c22);
                    ++n44;
                } while (n42 == 0);
            }
            if (n42 > n44) {
                continue;
            }
            break;
        }
        z2[n41] = new String(charArray11).intern();
        final int n45 = 11;
        final char[] charArray12 = "VE".toCharArray();
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
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = '\u0010';
                            break;
                        }
                        case 1: {
                            c24 = '\u0017';
                            break;
                        }
                        case 2: {
                            c24 = '*';
                            break;
                        }
                        case 3: {
                            c24 = '\r';
                            break;
                        }
                        default: {
                            c24 = 'y';
                            break;
                        }
                    }
                    charArray12[length12] = (char) (c23 ^ c24);
                    ++n48;
                } while (n46 == 0);
            }
            if (n46 > n48) {
                continue;
            }
            break;
        }
        z2[n45] = new String(charArray12).intern();
        final int n49 = 12;
        final char[] charArray13 = "0DZh\u001ayqCh\u001d0~D}\fd7Fb\u001aq{O-Q".toCharArray();
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
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = '\u0010';
                            break;
                        }
                        case 1: {
                            c26 = '\u0017';
                            break;
                        }
                        case 2: {
                            c26 = '*';
                            break;
                        }
                        case 3: {
                            c26 = '\r';
                            break;
                        }
                        default: {
                            c26 = 'y';
                            break;
                        }
                    }
                    charArray13[length13] = (char) (c25 ^ c26);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 > n52) {
                continue;
            }
            break;
        }
        z2[n49] = new String(charArray13).intern();
        final int n53 = 13;
        final char[] charArray14 = "97C~Y~x^-\negZb\u000bdrN-\u0018~s\nz\u0010|{\no\u001c0~Mc\u0016brN#".toCharArray();
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
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = '\u0010';
                            break;
                        }
                        case 1: {
                            c28 = '\u0017';
                            break;
                        }
                        case 2: {
                            c28 = '*';
                            break;
                        }
                        case 3: {
                            c28 = '\r';
                            break;
                        }
                        default: {
                            c28 = 'y';
                            break;
                        }
                    }
                    charArray14[length14] = (char) (c27 ^ c28);
                    ++n56;
                } while (n54 == 0);
            }
            if (n54 > n56) {
                continue;
            }
            break;
        }
        z2[n53] = new String(charArray14).intern();
        final int n57 = 14;
        final char[] charArray15 = "TV".toCharArray();
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
                    final char c29 = charArray15[n59];
                    char c30 = '\0';
                    switch (n60 % 5) {
                        case 0: {
                            c30 = '\u0010';
                            break;
                        }
                        case 1: {
                            c30 = '\u0017';
                            break;
                        }
                        case 2: {
                            c30 = '*';
                            break;
                        }
                        case 3: {
                            c30 = '\r';
                            break;
                        }
                        default: {
                            c30 = 'y';
                            break;
                        }
                    }
                    charArray15[length15] = (char) (c29 ^ c30);
                    ++n60;
                } while (n58 == 0);
            }
            if (n58 > n60) {
                continue;
            }
            break;
        }
        z2[n57] = new String(charArray15).intern();
        final int n61 = 15;
        final char[] charArray16 = "ve".toCharArray();
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
                    final char c31 = charArray16[n63];
                    char c32 = '\0';
                    switch (n64 % 5) {
                        case 0: {
                            c32 = '\u0010';
                            break;
                        }
                        case 1: {
                            c32 = '\u0017';
                            break;
                        }
                        case 2: {
                            c32 = '*';
                            break;
                        }
                        case 3: {
                            c32 = '\r';
                            break;
                        }
                        default: {
                            c32 = 'y';
                            break;
                        }
                    }
                    charArray16[length16] = (char) (c31 ^ c32);
                    ++n64;
                } while (n62 == 0);
            }
            if (n62 > n64) {
                continue;
            }
            break;
        }
        z2[n61] = new String(charArray16).intern();
        final int n65 = 16;
        final char[] charArray17 = "uy".toCharArray();
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
                    final char c33 = charArray17[n67];
                    char c34 = '\0';
                    switch (n68 % 5) {
                        case 0: {
                            c34 = '\u0010';
                            break;
                        }
                        case 1: {
                            c34 = '\u0017';
                            break;
                        }
                        case 2: {
                            c34 = '*';
                            break;
                        }
                        case 3: {
                            c34 = '\r';
                            break;
                        }
                        default: {
                            c34 = 'y';
                            break;
                        }
                    }
                    charArray17[length17] = (char) (c33 ^ c34);
                    ++n68;
                } while (n66 == 0);
            }
            if (n66 > n68) {
                continue;
            }
            break;
        }
        z2[n65] = new String(charArray17).intern();
        final int n69 = 17;
        final char[] charArray18 = "YC".toCharArray();
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
                    final char c35 = charArray18[n71];
                    char c36 = '\0';
                    switch (n72 % 5) {
                        case 0: {
                            c36 = '\u0010';
                            break;
                        }
                        case 1: {
                            c36 = '\u0017';
                            break;
                        }
                        case 2: {
                            c36 = '*';
                            break;
                        }
                        case 3: {
                            c36 = '\r';
                            break;
                        }
                        default: {
                            c36 = 'y';
                            break;
                        }
                    }
                    charArray18[length18] = (char) (c35 ^ c36);
                    ++n72;
                } while (n70 == 0);
            }
            if (n70 > n72) {
                continue;
            }
            break;
        }
        z2[n69] = new String(charArray18).intern();
        final int n73 = 18;
        final char[] charArray19 = "tr".toCharArray();
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
                    final char c37 = charArray19[n75];
                    char c38 = '\0';
                    switch (n76 % 5) {
                        case 0: {
                            c38 = '\u0010';
                            break;
                        }
                        case 1: {
                            c38 = '\u0017';
                            break;
                        }
                        case 2: {
                            c38 = '*';
                            break;
                        }
                        case 3: {
                            c38 = '\r';
                            break;
                        }
                        default: {
                            c38 = 'y';
                            break;
                        }
                    }
                    charArray19[length19] = (char) (c37 ^ c38);
                    ++n76;
                } while (n74 == 0);
            }
            if (n74 > n76) {
                continue;
            }
            break;
        }
        z2[n73] = new String(charArray19).intern();
        final int n77 = 19;
        final char[] charArray20 = "TR".toCharArray();
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
                    final char c39 = charArray20[n79];
                    char c40 = '\0';
                    switch (n80 % 5) {
                        case 0: {
                            c40 = '\u0010';
                            break;
                        }
                        case 1: {
                            c40 = '\u0017';
                            break;
                        }
                        case 2: {
                            c40 = '*';
                            break;
                        }
                        case 3: {
                            c40 = '\r';
                            break;
                        }
                        default: {
                            c40 = 'y';
                            break;
                        }
                    }
                    charArray20[length20] = (char) (c39 ^ c40);
                    ++n80;
                } while (n78 == 0);
            }
            if (n78 > n80) {
                continue;
            }
            break;
        }
        z2[n77] = new String(charArray20).intern();
        final int n81 = 20;
        final char[] charArray21 = "tv".toCharArray();
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
                    final char c41 = charArray21[n83];
                    char c42 = '\0';
                    switch (n84 % 5) {
                        case 0: {
                            c42 = '\u0010';
                            break;
                        }
                        case 1: {
                            c42 = '\u0017';
                            break;
                        }
                        case 2: {
                            c42 = '*';
                            break;
                        }
                        case 3: {
                            c42 = '\r';
                            break;
                        }
                        default: {
                            c42 = 'y';
                            break;
                        }
                    }
                    charArray21[length21] = (char) (c41 ^ c42);
                    ++n84;
                } while (n82 == 0);
            }
            if (n82 <= n84) {
                z2[n81] = new String(charArray21).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
