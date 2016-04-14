// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.EOFException;
import java.io.IOException;
import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import java.io.DataInputStream;
import com.avocent.kvm.a.l;

public class a {

    protected byte[] a;
    protected byte[] b;
    protected int c;
    protected l d;
    private static final String[] z = {"), secondary (0x", " Unknown message type: primary (0x", ").", "\n\n Packet stoped received\n\n", "Before createPacket( messageType ) ", "Message Type = ", "PacketReceiver: error = ", "Bad messages length (", " Error : read EOF occur. ", "yyyy/MM/dd HH:mm:ss", "  Error: Packet length: ", "Reading timeout, Payload length : ", ", Read length: "};

    public a(final l d) {
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
                } catch (InterruptedException ex2) {
                }
            }
            dataInputStream.readFully(this.a);
            n = (b ? ((this.a[4] & 0xFF) << 8 | (this.a[5] & 0xFF)) : (this.a[5] & 0xFF));
            Label_0172:
            {
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
            final int b2 = com.avocent.kvm.b.d.a.b(this.a, 6);
            if (b2 < 16) {
                throw new IOException(com.avocent.kvm.a.a.a.z[7] + b2 + com.avocent.kvm.a.a.a.z[2]);
            }
            if (b2 > 15000) {
                throw new IOException(com.avocent.kvm.a.a.a.z[10] + b2);
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
                    throw new EOFException(com.avocent.kvm.a.a.a.z[8]);
                }
                i += read;
                if (System.currentTimeMillis() - currentTimeMillis > 3000L) {
                    System.out.println(com.avocent.kvm.a.a.a.z[11] + n2 + com.avocent.kvm.a.a.a.z[12] + (i + 1));
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
                System.out.println(com.avocent.kvm.a.a.a.z[4] + n);
            }
            a = this.a(n);
            if (a != null) {
                a.a(this.a, this.b, n2);
            }
        } catch (IOException ex) {
            System.out.println(com.avocent.kvm.a.a.a.z[6] + new SimpleDateFormat(com.avocent.kvm.a.a.a.z[9]).format(new Date()).toString());
            System.out.println(com.avocent.kvm.a.a.a.z[5] + n);
            System.out.println(com.avocent.kvm.a.a.a.z[6] + ex.toString());
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
                System.out.println(com.avocent.kvm.a.a.a.z[3]);
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
                ((com.avocent.kvm.b.gb) d).a(n);
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
                d = new com.avocent.kvm.a.a.c();
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
                System.out.println(com.avocent.kvm.a.a.a.z[1] + Integer.toHexString(n) + com.avocent.kvm.a.a.a.z[0] + Integer.toHexString(n) + com.avocent.kvm.a.a.a.z[2]);
                d = new gb();
                break;
            }
        }
        return d;
    }
}
