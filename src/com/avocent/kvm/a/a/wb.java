package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.d.d;
import com.avocent.kvm.b.d.b;

public class wb extends b implements d
{
    int f;
    int g;
    private static final String z;
    
    public wb() {
        super(63);
        this.e = true;
    }
    
    public wb(final int b, final int c, final int f, final int g, final int n) {
        super(n);
        this.e = true;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public int d() {
        return 0;
    }
    
    public byte[] a() {
        return b.a(521, 16);
    }
    
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = 0;
        array[1] = (byte)(this.g & 0xFF);
        final int g = this.g();
        array[2] = (byte)(g >> 8 & 0xFF);
        array[3] = (byte)(g & 0xFF);
        final int h = this.h();
        array[4] = (byte)(h >> 8 & 0xFF);
        array[5] = (byte)(h & 0xFF);
        final int f = this.f;
        array[6] = (byte)(f >> 8 & 0xFF);
        array[7] = (byte)(f & 0xFF);
        return array;
    }
    
    public void a(final byte[] array, final byte[] array2, final int n) throws IOException {
        this.g = array2[1];
        this.b = a.b(array2, 2);
        this.c = a.b(array2, 4);
        this.f = a.b(array2, 6);
    }
    
    public String e() {
        return wb.z;
    }
    
    public int f() {
        return 16;
    }
    
    static {
        final char[] charArray = "t$`'\u0016\u0019\u000fp8\u0007XkG1\u0002L.f ".toCharArray();
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
                            c2 = '9';
                            break;
                        }
                        case 1: {
                            c2 = 'K';
                            break;
                        }
                        case 2: {
                            c2 = '\u0015';
                            break;
                        }
                        case 3: {
                            c2 = 'T';
                            break;
                        }
                        default: {
                            c2 = 's';
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
