package com.avocent.kvm.a.a;

import com.avocent.kvm.b.t;

public class q extends o
{
    private static final String[] z;
    
    public q() {
        this(0);
    }
    
    public q(final int n) {
        super(1026, q.z[0], (byte)(n & 0xFF));
        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: {
                if (b.h != 0) {
                    break;
                }
                return;
            }
        }
        throw new RuntimeException(q.z[1] + n);
    }
    
    public void a(final Object o) {
        final int h = b.h;
        if (o.equals(t.a)) {
            this.j = 0;
            if (h == 0) {
                return;
            }
        }
        if (o.equals(t.b)) {
            this.j = 1;
            if (h == 0) {
                return;
            }
        }
        if (o.equals(t.c)) {
            this.j = 2;
            if (h == 0) {
                return;
            }
        }
        if (o.equals(t.d)) {
            this.j = 3;
            if (h == 0) {
                return;
            }
        }
        if (o.equals(t.e)) {
            this.j = 4;
            if (h == 0) {
                return;
            }
        }
        this.j = 0;
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\u001f\u001cxYC(\u001cc[X-\u0017\u007fbC85ebC8".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098: {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'L';
                            break;
                        }
                        case 1: {
                            c2 = 'y';
                            break;
                        }
                        case 2: {
                            c2 = '\f';
                            break;
                        }
                        case 3: {
                            c2 = '\u000f';
                            break;
                        }
                        default: {
                            c2 = '*';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
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
        final char[] charArray2 = "\u0005\u0017znF%\u001d,yC(\u001cc/^>\u0018b|G%\r,cC!\u0010x5\n".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214: {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'L';
                            break;
                        }
                        case 1: {
                            c4 = 'y';
                            break;
                        }
                        case 2: {
                            c4 = '\f';
                            break;
                        }
                        case 3: {
                            c4 = '\u000f';
                            break;
                        }
                        default: {
                            c4 = '*';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
