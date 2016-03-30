package com.avocent.kvm.b.d;

import java.io.UnsupportedEncodingException;
import java.io.IOException;

public abstract class a implements c
{
    protected boolean a;
    protected int b;
    public static int c;
    private static final String z;
    
    public void a(final boolean a) {
        this.a = a;
    }
    
    public boolean c() {
        return this.a;
    }
    
    public int d() {
        return this.b;
    }
    
    public void a(final byte[] array, final byte[] array2, final int n) throws IOException {
        this.a(array, array2);
    }
    
    public static int a(final byte[] array, final int n) {
        final boolean f = g.f;
        final int n2 = (array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8 | (array[n + 3] & 0xFF);
        if (a.c != 0) {
            g.f = !f;
        }
        return n2;
    }
    
    public static String a(final byte[] array, final int n, final int n2) {
        try {
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, n, array2, 0, n2);
            return new String(array2, a.z);
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static int a(final String s, final byte[] array, final int n, final int n2) {
        final boolean f = g.f;
        if (s == null) {
            int i = 0;
            while (i < n2) {
                array[n + i] = 0;
                ++i;
                if (f) {
                    break;
                }
            }
            if (!f) {
                return n + n2;
            }
        }
        try {
            final byte[] bytes = s.getBytes(a.z);
            System.arraycopy(bytes, 0, array, n, bytes.length);
            int j = bytes.length;
            while (j < n2) {
                array[n + j] = 0;
                ++j;
                if (f) {
                    break;
                }
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
        return n + n2;
    }
    
    public static int b(final byte[] array, final int n) {
        return (array[n] & 0xFF) << 8 | (array[n + 1] & 0xFF);
    }
    
    public static int a(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n >>> 8 & 0xFF);
        array[n2 + 1] = (byte)(n & 0xFF);
        return n2 + 2;
    }
    
    public static int b(final int n, final byte[] array, final int n2) {
        final boolean f = g.f;
        array[n2] = (byte)(n >>> 24 & 0xFF);
        array[n2 + 1] = (byte)(n >>> 16 & 0xFF);
        array[n2 + 2] = (byte)(n >>> 8 & 0xFF);
        array[n2 + 3] = (byte)(n & 0xFF);
        final int n3 = n2 + 4;
        if (f) {
            int c = a.c;
            a.c = ++c;
        }
        return n3;
    }
    
    public static int c(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n & 0xFF);
        return n2 + 1;
    }
    
    public static int b(final byte[] array, final byte[] array2, final int n) {
        System.arraycopy(array, 0, array2, n, array.length);
        return n + array.length;
    }
    
    static {
        final char[] charArray = "\u0017'(2Q".toCharArray();
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
                            c2 = 'B';
                            break;
                        }
                        case 1: {
                            c2 = 's';
                            break;
                        }
                        case 2: {
                            c2 = 'n';
                            break;
                        }
                        case 3: {
                            c2 = '\u001f';
                            break;
                        }
                        default: {
                            c2 = 'i';
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
