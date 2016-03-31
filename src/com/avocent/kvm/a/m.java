// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import java.io.DataOutputStream;
import com.avocent.kvm.b.i;
import java.io.IOException;
import java.io.OutputStream;
import com.avocent.kvm.b.f.b;
import java.io.File;
import com.avocent.kvm.b.u;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import com.avocent.kvm.b.k;

public class m extends k {

    protected boolean x;
    protected int y;
    protected int z;
    protected boolean A;
    protected int B;
    protected int C;
    protected PrintWriter D;
    protected FileOutputStream E;
    private static final String[] F;

    public m(final u u) {
        super(u);
        this.x = false;
        this.y = 0;
        this.z = 0;
        final String property = System.getProperty(/*m.*/F[12]);
        try {
            if (property == null) {
                this.C = -1;
                if (com.avocent.kvm.a.l.Ab == 0) {
                    /*break;*/return;//Sam
                }
            }
            this.C = Integer.parseInt(property.trim());
        } catch (NumberFormatException ex) {
            u.i().a(/*m.*/F[11] + property);
        }
    }

    @Override
    public void n() {
        final int ab = com.avocent.kvm.a.l.Ab;
        if (this.q != null && this.A) {
            this.b.c().a();
            if (this.B != 0) {
                this.o();
            }
        }
        super.n();
        final int d = this.q.d();
        Label_0189:
        {
            switch (d) {
                case 130:
                case 34306: {
                    this.e = ((l) this.b).m();
                    if (ab != 0) {
                        break Label_0189;
                    }
                    break;
                }
                case 129:
                case 34305: {
                    this.e = ((l) this.b).o();
                    if (ab != 0) {
                        break Label_0189;
                    }
                    break;
                }
                case 131:
                case 34307: {
                    this.e = ((l) this.b).n();
                    if (ab != 0) {
                        break Label_0189;
                    }
                    break;
                }
                case 134:
                case 34310: {
                    this.e = ((l) this.b).p();
                    break;
                }
            }
        }
        this.e.a(d, this.q.b(), this.q.g());
        Label_0806:
        {
            if (this.C >= 0 && this.k == this.C) {
                try {
                    if (this.D == null) {
                        final File file = new File(/*m.*/F[2] + this.C + /*m.*/F[0]);
                        final File file2 = new File(/*m.*/F[2] + this.C + /*m.*/F[4]);
                        com.avocent.kvm.b.f.b.a().a(/*m.*/F[5] + file.getPath());
                        this.D = new PrintWriter(new FileOutputStream(file));
                        this.E = new FileOutputStream(file2);
                    }
                    final byte[] b = this.q.b();
                    final int g = this.q.g();
                    int i = 0;
                    while (i < g) {
                        final String hexString = Integer.toHexString(b[i] & 0xFF);
                        this.D.print(((hexString.length() == 1) ? /*m.*/F[3] : /*m.*/F[9]) + hexString);
                        if ((i + 1) % 16 == 0) {
                            this.D.println("");
                        }
                        ++i;
                        if (ab != 0) {
                            break;
                        }
                    }
                    this.E.write(b, 0, g);
                    break Label_0806;
                } catch (IOException ex) {
                    com.avocent.kvm.b.f.b.a().a(/*m.*/F[7] + ex.getMessage());
                    if (ab == 0) {
                        break Label_0806;
                    }
                }
            }
            if (this.D != null) {
                try {
                    com.avocent.kvm.b.f.b.a().a(/*m.*/F[8] + this.C + /*m.*/F[6]);
                    this.D.close();
                    this.E.close();
                    this.D = null;
                    this.E = null;
                    if (this.b.c() instanceof i) {
                        final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(/*m.*/F[2] + this.C + /*m.*/F[10]));
                        final i j = (i) this.b.c();
                        final int[] array = (int[]) j.e();
                        int k = 0;
                        while (k < j.n()) {
                            dataOutputStream.writeInt(array[k]);
                            ++k;
                            if (ab != 0) {
                                break;
                            }
                        }
                        dataOutputStream.close();
                    }
                } catch (IOException ex2) {
                    com.avocent.kvm.b.f.b.a().a(/*m.*/F[1] + ex2.getMessage() + ".");
                }
            }
        }
        this.l();
    }

    protected void o() {
    }

    static {
        final String[] f = new String[13];
        final int n = 0;
        final char[] charArray = "\u007f\u0001z<".toCharArray();
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
                            c2 = 'Q';
                            break;
                        }
                        case 1: {
                            c2 = 'i';
                            break;
                        }
                        case 2: {
                            c2 = '\u001f';
                            break;
                        }
                        case 3: {
                            c2 = 'D';
                            break;
                        }
                        default: {
                            c2 = '5';
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
        f[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "q/~-Y4\r?0Zq\ns+F4Iy6T<\f? @<\u0019?\"\\=\fl~\u0015".toCharArray();
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
                            c4 = 'Q';
                            break;
                        }
                        case 1: {
                            c4 = 'i';
                            break;
                        }
                        case 2: {
                            c4 = '\u001f';
                            break;
                        }
                        case 3: {
                            c4 = 'D';
                            break;
                        }
                        default: {
                            c4 = '5';
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
        f[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "7\u001b~)P\u000e".toCharArray();
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
                            c6 = 'Q';
                            break;
                        }
                        case 1: {
                            c6 = 'i';
                            break;
                        }
                        case 2: {
                            c6 = '\u001f';
                            break;
                        }
                        case 3: {
                            c6 = 'D';
                            break;
                        }
                        default: {
                            c6 = '5';
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
        f[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = "qYgt".toCharArray();
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
                            c8 = 'Q';
                            break;
                        }
                        case 1: {
                            c8 = 'i';
                            break;
                        }
                        case 2: {
                            c8 = '\u001f';
                            break;
                        }
                        case 3: {
                            c8 = 'D';
                            break;
                        }
                        default: {
                            c8 = '5';
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
        f[n13] = new String(charArray4).intern();
        final int n17 = 4;
        final char[] charArray5 = "\u007f\u000bv*".toCharArray();
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
                            c10 = 'Q';
                            break;
                        }
                        case 1: {
                            c10 = 'i';
                            break;
                        }
                        case 2: {
                            c10 = '\u001f';
                            break;
                        }
                        case 3: {
                            c10 = 'D';
                            break;
                        }
                        default: {
                            c10 = '5';
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
        f[n17] = new String(charArray5).intern();
        final int n21 = 5;
        final char[] charArray6 = "q>m-A8\u0007xdS#\br!\u00155\u001cr4\u0015%\u0006%d".toCharArray();
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
                            c12 = 'Q';
                            break;
                        }
                        case 1: {
                            c12 = 'i';
                            break;
                        }
                        case 2: {
                            c12 = '\u001f';
                            break;
                        }
                        case 3: {
                            c12 = 'D';
                            break;
                        }
                        default: {
                            c12 = '5';
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
        f[n21] = new String(charArray6).intern();
        final int n25 = 6;
        final char[] charArray7 = "\u007f\u001dg0".toCharArray();
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
                            c14 = 'Q';
                            break;
                        }
                        case 1: {
                            c14 = 'i';
                            break;
                        }
                        case 2: {
                            c14 = '\u001f';
                            break;
                        }
                        case 3: {
                            c14 = 'D';
                            break;
                        }
                        default: {
                            c14 = '5';
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
        f[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "q,g'P!\u001dv+[q\u001ew-Y4Ih6\\%\u0000q#\u00157\u001b~)Pq\u0001z<\u00155\u001cr4\u000fq".toCharArray();
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
                            c16 = 'Q';
                            break;
                        }
                        case 1: {
                            c16 = 'i';
                            break;
                        }
                        case 2: {
                            c16 = '\u001f';
                            break;
                        }
                        case 3: {
                            c16 = 'D';
                            break;
                        }
                        default: {
                            c16 = '5';
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
        f[n29] = new String(charArray8).intern();
        final int n33 = 8;
        final char[] charArray9 = "q/v*\\\"\u0001z \u0015&\u001bv0\\?\u000e?\"G0\u0004z\u001b".toCharArray();
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
                            c18 = 'Q';
                            break;
                        }
                        case 1: {
                            c18 = 'i';
                            break;
                        }
                        case 2: {
                            c18 = '\u001f';
                            break;
                        }
                        case 3: {
                            c18 = 'D';
                            break;
                        }
                        default: {
                            c18 = '5';
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
        f[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = "qYg".toCharArray();
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
                            c20 = 'Q';
                            break;
                        }
                        case 1: {
                            c20 = 'i';
                            break;
                        }
                        case 2: {
                            c20 = '\u001f';
                            break;
                        }
                        case 3: {
                            c20 = 'D';
                            break;
                        }
                        default: {
                            c20 = '5';
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
        f[n37] = new String(charArray10).intern();
        final int n41 = 10;
        final char[] charArray11 = "\u000e\u0019v<P=G}-[".toCharArray();
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
                            c22 = 'Q';
                            break;
                        }
                        case 1: {
                            c22 = 'i';
                            break;
                        }
                        case 2: {
                            c22 = '\u001f';
                            break;
                        }
                        case 3: {
                            c22 = 'D';
                            break;
                        }
                        default: {
                            c22 = '5';
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
        f[n41] = new String(charArray11).intern();
        final int n45 = 11;
        final char[] charArray12 = "\u0012\bq*Z%Io!G7\u0006m)\u00157\u001b~)Pq\u0001z<\u00155\u001cr4\u001bqIJ*T3\u0005zdA>Io%G\"\f?-[%\fx!Gq\u001f~(@4Iy6Z<Ik,Pq\u0019~6T<\fk!Gq".toCharArray();
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
                            c24 = 'Q';
                            break;
                        }
                        case 1: {
                            c24 = 'i';
                            break;
                        }
                        case 2: {
                            c24 = '\u001f';
                            break;
                        }
                        case 3: {
                            c24 = 'D';
                            break;
                        }
                        default: {
                            c24 = '5';
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
        f[n45] = new String(charArray12).intern();
        final int n49 = 12;
        final char[] charArray13 = "5\u001cr4s#\br!".toCharArray();
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
                            c26 = 'Q';
                            break;
                        }
                        case 1: {
                            c26 = 'i';
                            break;
                        }
                        case 2: {
                            c26 = '\u001f';
                            break;
                        }
                        case 3: {
                            c26 = 'D';
                            break;
                        }
                        default: {
                            c26 = '5';
                            break;
                        }
                    }
                    charArray13[length13] = (char) (c25 ^ c26);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 <= n52) {
                f[n49] = new String(charArray13).intern();
                F = f;
                break;
            }
            continue;
        }
    }
}
