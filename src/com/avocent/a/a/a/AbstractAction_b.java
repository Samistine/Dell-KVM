// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.image.RenderedImage;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import java.awt.datatransfer.Clipboard;
import javax.swing.AbstractAction;

//Originally named b
public class AbstractAction_b extends AbstractAction {

    i a;
    private static final String[] z;

    public AbstractAction_b(i a) {
        super(d.b(AbstractAction_b.z[0]));
        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3:
        {
            RenderedImage renderedImage = this.a.o().d();
            if (renderedImage != null) {
                try {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(new ImageTransferable((Image) renderedImage), null);
                    break block3;
                } catch (IllegalStateException var3_4) {
                    com.avocent.kvm.b.f.b.a().a(z[2] + var3_4.getMessage());
                    if (AbstractAction_c.b == 0) {
                        break block3;
                    }
                }
            }
            com.avocent.kvm.b.f.b.a().a(z[1]);
        }
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "'%u37\u000f*i\u0002<\u0003(y\u00029\u000b4h(\b\u000f\u0010s\u001e\u0016\u00034~2\u001b\u0018 ".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098:
            {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'j';
                            break;
                        }
                        case 1: {
                            c2 = 'D';
                            break;
                        }
                        case 2: {
                            c2 = '\u001c';
                            break;
                        }
                        case 3: {
                            c2 = ']';
                            break;
                        }
                        default: {
                            c2 = 'z';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
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
        final char[] charArray2 = ")%l)\u000f\u0018!<)\u0015J'p4\n\b+}/\u001eJ\"}4\u0016\u000f <?\u001f\t%i.\u001fJ-q<\u001d\u000fdu.Z\u00041p1".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214:
            {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'j';
                            break;
                        }
                        case 1: {
                            c4 = 'D';
                            break;
                        }
                        case 2: {
                            c4 = '\u001c';
                            break;
                        }
                        case 3: {
                            c4 = ']';
                            break;
                        }
                        default: {
                            c4 = 'z';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
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
        final char[] charArray3 = "J\u0007}-\u000e\u001f6y}\u000e\u0005d\u007f1\u0013\u001a&s<\b\u000edz<\u0013\u0006!x}\r\u00030t}\u001f\u0012'y-\u000e\u0003+rgZ".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330:
            {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'j';
                            break;
                        }
                        case 1: {
                            c6 = 'D';
                            break;
                        }
                        case 2: {
                            c6 = '\u001c';
                            break;
                        }
                        case 3: {
                            c6 = ']';
                            break;
                        }
                        default: {
                            c6 = 'z';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 <= n12) {
                z2[n9] = new String(charArray3).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
