package com.avocent.kvm.b.d;

import java.io.IOException;
import java.util.Vector;
import java.io.OutputStream;
import com.avocent.kvm.b.u;

public class g
{
    protected u a;
    protected OutputStream b;
    protected Vector c;
    protected i d;
    protected static int e;
    public static boolean f;
    private static final String[] z;
    
    public g(final u a, final OutputStream b) {
        super();
        this.c = new Vector();
        this.a = a;
        this.b = b;
        (this.d = new i(this)).start();
    }
    
    public void a(final c c) {
        if (c.e() != g.z[4]) {
            System.out.println(g.z[3] + c.e());
        }
        synchronized (this.d) {
            c.a(true);
            this.c.addElement(c);
            this.d.notifyAll();
        }
    }
    
    protected void b(final c c) throws IOException {
        if (c == null) {
            System.out.println(g.z[1]);
            return;
        }
        synchronized (this.b) {
            final byte[] a = c.a();
            final byte[] b = c.b();
            if (a != null) {
                final int n = a[6] << 8 | a[7];
                final byte b2 = a[5];
                if (n < 16 || n > 1500) {
                    System.out.println(g.z[2] + a[5] + g.z[0] + n);
                    if (b2 != 2) {
                        return;
                    }
                }
                this.b.write(a);
            }
            if (b != null) {
                this.b.write(b);
            }
            this.b.flush();
        }
    }
    
    protected void a(final Throwable t) {
        t.printStackTrace();
    }
    
    public void a() {
        this.d.a();
    }
    
    static {
        final String[] z2 = new String[5];
        final int n = 0;
        final char[] charArray = "\u001b#.\u0011w$#.\u0012# f}U".toCharArray();
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
                            c2 = 'H';
                            break;
                        }
                        case 1: {
                            c2 = 'F';
                            break;
                        }
                        case 2: {
                            c2 = '@';
                            break;
                        }
                        case 3: {
                            c2 = 'u';
                            break;
                        }
                        default: {
                            c2 = 'W';
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
        final char[] charArray2 = "hf\u0001\u0001#-+0\u0001>&!`\u00018h5%\u001b3h(5\u0019;h6!\u0016<-2n".toCharArray();
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
                            c4 = 'H';
                            break;
                        }
                        case 1: {
                            c4 = 'F';
                            break;
                        }
                        case 2: {
                            c4 = '@';
                            break;
                        }
                        case 3: {
                            c4 = 'u';
                            break;
                        }
                        default: {
                            c4 = 'W';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 > n8) {
                continue;
            }
            break;
        }
        z2[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "\u0018'#\u001e2<\u000b!\u001b6/#2U\u0004-($U\u000316%Ujh".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330: {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'H';
                            break;
                        }
                        case 1: {
                            c6 = 'F';
                            break;
                        }
                        case 2: {
                            c6 = '@';
                            break;
                        }
                        case 3: {
                            c6 = 'u';
                            break;
                        }
                        default: {
                            c6 = 'W';
                            break;
                        }
                    }
                    charArray3[length3] = (char)(c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 > n12) {
                continue;
            }
            break;
        }
        z2[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = "h\u0015%\u001b3!('Ow".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0446: {
                if (n14 > 1) {
                    break Label_0446;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'H';
                            break;
                        }
                        case 1: {
                            c8 = 'F';
                            break;
                        }
                        case 2: {
                            c8 = '@';
                            break;
                        }
                        case 3: {
                            c8 = 'u';
                            break;
                        }
                        default: {
                            c8 = 'W';
                            break;
                        }
                    }
                    charArray4[length4] = (char)(c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 > n16) {
                continue;
            }
            break;
        }
        z2[n13] = new String(charArray4).intern();
        final int n17 = 4;
        final char[] charArray5 = "\u001e/$\u00108h\u0007#\u001e".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0562: {
                if (n18 > 1) {
                    break Label_0562;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'H';
                            break;
                        }
                        case 1: {
                            c10 = 'F';
                            break;
                        }
                        case 2: {
                            c10 = '@';
                            break;
                        }
                        case 3: {
                            c10 = 'u';
                            break;
                        }
                        default: {
                            c10 = 'W';
                            break;
                        }
                    }
                    charArray5[length5] = (char)(c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 <= n20) {
                z2[n17] = new String(charArray5).intern();
                z = z2;
                g.e = 0;
                return;
            }
            continue;
        }
    }
}
