// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.c;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import com.avocent.kvm.b.d.a;
import java.io.IOException;
import com.avocent.kvm.b.f.b;
import java.net.Socket;

public class c {

    private static final String[] z;

    public Socket a() {
        try {
            return new Socket(c.z[0], 8192);
        } catch (IOException ex) {
            b.a().a(c.z[1]);
            return null;
        }
    }

    public void b() throws IOException {
        new d().a();
    }

    public boolean a(final String s, final com.avocent.a.c.b b) throws IOException {
        final int b2 = d.b;
        final Socket a = this.a();
        boolean equalsIgnoreCase = false;
        Label_0155:
        {
            if (a == null) {
                this.b();
                equalsIgnoreCase = false;
                if (b2 == 0) {
                    break Label_0155;
                }
                int c = com.avocent.kvm.b.d.a.c;
                com.avocent.kvm.b.d.a.c = ++c;
            }
            final DataInputStream dataInputStream = new DataInputStream(a.getInputStream());
            final DataOutputStream dataOutputStream = new DataOutputStream(a.getOutputStream());
            final String utf = dataInputStream.readUTF();
            if (!utf.equalsIgnoreCase(c.z[5])) {
                throw new IOException(c.z[2] + utf);
            }
            dataOutputStream.writeUTF(c.z[4]);
            dataOutputStream.writeUTF(s);
            equalsIgnoreCase = dataInputStream.readUTF().equalsIgnoreCase(c.z[3]);
        }
        if (!equalsIgnoreCase) {
            d.a(s, b);
        }
        return equalsIgnoreCase;
    }

    static {
        final String[] z2 = new String[6];
        final int n = 0;
        final char[] charArray = "\u0018rLw\u001a\u001cr\\b".toCharArray();
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
                            c2 = 't';
                            break;
                        }
                        case 1: {
                            c2 = '\u001d';
                            break;
                        }
                        case 2: {
                            c2 = '/';
                            break;
                        }
                        case 3: {
                            c2 = '\u0016';
                            break;
                        }
                        default: {
                            c2 = 'v';
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
        final char[] charArray2 = "TXW\u007f\u0005\u0000tAqV\u0002tJa\u0013\u0006=Ay\u0002T{@c\u0018\u00103".toCharArray();
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
                            c4 = 't';
                            break;
                        }
                        case 1: {
                            c4 = '\u001d';
                            break;
                        }
                        case 2: {
                            c4 = '/';
                            break;
                        }
                        case 3: {
                            c4 = '\u0016';
                            break;
                        }
                        default: {
                            c4 = 'v';
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
        final char[] charArray3 = "!s]s\u0015\u001bzA\u007f\f\u0011y\u000f{\u0017\u0013tL6\u0005\u0000oFx\u0011T{]y\u001bTsJaV\u0017qFs\u0018\u0000=Ly\u0018\u001axLb\u001f\u001bs\u00156".toCharArray();
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
                            c6 = 't';
                            break;
                        }
                        case 1: {
                            c6 = '\u001d';
                            break;
                        }
                        case 2: {
                            c6 = '/';
                            break;
                        }
                        case 3: {
                            c6 = '\u0016';
                            break;
                        }
                        default: {
                            c6 = 'v';
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
        final char[] charArray4 = "0h_P\u0019\u0001sK".toCharArray();
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
                            c8 = 't';
                            break;
                        }
                        case 1: {
                            c8 = '\u001d';
                            break;
                        }
                        case 2: {
                            c8 = '/';
                            break;
                        }
                        case 3: {
                            c8 = '\u0016';
                            break;
                        }
                        default: {
                            c8 = 'v';
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
        final char[] charArray5 = "7uJu\u001d2r]R\u0003\u0004".toCharArray();
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
                            c10 = 't';
                            break;
                        }
                        case 1: {
                            c10 = '\u001d';
                            break;
                        }
                        case 2: {
                            c10 = '/';
                            break;
                        }
                        case 3: {
                            c10 = '\u0016';
                            break;
                        }
                        default: {
                            c10 = 'v';
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
        final char[] charArray6 = "5KlBVY=kc\u00065m_U\u001e\u0011~D".toCharArray();
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
                            c12 = 't';
                            break;
                        }
                        case 1: {
                            c12 = '\u001d';
                            break;
                        }
                        case 2: {
                            c12 = '/';
                            break;
                        }
                        case 3: {
                            c12 = '\u0016';
                            break;
                        }
                        default: {
                            c12 = 'v';
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