package f7;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class c implements f7.d {

    /* renamed from: n  reason: collision with root package name */
    public static final c f7276n;

    /* renamed from: o  reason: collision with root package name */
    public static final c f7277o;

    /* renamed from: p  reason: collision with root package name */
    public static final c f7278p;

    /* renamed from: q  reason: collision with root package name */
    public static final c f7279q;

    /* renamed from: r  reason: collision with root package name */
    public static final c f7280r;

    /* renamed from: s  reason: collision with root package name */
    public static final c f7281s;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c[] f7282t;

    /* loaded from: classes.dex */
    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // f7.d
        public String e(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f7276n = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: f7.c.b
            @Override // f7.d
            public String e(Field field) {
                return c.h(field.getName());
            }
        };
        f7277o = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: f7.c.c
            @Override // f7.d
            public String e(Field field) {
                return c.h(c.g(field.getName(), " "));
            }
        };
        f7278p = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: f7.c.d
            @Override // f7.d
            public String e(Field field) {
                return c.g(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f7279q = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: f7.c.e
            @Override // f7.d
            public String e(Field field) {
                return c.g(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f7280r = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: f7.c.f
            @Override // f7.d
            public String e(Field field) {
                return c.g(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f7281s = cVar5;
        f7282t = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i10) {
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }

    static String g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String h(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length) {
            i10++;
        }
        char charAt = str.charAt(i10);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i10 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f7282t.clone();
    }
}
