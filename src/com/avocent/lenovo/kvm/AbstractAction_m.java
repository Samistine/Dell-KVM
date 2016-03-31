// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import com.avocent.kvm.nativekeyboard.c;
import java.awt.event.ActionEvent;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named m
public class AbstractAction_m extends AbstractAction {

    i a;
    protected boolean b;
    private static final String z;

    public AbstractAction_m(final i a) {
        super(a.b(AbstractAction_m.z));
        this.b = false;
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        ((c) this.a.l()).a(!this.b);
        ((c) this.a.m()).a(!this.b);
        this.enabled = !this.enabled;
    }

    static {
        final char[] charArray = "\u000b.\u0006Ao2.\u0005ku/%\u000fXC\u0005>\u001aGI4".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094:
            {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'F';
                            break;
                        }
                        case 1: {
                            c2 = 'K';
                            break;
                        }
                        case 2: {
                            c2 = 'h';
                            break;
                        }
                        case 3: {
                            c2 = '4';
                            break;
                        }
                        default: {
                            c2 = '&';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                break;
            }
            continue;
        }
    }
}
