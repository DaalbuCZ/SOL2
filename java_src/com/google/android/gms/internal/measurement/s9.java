package com.google.android.gms.internal.measurement;
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
public final class s9 {
    private static final /* synthetic */ s9[] A;

    /* renamed from: q  reason: collision with root package name */
    public static final s9 f4152q;

    /* renamed from: r  reason: collision with root package name */
    public static final s9 f4153r;

    /* renamed from: s  reason: collision with root package name */
    public static final s9 f4154s;

    /* renamed from: t  reason: collision with root package name */
    public static final s9 f4155t;

    /* renamed from: u  reason: collision with root package name */
    public static final s9 f4156u;

    /* renamed from: v  reason: collision with root package name */
    public static final s9 f4157v;

    /* renamed from: w  reason: collision with root package name */
    public static final s9 f4158w;

    /* renamed from: x  reason: collision with root package name */
    public static final s9 f4159x;

    /* renamed from: y  reason: collision with root package name */
    public static final s9 f4160y;

    /* renamed from: z  reason: collision with root package name */
    public static final s9 f4161z;

    /* renamed from: n  reason: collision with root package name */
    private final Class f4162n;

    /* renamed from: o  reason: collision with root package name */
    private final Class f4163o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f4164p;

    static {
        s9 s9Var = new s9("VOID", 0, Void.class, Void.class, null);
        f4152q = s9Var;
        Class cls = Integer.TYPE;
        s9 s9Var2 = new s9("INT", 1, cls, Integer.class, 0);
        f4153r = s9Var2;
        s9 s9Var3 = new s9("LONG", 2, Long.TYPE, Long.class, 0L);
        f4154s = s9Var3;
        s9 s9Var4 = new s9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f4155t = s9Var4;
        s9 s9Var5 = new s9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f4156u = s9Var5;
        s9 s9Var6 = new s9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f4157v = s9Var6;
        s9 s9Var7 = new s9("STRING", 6, String.class, String.class, "");
        f4158w = s9Var7;
        s9 s9Var8 = new s9("BYTE_STRING", 7, h8.class, h8.class, h8.f3880o);
        f4159x = s9Var8;
        s9 s9Var9 = new s9("ENUM", 8, cls, Integer.class, null);
        f4160y = s9Var9;
        s9 s9Var10 = new s9("MESSAGE", 9, Object.class, Object.class, null);
        f4161z = s9Var10;
        A = new s9[]{s9Var, s9Var2, s9Var3, s9Var4, s9Var5, s9Var6, s9Var7, s9Var8, s9Var9, s9Var10};
    }

    private s9(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f4162n = cls;
        this.f4163o = cls2;
        this.f4164p = obj;
    }

    public static s9[] values() {
        return (s9[]) A.clone();
    }

    public final Class e() {
        return this.f4163o;
    }
}
