package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private String f3716a;

    /* renamed from: b  reason: collision with root package name */
    private final long f3717b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f3718c;

    public b(String str, long j10, Map map) {
        this.f3716a = str;
        this.f3717b = j10;
        HashMap hashMap = new HashMap();
        this.f3718c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final long a() {
        return this.f3717b;
    }

    /* renamed from: b */
    public final b clone() {
        return new b(this.f3716a, this.f3717b, new HashMap(this.f3718c));
    }

    public final Object c(String str) {
        if (this.f3718c.containsKey(str)) {
            return this.f3718c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.f3716a;
    }

    public final Map e() {
        return this.f3718c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f3717b == bVar.f3717b && this.f3716a.equals(bVar.f3716a)) {
                return this.f3718c.equals(bVar.f3718c);
            }
            return false;
        }
        return false;
    }

    public final void f(String str) {
        this.f3716a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.f3718c.remove(str);
        } else {
            this.f3718c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f3716a.hashCode();
        long j10 = this.f3717b;
        return (((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f3718c.hashCode();
    }

    public final String toString() {
        String str = this.f3716a;
        long j10 = this.f3717b;
        String obj = this.f3718c.toString();
        return "Event{name='" + str + "', timestamp=" + j10 + ", params=" + obj + "}";
    }
}
