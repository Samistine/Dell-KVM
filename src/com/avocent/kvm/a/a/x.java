package com.avocent.kvm.a.a;

public class x extends h
{
    boolean j;
    int k;
    private static final String z;
    
    public x(final boolean j) {
        super(782);
        this.k = 1;
        this.j = j;
        this.e = 16;
    }
    
    public x() {
        super(782);
        this.k = 1;
        this.e = 16;
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.j = (array2[0] > 0);
    }
    
    public String e() {
        return x.z;
    }
    
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = (byte)(this.j ? 1 : 0);
        return array;
    }
    
    static {
        final char[] charArray = "\u001b kG_m\faCR!,/pU<<jQD".toCharArray();
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
                            c2 = 'M';
                            break;
                        }
                        case 1: {
                            c2 = 'I';
                            break;
                        }
                        case 2: {
                            c2 = '\u000f';
                            break;
                        }
                        case 3: {
                            c2 = '\"';
                            break;
                        }
                        default: {
                            c2 = '0';
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
