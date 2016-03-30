package com.avocent.kvm.a.a;

import com.avocent.kvm.b.gb;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.EOFException;
import java.io.IOException;
import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import java.io.DataInputStream;
import com.avocent.kvm.a.l;

public class a
{
    protected byte[] a;
    protected byte[] b;
    protected int c;
    protected l d;
    private static final String[] z;
    
    public a(final l d) {
        super();
        this.a = new byte[8];
        this.b = new byte[1024];
        this.c = 1;
        this.d = d;
    }
    
    public c a(final DataInputStream dataInputStream, final OutputStream outputStream, final boolean b) throws IOException {
        final int h = b.h;
        c a = null;
        int n = 0;
        try {
            if (this.c == 2) {
                final long long1 = dataInputStream.readLong();
                try {
                    if (long1 <= 1000L) {
                        Thread.sleep(long1);
                    }
                }
                catch (InterruptedException ex2) {}
            }
            dataInputStream.readFully(this.a);
            n = (b ? ((this.a[4] & 0xFF) << 8 | (this.a[5] & 0xFF)) : (this.a[5] & 0xFF));
            Label_0172: {
                if (this.d.y) {
                    if ((this.a[5] & 0xFF) == 0x8600) {
                        n = 34304;
                        if (h == 0) {
                            break Label_0172;
                        }
                    }
                    if ((this.a[5] & 0xFF) == 0x8601) {
                        n = 34305;
                        if (h == 0) {
                            break Label_0172;
                        }
                    }
                    if ((this.a[5] & 0xFF) == 0x8602) {
                        n = 34306;
                    }
                }
            }
            final int b2 = a.b(this.a, 6);
            if (b2 < 16) {
                throw new IOException(a.z[7] + b2 + a.z[2]);
            }
            if (b2 > 15000) {
                throw new IOException(a.z[10] + b2);
            }
            final int n2 = b2 - 8;
            if (this.b.length < n2) {
                this.b = new byte[n2];
            }
            int i = 0;
            final long currentTimeMillis = System.currentTimeMillis();
            while (i < n2) {
                final int read = dataInputStream.read(this.b, i, n2 - i);
                if (read < 0) {
                    throw new EOFException(a.z[8]);
                }
                i += read;
                if (System.currentTimeMillis() - currentTimeMillis > 3000L) {
                    System.out.println(a.z[11] + n2 + a.z[12] + (i + 1));
                    a = new gb();
                    return a;
                }
                if (h != 0) {
                    break;
                }
            }
            if (outputStream != null) {
                synchronized (outputStream) {
                    if (outputStream != null) {
                        outputStream.write(this.a);
                        outputStream.write(this.b, 0, n2);
                    }
                }
            }
            if (n != 134) {
                System.out.println(a.z[4] + n);
            }
            a = this.a(n);
            if (a != null) {
                a.a(this.a, this.b, n2);
            }
        }
        catch (IOException ex) {
            System.out.println(a.z[6] + new SimpleDateFormat(a.z[9]).format(new Date()).toString());
            System.out.println(a.z[5] + n);
            System.out.println(a.z[6] + ex.toString());
        }
        return a;
    }
    
    public c a(final int n) {
        c d = null;
        switch (n) {
            case 33536: {
                d = new kb();
                break;
            }
            case 33541: {
                d = new kb(true);
                break;
            }
            case 33281: {
                d = new ab();
                break;
            }
            case 33280:
            case 33286: {
                d = new bb();
                break;
            }
            case 33025: {
                d = new fb();
                break;
            }
            case 33026: {
                d = new eb();
                break;
            }
            case 34309: {
                System.out.println(a.z[3]);
                d = new r(n);
                break;
            }
            case 33538: {
                d = new hb(n);
                break;
            }
            case 33824: {
                d = new lb(n);
                break;
            }
            case 33810: {
                d = new db(n);
                break;
            }
            case 33811: {
                d = new ib(n);
                break;
            }
            case 33024: {
                d = new cb(n);
                break;
            }
            case 33283: {
                d = new jb(n);
                break;
            }
            case 256: {
                d = new u();
                break;
            }
            case 257: {
                d = new v();
                break;
            }
            case 128: {
                d = new z(n);
                break;
            }
            case 129:
            case 130:
            case 131:
            case 134:
            case 34305:
            case 34306:
            case 34307:
            case 34310: {
                d = this.d.b().d();
                ((gb)d).a(n);
                break;
            }
            case 132: {
                d = new mb();
                break;
            }
            case 133: {
                d = new r(n);
                break;
            }
            case 1: {
                d = new pb();
                break;
            }
            case 1024: {
                d = new n();
                break;
            }
            case 516: {
                d = new f();
                break;
            }
            case 770: {
                d = new t();
                break;
            }
            case 513: {
                d = new vb();
                break;
            }
            case 782: {
                d = new x();
                break;
            }
            case 1536: {
                d = new w(1536);
                break;
            }
            case 0: {
                d = new w(0);
                break;
            }
            case 772: {
                d = new m();
                break;
            }
            case 33282: {
                d = new nb();
                break;
            }
            case 33840: {
                d = new c();
                break;
            }
            case 33841: {
                d = new qb();
                break;
            }
            case 33842: {
                d = new rb();
                break;
            }
            case 33284: {
                d = new j();
                break;
            }
            case 33793: {
                d = new tb();
                break;
            }
            default: {
                System.out.println(a.z[1] + Integer.toHexString(n) + a.z[0] + Integer.toHexString(n) + a.z[2]);
                d = new gb();
                break;
            }
        }
        return d;
    }
    
    static {
        final String[] z2 = new String[13];
        final int n = 0;
        final char[] charArray = "|(f8=6k(/9'}fch-".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097: {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'U';
                            break;
                        }
                        case 1: {
                            c2 = '\u0004';
                            break;
                        }
                        case 2: {
                            c2 = 'F';
                            break;
                        }
                        case 3: {
                            c2 = 'K';
                            break;
                        }
                        default: {
                            c2 = 'X';
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
        final char[] charArray2 = "uQ( 6:s(k50w5*?0$22(0>f;*<i'9!u,v3".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213: {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'U';
                            break;
                        }
                        case 1: {
                            c4 = '\u0004';
                            break;
                        }
                        case 2: {
                            c4 = 'F';
                            break;
                        }
                        case 3: {
                            c4 = 'K';
                            break;
                        }
                        default: {
                            c4 = 'X';
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
        final char[] charArray3 = "|*".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329: {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'U';
                            break;
                        }
                        case 1: {
                            c6 = '\u0004';
                            break;
                        }
                        case 2: {
                            c6 = 'F';
                            break;
                        }
                        case 3: {
                            c6 = 'K';
                            break;
                        }
                        default: {
                            c6 = 'X';
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
        final char[] charArray4 = "_\u000ef\u001b96o#?x&p);=1$4.;0m0.<_\u000e".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0445: {
                if (n14 > 1) {
                    break Label_0445;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'U';
                            break;
                        }
                        case 1: {
                            c8 = '\u0004';
                            break;
                        }
                        case 2: {
                            c8 = 'F';
                            break;
                        }
                        case 3: {
                            c8 = 'K';
                            break;
                        }
                        default: {
                            c8 = 'X';
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
        final char[] charArray5 = "\u0017a $*0$%9=4p#\u001b96o#?pui#8+4c#\u001f!%afbx".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0561: {
                if (n18 > 1) {
                    break Label_0561;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'U';
                            break;
                        }
                        case 1: {
                            c10 = '\u0004';
                            break;
                        }
                        case 2: {
                            c10 = 'F';
                            break;
                        }
                        case 3: {
                            c10 = 'K';
                            break;
                        }
                        default: {
                            c10 = 'X';
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
        final char[] charArray6 = "\u0018a5892af\u001f!%afvx".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0677: {
                if (n22 > 1) {
                    break Label_0677;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = 'U';
                            break;
                        }
                        case 1: {
                            c12 = '\u0004';
                            break;
                        }
                        case 2: {
                            c12 = 'F';
                            break;
                        }
                        case 3: {
                            c12 = 'K';
                            break;
                        }
                        default: {
                            c12 = 'X';
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
        final char[] charArray7 = "\u0005e% =!V#(=<r#9bua497'${k".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0793: {
                if (n26 > 1) {
                    break Label_0793;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = 'U';
                            break;
                        }
                        case 1: {
                            c14 = '\u0004';
                            break;
                        }
                        case 2: {
                            c14 = 'F';
                            break;
                        }
                        case 3: {
                            c14 = 'K';
                            break;
                        }
                        default: {
                            c14 = 'X';
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
        z2[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "\u0017e\"k50w5*?0wf'=;c2#x}".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0909: {
                if (n30 > 1) {
                    break Label_0909;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = 'U';
                            break;
                        }
                        case 1: {
                            c16 = '\u0004';
                            break;
                        }
                        case 2: {
                            c16 = 'F';
                            break;
                        }
                        case 3: {
                            c16 = 'K';
                            break;
                        }
                        default: {
                            c16 = 'X';
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
        z2[n29] = new String(charArray8).intern();
        final int n33 = 8;
        final char[] charArray9 = "uA497'$|k*0e\"k\u001d\u001aBf$;6q4ex".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1025: {
                if (n34 > 1) {
                    break Label_1025;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'U';
                            break;
                        }
                        case 1: {
                            c18 = '\u0004';
                            break;
                        }
                        case 2: {
                            c18 = 'F';
                            break;
                        }
                        case 3: {
                            c18 = 'K';
                            break;
                        }
                        default: {
                            c18 = 'X';
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
        z2[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = ",}?2w\u0018Ii/<uL\u000eq58>58".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1141: {
                if (n38 > 1) {
                    break Label_1141;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'U';
                            break;
                        }
                        case 1: {
                            c20 = '\u0004';
                            break;
                        }
                        case 2: {
                            c20 = 'F';
                            break;
                        }
                        case 3: {
                            c20 = 'K';
                            break;
                        }
                        default: {
                            c20 = 'X';
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
        z2[n37] = new String(charArray10).intern();
        final int n41 = 10;
        final char[] charArray11 = "u$\u00039*:v|k\b4g-.,uh#%?!l|k".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1257: {
                if (n42 > 1) {
                    break Label_1257;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'U';
                            break;
                        }
                        case 1: {
                            c22 = '\u0004';
                            break;
                        }
                        case 2: {
                            c22 = 'F';
                            break;
                        }
                        case 3: {
                            c22 = 'K';
                            break;
                        }
                        default: {
                            c22 = 'X';
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
        z2[n41] = new String(charArray11).intern();
        final int n45 = 11;
        final char[] charArray12 = "\u0007a'/1;cf?18a)>,y$\u0016*!9k'/x9a(,,=$|k".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1373: {
                if (n46 > 1) {
                    break Label_1373;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = 'U';
                            break;
                        }
                        case 1: {
                            c24 = '\u0004';
                            break;
                        }
                        case 2: {
                            c24 = 'F';
                            break;
                        }
                        case 3: {
                            c24 = 'K';
                            break;
                        }
                        default: {
                            c24 = 'X';
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
        z2[n45] = new String(charArray12).intern();
        final int n49 = 12;
        final char[] charArray13 = "y$\u0014.91$*.62p.qx".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1489: {
                if (n50 > 1) {
                    break Label_1489;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = 'U';
                            break;
                        }
                        case 1: {
                            c26 = '\u0004';
                            break;
                        }
                        case 2: {
                            c26 = 'F';
                            break;
                        }
                        case 3: {
                            c26 = 'K';
                            break;
                        }
                        default: {
                            c26 = 'X';
                            break;
                        }
                    }
                    charArray13[length13] = (char)(c25 ^ c26);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 <= n52) {
                z2[n49] = new String(charArray13).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
