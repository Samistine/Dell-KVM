package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.d.d;
import com.avocent.kvm.b.d.b;

public class vb extends b implements d
{
    int f;
    int g;
    private static final String z;
    
    public vb() {
        super(63);
    }
    
    public vb(final int b, final int c, final int f, final int g, final int n) {
        super(n);
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public int d() {
        return 0;
    }
    
    public byte[] a() {
        return b.a(513, 16);
    }
    
    public byte[] b() {
        int h = b.h;
        final byte[] array = new byte[8];
        array[0] = 0;
        array[1] = (byte)(this.g & 0xFF);
        final int n = (this.g() < 0) ? 0 : this.g();
        array[2] = (byte)(n >> 8 & 0xFF);
        array[3] = (byte)(n & 0xFF);
        final int n2 = (this.h() < 0) ? 0 : this.h();
        array[4] = (byte)(n2 >> 8 & 0xFF);
        array[5] = (byte)(n2 & 0xFF);
        final int f = this.f;
        array[6] = (byte)(f >> 8 & 0xFF);
        array[7] = (byte)(f & 0xFF);
        final byte[] array2 = array;
        if (a.c != 0) {
            b.h = ++h;
        }
        return array2;
    }
    
    public void a(final byte[] array, final byte[] array2, final int n) throws IOException {
        this.g = array2[1];
        this.b = a.b(array2, 2);
        this.c = a.b(array2, 4);
        this.f = a.b(array2, 6);
    }
    
    public String e() {
        return vb.z;
    }
    
    public int f() {
        return 16;
    }
    
    static {
        final char[] charArray = "|_%l\u0001\u0011t1k\u0005\u0011b5n\u0011TC$".toCharArray();
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
                            c2 = '1';
                            break;
                        }
                        case 1: {
                            c2 = '0';
                            break;
                        }
                        case 2: {
                            c2 = 'P';
                            break;
                        }
                        case 3: {
                            c2 = '\u001f';
                            break;
                        }
                        default: {
                            c2 = 'd';
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
