// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a;

import java.util.MissingResourceException;
import com.avocent.kvm.b.f.b;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public class d {

    static ResourceBundle a;
    private static final String[] z = {">>>>", "<<<<", " Missing resource: "};

    public void a(String s) {
        d.a = ResourceBundle.getBundle(s);
    }

    public static String b(String s) {
        String s2 = c(s);
        if (s2 == null) {
            s2 = d.z[1] + s + d.z[0];
        }
        return s2;
    }

    public static String a(String s, Object[] array) {
        String s2 = c(s);
        if (s2 != null && array != null) {
            s2 = MessageFormat.format(s2, array);
        }
        return s2;
    }

    private static String c(String s) {
        String string = null;
        if (d.a != null) {
            try {
                string = d.a.getString(s);
            } catch (MissingResourceException ex) {
                b.a().a(d.z[2] + s);
            }
        }
        return string;
    }

}
