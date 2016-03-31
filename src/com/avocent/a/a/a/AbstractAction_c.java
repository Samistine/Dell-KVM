// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import com.avocent.kvm.b.d.a;
import java.awt.Component;
import javax.swing.filechooser.FileFilter;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import java.awt.image.RenderedImage;
import javax.swing.AbstractAction;

//Originally named c
public class AbstractAction_c extends AbstractAction {

    i a;
    public static int b;
    private static final String[] z;

    public AbstractAction_c(i a) {
        super(d.b(AbstractAction_c.z[5]));
        a.d();

        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        final File a = this.a();
        if (a != null) {
            this.a(a);
        }
    }

    public File a() {
        int b = AbstractAction_c.b;
        final JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter_l(this));
        fileChooser.setAcceptAllFileFilterUsed(false);
        final File file = (fileChooser.showSaveDialog(this.a.c()) == 0) ? fileChooser.getSelectedFile() : null;
        if (com.avocent.kvm.b.d.a.c != 0) {
            AbstractAction_c.b = ++b;
        }
        return file;
    }

    void a(File file) {
        if (!file.exists() || this.b(file)) {
            try {
                /*String absolutePath = file.getAbsolutePath();
                 if (absolutePath != null && !absolutePath.endsWith(c.z[2]) && !absolutePath.endsWith(c.z[0])) {
                 new StringBuilder().append(absolutePath).append(c.z[2]).toString();
                 }*/
                RenderedImage renderedImage = this.a.o().d();
                ImageIO.write(renderedImage, AbstractAction_c.z[4], file);
            } catch (IOException ex) {
                this.a.d();
                final String string = d.b(AbstractAction_c.z[3]);
                this.a.d();
                JOptionPane.showMessageDialog(this.a.r(), d.b(AbstractAction_c.z[1]), string, 0);
            }
        }
    }

    boolean b(File file) {
        final int b = AbstractAction_c.b;
        final Object[] array = {file.getAbsoluteFile()};
        this.a.d();
        final String a = d.a(AbstractAction_c.z[7], array);
        this.a.d();
        final boolean b2 = JOptionPane.showConfirmDialog(this.a.r(), a, d.b(AbstractAction_c.z[6]), 0, 3) == 0;
        if (b != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
        return b2;
    }

    static {
        final String[] z2 = new String[8];
        final int n = 0;
        final char[] charArray = "-6bU\"".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097:
            {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\u0003';
                            break;
                        }
                        case 1: {
                            c2 = '\\';
                            break;
                        }
                        case 2: {
                            c2 = '\u0012';
                            break;
                        }
                        case 3: {
                            c2 = '0';
                            break;
                        }
                        default: {
                            c2 = 'E';
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
        final char[] charArray2 = "@=bD0q9VY$o3uo\u0012q5fU\u0000q.}B".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213:
            {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\u0003';
                            break;
                        }
                        case 1: {
                            c4 = '\\';
                            break;
                        }
                        case 2: {
                            c4 = '\u0012';
                            break;
                        }
                        case 3: {
                            c4 = '0';
                            break;
                        }
                        default: {
                            c4 = 'E';
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
        final char[] charArray3 = "-6bW".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329:
            {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '\u0003';
                            break;
                        }
                        case 1: {
                            c6 = '\\';
                            break;
                        }
                        case 2: {
                            c6 = '\u0012';
                            break;
                        }
                        case 3: {
                            c6 = '0';
                            break;
                        }
                        default: {
                            c6 = 'E';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
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
        final char[] charArray4 = "@=bD0q9VY$o3uo\u0012q5fU\u0000q.}B\u001aW5f\\ ".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0445:
            {
                if (n14 > 1) {
                    break Label_0445;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '\u0003';
                            break;
                        }
                        case 1: {
                            c8 = '\\';
                            break;
                        }
                        case 2: {
                            c8 = '\u0012';
                            break;
                        }
                        case 3: {
                            c8 = '0';
                            break;
                        }
                        default: {
                            c8 = 'E';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
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
        final char[] charArray5 = "i,u".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0561:
            {
                if (n18 > 1) {
                    break Label_0561;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = '\u0003';
                            break;
                        }
                        case 1: {
                            c10 = '\\';
                            break;
                        }
                        case 2: {
                            c10 = '\u0012';
                            break;
                        }
                        case 3: {
                            c10 = '0';
                            break;
                        }
                        default: {
                            c10 = 'E';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 > n20) {
                continue;
            }
            break;
        }
        z2[n17] = new String(charArray5).intern();
        final int n21 = 5;
        final char[] charArray6 = "N={^\bf2go\u0003j0wo\u0006b,fE7f\b}v,o9".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0677:
            {
                if (n22 > 1) {
                    break Label_0677;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = '\u0003';
                            break;
                        }
                        case 1: {
                            c12 = '\\';
                            break;
                        }
                        case 2: {
                            c12 = '\u0012';
                            break;
                        }
                        case 3: {
                            c12 = '0';
                            break;
                        }
                        default: {
                            c12 = 'E';
                            break;
                        }
                    }
                    charArray6[length6] = (char) (c11 ^ c12);
                    ++n24;
                } while (n22 == 0);
            }
            if (n22 > n24) {
                continue;
            }
            break;
        }
        z2[n21] = new String(charArray6).intern();
        final int n25 = 6;
        final char[] charArray7 = "@=bD0q9VY$o3uo\u0003j0wu=j/fC".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0793:
            {
                if (n26 > 1) {
                    break Label_0793;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = '\u0003';
                            break;
                        }
                        case 1: {
                            c14 = '\\';
                            break;
                        }
                        case 2: {
                            c14 = '\u0012';
                            break;
                        }
                        case 3: {
                            c14 = '0';
                            break;
                        }
                        default: {
                            c14 = 'E';
                            break;
                        }
                    }
                    charArray7[length7] = (char) (c13 ^ c14);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 > n28) {
                continue;
            }
            break;
        }
        z2[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "@=bD0q9VY$o3uo\nu9`G7j(wv,o9".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0909:
            {
                if (n30 > 1) {
                    break Label_0909;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = '\u0003';
                            break;
                        }
                        case 1: {
                            c16 = '\\';
                            break;
                        }
                        case 2: {
                            c16 = '\u0012';
                            break;
                        }
                        case 3: {
                            c16 = '0';
                            break;
                        }
                        default: {
                            c16 = 'E';
                            break;
                        }
                    }
                    charArray8[length8] = (char) (c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 <= n32) {
                z2[n29] = new String(charArray8).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
