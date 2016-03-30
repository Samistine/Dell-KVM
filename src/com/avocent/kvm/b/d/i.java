// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.d;

class i extends Thread {

    protected int a;
    protected boolean b;
    final g c;
    private static final String z;

    i(final g c) {
        super(i.z + g.e);
        this.c = c;
        this.b = false;
        this.a = g.e++;
    }

    public void a() {
        this.b = true;
    }

    @Override
    public void run() {
        final boolean f = g.f;
        try {
            while (!this.b) {
                while (this.c.c.size() > 0) {
                    final c c = this.c.c.elementAt(0);
                    this.c.c.remove(0);
                    this.c.b(c);
                    c.a(false);
                    if (f) {
                        break;
                    }
                }
                synchronized (this) {
                    while (this.c.c.size() == 0 && !this.b) {
                        this.wait(1000L);
                        if (f) {
                            break;
                        }
                    }
                }
                if (f) {
                    break;
                }
            }
        } catch (Throwable t) {
            this.c.a(t);
        }
    }

    static {
        final char[] charArray = "Xil: vNT\u007f\u0001g\u001fl{\u001crXDh-".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094:
            {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u0013';
                            break;
                        }
                        case 1: {
                            c2 = '?';
                            break;
                        }
                        case 2: {
                            c2 = '!';
                            break;
                        }
                        case 3: {
                            c2 = '\u001a';
                            break;
                        }
                        default: {
                            c2 = 'r';
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
