package com.avocent.kvm.a.a;

import java.io.IOException;
import com.avocent.kvm.b.d.a;

public class j extends h
{
    protected int j;
    protected boolean k;
    protected boolean l;
    private static final String z;
    
    public j() {
        super(33284);
    }
    
    public int h() {
        return this.j;
    }
    
    public boolean i() {
        return this.k;
    }
    
    public byte[] b() {
        final byte[] array = new byte[8];
        a.c(this.l ? 1 : 0, array, a.c(this.k ? 1 : 0, array, a.c(this.j, array, 0)));
        return array;
    }
    
    public String e() {
        return j.z;
    }
    
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.j = (array2[0] & 0xFF);
        this.k = ((array2[1] & 0xFF) > 0);
        this.l = ((array2[2] & 0xFF) > 0);
    }
    
    static {
        final char[] charArray = "*\u0006|\">\u0002?M,>\n5m\u0004\"\u001e?Q\u00124".toCharArray();
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
                            c2 = 'n';
                            break;
                        }
                        case 1: {
                            c2 = 'P';
                            break;
                        }
                        case 2: {
                            c2 = '?';
                            break;
                        }
                        case 3: {
                            c2 = 'a';
                            break;
                        }
                        default: {
                            c2 = 'Q';
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
