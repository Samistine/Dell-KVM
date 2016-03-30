// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.c;

import java.io.IOException;
import java.util.TreeMap;

public class d {

    protected static TreeMap a = new TreeMap();
    public static int b;

    public static a a(String s) {
        return (a) a.get(s);
    }

    public void a() throws IOException {
        new f(this).start();
    }

    public static void a(String s, b b) {
        int b2 = d.b;
        final a a = new a(s);
        a.a(b);
        d.a.put(s, a);
        if (com.avocent.kvm.b.d.a.c != 0) {
            d.b = ++b2;
        }
    }
}
