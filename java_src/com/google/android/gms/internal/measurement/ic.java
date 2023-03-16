package com.google.android.gms.internal.measurement;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum q uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class ic {
    public static final ic A;
    public static final ic B;
    public static final ic C;
    public static final ic D;
    public static final ic E;
    public static final ic F;
    private static final /* synthetic */ ic[] G;

    /* renamed from: o  reason: collision with root package name */
    public static final ic f3903o;

    /* renamed from: p  reason: collision with root package name */
    public static final ic f3904p;

    /* renamed from: q  reason: collision with root package name */
    public static final ic f3905q;

    /* renamed from: r  reason: collision with root package name */
    public static final ic f3906r;

    /* renamed from: s  reason: collision with root package name */
    public static final ic f3907s;

    /* renamed from: t  reason: collision with root package name */
    public static final ic f3908t;

    /* renamed from: u  reason: collision with root package name */
    public static final ic f3909u;

    /* renamed from: v  reason: collision with root package name */
    public static final ic f3910v;

    /* renamed from: w  reason: collision with root package name */
    public static final ic f3911w;

    /* renamed from: x  reason: collision with root package name */
    public static final ic f3912x;

    /* renamed from: y  reason: collision with root package name */
    public static final ic f3913y;

    /* renamed from: z  reason: collision with root package name */
    public static final ic f3914z;

    /* renamed from: n  reason: collision with root package name */
    private final jc f3915n;

    static {
        ic icVar = new ic("DOUBLE", 0, jc.DOUBLE, 1);
        f3903o = icVar;
        ic icVar2 = new ic("FLOAT", 1, jc.FLOAT, 5);
        f3904p = icVar2;
        jc jcVar = jc.LONG;
        ic icVar3 = new ic("INT64", 2, jcVar, 0);
        f3905q = icVar3;
        ic icVar4 = new ic("UINT64", 3, jcVar, 0);
        f3906r = icVar4;
        jc jcVar2 = jc.INT;
        ic icVar5 = new ic("INT32", 4, jcVar2, 0);
        f3907s = icVar5;
        ic icVar6 = new ic("FIXED64", 5, jcVar, 1);
        f3908t = icVar6;
        ic icVar7 = new ic("FIXED32", 6, jcVar2, 5);
        f3909u = icVar7;
        ic icVar8 = new ic("BOOL", 7, jc.BOOLEAN, 0);
        f3910v = icVar8;
        ic icVar9 = new ic("STRING", 8, jc.STRING, 2);
        f3911w = icVar9;
        jc jcVar3 = jc.MESSAGE;
        ic icVar10 = new ic("GROUP", 9, jcVar3, 3);
        f3912x = icVar10;
        ic icVar11 = new ic("MESSAGE", 10, jcVar3, 2);
        f3913y = icVar11;
        ic icVar12 = new ic("BYTES", 11, jc.BYTE_STRING, 2);
        f3914z = icVar12;
        ic icVar13 = new ic("UINT32", 12, jcVar2, 0);
        A = icVar13;
        ic icVar14 = new ic("ENUM", 13, jc.ENUM, 0);
        B = icVar14;
        ic icVar15 = new ic("SFIXED32", 14, jcVar2, 5);
        C = icVar15;
        ic icVar16 = new ic("SFIXED64", 15, jcVar, 1);
        D = icVar16;
        ic icVar17 = new ic("SINT32", 16, jcVar2, 0);
        E = icVar17;
        ic icVar18 = new ic("SINT64", 17, jcVar, 0);
        F = icVar18;
        G = new ic[]{icVar, icVar2, icVar3, icVar4, icVar5, icVar6, icVar7, icVar8, icVar9, icVar10, icVar11, icVar12, icVar13, icVar14, icVar15, icVar16, icVar17, icVar18};
    }

    private ic(String str, int i10, jc jcVar, int i11) {
        this.f3915n = jcVar;
    }

    public static ic[] values() {
        return (ic[]) G.clone();
    }

    public final jc e() {
        return this.f3915n;
    }
}
