// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.c;

public class e {

    private static final String[] z;

    public static String a(final int n) {
        final int b = d.b;
        String s = "";
        Label_0294:
        {
            switch (n) {
                case 58: {
                    s = e.z[14];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 59: {
                    s = e.z[12];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 60: {
                    s = e.z[10];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 61: {
                    s = e.z[1];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 62: {
                    s = e.z[8];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 63: {
                    s = e.z[7];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 64: {
                    s = e.z[0];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 65: {
                    s = e.z[11];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 66: {
                    s = e.z[3];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 67: {
                    s = e.z[2];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 68: {
                    s = e.z[4];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 69: {
                    s = e.z[5];
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 70: {
                    s = com.avocent.a.d.b(e.z[13]);
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 72: {
                    s = com.avocent.a.d.b(e.z[6]);
                    if (b != 0) {
                        break Label_0294;
                    }
                    break;
                }
                case 0: {
                    s = com.avocent.a.d.b(e.z[9]);
                    break;
                }
            }
        }
        return s;
    }

    static {
        final String[] z2 = new String[15];
        final int n = 0;
        final char[] charArray = "I\u0013".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097:
            {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\u000f';
                            break;
                        }
                        case 1: {
                            c2 = '$';
                            break;
                        }
                        case 2: {
                            c2 = '%';
                            break;
                        }
                        case 3: {
                            c2 = '\u0015';
                            break;
                        }
                        default: {
                            c2 = '\u0003';
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
        final char[] charArray2 = "I\u0010".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213:
            {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\u000f';
                            break;
                        }
                        case 1: {
                            c4 = '$';
                            break;
                        }
                        case 2: {
                            c4 = '%';
                            break;
                        }
                        case 3: {
                            c4 = '\u0015';
                            break;
                        }
                        default: {
                            c4 = '\u0003';
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
        final char[] charArray3 = "I\u0015\u0015".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329:
            {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '\u000f';
                            break;
                        }
                        case 1: {
                            c6 = '$';
                            break;
                        }
                        case 2: {
                            c6 = '%';
                            break;
                        }
                        case 3: {
                            c6 = '\u0015';
                            break;
                        }
                        default: {
                            c6 = '\u0003';
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
        final char[] charArray4 = "I\u001d".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0445:
            {
                if (n14 > 1) {
                    break Label_0445;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '\u000f';
                            break;
                        }
                        case 1: {
                            c8 = '$';
                            break;
                        }
                        case 2: {
                            c8 = '%';
                            break;
                        }
                        case 3: {
                            c8 = '\u0015';
                            break;
                        }
                        default: {
                            c8 = '\u0003';
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
        final char[] charArray5 = "I\u0015\u0014".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0561:
            {
                if (n18 > 1) {
                    break Label_0561;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = '\u000f';
                            break;
                        }
                        case 1: {
                            c10 = '$';
                            break;
                        }
                        case 2: {
                            c10 = '%';
                            break;
                        }
                        case 3: {
                            c10 = '\u0015';
                            break;
                        }
                        default: {
                            c10 = '\u0003';
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
        final char[] charArray6 = "I\u0015\u0017".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0677:
            {
                if (n22 > 1) {
                    break Label_0677;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = '\u000f';
                            break;
                        }
                        case 1: {
                            c12 = '$';
                            break;
                        }
                        case 2: {
                            c12 = '%';
                            break;
                        }
                        case 3: {
                            c12 = '\u0015';
                            break;
                        }
                        default: {
                            c12 = '\u0003';
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
        final char[] charArray7 = "F`cS\\_epFF".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0793:
            {
                if (n26 > 1) {
                    break Label_0793;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = '\u000f';
                            break;
                        }
                        case 1: {
                            c14 = '$';
                            break;
                        }
                        case 2: {
                            c14 = '%';
                            break;
                        }
                        case 3: {
                            c14 = '\u0015';
                            break;
                        }
                        default: {
                            c14 = '\u0003';
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
        final char[] charArray8 = "I\u0012".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0909:
            {
                if (n30 > 1) {
                    break Label_0909;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = '\u000f';
                            break;
                        }
                        case 1: {
                            c16 = '$';
                            break;
                        }
                        case 2: {
                            c16 = '%';
                            break;
                        }
                        case 3: {
                            c16 = '\u0015';
                            break;
                        }
                        default: {
                            c16 = '\u0003';
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
        final char[] charArray9 = "I\u0011".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1025:
            {
                if (n34 > 1) {
                    break Label_1025;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = '\u000f';
                            break;
                        }
                        case 1: {
                            c18 = '$';
                            break;
                        }
                        case 2: {
                            c18 = '%';
                            break;
                        }
                        case 3: {
                            c18 = '\u0015';
                            break;
                        }
                        default: {
                            c18 = '\u0003';
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
        final char[] charArray10 = "F`cS\\AkkP".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1141:
            {
                if (n38 > 1) {
                    break Label_1141;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = '\u000f';
                            break;
                        }
                        case 1: {
                            c20 = '$';
                            break;
                        }
                        case 2: {
                            c20 = '%';
                            break;
                        }
                        case 3: {
                            c20 = '\u0015';
                            break;
                        }
                        default: {
                            c20 = '\u0003';
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
        final char[] charArray11 = "I\u0017".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1257:
            {
                if (n42 > 1) {
                    break Label_1257;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = '\u000f';
                            break;
                        }
                        case 1: {
                            c22 = '$';
                            break;
                        }
                        case 2: {
                            c22 = '%';
                            break;
                        }
                        case 3: {
                            c22 = '\u0015';
                            break;
                        }
                        default: {
                            c22 = '\u0003';
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
        final char[] charArray12 = "I\u001c".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1373:
            {
                if (n46 > 1) {
                    break Label_1373;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = '\u000f';
                            break;
                        }
                        case 1: {
                            c24 = '$';
                            break;
                        }
                        case 2: {
                            c24 = '%';
                            break;
                        }
                        case 3: {
                            c24 = '\u0015';
                            break;
                        }
                        default: {
                            c24 = '\u0003';
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
        final char[] charArray13 = "I\u0016".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1489:
            {
                if (n50 > 1) {
                    break Label_1489;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = '\u000f';
                            break;
                        }
                        case 1: {
                            c26 = '$';
                            break;
                        }
                        case 2: {
                            c26 = '%';
                            break;
                        }
                        case 3: {
                            c26 = '\u0015';
                            break;
                        }
                        default: {
                            c26 = '\u0003';
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
        final char[] charArray14 = "F`cS\\_vqF@]j".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1605:
            {
                if (n54 > 1) {
                    break Label_1605;
                }
                length14 = (n55 = n56);
                do {
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = '\u000f';
                            break;
                        }
                        case 1: {
                            c28 = '$';
                            break;
                        }
                        case 2: {
                            c28 = '%';
                            break;
                        }
                        case 3: {
                            c28 = '\u0015';
                            break;
                        }
                        default: {
                            c28 = '\u0003';
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
        final char[] charArray15 = "I\u0015".toCharArray();
        int length15;
        int n59;
        final int n58 = n59 = (length15 = charArray15.length);
        int n60 = 0;
        while (true) {
            Label_1721:
            {
                if (n58 > 1) {
                    break Label_1721;
                }
                length15 = (n59 = n60);
                do {
                    final char c29 = charArray15[n59];
                    char c30 = '\0';
                    switch (n60 % 5) {
                        case 0: {
                            c30 = '\u000f';
                            break;
                        }
                        case 1: {
                            c30 = '$';
                            break;
                        }
                        case 2: {
                            c30 = '%';
                            break;
                        }
                        case 3: {
                            c30 = '\u0015';
                            break;
                        }
                        default: {
                            c30 = '\u0003';
                            break;
                        }
                    }
                    charArray15[length15] = (char) (c29 ^ c30);
                    ++n60;
                } while (n58 == 0);
            }
            if (n58 <= n60) {
                z2[n57] = new String(charArray15).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
