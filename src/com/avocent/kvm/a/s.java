// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.g;
import java.util.Date;
import java.text.SimpleDateFormat;

class s extends Thread {

    private boolean a;
    private final l b;
    private static final String[] z = {"VideoInputThread: Received a null packet pointer.", " AVSP KVMSession Error: ", "VideoInputThread: p == null  @  ", "VideoInputThread: Received a packet pointer at ", "RECORDING_ACTIVE", "yyyy/MM/dd HH:mm:ss", "VideoInputThread:  m_videoStreamPacketReceiver.receive error + ", "AVSP Video Input"};

    public s(l b) {
        super(s.z[7]);
        this.b = b;
        this.a = false;
    }

    @Override
    public void run() {
        final int ab = l.Ab;
        try {
            while (!this.a) {
                c a = null;
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s.z[5]);
                final Date date = new Date();
                try {
                    a = this.b.jb.a(this.b.H, g.i ? l.g(this.b) : null, false);
                } catch (Throwable t) {
                    System.out.println(s.z[3] + simpleDateFormat.format(date));
                    System.out.println(s.z[6] + t.toString());
                }
                if (a == null) {
                    System.out.println(s.z[0]);
                    System.out.println(s.z[2] + simpleDateFormat.format(date));
                    this.b.f();
                    if (ab == 0) {
                        break;
                    }
                }
                l.h(this.b);
                int i = 0;
                while (i < l.i(this.b).size()) {
                    this.b.a(i).a(a);
                    ++i;
                    if (ab != 0) {
                        break;
                    }
                }
                if (l.j(this.b)) {
                    g.i = false;
                    if (l.k(this.b) != null) {
                        l.l(this.b).close();
                    }
                    l.b(this.b, null);
                    l.b(this.b, false);
                    this.b.a(s.z[4], Boolean.FALSE);
                }
                this.b.hb.a(a);
                if (ab != 0) {
                    break;
                }
            }
        } catch (Throwable t2) {
            this.b.i().a(s.z[1] + t2.getMessage());
            t2.printStackTrace();
            this.b.a(t2);
        }
    }
}
