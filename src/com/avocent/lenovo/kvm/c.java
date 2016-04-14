// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.net.MalformedURLException;
import com.avocent.a.a.s;
import com.avocent.lenovo.kvm.a.a;
import com.avocent.lenovo.kvm.a.AbstractAction_d;
import com.avocent.a.a.i;

public class c extends i {

    protected boolean H = false;
    protected boolean I = false;
    protected boolean J = false;
    protected AbstractAction_k K;
    protected AbstractAction_j L;
    protected i M;
    protected AbstractAction_l N;
    protected AbstractAction_g O;
    protected AbstractAction_g P;
    protected AbstractAction_g Q;
    protected AbstractAction_g R;
    protected AbstractAction_g S;
    protected AbstractAction_g T;
    protected AbstractAction_g U;
    protected AbstractAction_g V;
    protected AbstractAction_g W;
    protected AbstractAction_m X;
    protected com.avocent.a.b.c Y;
    protected AbstractAction_d Z;
    protected a ab;
    protected AbstractAction_h bb;
    public static boolean cb;
    private static final String[] db = {"playurl", "Cannot open: ", "SHARING_DENIED", "ConnectionDialog_LoginFailed", "SHARED_SESSION", "ConnectionDialog_SharingTimeout", "ConnectionDialog_SharingDenied", "ConnectionDialog_AccessDenied", "IN_USE", "LOGIN_REASON", "SHARING_TIMEOUT", "ACCESS_DENIED", "BAD_LOGIN", ", TCP Ports Control: ", "CHANNEL", "VPORT", "PASSWORD", "USERNAME", "PORT", "USE_APCP", "AVSP_VERSION", "HOST", "KMPORT", "SSLV3", "SERVER_KEY", ", Video: ", " Re-connecting to "};

    public c() {
        this.Z = new AbstractAction_d(this);
        this.ab = new a(this);
    }

    @Override
    public void a(s s, com.avocent.a.d d, String[] array) {
        if (this.a(db[0], (String) null) != null) {
            this.H = true;
        }
        if (!this.H) {
            if (!this.I) {
                this.r = new com.avocent.kvm.a.l(null);
                ((com.avocent.kvm.a.l) this.r).a(new e(this));
            }
        }
        if (!this.H) {
            this.K = new AbstractAction_k(this);
            this.L = new AbstractAction_j(this);
            //this.M = new i(this);
            this.M = new i();
            this.N = new AbstractAction_l(this);
            this.O = new AbstractAction_g(this, 0, 3);
            this.P = new AbstractAction_g(this, 0, 7);
            this.Q = new AbstractAction_g(this, 0, 9);
            this.R = new AbstractAction_g(this, 0, 12);
            this.S = new AbstractAction_g(this, 0, 15);
            this.T = new AbstractAction_g(this, 1, 4);
            this.U = new AbstractAction_g(this, 1, 5);
            this.V = new AbstractAction_g(this, 1, 6);
            this.W = new AbstractAction_g(this, 1, 7);
            this.X = new AbstractAction_m(this);
            this.Y = new com.avocent.a.b.c(this);
            this.Z = new AbstractAction_d(this);
            this.bb = new AbstractAction_h(this);
        }
        super.a(s, d, array);
    }

    public com.avocent.lenovo.kvm.a.a u() {
        return this.ab;
    }

    @Override
    public void f() throws Exception {
        if (this.a(db[0], (String) null) != null) {
            this.H = true;
        }
        this.r = new com.avocent.kvm.a.l(null);
        ((com.avocent.kvm.a.l) this.r).a(new e(this));
        super.f();
    }

    @Override
    public void i() throws Exception {
        if (!this.H) {
            super.i();
            if (!cb) {
                return;
            }
        }
        String e = this.e(db[0]);
        try {
            this.v();
        } catch (MalformedURLException ex) {
            this.a(db[1] + e);
            throw ex;
        }
    }

    protected void v() throws IOException {
    }

    @Override
    public void s() {
        boolean bl = cb;
        String string = this.r.b(db[9]);
        if (string != null) {
            if (string.equalsIgnoreCase(db[12])) {
                this.d();
                this.f(com.avocent.a.d.b(db[3]));
                System.exit(0);
                if (!bl) {
                    return;
                }
            }
            if (string.equalsIgnoreCase(db[8])) {
                Label_0151:
                {
                    if (new com.avocent.lenovo.kvm.b.d(this, this.k).b() == 0) {
                        this.a(db[4], (Object) Boolean.TRUE);
                        try {
                            this.w();
                            break Label_0151;
                        } catch (Exception ex) {
                            ex.printStackTrace();
                            this.d();
                            this.f(com.avocent.a.d.b(db[3]));
                            System.exit(0);
                            if (!bl) {
                                break Label_0151;
                            }
                        }
                    }
                    System.exit(0);
                }
                if (!bl) {
                    return;
                }
            }
            if (string.equalsIgnoreCase(db[11])) {
                this.d();
                this.f(com.avocent.a.d.b(db[3]));
                System.exit(0);
                this.d();
                this.f(com.avocent.a.d.b(db[7]));
                System.exit(0);
                if (!bl) {
                    return;
                }
            }
            if (string.equalsIgnoreCase(db[2])) {
                this.d();
                this.f(com.avocent.a.d.b(db[6]));
                System.exit(0);
                if (!bl) {
                    return;
                }
            }
            if (!string.equalsIgnoreCase(db[10])) {
                return;
            }
            this.d();
            this.f(com.avocent.a.d.b(db[5]));
            System.exit(0);
            if (!bl) {
                return;
            }
        }
        this.d();
        this.f(com.avocent.a.d.b(db[3]));
        System.exit(0);
    }

    public void w() throws Exception {
        boolean bl = cb;
        com.avocent.kvm.a.l l = (com.avocent.kvm.a.l) this.a();
        String e = this.e(db[17]);
        String e2 = this.e(db[16]);
        String e3 = this.e(db[21]);
        Integer a = this.a(db[15], new Integer(2068));
        Integer a2 = this.a(db[22], new Integer(8192));
        Boolean a3 = this.a(db[19], Boolean.FALSE);
        Integer a4 = this.a(db[20], new Integer(1));
        Boolean a5 = this.a(db[23], Boolean.FALSE);
        this.e(db[24]);
        Integer a6 = this.a(db[14], new Integer(0));
        Integer a7 = this.a(db[18], new Integer(1));
        l.a(e, e2);
        l.c(a2);
        l.d(a);
        l.h(a4);
        l.b(a3);
        l.c(a5);
        this.b().a(db[26] + e3 + db[13] + a2 + db[25] + a);
        l.a((int) a7, (int) a6, true);
        if (bl) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }
}
