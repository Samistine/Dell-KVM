package com.avocent.a.c;

import java.net.Socket;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;

class f extends Thread
{
    final d a;
    private static final String[] z;
    
    f(final d a) {
        this.a = a;
        super();
    }
    
    public void run() {
        final int b = d.b;
        try {
            final ServerSocket serverSocket = new ServerSocket(8192);
            while (true) {
                final Socket accept = serverSocket.accept();
                try {
                    final DataInputStream dataInputStream = new DataInputStream(accept.getInputStream());
                    final DataOutputStream dataOutputStream = new DataOutputStream(accept.getOutputStream());
                    dataOutputStream.writeUTF(f.z[1]);
                    final String utf = dataInputStream.readUTF();
                    if (!utf.equalsIgnoreCase(f.z[0])) {
                        throw new IOException(f.z[4] + utf);
                    }
                    final String utf2 = dataInputStream.readUTF();
                    final a a = d.a(utf2);
                    Label_0214: {
                        if (a == null) {
                            System.out.println(f.z[6] + utf2);
                            dataOutputStream.writeUTF(f.z[3]);
                            if (b == 0) {
                                break Label_0214;
                            }
                        }
                        System.out.println(f.z[5] + utf2);
                        a.a();
                        dataOutputStream.writeUTF(f.z[7]);
                    }
                    accept.close();
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch (Exception ex2) {
            System.out.println(f.z[2]);
            ex2.printStackTrace();
        }
    }
    
    static {
        final String[] z2 = new String[8];
        final int n = 0;
        final char[] charArray = "G^(\u000e%BY?);t".toCharArray();
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
                            c2 = '\u0004';
                            break;
                        }
                        case 1: {
                            c2 = '6';
                            break;
                        }
                        case 2: {
                            c2 = 'M';
                            break;
                        }
                        case 3: {
                            c2 = 'm';
                            break;
                        }
                        default: {
                            c2 = 'N';
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
        final char[] charArray2 = "E`\u000e9n)\u0016\t\u0018>EF=.&aU&".toCharArray();
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
                            c4 = '\u0004';
                            break;
                        }
                        case 1: {
                            c4 = '6';
                            break;
                        }
                        case 2: {
                            c4 = 'M';
                            break;
                        }
                        case 3: {
                            c4 = 'm';
                            break;
                        }
                        default: {
                            c4 = 'N';
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
        final char[] charArray3 = "$p,\u0004\"aRm\u0019!$E9\f<p\u0016)\u0018>$W=\u001dnwS?\u001b+v\u0018".toCharArray();
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
                            c6 = '\u0004';
                            break;
                        }
                        case 1: {
                            c6 = '6';
                            break;
                        }
                        case 2: {
                            c6 = 'M';
                            break;
                        }
                        case 3: {
                            c6 = 'm';
                            break;
                        }
                        default: {
                            c6 = 'N';
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
        final char[] charArray4 = "@C=#!pp\"\u0018 `".toCharArray();
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
                            c8 = '\u0004';
                            break;
                        }
                        case 1: {
                            c8 = '6';
                            break;
                        }
                        case 2: {
                            c8 = 'M';
                            break;
                        }
                        case 3: {
                            c8 = 'm';
                            break;
                        }
                        default: {
                            c8 = 'N';
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
        final char[] charArray5 = "$c#\u001f+gY*\u0003'~S)M-k[ \f `\fm".toCharArray();
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
                            c10 = '\u0004';
                            break;
                        }
                        case 1: {
                            c10 = '6';
                            break;
                        }
                        case 2: {
                            c10 = 'M';
                            break;
                        }
                        case 3: {
                            c10 = 'm';
                            break;
                        }
                        default: {
                            c10 = 'N';
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
        final char[] charArray6 = "$p\"\u0018 `\u0016,\u001d>$P\"\u001fnoS4Wn".toCharArray();
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
                            c12 = '\u0004';
                            break;
                        }
                        case 1: {
                            c12 = '6';
                            break;
                        }
                        case 2: {
                            c12 = 'M';
                            break;
                        }
                        case 3: {
                            c12 = 'm';
                            break;
                        }
                        default: {
                            c12 = 'N';
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
        final char[] charArray7 = "$r$\tnjY9M(mX)M\u000ftFm\u000b!v\u0016&\b7>\u0016".toCharArray();
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
                            c14 = '\u0004';
                            break;
                        }
                        case 1: {
                            c14 = '6';
                            break;
                        }
                        case 2: {
                            c14 = 'M';
                            break;
                        }
                        case 3: {
                            c14 = 'm';
                            break;
                        }
                        default: {
                            c14 = 'N';
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
        final char[] charArray8 = "@C=+!qX)".toCharArray();
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
                            c16 = '\u0004';
                            break;
                        }
                        case 1: {
                            c16 = '6';
                            break;
                        }
                        case 2: {
                            c16 = 'M';
                            break;
                        }
                        case 3: {
                            c16 = 'm';
                            break;
                        }
                        default: {
                            c16 = 'N';
                            break;
                        }
                    }
                    charArray8[length8] = (char)(c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 <= n32) {
                z2[n29] = new String(charArray8).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
