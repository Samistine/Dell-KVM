// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import com.avocent.a.a.i;
import javax.swing.JFrame;

//Originally named d
public class JFrameD extends JFrame {

    protected i a;
    private JMenuItem b_JMenuItem;//Originally named b
    private JMenuItem c_JMenuItem;//Originally named c
    private JMenuItem d_JMenuItem;//Originally named d
    private JMenu e_JMenu;//Originally named e
    private JSeparator f_JSeperator;//Originally named f
    private JMenuItem g_JMenuItem;//Originally named g
    private JMenuItem h_JMenuItem;//Originally named h
    private JMenu i_JMenu;//Originally named i
    private JMenu j_JMenu;//Originally named j
    private JMenuBar k_JMenuBar;//Originally named k
    private JMenuItem l_JMenuItem;//Originally named l
    private JMenu m_JMenu;//Originally named m
    private JPanel n_JPanel;//Originally named n
    private JScrollPane o_JScrollPane;//Originally named o
    private JMenuItem p_JMenuItem;//Originally named p
    private JMenu q_JMenu;//Originally named q
    private JMenuItem r_JMenuItem;//Originally named r
    private static final String[] z = {"MainMenu_File_CaptureToFile", "MainMenu_View_Refresh", "MainMenu_Tools_SessionOptions", "MainMenu_Help_ContentsAndIndex", "MainMenu_Help", "MainMenu_View", "MainMenu_Tools", "MainMenu_View_FullScreen", "MainMenu_Macros", "MainMenu_Help_About", "MainMenu_File", "Center", "MainMenu_File_Exit", "MainMenu_File_CaptureToClipboard", "images/connectvideo16.gif", "TITLE", "MainWindow_Title", " Fullscreen window setVisible "};

    public JFrameD(i a) {
        this.a = a;
        this.setUndecorated(true);
        this.a();
        this.setExtendedState(6);
        this.o_JScrollPane.setBackground(Color.black);
        try {
            this.setIconImage(new ImageIcon(i.class.getResource(com.avocent.a.a.b.JFrameD.z[14])).getImage());
        } catch (Exception ex) {
        }
        final String s = com.avocent.a.a.b.JFrameD.z[15];
        this.a.d();
        this.setTitle(a.b(s, com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[16])).toString());
        this.getJPanel_n().add(a.p().c());
    }

    private void a() {
        this.o_JScrollPane = new JScrollPane();
        this.n_JPanel = new JPanel();
        this.k_JMenuBar = new JMenuBar();
        this.e_JMenu = new JMenu();
        this.b_JMenuItem = new JMenuItem();
        this.c_JMenuItem = new JMenuItem();
        this.f_JSeperator = new JSeparator();
        this.d_JMenuItem = new JMenuItem();
        this.q_JMenu = new JMenu();
        this.r_JMenuItem = new JMenuItem();
        this.p_JMenuItem = new JMenuItem();
        this.j_JMenu = new JMenu();
        this.m_JMenu = new JMenu();
        this.l_JMenuItem = new JMenuItem();
        this.i_JMenu = new JMenu();
        this.h_JMenuItem = new JMenuItem();
        this.g_JMenuItem = new JMenuItem();
        this.setDefaultCloseOperation(3);
        this.o_JScrollPane.setHorizontalScrollBarPolicy(31);
        this.o_JScrollPane.setVerticalScrollBarPolicy(21);
        this.n_JPanel.setLayout(new GridBagLayout());
        this.n_JPanel.setBackground(new Color(0, 0, 0));
        this.o_JScrollPane.setViewportView(this.n_JPanel);
        this.getContentPane().add(this.o_JScrollPane, com.avocent.a.a.b.JFrameD.z[11]);
        final JMenu e = this.e_JMenu;
        //this.a.d();
        e.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[10]));
        //this.a.d();
        this.b_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[13]));
        this.e_JMenu.add(this.b_JMenuItem);
        //this.a.d();
        this.c_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[0]));
        this.e_JMenu.add(this.c_JMenuItem);
        this.e_JMenu.add(this.f_JSeperator);
        //this.a.d();
        d_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[12]));
        this.e_JMenu.add(this.d_JMenuItem);
        this.k_JMenuBar.add(this.e_JMenu);
        //this.a.d();
        this.q_JMenu.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[5]));
        //this.a.d();
        this.r_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[1]));
        this.q_JMenu.add(this.r_JMenuItem);
        //this.a.d();
        this.p_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[7]));
        this.q_JMenu.add(this.p_JMenuItem);
        this.k_JMenuBar.add(this.q_JMenu);
        final JMenu j = this.j_JMenu;
        //this.a.d();
        j.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[8]));
        this.k_JMenuBar.add(this.j_JMenu);
        final JMenu m = this.m_JMenu;
        //this.a.d();
        m.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[6]));
        final JMenuItem l = this.l_JMenuItem;
        //this.a.d();
        l.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[2]));
        this.m_JMenu.add(this.l_JMenuItem);
        this.k_JMenuBar.add(this.m_JMenu);
        final JMenu i = this.i_JMenu;
        //this.a.d();
        i.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[4]));
        final JMenuItem h = this.h_JMenuItem;
        //this.a.d();
        h.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[3]));
        this.i_JMenu.add(this.h_JMenuItem);
        final JMenuItem g = this.g_JMenuItem;
        //this.a.d();
        g.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[9]));
        this.i_JMenu.add(this.g_JMenuItem);
        this.k_JMenuBar.add(this.i_JMenu);
        this.setJMenuBar(this.k_JMenuBar);
        this.pack();
    }

    public JPanel getJPanel_n() {
        return this.n_JPanel;
    }

    @Override
    public void setVisible(boolean visible) {
        System.out.println(com.avocent.a.a.b.JFrameD.z[17] + visible);
        super.setVisible(visible);
    }
}
