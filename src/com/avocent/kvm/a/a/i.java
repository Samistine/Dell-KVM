package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;

public class i extends h
{
    protected boolean j;
    protected int k;
    protected boolean l;
    protected boolean m;
    private static final String z;
    
    public i() {
        super(1027);
        this.j = true;
        this.b(16);
    }
    
    public void c(final int k) {
        this.k = k;
    }
    
    public void b(final boolean l) {
        this.l = l;
    }
    
    public byte[] b() {
        final byte[] array = new byte[8];
        a.c(this.m ? 1 : 0, array, a.c(this.l ? 1 : 0, array, a.c(this.k, array, a.c(this.j ? 0 : 1, array, 0))));
        return array;
    }
    
    public String e() {
        return i.z;
    }
    
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.j = ((array2[0] & 0xFF) > 0);
        this.k = (array2[1] & 0xFF);
        this.l = ((array2[2] & 0xFF) > 0);
        this.m = ((array2[3] & 0xFF) > 0);
    }
    
    static {
        final char[] charArray = "\u0015j^8\u0002\u0005LE\u0010;4KO\f .BO\u000f''hO".toCharArray();
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
                            c2 = 'F';
                            break;
                        }
                        case 1: {
                            c2 = '\u000f';
                            break;
                        }
                        case 2: {
                            c2 = '*';
                            break;
                        }
                        case 3: {
                            c2 = '|';
                            break;
                        }
                        default: {
                            c2 = 'T';
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
