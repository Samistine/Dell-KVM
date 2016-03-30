package com.avocent.a.a;

import com.avocent.a.c.b;

class n implements b
{
    final i a;
    private static final String z;
    
    n(final i a) {
        this.a = a;
        super();
    }
    
    public void a() {
        this.a.b().a(n.z);
        this.a.c().toFront();
    }
    
    static {
        final char[] charArray = "Q3AlW\u0016\u0018]b\u0019\u0006\u0018]aV\u0006QGj\u0019\u0017\u001eA`^\u0003\u001eFk]Q\u0013VfX\u0004\u0002V%XQ\u0015FuU\u0018\u0012Rq\\Q\u0010Cu\u0019\u001d\u0010FkZ\u0019QRqM\u0014\u001cCq\u0017".toCharArray();
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
                            c2 = 'q';
                            break;
                        }
                        case 1: {
                            c2 = 'q';
                            break;
                        }
                        case 2: {
                            c2 = '3';
                            break;
                        }
                        case 3: {
                            c2 = '\u0005';
                            break;
                        }
                        default: {
                            c2 = '9';
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
