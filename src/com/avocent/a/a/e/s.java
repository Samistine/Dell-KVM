// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.io.IOException;
import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.nb;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import com.avocent.kvm.b.a.a;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import com.avocent.a.a.i;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;

public class s extends JPanel implements PropertyChangeListener, k {

    protected i a;
    protected c b;
    protected boolean c;
    protected boolean d;
    protected o e;
    private JRadioButton f;
    private JRadioButton g;
    private JSlider h;
    private JLabel i;
    private JLabel j;
    private JPanel k;
    private JPanel l;
    private JPanel m;
    private JPanel n;
    private JPanel o;
    private JSlider p;
    private JLabel q;
    private JTextField r;
    private JLabel s;
    private ButtonGroup t;
    private JLabel u;
    private JTextField v;
    private JLabel w;
    private static final String[] z = {" Option=","CompressionMode","false","true","CompressionMode Propery=","UVTable Propery=","YTable","UVTable","hasChanges returning ","YTable Propery=","hasChanges called","chrominanceSliderMouseReleased","UVSelector=","applyPressed called"," Exception: ","compressionMode=","YSelector=","luminanceSliderMouseReleased","  Kb/sec","Low Quality (420)","Network Statistics","Video Settings","High Quality (444)","Chrominance","Bandwidth:     ","VideoQualityPanel","Frame Rate:   ","  Frames/sec","Luminance","Video Compression Mode","cancelPressed called","mode420ActionPerformed","mode444ActionPerformed","Video Quality"};

    public s(final i a) {
        this.c = false;
        this.d = false;
        this.e = new o(this);
        this.a = a;
        this.g();
        this.a.a((PropertyChangeListener) this);
        this.a.a().a(this.e);
    }

    private void g() {
        this.t = new ButtonGroup();
        this.k = new JPanel();
        this.f = new JRadioButton();
        this.g = new JRadioButton();
        this.l = new JPanel();
        this.i = new JLabel();
        this.p = new JSlider();
        this.j = new JLabel();
        this.h = new JSlider();
        this.m = new JPanel();
        this.n = new JPanel();
        this.u = new JLabel();
        this.v = new JTextField();
        this.w = new JLabel();
        this.o = new JPanel();
        this.q = new JLabel();
        this.r = new JTextField();
        this.s = new JLabel();
        this.setMinimumSize(new Dimension(304, 185));
        this.setName(com.avocent.a.a.e.s.z[25]);
        this.setLayout(new GridBagLayout());
        this.k.setBorder(BorderFactory.createTitledBorder(com.avocent.a.a.e.s.z[29]));
        this.k.setLayout(new GridBagLayout());
        this.t.add(this.f);
        this.f.setText(com.avocent.a.a.e.s.z[19]);
        this.f.addActionListener(new m(this));
        this.k.add(this.f, new GridBagConstraints());
        this.f.getAccessibleContext().setAccessibleName(com.avocent.a.a.e.s.z[19]);
        this.t.add(this.g);
        this.g.setText(com.avocent.a.a.e.s.z[22]);
        this.g.addActionListener(new n(this));
        this.k.add(this.g, new GridBagConstraints());
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.anchor = 17;
        this.add(this.k, gridBagConstraints);
        this.l.setBorder(BorderFactory.createTitledBorder(com.avocent.a.a.e.s.z[21]));
        this.l.setLayout(new GridBagLayout());
        this.i.setText(com.avocent.a.a.e.s.z[28]);
        this.l.add(this.i, new GridBagConstraints());
        this.p.setMajorTickSpacing(10);
        this.p.setPaintLabels(true);
        this.p.setPaintTicks(true);
        this.p.setSnapToTicks(true);
        this.p.addMouseListener(new com.avocent.a.a.e.a(this));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        this.l.add(this.p, gridBagConstraints2);
        this.j.setText(com.avocent.a.a.e.s.z[23]);
        this.l.add(this.j, new GridBagConstraints());
        this.h.setMajorTickSpacing(10);
        this.h.setPaintLabels(true);
        this.h.setPaintTicks(true);
        this.h.setSnapToTicks(true);
        this.h.addMouseListener(new b(this));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        this.l.add(this.h, gridBagConstraints3);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridwidth = 0;
        gridBagConstraints4.gridheight = -1;
        gridBagConstraints4.anchor = 17;
        this.m.setBorder(BorderFactory.createTitledBorder(com.avocent.a.a.e.s.z[20]));
        this.m.setMinimumSize(new Dimension(160, 100));
        this.m.setLayout(new GridBagLayout());
        this.n.setLayout(new GridBagLayout());
        this.u.setText(com.avocent.a.a.e.s.z[26]);
        this.n.add(this.u, new GridBagConstraints());
        this.v.setColumns(10);
        this.v.setEditable(false);
        this.v.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridwidth = -1;
        gridBagConstraints5.gridheight = 0;
        this.n.add(this.v, gridBagConstraints5);
        this.w.setText(com.avocent.a.a.e.s.z[27]);
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridwidth = -1;
        gridBagConstraints6.gridheight = 0;
        this.n.add(this.w, gridBagConstraints6);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridwidth = 0;
        gridBagConstraints7.gridheight = -1;
        gridBagConstraints7.anchor = 11;
        this.m.add(this.n, gridBagConstraints7);
        this.o.setLayout(new GridBagLayout());
        this.q.setText(com.avocent.a.a.e.s.z[24]);
        final GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridheight = 0;
        this.o.add(this.q, gridBagConstraints8);
        this.r.setColumns(10);
        this.r.setEditable(false);
        this.r.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridheight = 0;
        this.o.add(this.r, gridBagConstraints9);
        this.s.setText(com.avocent.a.a.e.s.z[18]);
        final GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridheight = 0;
        gridBagConstraints10.anchor = 17;
        this.o.add(this.s, gridBagConstraints10);
        final GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridwidth = 0;
        gridBagConstraints11.gridheight = -1;
        gridBagConstraints11.anchor = 23;
        this.m.add(this.o, gridBagConstraints11);
        final GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridwidth = 0;
        gridBagConstraints12.gridheight = 0;
        gridBagConstraints12.anchor = 17;
        this.add(this.m, gridBagConstraints12);
    }

    private void a(final ActionEvent actionEvent) {
        System.out.println(com.avocent.a.a.e.s.z[32]);
        this.d = true;
        this.b.n();
    }

    private void b(final ActionEvent actionEvent) {
        System.out.println(com.avocent.a.a.e.s.z[31]);
        this.d = true;
        this.b.n();
    }

    private void a(final MouseEvent mouseEvent) {
        System.out.println(com.avocent.a.a.e.s.z[17]);
        this.d = true;
        this.b.n();
    }

    private void b(final MouseEvent mouseEvent) {
        System.out.println(com.avocent.a.a.e.s.z[11]);
        this.d = true;
        this.b.n();
    }

    @Override
    public JPanel d() {
        return this;
    }

    @Override
    public String e() {
        return com.avocent.a.a.e.s.z[33];
    }

    public void h() {
        final int t = com.avocent.a.a.e.c.t;
        String s = "0";
        String s2 = "0";
        String s3 = "0";
        final Object a = this.a.a().a(com.avocent.a.a.e.s.z[1]);
        Label_0078:
        {
            if (a != null) {
                s = (String) a;
                if (t == 0) {
                    break Label_0078;
                }
                int c = com.avocent.kvm.b.d.a.c;
                com.avocent.kvm.b.d.a.c = ++c;
            }
            this.a.a().a(com.avocent.a.a.e.s.z[1], s);
        }
        final Object a2 = this.a.a().a(com.avocent.a.a.e.s.z[6]);
        Label_0130:
        {
            if (a2 != null) {
                s2 = (String) a2;
                if (t == 0) {
                    break Label_0130;
                }
            }
            this.a.a().a(com.avocent.a.a.e.s.z[6], s2);
        }
        final Object a3 = this.a.a().a(com.avocent.a.a.e.s.z[7]);
        Label_0184:
        {
            if (a3 != null) {
                s3 = (String) a3;
                if (t == 0) {
                    break Label_0184;
                }
            }
            this.a.a().a(com.avocent.a.a.e.s.z[7], s3);
        }
        Label_0214:
        {
            if (s.equals("1")) {
                this.f.setSelected(true);
                if (t == 0) {
                    break Label_0214;
                }
            }
            this.g.setSelected(true);
        }
        this.p.setValue(Integer.parseInt(s2) * 10);
        this.h.setValue(Integer.parseInt(s3) * 10);
    }

    @Override
    public void c() {
        if (this.f() && !this.d) {
            this.h();
        }
        this.i();
    }

    public void i() {
        if (this.b != null) {
            final nb o = this.b.o();
            if (o != null) {
                this.v.setText(o.a());
                this.r.setText(o.b());
                if (com.avocent.a.a.e.c.t == 0) {
                    return;
                }
            }
            this.v.setText(" ");
            this.r.setText(" ");
        }
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final String propertyName = propertyChangeEvent.getPropertyName();
        if (!this.c && !this.d && (propertyName.equalsIgnoreCase(com.avocent.a.a.e.s.z[1]) || propertyName.equalsIgnoreCase(com.avocent.a.a.e.s.z[6]) || propertyName.equalsIgnoreCase(com.avocent.a.a.e.s.z[7]))) {
            this.c();
        }
    }

    @Override
    public void a() {
        System.out.println(com.avocent.a.a.e.s.z[13]);
        if (this.f()) {
            final Integer n = new Integer(6);
            this.c = true;
            this.d = false;
            int n2 = 0;
            if (this.f.isSelected()) {
                n2 = 1;
            }
            this.a.a().a(com.avocent.a.a.e.s.z[1], Integer.toString(n2));
            final int n3 = this.p.getValue() / 10;
            this.a.a().a(com.avocent.a.a.e.s.z[6], Integer.toString(n3));
            final int n4 = this.h.getValue() / 10;
            this.a.a().a(com.avocent.a.a.e.s.z[7], Integer.toString(n4));
            try {
                this.a.a().a(7, n, com.avocent.a.a.e.s.z[15] + Integer.toString(n2) + "," + com.avocent.a.a.e.s.z[16] + Integer.toString(n3) + "," + com.avocent.a.a.e.s.z[12] + Integer.toString(n4));
            } catch (IOException ex) {
                this.a.b().a(com.avocent.a.a.e.s.z[14] + ex.getMessage());
            }
            this.c = false;
            this.b.n();
        }
    }

    @Override
    public void b() {
        System.out.println(com.avocent.a.a.e.s.z[30]);
        this.d = false;
        this.h();
    }

    @Override
    public boolean f() {
        final int t = com.avocent.a.a.e.c.t;
        boolean b = false;
        System.out.println(com.avocent.a.a.e.s.z[10]);
        final Object a = this.a.a().a(com.avocent.a.a.e.s.z[1]);
        Label_0122:
        {
            if (a != null) {
                final int int1 = Integer.parseInt((String) a);
                final int selected = this.f.isSelected() ? 1 : 0;
                System.out.println(com.avocent.a.a.e.s.z[4] + int1 + com.avocent.a.a.e.s.z[0] + selected);
                if (int1 == selected) {
                    break Label_0122;
                }
                b = true;
                if (t == 0) {
                    break Label_0122;
                }
            }
            b = true;
        }
        final Object a2 = this.a.a().a(com.avocent.a.a.e.s.z[6]);
        Label_0221:
        {
            if (a2 != null) {
                final int int2 = Integer.parseInt((String) a2);
                final int n = this.p.getValue() / 10;
                System.out.println(com.avocent.a.a.e.s.z[9] + int2 + com.avocent.a.a.e.s.z[0] + n);
                if (int2 == n) {
                    break Label_0221;
                }
                b = true;
                if (t == 0) {
                    break Label_0221;
                }
            }
            b = true;
        }
        final Object a3 = this.a.a().a(com.avocent.a.a.e.s.z[7]);
        Label_0319:
        {
            if (a3 != null) {
                final int int3 = Integer.parseInt((String) a3);
                final int n2 = this.h.getValue() / 10;
                System.out.println(com.avocent.a.a.e.s.z[5] + int3 + com.avocent.a.a.e.s.z[0] + n2);
                if (int3 == n2) {
                    break Label_0319;
                }
                b = true;
                if (t == 0) {
                    break Label_0319;
                }
            }
            b = true;
        }
        System.out.println(com.avocent.a.a.e.s.z[8] + (b ? com.avocent.a.a.e.s.z[3] : com.avocent.a.a.e.s.z[2]));
        return b;
    }

    @Override
    public void a(final c b) {
        this.b = b;
    }

    static void a(final s s, final ActionEvent actionEvent) {
        s.b(actionEvent);
    }

    static void b(final s s, final ActionEvent actionEvent) {
        s.a(actionEvent);
    }

    static void a(final s s, final MouseEvent mouseEvent) {
        s.a(mouseEvent);
    }

    static void b(final s s, final MouseEvent mouseEvent) {
        s.b(mouseEvent);
    }
}
