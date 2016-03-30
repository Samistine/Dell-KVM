package com.avocent.a.c;

import com.avocent.kvm.b.d.a;
import java.io.IOException;
import java.util.TreeMap;

public class d
{
    protected static TreeMap a;
    public static int b;
    
    public static a a(final String s) {
        return d.a.get(s);
    }
    
    public void a() throws IOException {
        new f(this).start();
    }
    
    public static void a(final String s, final b b) {
        int b2 = d.b;
        final a a = new a(s);
        a.a(b);
        d.a.put(s, a);
        if (a.c != 0) {
            d.b = ++b2;
        }
    }
    
    static {
        d.a = new TreeMap();
    }
}
