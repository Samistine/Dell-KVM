// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named g
public class AbstractAction_g extends AbstractAction {

    i a;
    private static final String[] z = {"MainMenu_Help_ContentsAndIndex", "IDFF_HELP_ON_REDIRECTION_PAGE"};

    public AbstractAction_g(i a) {
        super(d.b(AbstractAction_g.z[0]));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.d();
        final String b = d.b(AbstractAction_g.z[0]);
        this.a.d();
        JOptionPane.showMessageDialog(this.a.c(), d.b(AbstractAction_g.z[1]), b, 1);
    }
}
