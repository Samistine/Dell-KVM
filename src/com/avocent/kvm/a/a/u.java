// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;

public class u extends h {

    protected String j;
    protected String k;
    protected String l;
    protected byte[] m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected boolean r;
    protected int s;
    private static final String[] z = {"RIP ID contains non-hex characters", "Login Request", " Client random in request: ", "UTF-8", "UserLoginRequest setShareMode() ", "Unexpected share mode value: "};

    public u() {
        super(256);
        this.j = "";
        this.k = "";
        this.m = new byte[8];
        this.r = false;
    }

    public u(final boolean r) {
        super(r ? 258 : 256);
        this.j = "";
        this.k = "";
        this.m = new byte[8];
        this.r = false;
        this.r = r;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.a(array);
        final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(array2));
        final byte[] array3 = new byte[96];
        final byte byte1 = dataInputStream.readByte();
        dataInputStream.readFully(array3);
        this.j = new String(array3, 0, byte1, u.z[3]);
        final byte byte2 = dataInputStream.readByte();
        dataInputStream.readFully(array3);
        this.k = new String(array3, 0, byte2, u.z[3]);
        dataInputStream.readFully(this.m = new byte[8]);
        this.n = dataInputStream.readByte();
        this.o = dataInputStream.readByte();
        this.q = dataInputStream.readInt();
        if (dataInputStream.available() > 0) {
            this.r = true;
            this.s = dataInputStream.readByte();
            if (b.h == 0) {
                break;
            }
        }
        this.r = false;
    }

    public void a(final String j, final String k) {
        this.j = j;
        this.k = k;
    }

    public void c(final int o) {
        this.o = o;
    }

    public void d(final int n) {
        this.n = n;
    }

    public void a(final String l) {
        final int h = b.h;
        this.l = l;
        this.n = 0;
        if (this.l.length() > 0) {
            if (this.l.indexOf(45) >= 0) {
                final int index = this.l.indexOf(45);
                this.l = this.l.substring(0, index) + this.l.substring(index + 1);
            }
            final byte[] bytes = this.l.getBytes();
            int i = 0;
            while (i < bytes.length / 2) {
                byte b = 0;
                Label_0231:
                {
                    if (bytes[i * 2] >= 48 && bytes[i * 2] <= 57) {
                        b = (byte) (bytes[i * 2] - 48);
                        if (h == 0) {
                            break Label_0231;
                        }
                    }
                    if (bytes[i * 2] >= 65 && bytes[i * 2] <= 70) {
                        b = (byte) (bytes[i * 2] - 65 + 10);
                        if (h == 0) {
                            break Label_0231;
                        }
                    }
                    if (bytes[i * 2] >= 97 && bytes[i * 2] <= 102) {
                        b = (byte) (bytes[i * 2] - 97 + 10);
                        if (h == 0) {
                            break Label_0231;
                        }
                    }
                    throw new RuntimeException(u.z[0]);
                }
                byte b2 = 0;
                Label_0376:
                {
                    if (bytes[i * 2 + 1] >= 48 && bytes[i * 2 + 1] <= 57) {
                        b2 = (byte) (bytes[i * 2 + 1] - 48);
                        if (h == 0) {
                            break Label_0376;
                        }
                    }
                    if (bytes[i * 2 + 1] >= 65 && bytes[i * 2 + 1] <= 70) {
                        b2 = (byte) (bytes[i * 2 + 1] - 65 + 10);
                        if (h == 0) {
                            break Label_0376;
                        }
                    }
                    if (bytes[i * 2 + 1] >= 97 && bytes[i * 2 + 1] <= 102) {
                        b2 = (byte) (bytes[i * 2 + 1] - 97 + 10);
                        if (h == 0) {
                            break Label_0376;
                        }
                    }
                    throw new RuntimeException(u.z[0]);
                }
                this.m[i] = (byte) (b << 4 | b2);
                ++i;
                if (h != 0) {
                    break;
                }
            }
        }
    }

    public void e(final int p) {
        System.out.println(u.z[4] + Integer.toHexString(p) + "\n");
        switch (p) {
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
            case 7: {
                this.p = p;
                if (b.h != 0) {
                    break;
                }
                break;
            }
        }
        throw new RuntimeException(u.z[5] + p);
    }

    @Override
    public int g() {
        return this.h();
    }

    public int h() {
        int n = 202 + this.m.length + 1 + 1 + 4;
        if (this.r) {
            ++n;
        }
        return n;
    }

    @Override
    public byte[] b() {
        final int h = b.h;
        final byte[] array = new byte[this.h() - 8];
        final int b = com.avocent.kvm.b.d.a.b(this.q, array, com.avocent.kvm.b.d.a.c(this.o, array, com.avocent.kvm.b.d.a.c(this.n, array, com.avocent.kvm.b.d.a.b(this.m, array, com.avocent.kvm.b.d.a.a(this.k, array, com.avocent.kvm.b.d.a.c((this.k == null) ? 0 : this.k.length(), array, com.avocent.kvm.b.d.a.a(this.j, array, com.avocent.kvm.b.d.a.c((this.j == null) ? 0 : this.j.length(), array, 0), 96)), 96)))));
        if (this.r) {
            com.avocent.kvm.b.d.a.c(this.p, array, b);
        }
        com.avocent.kvm.b.f.b.a().a(u.z[2] + this.q);
        final byte[] array2 = array;
        if (h != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
        return array2;
    }

    @Override
    public String e() {
        return u.z[1];
    }

    public void f(final int q) {
        this.q = q;
    }

    static {
        final String[] z2 = new String[6];
        final int n = 0;
        final char[] charArray = "!cc\u007fB7\nP0e\u0007KZ1xSD\\1&\u001bOK\u007fh\u001bKA>h\u0007OA,".toCharArray();
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
                            c2 = 's';
                            break;
                        }
                        case 1: {
                            c2 = '*';
                            break;
                        }
                        case 2: {
                            c2 = '3';
                            break;
                        }
                        case 3: {
                            c2 = '_';
                            break;
                        }
                        default: {
                            c2 = '\u000b';
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
        final char[] charArray2 = "?ET6eSxV.~\u0016YG".toCharArray();
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
                            c4 = 's';
                            break;
                        }
                        case 1: {
                            c4 = '*';
                            break;
                        }
                        case 2: {
                            c4 = '3';
                            break;
                        }
                        case 3: {
                            c4 = '_';
                            break;
                        }
                        default: {
                            c4 = '\u000b';
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
        final char[] charArray3 = "Si_6n\u001d^\u0013-j\u001dN\\2+\u001aD\u0013-n\u0002_V,\u007fI\n".toCharArray();
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
                            c6 = 's';
                            break;
                        }
                        case 1: {
                            c6 = '*';
                            break;
                        }
                        case 2: {
                            c6 = '3';
                            break;
                        }
                        case 3: {
                            c6 = '_';
                            break;
                        }
                        default: {
                            c6 = '\u000b';
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
        final char[] charArray4 = "&~ur3".toCharArray();
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
                            c8 = 's';
                            break;
                        }
                        case 1: {
                            c8 = '*';
                            break;
                        }
                        case 2: {
                            c8 = '3';
                            break;
                        }
                        case 3: {
                            c8 = '_';
                            break;
                        }
                        default: {
                            c8 = '\u000b';
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
        final char[] charArray5 = "&YV-G\u001cMZ1Y\u0016[F:x\u0007\n@:\u007f BR-n>EW:#Z\n".toCharArray();
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
                            c10 = 's';
                            break;
                        }
                        case 1: {
                            c10 = '*';
                            break;
                        }
                        case 2: {
                            c10 = '3';
                            break;
                        }
                        case 3: {
                            c10 = '_';
                            break;
                        }
                        default: {
                            c10 = '\u000b';
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
        final char[] charArray6 = "&DV'{\u0016IG:oSY[>y\u0016\n^0o\u0016\nE>g\u0006O\t\u007f".toCharArray();
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
                            c12 = 's';
                            break;
                        }
                        case 1: {
                            c12 = '*';
                            break;
                        }
                        case 2: {
                            c12 = '3';
                            break;
                        }
                        case 3: {
                            c12 = '_';
                            break;
                        }
                        default: {
                            c12 = '\u000b';
                            break;
                        }
                    }
                    charArray6[length6] = (char) (c11 ^ c12);
                    ++n24;
                } while (n22 == 0);
            }
            if (n22 <= n24) {
                z2[n21] = new String(charArray6).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
