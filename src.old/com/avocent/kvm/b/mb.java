// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import javax.swing.SwingUtilities;

class mb extends Thread {

    boolean a;
    final ob b;
    private static final String z;

    mb(final ob b) {
        super(mb.z);
        this.b = b;
        this.a = false;
    }

    public void a(final boolean b) {
        this.b.y |= b;
    }

    @Override
    public void run() {
        final boolean t = g.t;
        try {
            while (!this.a) {
                Thread.sleep(30L);
                synchronized (this) {
                    if (!this.b.B) {
                        this.wait();
                    }
                    SwingUtilities.invokeLater(this.b.C);
                }
                if (t) {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static {
        final char[] charArray = "5\u001fp&?\b\\W3>\u0007\bg".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0093:
            {
                if (n > 1) {
                    break Label_0093;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'f';
                            break;
                        }
                        case 1: {
                            c2 = '|';
                            break;
                        }
                        case 2: {
                            c2 = '\u0002';
                            break;
                        }
                        case 3: {
                            c2 = 'C';
                            break;
                        }
                        default: {
                            c2 = 'Z';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                break;
            }
            continue;
        }
    }
}
