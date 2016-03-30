// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class g extends WindowAdapter {

    final h a;
    private static final String z;

    g(final h a) {
        this.a = a;
    }

    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        this.a.o.b().a(g.z);
        this.a.j();
    }

    static {
        final char[] charArray = "I3a\u0001J\u001b&`\u001d\r\r*r\u0002B\u000ecd\u0007C\r,dND\u001acp\u0002B\u001a*}\t\u0003".toCharArray();
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
                            c2 = 'i';
                            break;
                        }
                        case 1: {
                            c2 = 'C';
                            break;
                        }
                        case 2: {
                            c2 = '\u0013';
                            break;
                        }
                        case 3: {
                            c2 = 'n';
                            break;
                        }
                        default: {
                            c2 = '-';
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
