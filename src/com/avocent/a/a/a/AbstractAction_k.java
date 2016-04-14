// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named k
public class AbstractAction_k extends AbstractAction {

    i a;
    private static final String z = "MainMenu_View_Fit";

    public AbstractAction_k(i a) {
        super(d.b(AbstractAction_k.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.r().pack();
    }
}
