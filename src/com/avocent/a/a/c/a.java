// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.c;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class a {

    protected ArrayList a;
    protected String b;

    public a(final String b) {
        this.a = new ArrayList();
        this.b = b;
    }

    public void a(final c c) {
        this.a.add(c);
    }

    public String a() {
        return this.b;
    }

    public List b() {
        return Collections.unmodifiableList((List<?>) this.a);
    }
}
