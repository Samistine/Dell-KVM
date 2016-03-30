// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.datatransfer.DataFlavor;
import java.awt.Image;
import java.awt.datatransfer.Transferable;

class a implements Transferable {

    private Image a;
    private static final String[] z;

    public a(final Image a) {
        this.a = a;
    }

    @Override
    public Object getTransferData(final DataFlavor dataFlavor) {
        System.out.println(com.avocent.a.a.a.a.z[1]);
        if (dataFlavor.equals(DataFlavor.imageFlavor)) {
            return this.a;
        }
        return null;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        System.out.println(com.avocent.a.a.a.a.z[0]);
        return new DataFlavor[]{DataFlavor.imageFlavor};
    }

    @Override
    public boolean isDataFlavorSupported(final DataFlavor dataFlavor) {
        System.out.println(com.avocent.a.a.a.a.z[2]);
        return dataFlavor.equals(DataFlavor.imageFlavor);
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "_C1b\u001d\rE:e/\u001aV\u0010w=\u001eb8w?\u0010V'".toCharArray();
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
                            c2 = '\u007f';
                            break;
                        }
                        case 1: {
                            c2 = '$';
                            break;
                        }
                        case 2: {
                            c2 = 'T';
                            break;
                        }
                        case 3: {
                            c2 = '\u0016';
                            break;
                        }
                        default: {
                            c2 = 'I';
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
        final char[] charArray2 = "_C1b\u001d\rE:e/\u001aV\u0010w=\u001e".toCharArray();
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
                            c4 = '\u007f';
                            break;
                        }
                        case 1: {
                            c4 = '$';
                            break;
                        }
                        case 2: {
                            c4 = 'T';
                            break;
                        }
                        case 3: {
                            c4 = '\u0016';
                            break;
                        }
                        default: {
                            c4 = 'I';
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
        final char[] charArray3 = "_M'R(\u000bE\u0012z(\tK&E<\u000fT;d=\u001a@".toCharArray();
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
                            c6 = '\u007f';
                            break;
                        }
                        case 1: {
                            c6 = '$';
                            break;
                        }
                        case 2: {
                            c6 = 'T';
                            break;
                        }
                        case 3: {
                            c6 = '\u0016';
                            break;
                        }
                        default: {
                            c6 = 'I';
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
