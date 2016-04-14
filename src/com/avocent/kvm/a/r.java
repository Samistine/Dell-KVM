// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.g;
import java.util.Date;
import java.text.SimpleDateFormat;

class r extends Thread {

    boolean a;
    final l b;
    private static final String[] z = {"AVSP Session Receive", "\nSessionInputThread m_disVideo.available: ", "RECORDING_ACTIVE", "SessionInputThread: p.getPacketId() ", "SessionInputThread: Received a packet pointer at ", "yyyy/MM/dd HH:mm:ss", "SessionInputThread (m_disVideo == null\n", "SessionInputThread: error + ", "SessionInputThread:  m_videoStreamPacketReceiver.receive error + ", "SessionInputThread:  p == null  @  ", "SessionInputThread: Received a null packet pointer."};

    r(final l b) {
        super(r.z[0]);
        this.b = b;
        this.a = false;
    }

    @Override
    public void run() {
        final int ab = l.Ab;
        try {
            while (!this.a) {
                c a = null;
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(r.z[5]);
                final Date date = new Date();
                try {
                    System.out.println(r.z[1] + this.b.F.available());
                    if (this.b.F == null) {
                        System.out.println(r.z[6]);
                    }
                    a = this.b.ib.a(this.b.F, g.i ? l.a(this.b) : null, true);
                } catch (Throwable t) {
                    System.out.println(r.z[4] + simpleDateFormat.format(date).toString());
                    System.out.println(r.z[8] + t.toString());
                }
                if (a != null) {
                    System.out.println(r.z[3] + a.d());
                }
                if (a == null) {
                    System.out.println(r.z[10]);
                    System.out.println(r.z[9] + simpleDateFormat.format(date).toString());
                    this.b.f();
                    if (ab == 0) {
                        break;
                    }
                }
                l.b(this.b);
                int i = 0;
                while (i < l.c(this.b).size()) {
                    this.b.a(i).a(a);
                    ++i;
                    if (ab != 0) {
                        break;
                    }
                }
                if (l.d(this.b)) {
                    g.i = false;
                    if (l.e(this.b) != null) {
                        l.f(this.b).close();
                    }
                    l.a(this.b, null);
                    l.a(this.b, false);
                    this.b.a(r.z[2], Boolean.FALSE);
                }
                this.b.hb.a(a);
                if (ab != 0) {
                    break;
                }
            }
        } catch (Throwable t2) {
            System.out.println(r.z[7] + new SimpleDateFormat(r.z[5]).format(new Date()).toString());
            System.out.println(r.z[7] + t2.toString());
            t2.printStackTrace();
            this.b.a(t2);
            this.b.l();
        }
    }

}
