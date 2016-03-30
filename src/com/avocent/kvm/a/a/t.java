package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class t extends h
{
    byte[] j;
    int k;
    int l;
    private static final String z;
    
    public t() {
        super(770);
        this.j = new byte[4];
        this.e = 16;
    }
    
    public t(final int k, final int l) {
        super(770);
        this.j = new byte[4];
        this.k = k;
        this.l = l;
        this.e = 16;
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.k = a.b(array2, 0);
        this.l = a.b(array2, 2);
    }
    
    public byte[] b() {
        final byte[] array = new byte[8];
        a.a(this.k, array, 0);
        a.a(this.l, array, 2);
        return array;
    }
    
    public String e() {
        return t.z;
    }
    
    static {
        final char[] charArray = "\u001d\u001doy:'\u000bk5\u001f7XZ+\u001b/".toCharArray();
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
                            c2 = 'N';
                            break;
                        }
                        case 1: {
                            c2 = 'x';
                            break;
                        }
                        case 2: {
                            c2 = '\u001b';
                            break;
                        }
                        case 3: {
                            c2 = 'Y';
                            break;
                        }
                        default: {
                            c2 = '~';
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
