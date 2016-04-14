// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import java.io.IOException;
import com.avocent.kvm.b.d.c;
import com.avocent.kvm.b.a.d;
import java.util.ArrayList;
import com.avocent.kvm.b.ib;

public class e implements ib {

    protected l a;
    protected ArrayList b;
    /*private static final String[] z = {"===sendKey=","m_kvmSession != null",",m_kvmSession.getRequestManager() != null "};*/

    public e(l a) {
        this.b = new ArrayList();
        this.a = a;
    }

    @Override
    public void a(final int n) throws IOException {
        final int ab = l.Ab;
        boolean b = true;
        int i = 0;
        while (i < this.b.size()) {
            if (((d) this.b.get(i)).a(n)) {
                b = false;
            }
            ++i;
            if (ab != 0) {
                break;
            }
        }
        //System.out.println(e.z[0] + b + e.z[1] + (this.a != null) + e.z[2] + this.a.x() != null);
        if (b && this.a != null && this.a.x() != null) {
            this.a.x().a(new com.avocent.kvm.a.a.e(n, true));
        }
    }

    @Override
    public void b(final int n) throws IOException {
        final int ab = l.Ab;
        boolean b = true;
        int i = 0;
        while (i < this.b.size()) {
            if (((d) this.b.get(i)).b(n)) {
                b = false;
            }
            ++i;
            if (ab != 0) {
                break;
            }
        }
        if (b && this.a != null && this.a.x() != null) {
            this.a.x().a(new com.avocent.kvm.a.a.e(n, false));
        }
    }

    @Override
    public void a(final d d) {
        this.b.add(d);
    }

    /*}
