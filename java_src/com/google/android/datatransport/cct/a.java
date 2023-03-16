package com.google.android.datatransport.cct;

import g1.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String f3333c;

    /* renamed from: d  reason: collision with root package name */
    static final String f3334d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f3335e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<e1.b> f3336f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f3337g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f3338h;

    /* renamed from: a  reason: collision with root package name */
    private final String f3339a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3340b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f3333c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f3334d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f3335e = a12;
        f3336f = Collections.unmodifiableSet(new HashSet(Arrays.asList(e1.b.b("proto"), e1.b.b("json"))));
        f3337g = new a(a10, null);
        f3338h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f3339a = str;
        this.f3340b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (str2.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str3 = split[1];
                if (str3.isEmpty()) {
                    str3 = null;
                }
                return new a(str2, str3);
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // g1.g
    public Set<e1.b> a() {
        return f3336f;
    }

    public byte[] b() {
        String str = this.f3340b;
        if (str == null && this.f3339a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f3339a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f3340b;
    }

    @Override // g1.f
    public String e() {
        return "cct";
    }

    @Override // g1.f
    public byte[] f() {
        return b();
    }

    public String g() {
        return this.f3339a;
    }
}
