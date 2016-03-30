package com.avocent.lenovo.kvm.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class b extends AbstractAction
{
    protected a a;
    private static final String z;
    
    public b(final a a) {
        super(a.a().b(b.z));
        this.a = a;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.f();
    }
    
    static {
        final char[] charArray = "\u0002,\u0019o6'\u000e:E;.\u0000/".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094: {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'K';
                            break;
                        }
                        case 1: {
                            c2 = 'a';
                            break;
                        }
                        case 2: {
                            c2 = ']';
                            break;
                        }
                        case 3: {
                            c2 = '\u0006';
                            break;
                        }
                        default: {
                            c2 = 'W';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
