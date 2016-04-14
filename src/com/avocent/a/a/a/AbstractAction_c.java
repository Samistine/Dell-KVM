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
    private static final String[] z = {".jpeg", "CaptureDialog_WriteError", ".jpg", "CaptureDialog_WriteError_Title", "jpg", "MainMenu_File_CaptureToFile", "CaptureDialog_FileExists", "CaptureDialog_OverwriteFile"};

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
}
