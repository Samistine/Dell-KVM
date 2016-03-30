// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import com.avocent.kvm.b.f.e;
import java.awt.Component;
import com.avocent.kvm.b.hb;
import java.awt.event.FocusListener;
import com.avocent.kvm.b.u;
import java.util.HashMap;
import com.avocent.kvm.b.r;

public class g implements r {

    protected boolean a;
    protected HashMap b;
    protected u c;
    protected NativeKeyEventListener d;
    protected FocusListener e;
    private static final String[] z;

    public g() {
        this.a = true;
        this.b = new HashMap();
        this.d = new i(this);
        this.e = new h(this);
        this.b();
    }

    public void b() throws UnsatisfiedLinkError {
        System.loadLibrary(g.z[3]);
        System.loadLibrary(g.z[2]);
    }

    public boolean a(final Object o) {
        final Boolean value = this.b.get(o);
        return value != null && value;
    }

    @Override
    public void a(final boolean a) {
        this.a = a;
    }

    @Override
    public void a(final hb hb, final boolean b) {
        try {
            System.out.println(g.z[0] + b + ")");
            this.b.put(hb.c(), new Boolean(b));
            final Component c = hb.c();
            if (c.isVisible() && c.isDisplayable()) {
                NativeKVM.a(c, b);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @Override
    public void a(final u c) {
        this.c = c;
    }

    @Override
    public void a(final hb hb, final e e) {
        if (hb != null) {
            try {
                NativeKVM.a(hb.c(), this.d, hb.getName(), e);
                hb.c().setFocusable(true);
                hb.c().addFocusListener(this.e);
                System.out.println(g.z[1]);
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage(), ex);
            }
        }
    }

    @Override
    public void a(final u u, final hb hb) {
        this.a(u);
        this.a(hb, u.i());
    }

    @Override
    public void a() {
    }

    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "6Y9=.wY/=\u0016dE).\u0016SD=+\u0012sNt".toCharArray();
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
                            c2 = '\u0016';
                            break;
                        }
                        case 1: {
                            c2 = '*';
                            break;
                        }
                        case 2: {
                            c2 = '\\';
                            break;
                        }
                        case 3: {
                            c2 = 'I';
                            break;
                        }
                        default: {
                            c2 = '~';
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
        final char[] charArray2 = "+\u0017at0w^5?\u001b]O%+\u0011wX8e^dO; \rbO.i1]".toCharArray();
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
                            c4 = '\u0016';
                            break;
                        }
                        case 1: {
                            c4 = '*';
                            break;
                        }
                        case 2: {
                            c4 = '\\';
                            break;
                        }
                        case 3: {
                            c4 = 'I';
                            break;
                        }
                        default: {
                            c4 = '~';
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
        final char[] charArray3 = "w\\?=5@g\u0015\u0006".toCharArray();
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
                            c6 = '\u0016';
                            break;
                        }
                        case 1: {
                            c6 = '*';
                            break;
                        }
                        case 2: {
                            c6 = '\\';
                            break;
                        }
                        case 3: {
                            c6 = 'I';
                            break;
                        }
                        default: {
                            c6 = '~';
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
        final char[] charArray4 = "|K+=".toCharArray();
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
                            c8 = '\u0016';
                            break;
                        }
                        case 1: {
                            c8 = '*';
                            break;
                        }
                        case 2: {
                            c8 = '\\';
                            break;
                        }
                        case 3: {
                            c8 = 'I';
                            break;
                        }
                        default: {
                            c8 = '~';
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
            continue;
        }
    }
}
