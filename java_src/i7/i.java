package i7;

import f7.s;
import f7.u;
import f7.v;
import f7.w;
import f7.x;
/* loaded from: classes.dex */
public final class i extends w<Number> {

    /* renamed from: b  reason: collision with root package name */
    private static final x f8371b = g(u.f7338o);

    /* renamed from: a  reason: collision with root package name */
    private final v f8372a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements x {
        a() {
        }

        @Override // f7.x
        public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
            if (aVar.c() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8374a;

        static {
            int[] iArr = new int[n7.b.values().length];
            f8374a = iArr;
            try {
                iArr[n7.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8374a[n7.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8374a[n7.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private i(v vVar) {
        this.f8372a = vVar;
    }

    public static x f(v vVar) {
        return vVar == u.f7338o ? f8371b : g(vVar);
    }

    private static x g(v vVar) {
        return new a();
    }

    @Override // f7.w
    /* renamed from: h */
    public Number c(n7.a aVar) {
        n7.b Z = aVar.Z();
        int i10 = b.f8374a[Z.ordinal()];
        if (i10 == 1) {
            aVar.S();
            return null;
        } else if (i10 == 2 || i10 == 3) {
            return this.f8372a.e(aVar);
        } else {
            throw new s("Expecting number, got: " + Z);
        }
    }

    @Override // f7.w
    /* renamed from: i */
    public void e(n7.c cVar, Number number) {
        cVar.b0(number);
    }
}
