package com.avocent.a;

import javax.swing.JFrame;

public class g extends e
{
    protected d j;
    private static final String z;
    
    public g() {
        super(g.z, null);
        this.j = new d();
    }
    
    public g(final String s) {
        super(s, null);
        this.j = new d();
    }
    
    public JFrame c() {
        return (JFrame)this.e();
    }
    
    public d d() {
        return this.j;
    }
    
    static {
        final char[] charArray = "-o.b-\u000f`3~\u0001\fb\"~".toCharArray();
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
                            c2 = '`';
                            break;
                        }
                        case 1: {
                            c2 = '\u000e';
                            break;
                        }
                        case 2: {
                            c2 = 'G';
                            break;
                        }
                        case 3: {
                            c2 = '\f';
                            break;
                        }
                        default: {
                            c2 = 'n';
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
