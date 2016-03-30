// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import java.security.PublicKey;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateException;
import javax.net.ssl.X509TrustManager;

class b implements X509TrustManager {

    final l a;
    private static final String[] z;

    b(final l a) throws CertificateException {
        this.a = a;
    }

    @Override
    public void checkClientTrusted(final X509Certificate[] array, final String s) throws CertificateException {
        this.a.i().a(b.z[0]);
    }

    @Override
    public void checkServerTrusted(final X509Certificate[] array, final String s) throws CertificateException {
        final int ab = l.Ab;
        this.a.i().a(b.z[2]);
        boolean b = false;
        if (this.a.rb) {
            if (this.a.nb != null) {
                int i = 0;
                while (i < array.length) {
                    final PublicKey publicKey = array[i].getPublicKey();
                    if (publicKey instanceof RSAPublicKey && new BigInteger(this.a.nb.trim(), 16).equals(((RSAPublicKey) publicKey).getModulus())) {
                        if (this.a.ob == null) {
                            b = false;
                            if (ab == 0) {
                                break;
                            }
                        }
                        if (new BigInteger(this.a.ob.trim(), 16).equals(((RSAPublicKey) publicKey).getPublicExponent())) {
                            b = true;
                            if (ab == 0) {
                                break;
                            }
                        }
                    }
                    ++i;
                    if (ab != 0) {
                        break;
                    }
                }
            }
            if (!b) {
                throw new CertificateException(com.avocent.kvm.a.b.z[1]);
            }
        }
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        this.a.i().a(b.z[3]);
        return new X509Certificate[0];
    }

    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "`O|vd`\u007fG_=+_CS;.h{H+3hJ^vi<L[2,yK\u0014".toCharArray();
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
                            c2 = '@';
                            break;
                        }
                        case 1: {
                            c2 = '\u001c';
                            break;
                        }
                        case 2: {
                            c2 = '/';
                            break;
                        }
                        case 3: {
                            c2 = ':';
                            break;
                        }
                        default: {
                            c2 = '^';
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
        final char[] charArray2 = "\u0006}FV;$<[U~!i[R;.hFY?4y\u000fI;2jJH~#sAT;#hFU0n".toCharArray();
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
                            c4 = '@';
                            break;
                        }
                        case 1: {
                            c4 = '\u001c';
                            break;
                        }
                        case 2: {
                            c4 = '/';
                            break;
                        }
                        case 3: {
                            c4 = ':';
                            break;
                        }
                        default: {
                            c4 = '^';
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
        final char[] charArray3 = "`O|vd`\u007fG_=+OJH(%n{H+3hJ^vi<L[2,yK\u0014".toCharArray();
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
                            c6 = '@';
                            break;
                        }
                        case 1: {
                            c6 = '\u001c';
                            break;
                        }
                        case 2: {
                            c6 = '/';
                            break;
                        }
                        case 3: {
                            c6 = ':';
                            break;
                        }
                        default: {
                            c6 = '^';
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
        final char[] charArray4 = "`O|vd`{JN\u001f#\u007fJJ*%xfI-5y]Ivi<L[2,yK\u0014".toCharArray();
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
                            c8 = '@';
                            break;
                        }
                        case 1: {
                            c8 = '\u001c';
                            break;
                        }
                        case 2: {
                            c8 = '/';
                            break;
                        }
                        case 3: {
                            c8 = ':';
                            break;
                        }
                        default: {
                            c8 = '^';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 <= n16) {
                z2[n13] = new String(charArray4).intern();
                z = z2;
                break;
            }
        }
    }
}
