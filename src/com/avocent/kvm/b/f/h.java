package com.avocent.kvm.b.f;

import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import javax.net.ssl.SSLSession;
import java.util.List;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.KeyManagerFactory;
import java.io.InputStream;
import java.security.KeyStore;
import java.io.FileInputStream;
import java.security.cert.CertificateFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.HandshakeCompletedListener;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import javax.net.ssl.SSLSocketFactory;
import com.avocent.kvm.b.d.a;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import java.net.Socket;
import java.util.Map;
import java.security.SecureRandom;

public class h
{
    private static SecureRandom a;
    private static final int b;
    private static final int c;
    private static Map d;
    private static final String[] z;
    
    public static SSLSocket a(final Socket socket, final String s, final int n, final int n2, final String s2, final String s3, final String s4) throws Exception, SSLException {
        return a(socket, s, n, n2, s2, s3, s4, false);
    }
    
    public static SSLSocket a(final Socket socket, final String s, final int n, final int n2, final String s2, final String s3, final String s4, final boolean b) throws Exception, SSLException {
        int b2 = b.b;
        a(h.z[15], h.z[46] + socket.getInetAddress() + h.z[40] + n + h.z[43] + n2 + h.z[39] + s2 + h.z[41] + s3 + h.z[45] + s4 + h.z[42] + b);
        if (s == null || socket == null) {
            b(h.z[15], h.z[12]);
            throw new Exception(h.z[4]);
        }
        a(h.z[15], h.z[44]);
        final String[] a = a(s2 != null || s4 != null);
        SSLSocket a2;
        try {
            a2 = a(socket, s, n, n2, a, a(s2, s3, s4));
            if (s4 != null && b) {
                a(a2, s);
            }
        }
        catch (SSLException ex) {
            a(h.z[15], h.z[1], ex);
            throw ex;
        }
        catch (Exception ex2) {
            a(h.z[15], h.z[1], ex2);
            throw new Exception(h.z[9]);
        }
        final SSLSocket sslSocket = a2;
        if (a.c != 0) {
            b.b = ++b2;
        }
        return sslSocket;
    }
    
    public static SSLSocket a(Socket socket, final String s, final int n, final int soTimeout, final String[] enabledCipherSuites, final SSLSocketFactory sslSocketFactory) throws Exception, SSLException {
        final int b = b.b;
        if (s == null || sslSocketFactory == null || enabledCipherSuites == null) {
            b(h.z[15], h.z[12]);
            throw new Exception(h.z[4]);
        }
        SSLSocket sslSocket;
        try {
            if (socket == null) {
                a(h.z[15], h.z[8]);
                final InetAddress byName = InetAddress.getByName(s);
                socket = new Socket();
                socket.connect(new InetSocketAddress(byName, n), soTimeout);
                a(h.z[15], h.z[10]);
            }
            a(h.z[15], h.z[3] + socket + h.z[2] + s + h.z[11] + n);
            sslSocket = (SSLSocket)sslSocketFactory.createSocket(socket, s, n, true);
            sslSocket.setEnabledCipherSuites(enabledCipherSuites);
            final String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            a(h.z[15], h.z[7]);
            int i = 0;
            while (i < enabledCipherSuites2.length) {
                a(h.z[15], h.z[14] + enabledCipherSuites2[i]);
                ++i;
                if (b != 0) {
                    int c = a.c;
                    a.c = ++c;
                    break;
                }
            }
            sslSocket.setSoTimeout(soTimeout);
            final g g = new g();
            a(h.z[15], h.z[13]);
            sslSocket.addHandshakeCompletedListener(g);
            sslSocket.startHandshake();
            int n2 = 0;
            final int n3 = soTimeout / 100;
            while (!g.a() && n2 < n3) {
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException ex3) {}
                ++n2;
                if (b != 0) {
                    break;
                }
            }
            if (!g.a()) {
                sslSocket.close();
                b(h.z[15], h.z[5]);
                throw new Exception();
            }
            sslSocket.setSoTimeout(0);
            a(h.z[15], h.z[6]);
        }
        catch (SSLException ex) {
            a(h.z[15], h.z[1], ex);
            throw ex;
        }
        catch (Exception ex2) {
            a(h.z[15], h.z[1], ex2);
            throw new Exception(h.z[9]);
        }
        return sslSocket;
    }
    
    private static String[] a(final boolean b) {
        String[] array;
        if (b) {
            array = new String[] { h.z[48], h.z[55], h.z[50], h.z[57], h.z[51], h.z[52], h.z[53] };
        }
        else {
            array = new String[] { h.z[54], h.z[49], h.z[56], h.z[47], h.z[58] };
        }
        return array;
    }
    
    private static SSLSocketFactory a(final String s, final String s2, final String s3) throws Exception {
        final SSLContext instance = SSLContext.getInstance(h.z[26]);
        SSLSocketFactory socketFactory;
        if (s != null || s3 != null) {
            final CertificateFactory instance2 = CertificateFactory.getInstance(h.z[25]);
            KeyManagerFactory instance3 = null;
            TrustManagerFactory instance4 = null;
            if (s != null) {
                a(h.z[27], h.z[18]);
                char[] charArray = null;
                if (s2 != null) {
                    charArray = s2.toCharArray();
                }
                final FileInputStream fileInputStream = new FileInputStream(s);
                final KeyStore instance5 = KeyStore.getInstance(h.z[16]);
                instance5.load(fileInputStream, charArray);
                instance3 = KeyManagerFactory.getInstance(h.z[28]);
                instance3.init(instance5, charArray);
                a(h.z[27], h.z[20]);
                fileInputStream.close();
            }
            if (s3 != null) {
                a(h.z[27], h.z[29]);
                final FileInputStream fileInputStream2 = new FileInputStream(s3);
                final Certificate generateCertificate = instance2.generateCertificate(fileInputStream2);
                final KeyStore instance6 = KeyStore.getInstance(h.z[16]);
                instance6.load(null, null);
                instance6.setCertificateEntry(h.z[24], generateCertificate);
                instance4 = TrustManagerFactory.getInstance(h.z[28]);
                instance4.init(instance6);
                a(h.z[27], h.z[21]);
                fileInputStream2.close();
            }
            a(h.z[27], h.z[23] + instance3 + h.z[17] + instance4 + ".");
            instance.init((KeyManager[])((instance3 == null) ? null : instance3.getKeyManagers()), (TrustManager[])((instance4 == null) ? null : instance4.getTrustManagers()), null);
            a(h.z[27], h.z[19]);
            socketFactory = instance.getSocketFactory();
        }
        else {
            a(h.z[27], h.z[22]);
            socketFactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
        }
        return socketFactory;
    }
    
    private static void a(final SSLSocket sslSocket, final String s) throws Exception {
        final int b = b.b;
        final SSLSession session = sslSocket.getSession();
        if (session != null) {
            a(h.z[35], h.z[37]);
            final Certificate[] peerCertificates = session.getPeerCertificates();
            a(h.z[35], h.z[32] + peerCertificates);
            if (peerCertificates != null && peerCertificates.length > 0) {
                final X509Certificate x509Certificate = (X509Certificate)peerCertificates[0];
                final Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                a(h.z[35], h.z[31] + x509Certificate + h.z[30] + subjectAlternativeNames);
                if (subjectAlternativeNames != null) {
                    for (final List<Integer> list : subjectAlternativeNames) {
                        if (list.get(0) == 2L) {
                            final String s2 = (String)list.get(1);
                            a(h.z[35], h.z[34] + s2 + h.z[38]);
                            if (s2.equals(s)) {
                                b(h.z[35], h.z[33]);
                                if (b == 0) {
                                    break;
                                }
                            }
                            b(h.z[35], h.z[36]);
                            throw new Exception();
                        }
                        if (b != 0) {
                            break;
                        }
                    }
                }
            }
        }
    }
    
    static void a(final String s, final String s2) {
        f.c().a(s + h.z[0] + s2);
    }
    
    static void b(final String s, final String s2) {
        f.c().a(s + h.z[0] + s2);
    }
    
    static void a(final String s, final String s2, final Throwable t) {
        f.c().a(s + h.z[0] + s2);
        t.printStackTrace();
    }
    
    static int a() {
        return h.b;
    }
    
    static {
        z = new String[] { z(z("\u0019A")), z(z("e\u0000<8MGA!;\bF\u0012!5JO\b&<\bp2\u0019tKL\u000f;1KW\b::\b")), z(z("\u0003\u0015:tiG\u0005'1[P\\")), z(z("@\u001305\\F2\u0006\u0018{L\u0002>1\\\u000bHu\u0015JL\u0014!t\\LA6&MB\u00150tIMA\u0006\u0007dp\u000e6?MWA:\"MQA0,AP\u0015<:O\u00035\u0016\u0004\bP\u000e6?MW\\")), z(z("j\u000f#5DJ\u0005u5ZD\u001481FW\u0012{")), z(z("p2\u0019t@B\u000f1'@B\n0tLJ\u0005u:GWA6;ES\r0 M\u0003\b;t\\J\f0;]W")), z(z("w\t0t{p-\u0006;KH\u0004!t_B\u0012u7ZF\u0000!1L\u0003\u0012 7KF\u0012&2]O\r,tIM\u0005u @FA=5FG\u0012=5CFA6;ES\r0 MG")), z(z("@\u001305\\F2\u0006\u0018{L\u0002>1\\\u000bHuy\u0005\u000eA\u0010:IA\r00\b@\b%<MQA&!AW\u0004&tDJ\u0012!")), z(z("m\u000eu\u0000ksA\u0006;KH\u0004!tXB\u0012&1L\u000fA6&MB\u0015<:O\u0003\u000e;1")), z(z("v\u000f46DFA!;\b@\u000e;:M@\u0015u G\u0003\t:'\\")), z(z("w\"\u0005t{L\u0002>1\\\u0003\u0002'1IW\u00041z")), z(z("\u0003\u0000;0\bs\u000e' \u0015")), z(z("j\u000f#5DJ\u0005u5ZD\u001481FW\u0012{t")), z(z("@\u001305\\F2\u0006\u0018{L\u0002>1\\\u000bHu\u0007{o2:7CF\u0015u7ZF\u0000!1L\u000fA46GV\u0015u G\u0003\r<'\\F\u000fu2GQA=5FG\u0012=5CF")), z(z("\u0003Aut")), z(z("p2\u0019\u001cMO\u00110&\u0012@\u001305\\F2\u0006\u0018{L\u0002>1\\")), z(z("s*\u0016\u0007\u0019\u0011")), z(z("\u0003\u0000;0\bw\u0013 '\\n\u0000;5OF\u0013\u00135KW\u000e'-\u0015")), z(z("v\u0012<:O\u0003\u00029=MM\u0015u7MQ\u0015<2A@\u0000!1\bW\u000eu7ZF\u0000!1\bh\u0004,\u0019IM\u000021Z\u0003\n0-[W\u000e'1\u0006")), z(z("@\u001305\\F2\u0006\u0018{L\u0002>1\\\u000bHu\u0015JL\u0014!t\\LA21\\\u0003\u0015=1\bp2\u0019\u0007G@\n0 nB\u0002!;ZZ")), z(z("`\r:'AM\u0006u7DJ\u0004; \b@\u0004' \bE\b91\bJ\u000f%!\\\u0003\u0012!&MB\f{")), z(z("`\r:'AM\u0006u7MQ\u0015u5]W\tu2AO\u0004u=FS\u0014!t[W\u001305E\r")), z(z("@\u001305\\F2\u0006\u0018{L\u0002>1\\\u000bHu\u0015JL\u0014!t\\LA21\\\u0003\u0015=1\bG\u000435]O\u0015u\u0007{o2:7CF\u0015\u00135KW\u000e'-")), z(z("j\u000f< AB\r<.AM\u0006u\u0007{oA6;FW\u0004- \bT\b!<\bh\u0004,\u0019IM\u000021Ze\u00006 GQ\u0018h")), z(z("` u5DJ\u0000&")), z(z("{O`d\u0011")), z(z("p2\u0019")), z(z("p2\u0019\u001cMO\u00110&\u0012D\u0004!\u0007[O2:7CF\u0015\u00135KW\u000e'-")), z(z("p\u0014;\f\u001d\u0013X")), z(z("v\u0012<:O\u0003\u00020&\\\u0003\u0000  @\u0003\u00020&\\J\u0007<7IW\u0004u G\u0003\u0002'1IW\u0004u\u0000ZV\u0012!\u0019IM\u000021Z\u0003\n0-[W\u000e'1\u0006")), z(z("\u000fA%5ZP\u00041\u0007MQ\u00170&kF\u0013!i")), z(z("P\u0004'\"MQ\"0&\\\u001e")), z(z("B101Z`\u0004' [\u001e")), z(z("p\u0004'\"MQA\u001c\u0004\bb\u00051&MP\u0012u=FP\b11\b@\u0004' AE\b65\\FA85\\@\t0'\bW\t0tasA\u00140LQ\u0004&'\bT\u0004u7GM\u000f07\\F\u0005u G\rAu\u0007{oA\u0016;FM\u00046 AL\u000fu\u0007]@\u000201LF\u0005{")), z(z("e\u000e :L\u0003A\u001c\u0004\bb\u00051&MP\u0012h")), z(z("p2\u0019\u001cMO\u00110&\u0012U\u0004'=NZ20&^F\u0013\u001c$iG\u0005'1[P")), z(z("p\u0004'\"MQA\u001c\u0004\bb\u00051&MP\u0012u=FP\b11\b@\u0004' AE\b65\\FA1;MPA;;\\\u0003\f4 KKA!<M\u0003(\u0005tiG\u0005'1[PA\"1\b@\u000e;:M@\u001500\bW\u000exyLQ\u000e%$AM\u0006u @FA6;FM\u00046 AL\u000f{")), z(z("p\u0004'\"MQA4!\\K\u0004; A@\u0000!=GMA'1YV\b'1L\rAu\u0013MW\u0015<:O\u0003\u0015=1\bP\u0004'\"MQA61ZW\b3=KB\u00150tKK\u0000<:\bE\u0013:9\bW\t0t{p-u7GM\u00150,\\\u000fA!<MMA#1ZJ\u0007,=FDA\u001c\u0004\bb\u00051&MP\u0012u=F\u0003\u0015=1\b@\u0004' AE\b65\\FA85\\@\t0'\bW\t0tGM\u0004u#M\u0003\u0002::FF\u0002!1L\u0003\u0015:z\u0006\r")), z(z("\u0003\b;'AG\u0004u'MQ\u00170&\b@\u0004' AE\b65\\FO")), z(z("\u000fA&.kO\b0:\\`\u0004' AE\b65\\F'<8M\u001e")), z(z("\u000fA;\u0004GQ\u0015h")), z(z("\u000fA&.kO\b0:\\e\b91xB\u0012&$@Q\u0000&1\u0015")), z(z("\u0003\u0000;0\bA70&AE\u0018\u00061ZU\u0004'\u001dXb\u00051&MP\u0012h")), z(z("\u000fA;\u0000AN\u0004:!\\\u001e")), z(z("@\u001305\\F2\u0006\u0018{L\u0002>1\\\u000bHu\u0010MW\u0004'9AM\b;3\bP\u0004!tKJ\u0011=1Z\u0003\u0012 =\\F\u0012u G\u0003\u0004;5JO\u0004")), z(z("\u000fA&.kF\u0013!\u0015]W\t\u00161ZW\b3=KB\u00150\u0012AO\u0004h")), z(z("b\u00132!EF\u000f!'\bD\b#1F\u0019A&;KH\u0004!\u0000KS(;1\\b\u00051&MP\u0012h")), z(z("p2\u0019\u000blk>4:GM>\u0010\fxl3\u0001\u000b\u007fj5\u001d\u000blf2adw`#\u0016\u000b{k ")), z(z("p2\u0019\u000bzp \n\u0003aw)\n\u0006k\u0017>df\u0010|,\u0011a")), z(z("p2\u0019\u000blk>4:GM>\u0002\u001d|k>f\u0010mp>\u0010\u0010m|\"\u0017\u0017wp)\u0014")), z(z("p2\u0019\u000bzp \n\u0003aw)\n\u0010mp>\u0016\u0016k|2\u001d\u0015")), z(z("p2\u0019\u000bzp \n\u0003aw)\n\u001a}o-\n\u0019l\u0016")), z(z("p2\u0019\u000bzp \n\u0003aw)\n\u001a}o-\n\u0007`b")), z(z("p2\u0019\u000bzp \n\u0011ps.\u0007\u0000wt(\u0001\u001cwq\"a\u000b\u001c\u0013>\u0018\u0010\u001d")), z(z("p2\u0019\u000blk>4:GM>\u0002\u001d|k>\u0007\u0017\u001c|Pglwn%`")), z(z("p2\u0019\u000bzp \n\u0003aw)\n\u0006k\u0017>df\u0010|2\u001d\u0015")), z(z("p2\u0019\u000blk>4:GM>\u0002\u001d|k>\u0011\u0011{|\"\u0017\u0017wp)\u0014")), z(z("p2\u0019\u000bzp \n\u0003aw)\nglf2\n\u0011lf>\u0016\u0016k|2\u001d\u0015")), z(z("p2\u0019\u000blk>4:GM>\u0010\fxl3\u0001\u000b\u007fj5\u001d\u000bz`U\n`\u0018|,\u0011a")) };
        h.a = new SecureRandom();
        b = (int)Integer.getInteger(z(z("p2\u0019\u001cMO\u00110&\u0006n \r\u000bkl/\u0001\u0011pw>\u0016\u0015kk$\n\u0007ay$")), 50);
        c = (int)Integer.getInteger(z(z("p2\u0019\u001cMO\u00110&\u0006p2\u0019\u000b`b/\u0011\u0007`b*\u0010\u000b|j,\u0010\u001b}w")), 5000);
        h.d = Collections.synchronizedMap((Map<Object, Object>)new i(16, 0.75f, true));
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        int i;
        do {
            i = charArray.length;
            if (i < 2) {
                continue;
            }
            return charArray;
        } while (i == 0);
        final int n = 0;
        charArray[n] ^= '(';
        return charArray;
    }
    
    private static String z(final char[] array) {
        int length;
        int n2;
        final int n = n2 = (length = array.length);
        int n3 = 0;
        while (true) {
            Label_0086: {
                if (n > 1) {
                    break Label_0086;
                }
                length = (n2 = n3);
                do {
                    final char c = array[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '#';
                            break;
                        }
                        case 1: {
                            c2 = 'a';
                            break;
                        }
                        case 2: {
                            c2 = 'U';
                            break;
                        }
                        case 3: {
                            c2 = 'T';
                            break;
                        }
                        default: {
                            c2 = '(';
                            break;
                        }
                    }
                    array[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                return new String(array).intern();
            }
            continue;
        }
    }
}
