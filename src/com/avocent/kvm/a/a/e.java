package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class e extends b
{
    protected int i;
    protected boolean j;
    private static final String z;
    
    public e() {
        super(512);
        this.b(16);
    }
    
    public e(final int i, final boolean j) {
        super(512);
        this.b(16);
        this.i = i;
        this.j = j;
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.j = (array2[1] > 0);
        this.i = a.b(array2, 2);
    }
    
    public byte[] b() {
        return new byte[] { 0, !this.j, (byte)((this.i & 0xFF00) >> 8), (byte)(this.i & 0xFF), 0, 0, 0, 0 };
    }
    
    public String e() {
        return e.z;
    }
    
    static {
        final char[] charArray = "~[5\"\fTL(\u0004\u0002A_\u001e%\u0012@[?4".toCharArray();
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
                            c2 = '5';
                            break;
                        }
                        case 1: {
                            c2 = '>';
                            break;
                        }
                        case 2: {
                            c2 = 'L';
                            break;
                        }
                        case 3: {
                            c2 = '@';
                            break;
                        }
                        default: {
                            c2 = 'c';
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
