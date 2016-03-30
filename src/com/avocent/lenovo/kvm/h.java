package com.avocent.lenovo.kvm;

import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

public class h extends AbstractAction
{
    a a;
    private static final String z;
    
    public h(final a a) {
        super(a.b(h.z));
        this.a = a;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        System.exit(0);
    }
    
    static {
        final char[] charArray = "I<\u0006T\u0016I8\u0001O\u0016B4\u0003_\u0016A%\u0006N".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0093: {
                if (n > 1) {
                    break Label_0093;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u0004';
                            break;
                        }
                        case 1: {
                            c2 = '}';
                            break;
                        }
                        case 2: {
                            c2 = 'O';
                            break;
                        }
                        case 3: {
                            c2 = '\u001a';
                            break;
                        }
                        default: {
                            c2 = 'I';
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
