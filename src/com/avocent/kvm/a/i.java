// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.b.f.e;
import java.net.ConnectException;
import com.avocent.kvm.a.a.tb;
import com.avocent.kvm.a.a.j;
import com.avocent.kvm.a.a.rb;
import com.avocent.kvm.a.a.qb;
import com.avocent.kvm.a.a.r;
import com.avocent.kvm.a.a.eb;
import com.avocent.kvm.a.a.nb;
import com.avocent.kvm.a.a.z;
import com.avocent.kvm.b.gb;
import com.avocent.kvm.a.a.cb;
import com.avocent.kvm.a.a.fb;
import com.avocent.kvm.a.a.lb;
import com.avocent.kvm.a.a.jb;
import com.avocent.kvm.a.a.hb;
import com.avocent.kvm.a.a.bb;
import com.avocent.kvm.a.a.ab;
import com.avocent.kvm.a.a.mb;
import com.avocent.kvm.a.a.kb;
import com.avocent.kvm.b.d.c;

public class i {

    protected l h;
    protected boolean i;
    private static final String[] z = {"video_state"," << packet type (0x",") name (","Got packet id: "," for packet (","Unexpected packet: ","Failed to process packet: ",") which is of type: ",") of length (","\n\n ResponseHandler.java AvspPacket.TYPE_USER_PRIVILEDGES_RESPONSE: 33824",").",", "," Input resolution: ",", depth= ","KVMColorDepth","AVSPKVMSession","Color","GrayScale","KVMColorMode","Received color model response: color=","mouse_accel","contrast","horz_position","priority","vert_position","brightness","fine_adjust"," Video output resolution changed to: "," Video resolution: ","IN_USE","LOGIN_REASON","SESSION_STATE","\n\nUser login response: ","ACCESS_DENIED"," Failed to open video connection.","User resp.getApplianceRandomNumber: ","User resp.getVideoOverSSL: ","SHARING_DENIED","CONNECTION_LOGIN_FAILED","SHARING_TIMEOUT","User resp.getVideoEncoding: ","BAD_LOGIN","\n\n"};

    public i(final l h) {
        this.i = false;
        this.h = h;
    }

    void a(final c c) {
        final int ab = l.Ab;
        try {
            if (this.h.yb != null) {
                this.h.yb.println(com.avocent.kvm.a.i.z[1] + Integer.toHexString(c.d()) + com.avocent.kvm.a.i.z[2] + c.e() + com.avocent.kvm.a.i.z[8] + c.f() + com.avocent.kvm.a.i.z[10]);
            }
            Label_0588:
            {
                switch (c.d()) {
                    case 33536: {
                        this.a((kb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33541: {
                        this.a((kb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 132: {
                        this.a((mb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33281: {
                        this.a((ab) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33280: {
                        this.a((bb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33538: {
                        this.a((hb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33283: {
                        this.a((jb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33824: {
                        System.out.println(com.avocent.kvm.a.i.z[9]);
                        this.a((lb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33025: {
                        this.a((fb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33024: {
                        this.a((cb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
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
                        this.a((gb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 128:
                    case 34304: {
                        this.a((z) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33282: {
                        this.a((nb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33026: {
                        this.a((eb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 133:
                    case 34309: {
                        this.a((r) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33840: {
                        this.a((com.avocent.kvm.a.a.c) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33841: {
                        this.a((qb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33842: {
                        this.a((rb) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33284: {
                        this.a((j) c);
                        if (ab != 0) {
                            break Label_0588;
                        }
                        break;
                    }
                    case 33793: {
                        this.a((tb) c);
                        if (ab != 0) {
                            break;
                        }
                        break;
                    }
                }
            }
            System.out.println(com.avocent.kvm.a.i.z[5] + c.e());
        } catch (ClassCastException ex) {
            throw new RuntimeException(com.avocent.kvm.a.i.z[3] + c.d() + com.avocent.kvm.a.i.z[4] + c.e() + com.avocent.kvm.a.i.z[7] + c.getClass().getName(), ex);
        } catch (Exception ex2) {
            System.out.println(com.avocent.kvm.a.i.z[6] + c.e());
            ex2.printStackTrace();
        }
    }

    void a(final kb kb) throws Exception {
        final int ab = l.Ab;
        System.out.println(com.avocent.kvm.a.i.z[32] + kb.h());
        final int h = kb.h();
        System.out.println(com.avocent.kvm.a.i.z[35] + kb.i());
        System.out.println(com.avocent.kvm.a.i.z[36] + kb.j());
        System.out.println(com.avocent.kvm.a.i.z[40] + kb.k() + com.avocent.kvm.a.i.z[42]);
        this.h.f(kb.i());
        this.h.d(kb.j());
        this.h.b(kb.k());
        if (h == 0) {
            this.h.f(kb.i());
            if (this.h.y) {
                return;
            }
            try {
                Label_0243:
                {
                    if (!kb.l()) {
                        this.h.s();
                        if (ab == 0) {
                            break Label_0243;
                        }
                    }
                    this.h.r();
                    this.h.b().c();
                }
                this.h.q();
                return;
            } catch (ConnectException ex) {
                System.out.println(com.avocent.kvm.a.i.z[34]);
                ex.printStackTrace();
                this.h.k();
                if (ab == 0) {
                    return;
                }
            }
        }
        this.h.q();
        Label_0466:
        {
            if (h == 1 || h == 2) {
                this.h.b(com.avocent.kvm.a.i.z[30], com.avocent.kvm.a.i.z[41]);
                if (ab == 0) {
                    break Label_0466;
                }
            }
            if (h == 3) {
                this.h.b(com.avocent.kvm.a.i.z[30], com.avocent.kvm.a.i.z[33]);
                if (ab == 0) {
                    break Label_0466;
                }
            }
            if (h == 4 || h == 12) {
                this.h.b(com.avocent.kvm.a.i.z[30], com.avocent.kvm.a.i.z[29]);
                if (ab == 0) {
                    break Label_0466;
                }
            }
            if (h == 15) {
                this.h.b(com.avocent.kvm.a.i.z[30], com.avocent.kvm.a.i.z[37]);
                if (ab == 0) {
                    break Label_0466;
                }
            }
            if (h == 16) {
                this.h.b(com.avocent.kvm.a.i.z[30], com.avocent.kvm.a.i.z[39]);
                if (ab == 0) {
                    break Label_0466;
                }
            }
            this.h.b(com.avocent.kvm.a.i.z[30], com.avocent.kvm.a.i.z[41]);
        }
        this.h.a(com.avocent.kvm.a.i.z[31]);
        this.h.b(com.avocent.kvm.a.i.z[31], com.avocent.kvm.a.i.z[38]);
        this.h.a(com.avocent.kvm.a.i.z[31], null, com.avocent.kvm.a.i.z[38]);
    }

    void a(final mb mb) throws Exception {
        this.h.r();
    }

    void a(final ab ab) throws Exception {
        this.h.i().a(com.avocent.kvm.a.i.z[28] + ab.h() + com.avocent.kvm.a.i.z[11] + ab.i());
        this.h.i().a(com.avocent.kvm.a.i.z[15], com.avocent.kvm.a.i.z[27] + ab.h() + "x" + ab.i());
        this.h.a();
    }

    void a(final bb bb) throws Exception {
        this.h.i().a(com.avocent.kvm.a.i.z[12] + bb.h() + com.avocent.kvm.a.i.z[11] + bb.i());
    }

    void a(final hb hb) throws Exception {
    }

    void a(final jb jb) throws Exception {
    }

    void a(final j j) throws Exception {
        final e i = this.h.i();
        final l h = this.h;
        i.a(com.avocent.kvm.a.i.z[15], com.avocent.kvm.a.i.z[19] + j.i() + com.avocent.kvm.a.i.z[13] + j.h());
        final String s = j.i() ? com.avocent.kvm.a.i.z[16] : com.avocent.kvm.a.i.z[17];
        this.h.a(com.avocent.kvm.a.i.z[18], s);
        this.h.a(com.avocent.kvm.a.i.z[14], (Object) new Integer(j.h()));
        this.h.a(com.avocent.kvm.a.i.z[18], null, s);
    }

    void a(final lb lb) throws Exception {
    }

    void a(final fb fb) throws Exception {
        this.h.v().a(fb.h());
    }

    void a(final cb cb) throws Exception {
    }

    void a(final z z) {
        if (this.i) {
            this.i = false;
            this.h.c(com.avocent.kvm.a.i.z[0], 100);
        }
        this.h.u();
    }

    void a(final gb gb) {
        if (this.i) {
            this.i = false;
            this.h.c(com.avocent.kvm.a.i.z[0], 100);
        }
        this.h.b().a(gb);
        this.h.u();
    }

    void a(final nb nb) throws Exception {
        this.h.a(com.avocent.kvm.a.i.z[26], (Object) nb.l());
        this.h.a(com.avocent.kvm.a.i.z[22], (Object) nb.j());
        this.h.a(com.avocent.kvm.a.i.z[24], (Object) nb.k());
        this.h.a(com.avocent.kvm.a.i.z[21], (Object) nb.i());
        this.h.a(com.avocent.kvm.a.i.z[25], (Object) nb.h());
        this.h.a(com.avocent.kvm.a.i.z[23], (Object) nb.m());
    }

    void a(final r r) throws Exception {
        final int ab = l.Ab;
        this.i = true;
        Label_0101:
        {
            if (r.h() == 0) {
                this.h.c(com.avocent.kvm.a.i.z[0], 0);
                if (ab == 0) {
                    break Label_0101;
                }
            }
            if (r.h() == 1) {
                this.h.c(com.avocent.kvm.a.i.z[0], 1);
                if (ab == 0) {
                    break Label_0101;
                }
            }
            if (r.h() == 2) {
                this.h.c(com.avocent.kvm.a.i.z[0], 2);
            }
        }
        this.h.u();
    }

    void a(eb eb) throws Exception {
        this.h.a(com.avocent.kvm.a.i.z[20], (Object) eb.h());
    }

    void a(com.avocent.kvm.a.a.c c) throws Exception {
    }

    void a(qb qb) throws Exception {
        this.h.pb = qb.h();
    }

    void a(rb rb) throws Exception {
    }

    void a(tb tb) throws Exception {
        this.h.a(tb.h(), tb.i(), tb.j());
    }
}