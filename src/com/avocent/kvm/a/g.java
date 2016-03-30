package com.avocent.kvm.a;

import java.util.Random;
import java.net.InetAddress;
import com.avocent.kvm.b.d.a;
import javax.net.ssl.SSLSocket;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLContext;
import com.avocent.kvm.b.f.b;
import java.net.SocketTimeoutException;
import java.net.Socket;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class g
{
    protected String a;
    protected int b;
    protected DataInputStream c;
    protected DataOutputStream d;
    protected byte e;
    protected byte f;
    protected int g;
    private static final String[] z;
    
    private g(final String a, final int b) {
        super();
        this.e = 0;
        this.f = 0;
        this.g = 5;
        this.a = a;
        this.b = b;
    }
    
    protected void a(final DataInputStream c, final DataOutputStream d) {
        this.c = c;
        this.d = d;
    }
    
    protected void a(final int g) {
        this.g = g;
    }
    
    void a(final byte b, final byte[] array) throws IOException {
        final int ab = l.Ab;
        if (array.length > 32) {
            throw new IOException(g.z[0]);
        }
        this.d.writeBytes(g.z[1]);
        this.d.writeInt(53);
        this.d.writeShort(256);
        this.d.writeShort(0);
        this.d.writeByte(b);
        this.d.writeByte(this.e);
        this.d.writeByte(this.f);
        this.d.writeByte(0);
        this.d.writeInt(this.g);
        this.d.writeByte(array.length);
        this.d.write(array);
        int i = 32 - array.length;
        while (i > 0) {
            this.d.writeByte(0);
            --i;
            if (ab != 0) {
                break;
            }
        }
        this.d.flush();
    }
    
    Socket a(Socket socket) throws IOException, Exception {
        int ab = l.Ab;
        final byte[] array = new byte[4];
        socket.setSoTimeout(2000);
        int n = 90;
        int read = 0;
        do {
            try {
                read = this.c.read(array);
            }
            catch (SocketTimeoutException ex) {}
            --n;
        } while (read == 0 && n > 0);
        if (n == 0) {
            throw new IOException(g.z[15]);
        }
        socket.setSoTimeout(0);
        if (array[0] != 65 || array[1] != 80 || array[2] != 67 || array[3] != 80) {
            throw new IOException(g.z[22]);
        }
        this.c.readInt();
        if (this.c.readShort() != -32512) {
            throw new IOException(g.z[2]);
        }
        this.c.readShort();
        this.c.readByte();
        this.c.readByte();
        final int int1 = this.c.readInt();
        final short short1 = this.c.readShort();
        final byte[] array2 = new byte[this.c.readByte()];
        this.c.read(array2);
        int i = 32 - array2.length;
        while (i > 0) {
            this.c.readByte();
            --i;
            if (ab != 0) {
                break;
            }
        }
        if (int1 == 0) {
            return null;
        }
        Label_0338: {
            if ((int1 & 0x1) > 0) {
                this.g = 1;
                if (ab == 0) {
                    break Label_0338;
                }
            }
            if ((int1 & 0x4) > 0) {
                this.g = 4;
                if (ab == 0) {
                    break Label_0338;
                }
            }
            throw new IOException(g.z[19] + int1 + g.z[21]);
        }
        if (short1 != 0) {
            final InetAddress inetAddress = socket.getInetAddress();
            b.a().a(g.z[13] + inetAddress + ":" + short1);
            socket = new Socket(inetAddress, short1);
        }
        if (this.g == 4) {
            final SSLContext instance = SSLContext.getInstance(g.z[17]);
            instance.init(null, new TrustManager[] { new h(this) }, null);
            socket = instance.getSocketFactory().createSocket(socket, this.a, this.b, true);
            socket.setTcpNoDelay(true);
            socket.setReceiveBufferSize(32768);
            ((SSLSocket)socket).setEnabledCipherSuites(new String[] { g.z[18], g.z[3], g.z[11], g.z[5], g.z[8], g.z[6], g.z[9], g.z[7], g.z[12], g.z[4], g.z[10], g.z[16], g.z[14], g.z[20] });
            ((SSLSocket)socket).startHandshake();
        }
        final Socket socket2 = socket;
        if (a.c != 0) {
            l.Ab = ++ab;
        }
        return socket2;
    }
    
    public static Socket a(final String s, final int n, final int n2) throws Exception {
        final Socket socket = new Socket(s, n);
        socket.setTcpNoDelay(true);
        socket.setReceiveBufferSize(32768);
        return a(socket, n2);
    }
    
    static Socket a(final Socket socket, final int n) throws IOException, Exception {
        final byte[] array = new byte[32];
        new Random().nextBytes(array);
        final com.avocent.kvm.b.b.a a = new com.avocent.kvm.b.b.a(socket.getInputStream(), socket);
        final com.avocent.kvm.b.b.b b = new com.avocent.kvm.b.b.b(socket.getOutputStream());
        final g g = new g(socket.getRemoteSocketAddress().toString(), socket.getLocalPort());
        g.a(a, b);
        g.a(n);
        g.a(3, array);
        return g.a(socket);
    }
    
    public static Socket b(final String s, final int n, final int n2) throws Exception {
        final byte[] array = new byte[32];
        new Random().nextBytes(array);
        final Socket socket = new Socket(s, n);
        socket.setTcpNoDelay(true);
        socket.setReceiveBufferSize(32768);
        final com.avocent.kvm.b.b.a a = new com.avocent.kvm.b.b.a(socket.getInputStream(), socket);
        final com.avocent.kvm.b.b.b b = new com.avocent.kvm.b.b.b(socket.getOutputStream());
        final g g = new g(s, n);
        g.a(a, b);
        g.a(n2);
        g.a(4, array);
        return g.a(socket);
    }
    
    static {
        final String[] z2 = new String[23];
        final int n = 0;
        final char[] charArray = "?\u0004\u000eR\u0013\u0000E\u000eC\u0011\u000f\u0000\u0012\u0016\b\u0002\n@Z\u0013\u0003\u0002".toCharArray();
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
                            c2 = 'm';
                            break;
                        }
                        case 1: {
                            c2 = 'e';
                            break;
                        }
                        case 2: {
                            c2 = '`';
                            break;
                        }
                        case 3: {
                            c2 = '6';
                            break;
                        }
                        default: {
                            c2 = '|';
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
        final char[] charArray2 = ",5#f".toCharArray();
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
                            c4 = 'm';
                            break;
                        }
                        case 1: {
                            c4 = 'e';
                            break;
                        }
                        case 2: {
                            c4 = '`';
                            break;
                        }
                        case 3: {
                            c4 = '6';
                            break;
                        }
                        default: {
                            c4 = '|';
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
        final char[] charArray3 = "$\u000b\u0003Y\u000e\u001f\u0000\u0003B\\\u0000\u0000\u0013E\u001d\n\u0000@B\u0005\u001d\u0000".toCharArray();
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
                            c6 = 'm';
                            break;
                        }
                        case 1: {
                            c6 = 'e';
                            break;
                        }
                        case 2: {
                            c6 = '`';
                            break;
                        }
                        case 3: {
                            c6 = '6';
                            break;
                        }
                        default: {
                            c6 = '|';
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
        final char[] charArray4 = ">6,i8%:\u0001X\u0013\u0003:7\u007f(%:2uH2TR\u000e# !U".toCharArray();
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
                            c8 = 'm';
                            break;
                        }
                        case 1: {
                            c8 = 'e';
                            break;
                        }
                        case 2: {
                            c8 = '`';
                            break;
                        }
                        case 3: {
                            c8 = '6';
                            break;
                        }
                        default: {
                            c8 = '|';
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
        final char[] charArray5 = ">6,i.>$?a59-?r9>:#t?26(w".toCharArray();
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
                            c10 = 'm';
                            break;
                        }
                        case 1: {
                            c10 = 'e';
                            break;
                        }
                        case 2: {
                            c10 = '`';
                            break;
                        }
                        case 3: {
                            c10 = '6';
                            break;
                        }
                        default: {
                            c10 = '|';
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
        final char[] charArray6 = ">6,i8%:\u0001X\u0013\u0003:%n,\"74i+$1(i..Q?\u0002L2($\u0003".toCharArray();
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
                            c12 = 'm';
                            break;
                        }
                        case 1: {
                            c12 = 'e';
                            break;
                        }
                        case 2: {
                            c12 = '`';
                            break;
                        }
                        case 3: {
                            c12 = '6';
                            break;
                        }
                        default: {
                            c12 = '|';
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
        final char[] charArray7 = ">6,i8% ?r/>:7\u007f(%:Sr9>:%r92&\"u#>-!".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0798: {
                if (n26 > 1) {
                    break Label_0798;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = 'm';
                            break;
                        }
                        case 1: {
                            c14 = 'e';
                            break;
                        }
                        case 2: {
                            c14 = '`';
                            break;
                        }
                        case 3: {
                            c14 = '6';
                            break;
                        }
                        default: {
                            c14 = '|';
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
        final char[] charArray8 = ">6,i.>$?a59-?d?Y:Q\u0004D2($\u0003".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0918: {
                if (n30 > 1) {
                    break Label_0918;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = 'm';
                            break;
                        }
                        case 1: {
                            c16 = 'e';
                            break;
                        }
                        case 2: {
                            c16 = '`';
                            break;
                        }
                        case 3: {
                            c16 = '6';
                            break;
                        }
                        default: {
                            c16 = '|';
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
        final char[] charArray9 = ">6,i8% ?r/>:7\u007f(%:$s/2&\"u#>-!".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1038: {
                if (n34 > 1) {
                    break Label_1038;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'm';
                            break;
                        }
                        case 1: {
                            c18 = 'e';
                            break;
                        }
                        case 2: {
                            c18 = '`';
                            break;
                        }
                        case 3: {
                            c18 = '6';
                            break;
                        }
                        default: {
                            c18 = '|';
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
        final char[] charArray10 = ">6,i8% ?r/>:%n,\"74i+$1(i8(6T\u0006#.'#i/%$".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1158: {
                if (n38 > 1) {
                    break Label_1158;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'm';
                            break;
                        }
                        case 1: {
                            c20 = 'e';
                            break;
                        }
                        case 2: {
                            c20 = '`';
                            break;
                        }
                        case 3: {
                            c20 = '6';
                            break;
                        }
                        default: {
                            c20 = '|';
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
        final char[] charArray11 = ">6,i.>$?a59-?\u00058(6?s8(:#t?26(w".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1278: {
                if (n42 > 1) {
                    break Label_1278;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'm';
                            break;
                        }
                        case 1: {
                            c22 = 'e';
                            break;
                        }
                        case 2: {
                            c22 = '`';
                            break;
                        }
                        case 3: {
                            c22 = '6';
                            break;
                        }
                        default: {
                            c22 = '|';
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
        final char[] charArray12 = ">6,i8%:\u0001X\u0013\u0003:%n,\"74i+$1(i8(6T\u0006#.'#i/%$".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1398: {
                if (n46 > 1) {
                    break Label_1398;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = 'm';
                            break;
                        }
                        case 1: {
                            c24 = 'e';
                            break;
                        }
                        case 2: {
                            c24 = '`';
                            break;
                        }
                        case 3: {
                            c24 = '6';
                            break;
                        }
                        default: {
                            c24 = '|';
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
        final char[] charArray13 = ">6,i.>$?a59-?d?Y:Q\u0004D26(w".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1518: {
                if (n50 > 1) {
                    break Label_1518;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = 'm';
                            break;
                        }
                        case 1: {
                            c26 = 'e';
                            break;
                        }
                        case 2: {
                            c26 = '`';
                            break;
                        }
                        case 3: {
                            c26 = '6';
                            break;
                        }
                        default: {
                            c26 = '|';
                            break;
                        }
                    }
                    charArray13[length13] = (char)(c25 ^ c26);
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
        final char[] charArray14 = "M&\u000fX\u0012\b\u0006\u0014_\u0012\nE\u0014YFM".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1638: {
                if (n54 > 1) {
                    break Label_1638;
                }
                length14 = (n55 = n56);
                do {
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = 'm';
                            break;
                        }
                        case 1: {
                            c28 = 'e';
                            break;
                        }
                        case 2: {
                            c28 = '`';
                            break;
                        }
                        case 3: {
                            c28 = '6';
                            break;
                        }
                        default: {
                            c28 = '|';
                            break;
                        }
                    }
                    charArray14[length14] = (char)(c27 ^ c28);
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
        final char[] charArray15 = ">6,i.>$?a59-?x)!)?e4,".toCharArray();
        int length15;
        int n59;
        final int n58 = n59 = (length15 = charArray15.length);
        int n60 = 0;
        while (true) {
            Label_1758: {
                if (n58 > 1) {
                    break Label_1758;
                }
                length15 = (n59 = n60);
                do {
                    final char c29 = charArray15[n59];
                    char c30 = '\0';
                    switch (n60 % 5) {
                        case 0: {
                            c30 = 'm';
                            break;
                        }
                        case 1: {
                            c30 = 'e';
                            break;
                        }
                        case 2: {
                            c30 = '`';
                            break;
                        }
                        case 3: {
                            c30 = '6';
                            break;
                        }
                        default: {
                            c30 = '|';
                            break;
                        }
                    }
                    charArray15[length15] = (char)(c29 ^ c30);
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
        final char[] charArray16 = "%\u0000\u0001R\u0019\u001fE\u0012S\u001d\tE\u0014_\u0011\b\u0001@Y\t\u0019".toCharArray();
        int length16;
        int n63;
        final int n62 = n63 = (length16 = charArray16.length);
        int n64 = 0;
        while (true) {
            Label_1878: {
                if (n62 > 1) {
                    break Label_1878;
                }
                length16 = (n63 = n64);
                do {
                    final char c31 = charArray16[n63];
                    char c32 = '\0';
                    switch (n64 % 5) {
                        case 0: {
                            c32 = 'm';
                            break;
                        }
                        case 1: {
                            c32 = 'e';
                            break;
                        }
                        case 2: {
                            c32 = '`';
                            break;
                        }
                        case 3: {
                            c32 = '6';
                            break;
                        }
                        default: {
                            c32 = '|';
                            break;
                        }
                    }
                    charArray16[length16] = (char)(c31 ^ c32);
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
        final char[] charArray17 = ">6,i.>$?a59-?x)!)?{8X".toCharArray();
        int length17;
        int n67;
        final int n66 = n67 = (length17 = charArray17.length);
        int n68 = 0;
        while (true) {
            Label_1998: {
                if (n66 > 1) {
                    break Label_1998;
                }
                length17 = (n67 = n68);
                do {
                    final char c33 = charArray17[n67];
                    char c34 = '\0';
                    switch (n68 % 5) {
                        case 0: {
                            c34 = 'm';
                            break;
                        }
                        case 1: {
                            c34 = 'e';
                            break;
                        }
                        case 2: {
                            c34 = '`';
                            break;
                        }
                        case 3: {
                            c34 = '6';
                            break;
                        }
                        default: {
                            c34 = '|';
                            break;
                        }
                    }
                    charArray17[length17] = (char)(c33 ^ c34);
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
        final char[] charArray18 = ">6,".toCharArray();
        int length18;
        int n71;
        final int n70 = n71 = (length18 = charArray18.length);
        int n72 = 0;
        while (true) {
            Label_2118: {
                if (n70 > 1) {
                    break Label_2118;
                }
                length18 = (n71 = n72);
                do {
                    final char c35 = charArray18[n71];
                    char c36 = '\0';
                    switch (n72 % 5) {
                        case 0: {
                            c36 = 'm';
                            break;
                        }
                        case 1: {
                            c36 = 'e';
                            break;
                        }
                        case 2: {
                            c36 = '`';
                            break;
                        }
                        case 3: {
                            c36 = '6';
                            break;
                        }
                        default: {
                            c36 = '|';
                            break;
                        }
                    }
                    charArray18[length18] = (char)(c35 ^ c36);
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
        final char[] charArray19 = ">6,i8%:\u0001X\u0013\u0003:7\u007f(%:Sr9>:%r92&\"u#>-!".toCharArray();
        int length19;
        int n75;
        final int n74 = n75 = (length19 = charArray19.length);
        int n76 = 0;
        while (true) {
            Label_2238: {
                if (n74 > 1) {
                    break Label_2238;
                }
                length19 = (n75 = n76);
                do {
                    final char c37 = charArray19[n75];
                    char c38 = '\0';
                    switch (n76 % 5) {
                        case 0: {
                            c38 = 'm';
                            break;
                        }
                        case 1: {
                            c38 = 'e';
                            break;
                        }
                        case 2: {
                            c38 = '`';
                            break;
                        }
                        case 3: {
                            c38 = '6';
                            break;
                        }
                        default: {
                            c38 = '|';
                            break;
                        }
                    }
                    charArray19[length19] = (char)(c37 ^ c38);
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
        final char[] charArray20 = "8\u000b\u0013C\f\u001d\n\u0012B\u0019\tE\u0003Y\u0012\u0003\u0000\u0003B\u0015\u0002\u000b@B\u0005\u001d\u0000@D\u0019\u001c\u0010\u0005E\b\b\u0001@\u001e\u001f\f\u0015\u0001T\u0015\u0001\f\u0014_\u0019\u001eX".toCharArray();
        int length20;
        int n79;
        final int n78 = n79 = (length20 = charArray20.length);
        int n80 = 0;
        while (true) {
            Label_2358: {
                if (n78 > 1) {
                    break Label_2358;
                }
                length20 = (n79 = n80);
                do {
                    final char c39 = charArray20[n79];
                    char c40 = '\0';
                    switch (n80 % 5) {
                        case 0: {
                            c40 = 'm';
                            break;
                        }
                        case 1: {
                            c40 = 'e';
                            break;
                        }
                        case 2: {
                            c40 = '`';
                            break;
                        }
                        case 3: {
                            c40 = '6';
                            break;
                        }
                        default: {
                            c40 = '|';
                            break;
                        }
                    }
                    charArray20[length20] = (char)(c39 ^ c40);
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
        final char[] charArray21 = ">6,i.>$?s$=*2b#:,4~#?&TiH]:-rI".toCharArray();
        int length21;
        int n83;
        final int n82 = n83 = (length21 = charArray21.length);
        int n84 = 0;
        while (true) {
            Label_2478: {
                if (n82 > 1) {
                    break Label_2478;
                }
                length21 = (n83 = n84);
                do {
                    final char c41 = charArray21[n83];
                    char c42 = '\0';
                    switch (n84 % 5) {
                        case 0: {
                            c42 = 'm';
                            break;
                        }
                        case 1: {
                            c42 = 'e';
                            break;
                        }
                        case 2: {
                            c42 = '`';
                            break;
                        }
                        case 3: {
                            c42 = '6';
                            break;
                        }
                        default: {
                            c42 = '|';
                            break;
                        }
                    }
                    charArray21[length21] = (char)(c41 ^ c42);
                    ++n84;
                } while (n82 == 0);
            }
            if (n82 > n84) {
                continue;
            }
            break;
        }
        z2[n81] = new String(charArray21).intern();
        final int n85 = 21;
        final char[] charArray22 = "DK".toCharArray();
        int length22;
        int n87;
        final int n86 = n87 = (length22 = charArray22.length);
        int n88 = 0;
        while (true) {
            Label_2598: {
                if (n86 > 1) {
                    break Label_2598;
                }
                length22 = (n87 = n88);
                do {
                    final char c43 = charArray22[n87];
                    char c44 = '\0';
                    switch (n88 % 5) {
                        case 0: {
                            c44 = 'm';
                            break;
                        }
                        case 1: {
                            c44 = 'e';
                            break;
                        }
                        case 2: {
                            c44 = '`';
                            break;
                        }
                        case 3: {
                            c44 = '6';
                            break;
                        }
                        default: {
                            c44 = '|';
                            break;
                        }
                    }
                    charArray22[length22] = (char)(c43 ^ c44);
                    ++n88;
                } while (n86 == 0);
            }
            if (n86 > n88) {
                continue;
            }
            break;
        }
        z2[n85] = new String(charArray22).intern();
        final int n89 = 22;
        final char[] charArray23 = "%\u0000\u0001R\u0019\u001fE\tX\u001f\u0002\u0017\u0012S\u001f\u0019".toCharArray();
        int length23;
        int n91;
        final int n90 = n91 = (length23 = charArray23.length);
        int n92 = 0;
        while (true) {
            Label_2718: {
                if (n90 > 1) {
                    break Label_2718;
                }
                length23 = (n91 = n92);
                do {
                    final char c45 = charArray23[n91];
                    char c46 = '\0';
                    switch (n92 % 5) {
                        case 0: {
                            c46 = 'm';
                            break;
                        }
                        case 1: {
                            c46 = 'e';
                            break;
                        }
                        case 2: {
                            c46 = '`';
                            break;
                        }
                        case 3: {
                            c46 = '6';
                            break;
                        }
                        default: {
                            c46 = '|';
                            break;
                        }
                    }
                    charArray23[length23] = (char)(c45 ^ c46);
                    ++n92;
                } while (n90 == 0);
            }
            if (n90 <= n92) {
                z2[n89] = new String(charArray23).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
