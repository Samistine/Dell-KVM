// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.awt.event.WindowListener;
import javax.swing.JDialog;
import java.awt.Component;
import java.awt.Frame;
import com.avocent.a.a.b.c;
import com.avocent.a.d;
import com.avocent.a.e;
import com.avocent.a.f;

public class h extends f {

    protected i o;
    public WindowAdpater_g p;
    private static final String[] z;

    public h(final i o) {
        super(z[1], o); //Sam
        this.p = new WindowAdpater_g(this);
        this.o = o;
    }

    @Override
    public d d() {
        return this.o.d();
    }

    @Override
    public void g() {
        if (this.component_b == null) {
            this.setComponent_b((Component) new c(this, this.o.c()));
            ((JDialog) this.component_b).addWindowListener(this.p);
        }
        if (!this.component_b.isVisible()) {
            ((JDialog) this.component_b).setLocationRelativeTo(this.o.c());
            this.component_b.setVisible(true);
        }
        ((JDialog) this.component_b).toFront();
    }

    public void m() {
        this.component_b.setVisible(false);
        this.component_b = null;
    }

    @Override
    public void j() {
        this.o.b().a(z[0]);//Sam
        System.exit(0);
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "Ea7x \u0011G391\u0004\\ |>\u0000Vm".toCharArray();
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
                            c2 = 'e';
                            break;
                        }
                        case 1: {
                            c2 = '2';
                            break;
                        }
                        case 2: {
                            c2 = 'C';
                            break;
                        }
                        case 3: {
                            c2 = '\u0019';
                            break;
                        }
                        default: {
                            c2 = 'R';
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
        final char[] charArray2 = "5@,~ \u0000A0];\u0004^,~\u0011\n\\7k=\t^&k".toCharArray();
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
                            c4 = 'e';
                            break;
                        }
                        case 1: {
                            c4 = '2';
                            break;
                        }
                        case 2: {
                            c4 = 'C';
                            break;
                        }
                        case 3: {
                            c4 = '\u0019';
                            break;
                        }
                        default: {
                            c4 = 'R';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
