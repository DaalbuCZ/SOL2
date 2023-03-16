package com.google.protobuf;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum r uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ d0[] A;

    /* renamed from: q  reason: collision with root package name */
    public static final d0 f5921q;

    /* renamed from: r  reason: collision with root package name */
    public static final d0 f5922r;

    /* renamed from: s  reason: collision with root package name */
    public static final d0 f5923s;

    /* renamed from: t  reason: collision with root package name */
    public static final d0 f5924t;

    /* renamed from: u  reason: collision with root package name */
    public static final d0 f5925u;

    /* renamed from: v  reason: collision with root package name */
    public static final d0 f5926v;

    /* renamed from: w  reason: collision with root package name */
    public static final d0 f5927w;

    /* renamed from: x  reason: collision with root package name */
    public static final d0 f5928x;

    /* renamed from: y  reason: collision with root package name */
    public static final d0 f5929y;

    /* renamed from: z  reason: collision with root package name */
    public static final d0 f5930z;

    /* renamed from: n  reason: collision with root package name */
    private final Class<?> f5931n;

    /* renamed from: o  reason: collision with root package name */
    private final Class<?> f5932o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f5933p;

    static {
        d0 d0Var = new d0("VOID", 0, Void.class, Void.class, null);
        f5921q = d0Var;
        Class cls = Integer.TYPE;
        d0 d0Var2 = new d0("INT", 1, cls, Integer.class, 0);
        f5922r = d0Var2;
        d0 d0Var3 = new d0("LONG", 2, Long.TYPE, Long.class, 0L);
        f5923s = d0Var3;
        d0 d0Var4 = new d0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f5924t = d0Var4;
        d0 d0Var5 = new d0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f5925u = d0Var5;
        d0 d0Var6 = new d0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f5926v = d0Var6;
        d0 d0Var7 = new d0("STRING", 6, String.class, String.class, "");
        f5927w = d0Var7;
        d0 d0Var8 = new d0("BYTE_STRING", 7, h.class, h.class, h.f5966o);
        f5928x = d0Var8;
        d0 d0Var9 = new d0("ENUM", 8, cls, Integer.class, null);
        f5929y = d0Var9;
        d0 d0Var10 = new d0("MESSAGE", 9, Object.class, Object.class, null);
        f5930z = d0Var10;
        A = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10};
    }

    private d0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f5931n = cls;
        this.f5932o = cls2;
        this.f5933p = obj;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) A.clone();
    }

    public Class<?> e() {
        return this.f5932o;
    }
}
