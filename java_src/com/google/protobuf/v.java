package com.google.protobuf;

import java.lang.reflect.Type;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum s uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class v {
    public static final v A;
    public static final v B;
    public static final v C;
    public static final v D;
    public static final v E;
    public static final v F;
    public static final v G;
    public static final v H;
    public static final v I;
    public static final v J;
    public static final v K;
    public static final v L;
    public static final v M;
    public static final v N;
    public static final v O;
    public static final v P;
    public static final v Q;
    public static final v R;
    public static final v S;
    public static final v T;
    public static final v U;
    public static final v V;
    public static final v W;
    public static final v X;
    public static final v Y;
    public static final v Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final v f6143a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final v f6144b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final v f6145c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final v f6146d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final v f6147e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final v f6148f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final v f6149g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final v f6150h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final v f6151i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final v f6152j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final v f6153k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final v f6154l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final v f6155m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final v f6156n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final v f6157o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final v f6158p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final v f6159q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final v[] f6160r0;

    /* renamed from: s  reason: collision with root package name */
    public static final v f6161s;

    /* renamed from: s0  reason: collision with root package name */
    private static final Type[] f6162s0;

    /* renamed from: t  reason: collision with root package name */
    public static final v f6163t;

    /* renamed from: t0  reason: collision with root package name */
    private static final /* synthetic */ v[] f6164t0;

    /* renamed from: u  reason: collision with root package name */
    public static final v f6165u;

    /* renamed from: v  reason: collision with root package name */
    public static final v f6166v;

    /* renamed from: w  reason: collision with root package name */
    public static final v f6167w;

    /* renamed from: x  reason: collision with root package name */
    public static final v f6168x;

    /* renamed from: y  reason: collision with root package name */
    public static final v f6169y;

    /* renamed from: z  reason: collision with root package name */
    public static final v f6170z;

    /* renamed from: n  reason: collision with root package name */
    private final d0 f6171n;

    /* renamed from: o  reason: collision with root package name */
    private final int f6172o;

    /* renamed from: p  reason: collision with root package name */
    private final b f6173p;

    /* renamed from: q  reason: collision with root package name */
    private final Class<?> f6174q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f6175r;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6176a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f6177b;

        static {
            int[] iArr = new int[d0.values().length];
            f6177b = iArr;
            try {
                iArr[d0.f5928x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6177b[d0.f5930z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6177b[d0.f5927w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f6176a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6176a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6176a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: n  reason: collision with root package name */
        private final boolean f6183n;

        b(boolean z10) {
            this.f6183n = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        d0 d0Var = d0.f5925u;
        v vVar = new v("DOUBLE", 0, 0, bVar, d0Var);
        f6161s = vVar;
        d0 d0Var2 = d0.f5924t;
        v vVar2 = new v("FLOAT", 1, 1, bVar, d0Var2);
        f6163t = vVar2;
        d0 d0Var3 = d0.f5923s;
        v vVar3 = new v("INT64", 2, 2, bVar, d0Var3);
        f6165u = vVar3;
        v vVar4 = new v("UINT64", 3, 3, bVar, d0Var3);
        f6166v = vVar4;
        d0 d0Var4 = d0.f5922r;
        v vVar5 = new v("INT32", 4, 4, bVar, d0Var4);
        f6167w = vVar5;
        v vVar6 = new v("FIXED64", 5, 5, bVar, d0Var3);
        f6168x = vVar6;
        v vVar7 = new v("FIXED32", 6, 6, bVar, d0Var4);
        f6169y = vVar7;
        d0 d0Var5 = d0.f5926v;
        v vVar8 = new v("BOOL", 7, 7, bVar, d0Var5);
        f6170z = vVar8;
        d0 d0Var6 = d0.f5927w;
        v vVar9 = new v("STRING", 8, 8, bVar, d0Var6);
        A = vVar9;
        d0 d0Var7 = d0.f5930z;
        v vVar10 = new v("MESSAGE", 9, 9, bVar, d0Var7);
        B = vVar10;
        d0 d0Var8 = d0.f5928x;
        v vVar11 = new v("BYTES", 10, 10, bVar, d0Var8);
        C = vVar11;
        v vVar12 = new v("UINT32", 11, 11, bVar, d0Var4);
        D = vVar12;
        d0 d0Var9 = d0.f5929y;
        v vVar13 = new v("ENUM", 12, 12, bVar, d0Var9);
        E = vVar13;
        v vVar14 = new v("SFIXED32", 13, 13, bVar, d0Var4);
        F = vVar14;
        v vVar15 = new v("SFIXED64", 14, 14, bVar, d0Var3);
        G = vVar15;
        v vVar16 = new v("SINT32", 15, 15, bVar, d0Var4);
        H = vVar16;
        v vVar17 = new v("SINT64", 16, 16, bVar, d0Var3);
        I = vVar17;
        v vVar18 = new v("GROUP", 17, 17, bVar, d0Var7);
        J = vVar18;
        b bVar2 = b.VECTOR;
        v vVar19 = new v("DOUBLE_LIST", 18, 18, bVar2, d0Var);
        K = vVar19;
        v vVar20 = new v("FLOAT_LIST", 19, 19, bVar2, d0Var2);
        L = vVar20;
        v vVar21 = new v("INT64_LIST", 20, 20, bVar2, d0Var3);
        M = vVar21;
        v vVar22 = new v("UINT64_LIST", 21, 21, bVar2, d0Var3);
        N = vVar22;
        v vVar23 = new v("INT32_LIST", 22, 22, bVar2, d0Var4);
        O = vVar23;
        v vVar24 = new v("FIXED64_LIST", 23, 23, bVar2, d0Var3);
        P = vVar24;
        v vVar25 = new v("FIXED32_LIST", 24, 24, bVar2, d0Var4);
        Q = vVar25;
        v vVar26 = new v("BOOL_LIST", 25, 25, bVar2, d0Var5);
        R = vVar26;
        v vVar27 = new v("STRING_LIST", 26, 26, bVar2, d0Var6);
        S = vVar27;
        v vVar28 = new v("MESSAGE_LIST", 27, 27, bVar2, d0Var7);
        T = vVar28;
        v vVar29 = new v("BYTES_LIST", 28, 28, bVar2, d0Var8);
        U = vVar29;
        v vVar30 = new v("UINT32_LIST", 29, 29, bVar2, d0Var4);
        V = vVar30;
        v vVar31 = new v("ENUM_LIST", 30, 30, bVar2, d0Var9);
        W = vVar31;
        v vVar32 = new v("SFIXED32_LIST", 31, 31, bVar2, d0Var4);
        X = vVar32;
        v vVar33 = new v("SFIXED64_LIST", 32, 32, bVar2, d0Var3);
        Y = vVar33;
        v vVar34 = new v("SINT32_LIST", 33, 33, bVar2, d0Var4);
        Z = vVar34;
        v vVar35 = new v("SINT64_LIST", 34, 34, bVar2, d0Var3);
        f6143a0 = vVar35;
        b bVar3 = b.PACKED_VECTOR;
        v vVar36 = new v("DOUBLE_LIST_PACKED", 35, 35, bVar3, d0Var);
        f6144b0 = vVar36;
        v vVar37 = new v("FLOAT_LIST_PACKED", 36, 36, bVar3, d0Var2);
        f6145c0 = vVar37;
        v vVar38 = new v("INT64_LIST_PACKED", 37, 37, bVar3, d0Var3);
        f6146d0 = vVar38;
        v vVar39 = new v("UINT64_LIST_PACKED", 38, 38, bVar3, d0Var3);
        f6147e0 = vVar39;
        v vVar40 = new v("INT32_LIST_PACKED", 39, 39, bVar3, d0Var4);
        f6148f0 = vVar40;
        v vVar41 = new v("FIXED64_LIST_PACKED", 40, 40, bVar3, d0Var3);
        f6149g0 = vVar41;
        v vVar42 = new v("FIXED32_LIST_PACKED", 41, 41, bVar3, d0Var4);
        f6150h0 = vVar42;
        v vVar43 = new v("BOOL_LIST_PACKED", 42, 42, bVar3, d0Var5);
        f6151i0 = vVar43;
        v vVar44 = new v("UINT32_LIST_PACKED", 43, 43, bVar3, d0Var4);
        f6152j0 = vVar44;
        v vVar45 = new v("ENUM_LIST_PACKED", 44, 44, bVar3, d0Var9);
        f6153k0 = vVar45;
        v vVar46 = new v("SFIXED32_LIST_PACKED", 45, 45, bVar3, d0Var4);
        f6154l0 = vVar46;
        v vVar47 = new v("SFIXED64_LIST_PACKED", 46, 46, bVar3, d0Var3);
        f6155m0 = vVar47;
        v vVar48 = new v("SINT32_LIST_PACKED", 47, 47, bVar3, d0Var4);
        f6156n0 = vVar48;
        v vVar49 = new v("SINT64_LIST_PACKED", 48, 48, bVar3, d0Var3);
        f6157o0 = vVar49;
        v vVar50 = new v("GROUP_LIST", 49, 49, bVar2, d0Var7);
        f6158p0 = vVar50;
        v vVar51 = new v("MAP", 50, 50, b.MAP, d0.f5921q);
        f6159q0 = vVar51;
        f6164t0 = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, vVar21, vVar22, vVar23, vVar24, vVar25, vVar26, vVar27, vVar28, vVar29, vVar30, vVar31, vVar32, vVar33, vVar34, vVar35, vVar36, vVar37, vVar38, vVar39, vVar40, vVar41, vVar42, vVar43, vVar44, vVar45, vVar46, vVar47, vVar48, vVar49, vVar50, vVar51};
        f6162s0 = new Type[0];
        v[] values = values();
        f6160r0 = new v[values.length];
        for (v vVar52 : values) {
            f6160r0[vVar52.f6172o] = vVar52;
        }
    }

    private v(String str, int i10, int i11, b bVar, d0 d0Var) {
        int i12;
        this.f6172o = i11;
        this.f6173p = bVar;
        this.f6171n = d0Var;
        int i13 = a.f6176a[bVar.ordinal()];
        boolean z10 = true;
        this.f6174q = (i13 == 1 || i13 == 2) ? d0Var.e() : null;
        this.f6175r = (bVar != b.SCALAR || (i12 = a.f6177b[d0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : z10;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f6164t0.clone();
    }

    public int e() {
        return this.f6172o;
    }
}
