package com.avocent.kvm.a.a;

public class n extends h
{
    byte[] j;
    int k;
    private static final String z;
    
    public n() {
        super(1024);
        this.j = new byte[8];
        this.e = 16;
    }
    
    public void a(final byte[] array, final byte[] array2) {
    }
    
    public void c(final int k) {
        this.k = k;
    }
    
    public byte[] b() {
        return new byte[] { (byte)(this.k >>> 24 & 0xFF), (byte)(this.k >>> 16 & 0xFF), (byte)(this.k >>> 8 & 0xFF), (byte)(this.k & 0xFF), 0, 0, 0, 0 };
    }
    
    public String e() {
        return n.z;
    }
    
    static {
        final char[] charArray = " }GP\u0000\u0007qTE".toCharArray();
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
                            c2 = 'k';
                            break;
                        }
                        case 1: {
                            c2 = '\u0018';
                            break;
                        }
                        case 2: {
                            c2 = '\"';
                            break;
                        }
                        case 3: {
                            c2 = ' ';
                            break;
                        }
                        default: {
                            c2 = 'A';
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
