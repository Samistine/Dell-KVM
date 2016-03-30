package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;

public abstract class b extends a
{
    int d;
    protected int e;
    int f;
    protected String g;
    public static int h;
    private static final String z;
    
    public b(final int d) {
        super();
        this.f = 0;
        this.g = b.z;
        this.d = d;
    }
    
    protected void a(final byte[] array) {
        this.d = ((array[4] & 0xFF) << 8 | (array[5] & 0xFF));
        this.e = a.b(array, 6);
    }
    
    public abstract void a(final byte[] p0, final byte[] p1) throws IOException;
    
    public void a(final int d) {
        this.d = d;
    }
    
    public int d() {
        return this.d;
    }
    
    public void b(final int e) {
        this.e = e;
    }
    
    public byte[] a() {
        return a(this.d, this.g());
    }
    
    public int g() {
        return this.e;
    }
    
    public int f() {
        return this.e;
    }
    
    public abstract byte[] b();
    
    static byte[] a(final int n, final int n2) {
        return new byte[] { 66, 69, 69, 70, (byte)(n >>> 8 & 0xFF), (byte)(n & 0xFF), (byte)(n2 >>> 8 & 0xFF), (byte)(n2 & 0xFF) };
    }
    
    static {
        final char[] charArray = "cCHZ".toCharArray();
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
                            c2 = '!';
                            break;
                        }
                        case 1: {
                            c2 = '\u0006';
                            break;
                        }
                        case 2: {
                            c2 = '\r';
                            break;
                        }
                        case 3: {
                            c2 = '\u001c';
                            break;
                        }
                        default: {
                            c2 = ' ';
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
