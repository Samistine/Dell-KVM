// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.b.d.g;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.avocent.kvm.b.d.c;
import com.avocent.kvm.a.a.n;

class q extends Thread {

    boolean a;
    final l b;
    private static final String[] z = {"yyyy/MM/dd HH:mm:ss", "Received HEARTBEAT message. (RandomNumber:", "KVM Keep Alive"};

    q(final l b) {
        this.b = b;
        this.a = false;
        this.setName(q.z[2]);
        this.setDaemon(true);
    }

    @Override
    public void run() {
        while (!this.a) {
            try {
                final g x = this.b.x();
                if (x != null) {
                    final n n = new n();
                    final l b = this.b;
                    ++b.qb;
                    n.c(this.b.qb);
                    x.a(n);
                    final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(q.z[0]);
                    final Date date = new Date();
                    System.out.println(q.z[1] + this.b.qb + ")");
                    System.out.println(simpleDateFormat.format(date).toString());
                }
                Thread.currentThread();
                Thread.sleep(5000L);
            } catch (Throwable t) {
                this.b.a(t);
                break;
            }
        }
    }
}
