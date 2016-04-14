// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import com.avocent.a.d;
import java.io.File;
import javax.swing.filechooser.FileFilter;

//Originally named l
public class FileFilter_l extends FileFilter {

    final AbstractAction_c a;
    private static final String[] z = {".jpeg", ".jpg", "CaptureDialog_FileTypeDescription"};

    public FileFilter_l(AbstractAction_c a) {
        this.a = a;
    }

    @Override
    public boolean accept(File file) {
        final String name = file.getName();
        return file.isDirectory() || name.endsWith(FileFilter_l.z[1]) || name.endsWith(FileFilter_l.z[0]);
    }

    @Override
    public String getDescription() {
        this.a.a.d();
        return d.b(FileFilter_l.z[2]);
    }
}
