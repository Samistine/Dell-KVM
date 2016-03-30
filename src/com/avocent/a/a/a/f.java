package com.avocent.a.a.a;

import java.awt.Component;
import com.avocent.a.g;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.b.b;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

public class f extends AbstractAction
{
    i a;
    protected b b;
    private static final String z;
    
    public f(final i a) {
        a.d();
        super(d.b(f.z));
        this.a = a;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        if (this.b == null) {
            this.b = new b(this.a, true);
        }
        this.b.setLocationRelativeTo(this.a.c());
        this.b.setVisible(true);
    }
    
    static {
        final char[] charArray = "\u0004Eb\u00039,J~2<,H{25+K~\u0019".toCharArray();
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
                            c2 = 'I';
                            break;
                        }
                        case 1: {
                            c2 = '$';
                            break;
                        }
                        case 2: {
                            c2 = '\u000b';
                            break;
                        }
                        case 3: {
                            c2 = 'm';
                            break;
                        }
                        default: {
                            c2 = 't';
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
