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
    private static final String[] z = {"MainMenu_File_CaptureToClipboard", "Capture to clipboard failed because image is null", " Capture to clipboard failed with exception: "};

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
}
