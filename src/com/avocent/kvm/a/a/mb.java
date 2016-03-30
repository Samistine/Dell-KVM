package com.avocent.kvm.a.a;

public class mb extends y
{
    boolean j;
    private static final String[] z;
    
    public mb() {
        super(132);
        this.e = 16;
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.j = (array2[0] == 0);
        System.out.println(mb.z[0] + this.j);
    }
    
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = (byte)(this.j ? 0 : 1);
        return array;
    }
    
    public String e() {
        return mb.z[1];
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "d<\u0000nO+J\neD*\u000f\n~\n7\u001e\b~_7PI".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098: {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'D';
                            break;
                        }
                        case 1: {
                            c2 = 'j';
                            break;
                        }
                        case 2: {
                            c2 = 'i';
                            break;
                        }
                        case 3: {
                            c2 = '\n';
                            break;
                        }
                        default: {
                            c2 = '*';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n4;
                } while (n2 == 0);
            }
            if (n2 > n4) {
                continue;
            }
            break;
        }
        z2[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "\u0012\u0003\roEd)\u0006dD!\t\u001d*y0\u000b\u001d\u007fY".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214: {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'D';
                            break;
                        }
                        case 1: {
                            c4 = 'j';
                            break;
                        }
                        case 2: {
                            c4 = 'i';
                            break;
                        }
                        case 3: {
                            c4 = '\n';
                            break;
                        }
                        default: {
                            c4 = '*';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
