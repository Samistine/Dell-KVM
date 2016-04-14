// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.c;

import com.avocent.kvm.b.ib;
import java.io.IOException;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import com.avocent.a.a.i;

public class b {

    protected i a;
    protected ArrayList<NamedArray> b;
    protected HashMap<String, NamedArray> c;
    protected ArrayList<NamedArray> d;
    protected ArrayList<NamedArray> e;
    public static boolean f;
    private static final String[] z = {"MainMenu_Macros_AltF9", "MainMenu_Macros_AltF4", "MainMenu_Macros_AltF11", "MainMenu_Macros_AltF3", "MainMenu_Macros_AltF2", "MainMenu_Macros_AltF1", "WARNING: Duplicate macro name \"", "MainMenu_Macros_AltF12", "MainMenu_Macros_AltF8", "MainMenu_Macros_AltF7", "MainMenu_Macros_AltF10", "MainMenu_Macros_AltF6", "MainMenu_Macros_AltF5", "MainMenu_Macros_AltEnter", "MainMenu_Macros_PrtScrn", "MainMenu_Macros_AltSpace", "MainMenu_Macros_CtrlESC", "MainMenu_Macros_AltSysReq", "MainMenu_Macros_AltESC", "MainMenu_Macros_AltLShiftRShiftEsc", "MainMenu_Macros_SysReq", "MainMenu_Macros_Tab", "MainMenu_Macros_AltHyphen", "MainMenu_Macros_Pause", "MainMenu_Macros_AltTab", "MainMenu_Macros_CtrlEnter", "MainMenu_Macros_CtrlAltDel", "MainMenu_Macros_F1", "MainMenu_Macros_AltPrtScrn", " Error while sending macro: ", "MainMenu_Macros_CtrlAltF5", "MainMenu_Macros_CtrlAltF9", "MainMenu_Macros_CtrlAltF1", "MainMenu_Macros_CtrlAltF12", "MainMenu_Macros_CtrlAltF4", "MainMenu_Macros_CtrlAltF10", "MainMenu_Macros_CtrlAltF8", "MainMenu_Macros_CtrlAltF6", "MainMenu_Macros_CtrlAltF3", "MainMenu_Macros_CtrlAltF2", "MainMenu_Macros_CtrlAltF11", "MainMenu_Macros_CtrlAltF7", "CTRL_ALTF_MACRO_GROUP", "ALTF_MACRO_GROUP"};

    public b(final i a) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = a;
        this.a();
        this.b();
        this.c();
    }

    void a() {
        final boolean f = com.avocent.a.a.c.b.f;
        final NamedArray a = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[26]));
        this.b.add(a);
        a.add(new c(224, true));
        a.add(new c(226, true));
        a.add(new c(76, true));
        a.add(new c(76, false));
        a.add(new c(226, false));
        a.add(new c(224, false));
        final NamedArray a2 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[24]));
        this.b.add(a2);
        a2.add(new c(226, true));
        a2.add(new c(43, true));
        a2.add(new c(43, false));
        a2.add(new c(226, false));
        final NamedArray a3 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[18]));
        this.b.add(a3);
        a3.add(new c(226, true));
        a3.add(new c(41, true));
        a3.add(new c(41, false));
        a3.add(new c(226, false));
        final NamedArray a4 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[16]));
        this.b.add(a4);
        a4.add(new c(224, true));
        a4.add(new c(41, true));
        a4.add(new c(41, false));
        a4.add(new c(224, false));
        final NamedArray a5 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[15]));
        this.b.add(a5);
        a5.add(new c(226, true));
        a5.add(new c(44, true));
        a5.add(new c(44, false));
        a5.add(new c(226, false));
        final NamedArray a6 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[13]));
        this.b.add(a6);
        a6.add(new c(226, true));
        a6.add(new c(40, true));
        a6.add(new c(40, false));
        a6.add(new c(226, false));
        final NamedArray a7 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[22]));
        this.b.add(a7);
        a7.add(new c(226, true));
        a7.add(new c(45, true));
        a7.add(new c(45, false));
        a7.add(new c(226, false));
        final NamedArray a8 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[1]));
        this.b.add(a8);
        a8.add(new c(226, true));
        a8.add(new c(61, true));
        a8.add(new c(61, false));
        a8.add(new c(226, false));
        final NamedArray a9 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[14]));
        this.b.add(a9);
        a9.add(new c(70, true));
        a9.add(new c(70, false));
        final NamedArray a10 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[28]));
        this.b.add(a10);
        a10.add(new c(226, true));
        a10.add(new c(70, true));
        a10.add(new c(70, false));
        a10.add(new c(226, false));
        final NamedArray a11 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[27]));
        this.b.add(a11);
        a11.add(new c(58, true));
        a11.add(new c(58, false));
        final NamedArray a12 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[23]));
        this.b.add(a12);
        a12.add(new c(72, true));
        a12.add(new c(72, false));
        final NamedArray a13 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[21]));
        this.b.add(a13);
        a13.add(new c(43, true));
        a13.add(new c(43, false));
        final NamedArray a14 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[25]));
        this.b.add(a14);
        a14.add(new c(224, true));
        a14.add(new c(40, true));
        a14.add(new c(40, false));
        a14.add(new c(224, false));
        final NamedArray a15 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[20]));
        this.b.add(a15);
        a15.add(new c(70, true));
        a15.add(new c(70, false));
        final NamedArray a16 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[17]));
        this.b.add(a16);
        a16.add(new c(226, true));
        a16.add(new c(70, true));
        a16.add(new c(70, false));
        a16.add(new c(226, false));
        final NamedArray a17 = new NamedArray(this.a.b(com.avocent.a.a.c.b.z[19]));
        this.b.add(a17);
        a17.add(new c(226, true));
        a17.add(new c(225, true));
        a17.add(new c(229, true));
        a17.add(new c(41, true));
        a17.add(new c(41, false));
        a17.add(new c(229, false));
        a17.add(new c(225, false));
        a17.add(new c(226, false));
        int i = 0;
        while (i < this.b.size()) {
            final NamedArray a18 = this.b.get(i);
            this.c.put(a18.getName(), a18);
            ++i;
            if (f) {
                int c = com.avocent.kvm.b.d.a.c;
                com.avocent.kvm.b.d.a.c = ++c;
                break;
            }
        }
    }

    public void b() {
        final boolean f = com.avocent.a.a.c.b.f;
        final String[] array = {com.avocent.a.a.c.b.z[5], com.avocent.a.a.c.b.z[4], com.avocent.a.a.c.b.z[3], com.avocent.a.a.c.b.z[1], com.avocent.a.a.c.b.z[12], com.avocent.a.a.c.b.z[11], com.avocent.a.a.c.b.z[9], com.avocent.a.a.c.b.z[8], com.avocent.a.a.c.b.z[0], com.avocent.a.a.c.b.z[10], com.avocent.a.a.c.b.z[2], com.avocent.a.a.c.b.z[7]};
        final int[] array2 = {58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69};
        int i = 0;
        while (i < array.length) {
            final NamedArray a = new NamedArray(this.a.b(array[i]));
            a.add(new c(226, true));
            a.add(new c(array2[i], true));
            a.add(new c(array2[i], false));
            a.add(new c(226, false));
            this.d.add(a);
            ++i;
            if (f) {
                break;
            }
        }
        int j = 0;
        while (j < this.d.size()) {
            final NamedArray a2 = this.d.get(j);
            if (this.c.containsKey(a2.getName())) {
                this.a.b().a(com.avocent.a.a.c.b.z[6] + a2.getName() + "\"");
            }
            this.c.put(a2.getName(), a2);
            ++j;
            if (f) {
                break;
            }
        }
    }

    public void c() {
        final boolean f = com.avocent.a.a.c.b.f;
        final String[] array = {com.avocent.a.a.c.b.z[32], com.avocent.a.a.c.b.z[39], com.avocent.a.a.c.b.z[38], com.avocent.a.a.c.b.z[34], com.avocent.a.a.c.b.z[30], com.avocent.a.a.c.b.z[37], com.avocent.a.a.c.b.z[41], com.avocent.a.a.c.b.z[36], com.avocent.a.a.c.b.z[31], com.avocent.a.a.c.b.z[35], com.avocent.a.a.c.b.z[40], com.avocent.a.a.c.b.z[33]};
        final int[] array2 = {58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69};
        int i = 0;
        while (i < array.length) {
            final NamedArray a = new NamedArray(this.a.b(array[i]));
            a.add(new c(224, true));
            a.add(new c(226, true));
            a.add(new c(array2[i], true));
            a.add(new c(array2[i], false));
            a.add(new c(226, false));
            a.add(new c(224, false));
            this.e.add(a);
            ++i;
            if (f) {
                break;
            }
        }
        int j = 0;
        while (j < this.e.size()) {
            final NamedArray a2 = this.e.get(j);
            if (this.c.containsKey(a2.getName())) {
                this.a.b().a(com.avocent.a.a.c.b.z[6] + a2.getName() + "\"");
            }
            this.c.put(a2.getName(), a2);
            ++j;
            if (f) {
                break;
            }
        }
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.a.a.c.b.f = !f;
        }
    }

    public int d() {
        return this.b.size();
    }

    public NamedArray a(final int n) {
        return this.b.get(n);
    }

    public Iterator<NamedArray> a(final String s) {
        if (s.equalsIgnoreCase(com.avocent.a.a.c.b.z[43])) {
            return this.d.iterator();
        }
        if (s.equalsIgnoreCase(com.avocent.a.a.c.b.z[42])) {
            return this.e.iterator();
        }
        return null;
    }

    public void a(final NamedArray a) {
        final boolean f = com.avocent.a.a.c.b.f;
        try {
            final Iterator<c> iterator = (Iterator<c>) a.getList().iterator();
            final ib d = this.a.a().d();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(60L);
                } catch (InterruptedException ex2) {
                }
                final c c = iterator.next();
                Label_0094:
                {
                    if (c.b()) {
                        d.a(c.a());
                        if (!f) {
                            break Label_0094;
                        }
                    }
                    d.b(c.a());
                }
                if (f) {
                    break;
                }
            }
        } catch (IOException ex) {
            this.a.b().a(com.avocent.a.a.c.b.z[29] + ex.getMessage());
        }
    }
}
