// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.Insets;
import java.awt.Rectangle;
import com.avocent.kvm.b.d.a;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import com.avocent.a.d;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import com.avocent.a.a.i;
import javax.swing.JFrame;

public class e extends JFrame {

    protected i a;
    private JScrollPane scroll_pane;//Originally b
    private JPanel jpanel;//Originally c
    ScrollableJPanel_f scollableJPanel;//Originally d
    public static int e;
    private static final String[] z = {"images/connectvideo16.gif", "TITLE", "MainWindow_Title", ", ", ": ", "Video Viewer", "Center", "Scroll Pane ", "Container   ", "Frame      ", "KVM Client: call to main window pack.", " Call to resize from outside event thread.", "Video panel ", "Viewport    "};

    public e(final i a) {
        this.a = a;
        this.scollableJPanel = new ScrollableJPanel_f(this);
        this.a();
        final String s = com.avocent.a.a.b.e.z[1];
        this.a.d();
        this.setTitle(a.b(s, com.avocent.a.d.b(com.avocent.a.a.b.e.z[2])).toString());
        try {
            this.setIconImage(new ImageIcon(i.class.getResource(com.avocent.a.a.b.e.z[0])).getImage());
        } catch (Exception ex) {
        }
        this.scroll_pane.setViewportView(this.scollableJPanel);
        this.scroll_pane.getViewport().setBackground(Color.black);
        this.b().add(a.o().c());
    }

    private void a() {
        this.jpanel = new JPanel();
        this.scroll_pane = new JScrollPane();
        this.jpanel.setLayout(new GridBagLayout());
        this.jpanel.setBackground(new Color(0, 0, 0));
        this.setDefaultCloseOperation(3);
        this.setTitle(com.avocent.a.a.b.e.z[5]);
        this.getContentPane().add(this.scroll_pane, com.avocent.a.a.b.e.z[6]);
        this.pack();
    }

    public JPanel b() {
        return this.scollableJPanel;
    }

    @Override
    public void pack() {
        final int e = com.avocent.a.a.b.e.e;
        this.a.b().a(com.avocent.a.a.b.e.z[10]);
        if (!SwingUtilities.isEventDispatchThread()) {
            System.out.println(com.avocent.a.a.b.e.z[11]);
        }
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());
        final Dimension dimension = new Dimension(screenSize.width - screenInsets.left - screenInsets.right, screenSize.height - screenInsets.top - screenInsets.bottom);
        this.scollableJPanel.invalidate();
        super.pack();
        Dimension preferredSize = this.getPreferredSize();
        Label_0250:
        {
            if (preferredSize.width > dimension.width || preferredSize.height > dimension.height) {
                this.setSize(new Dimension(Math.min(preferredSize.width, dimension.width), Math.min(preferredSize.height, dimension.height)));
                this.scollableJPanel.invalidate();
                this.scroll_pane.getViewport().validate();
                if (e == 0) {
                    break Label_0250;
                }
                int c = com.avocent.kvm.b.d.a.c;
                com.avocent.kvm.b.d.a.c = ++c;
            }
            if (preferredSize.getWidth() < 600.0 || preferredSize.getHeight() < 400.0) {
                preferredSize = new Dimension(600, 400);
            }
            this.setSize(preferredSize);
        }
        this.setMaximizedBounds(new Rectangle(dimension));
        if (this.a.b().a()) {
            this.a(this.a.b(), com.avocent.a.a.b.e.z[9], this);
            this.a(this.a.b(), com.avocent.a.a.b.e.z[7], this.scroll_pane);
            this.a(this.a.b(), com.avocent.a.a.b.e.z[13], this.scroll_pane.getViewport());
            this.a(this.a.b(), com.avocent.a.a.b.e.z[8], this.scollableJPanel);
            if (this.scollableJPanel.getComponentCount() > 0) {
                this.a(this.a.b(), com.avocent.a.a.b.e.z[12], this.scollableJPanel.getComponent(0));
            }
        }
    }

    void a(final com.avocent.kvm.b.f.e e, final String s, final Component component) {
        int n = /*e.*/ this.e;
        Dimension preferredSize = component.getPreferredSize();
        e.a(" " + s + /*e.*/ z[4] + preferredSize.width + /*e.*/ this.z[3] + preferredSize.height);
        if (com.avocent.kvm.b.d.a.c != 0) {
            /*e.*/
            this.e = ++n;
        }
    }

    @Override
    public void setVisible(final boolean visible) {
        super.setVisible(visible);
    }
}
