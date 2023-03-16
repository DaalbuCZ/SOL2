package j$.util.stream;

import j$.util.Map;
import java.util.EnumMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DISTINCT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.e3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0298e3 {
    public static final EnumC0298e3 DISTINCT;
    public static final EnumC0298e3 ORDERED;
    public static final EnumC0298e3 SHORT_CIRCUIT;
    public static final EnumC0298e3 SIZED;
    public static final EnumC0298e3 SORTED;

    /* renamed from: f  reason: collision with root package name */
    static final int f10016f;

    /* renamed from: g  reason: collision with root package name */
    static final int f10017g;

    /* renamed from: h  reason: collision with root package name */
    static final int f10018h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f10019i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f10020j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f10021k;

    /* renamed from: l  reason: collision with root package name */
    static final int f10022l;

    /* renamed from: m  reason: collision with root package name */
    static final int f10023m;

    /* renamed from: n  reason: collision with root package name */
    static final int f10024n;

    /* renamed from: o  reason: collision with root package name */
    static final int f10025o;

    /* renamed from: p  reason: collision with root package name */
    static final int f10026p;

    /* renamed from: q  reason: collision with root package name */
    static final int f10027q;

    /* renamed from: r  reason: collision with root package name */
    static final int f10028r;

    /* renamed from: s  reason: collision with root package name */
    static final int f10029s;

    /* renamed from: t  reason: collision with root package name */
    static final int f10030t;

    /* renamed from: u  reason: collision with root package name */
    static final int f10031u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ EnumC0298e3[] f10032v;

    /* renamed from: a  reason: collision with root package name */
    private final Map f10033a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10034b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10035c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10036d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10037e;

    static {
        EnumC0293d3 enumC0293d3 = EnumC0293d3.SPLITERATOR;
        C0288c3 i10 = i(enumC0293d3);
        EnumC0293d3 enumC0293d32 = EnumC0293d3.STREAM;
        i10.b(enumC0293d32);
        EnumC0293d3 enumC0293d33 = EnumC0293d3.OP;
        i10.c(enumC0293d33);
        EnumC0298e3 enumC0298e3 = new EnumC0298e3("DISTINCT", 0, 0, i10);
        DISTINCT = enumC0298e3;
        C0288c3 i11 = i(enumC0293d3);
        i11.b(enumC0293d32);
        i11.c(enumC0293d33);
        EnumC0298e3 enumC0298e32 = new EnumC0298e3("SORTED", 1, 1, i11);
        SORTED = enumC0298e32;
        C0288c3 i12 = i(enumC0293d3);
        i12.b(enumC0293d32);
        i12.c(enumC0293d33);
        EnumC0293d3 enumC0293d34 = EnumC0293d3.TERMINAL_OP;
        i12.a(enumC0293d34);
        EnumC0293d3 enumC0293d35 = EnumC0293d3.UPSTREAM_TERMINAL_OP;
        i12.a(enumC0293d35);
        EnumC0298e3 enumC0298e33 = new EnumC0298e3("ORDERED", 2, 2, i12);
        ORDERED = enumC0298e33;
        C0288c3 i13 = i(enumC0293d3);
        i13.b(enumC0293d32);
        i13.a(enumC0293d33);
        EnumC0298e3 enumC0298e34 = new EnumC0298e3("SIZED", 3, 3, i13);
        SIZED = enumC0298e34;
        C0288c3 i14 = i(enumC0293d33);
        i14.b(enumC0293d34);
        EnumC0298e3 enumC0298e35 = new EnumC0298e3("SHORT_CIRCUIT", 4, 12, i14);
        SHORT_CIRCUIT = enumC0298e35;
        f10032v = new EnumC0298e3[]{enumC0298e3, enumC0298e32, enumC0298e33, enumC0298e34, enumC0298e35};
        f10016f = b(enumC0293d3);
        f10017g = b(enumC0293d32);
        f10018h = b(enumC0293d33);
        b(enumC0293d34);
        b(enumC0293d35);
        int i15 = 0;
        for (EnumC0298e3 enumC0298e36 : values()) {
            i15 |= enumC0298e36.f10037e;
        }
        f10019i = i15;
        int i16 = f10017g;
        f10020j = i16;
        int i17 = i16 << 1;
        f10021k = i17;
        f10022l = i16 | i17;
        EnumC0298e3 enumC0298e37 = DISTINCT;
        f10023m = enumC0298e37.f10035c;
        f10024n = enumC0298e37.f10036d;
        EnumC0298e3 enumC0298e38 = SORTED;
        f10025o = enumC0298e38.f10035c;
        f10026p = enumC0298e38.f10036d;
        EnumC0298e3 enumC0298e39 = ORDERED;
        f10027q = enumC0298e39.f10035c;
        f10028r = enumC0298e39.f10036d;
        EnumC0298e3 enumC0298e310 = SIZED;
        f10029s = enumC0298e310.f10035c;
        f10030t = enumC0298e310.f10036d;
        f10031u = SHORT_CIRCUIT.f10035c;
    }

    private EnumC0298e3(String str, int i10, int i11, C0288c3 c0288c3) {
        EnumC0293d3[] values;
        for (EnumC0293d3 enumC0293d3 : EnumC0293d3.values()) {
            Map map = c0288c3.f10003a;
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).putIfAbsent(enumC0293d3, 0);
            } else {
                Map.CC.$default$putIfAbsent(map, enumC0293d3, 0);
            }
        }
        this.f10033a = c0288c3.f10003a;
        int i12 = i11 * 2;
        this.f10034b = i12;
        this.f10035c = 1 << i12;
        this.f10036d = 2 << i12;
        this.f10037e = 3 << i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, int i11) {
        return i10 | (i11 & (i10 == 0 ? f10019i : ~(((f10020j & i10) << 1) | i10 | ((f10021k & i10) >> 1))));
    }

    private static int b(EnumC0293d3 enumC0293d3) {
        EnumC0298e3[] values;
        int i10 = 0;
        for (EnumC0298e3 enumC0298e3 : values()) {
            i10 |= ((Integer) enumC0298e3.f10033a.get(enumC0293d3)).intValue() << enumC0298e3.f10034b;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(j$.util.H h10) {
        int characteristics = h10.characteristics();
        return ((characteristics & 4) == 0 || h10.getComparator() == null) ? f10016f & characteristics : f10016f & characteristics & (-5);
    }

    private static C0288c3 i(EnumC0293d3 enumC0293d3) {
        EnumMap enumMap = new EnumMap(EnumC0293d3.class);
        C0288c3 c0288c3 = new C0288c3(enumMap);
        enumMap.put((EnumMap) enumC0293d3, (EnumC0293d3) 1);
        return c0288c3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10) {
        return i10 & ((~i10) >> 1) & f10020j;
    }

    public static EnumC0298e3 valueOf(String str) {
        return (EnumC0298e3) Enum.valueOf(EnumC0298e3.class, str);
    }

    public static EnumC0298e3[] values() {
        return (EnumC0298e3[]) f10032v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i10) {
        return (i10 & this.f10037e) == this.f10035c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(int i10) {
        int i11 = this.f10037e;
        return (i10 & i11) == i11;
    }
}
