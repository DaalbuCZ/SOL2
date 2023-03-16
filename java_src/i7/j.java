package i7;

import f7.u;
import f7.v;
import f7.w;
import f7.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j extends w<Object> {

    /* renamed from: c  reason: collision with root package name */
    private static final x f8375c = g(u.f7337n);

    /* renamed from: a  reason: collision with root package name */
    private final f7.e f8376a;

    /* renamed from: b  reason: collision with root package name */
    private final v f8377b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements x {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ v f8378n;

        a(v vVar) {
            this.f8378n = vVar;
        }

        @Override // f7.x
        public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new j(eVar, this.f8378n, null);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8379a;

        static {
            int[] iArr = new int[n7.b.values().length];
            f8379a = iArr;
            try {
                iArr[n7.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8379a[n7.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8379a[n7.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8379a[n7.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8379a[n7.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8379a[n7.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private j(f7.e eVar, v vVar) {
        this.f8376a = eVar;
        this.f8377b = vVar;
    }

    /* synthetic */ j(f7.e eVar, v vVar, a aVar) {
        this(eVar, vVar);
    }

    public static x f(v vVar) {
        return vVar == u.f7337n ? f8375c : g(vVar);
    }

    private static x g(v vVar) {
        return new a(vVar);
    }

    @Override // f7.w
    public Object c(n7.a aVar) {
        switch (b.f8379a[aVar.Z().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.r()) {
                    arrayList.add(c(aVar));
                }
                aVar.k();
                return arrayList;
            case 2:
                h7.h hVar = new h7.h();
                aVar.b();
                while (aVar.r()) {
                    hVar.put(aVar.O(), c(aVar));
                }
                aVar.o();
                return hVar;
            case 3:
                return aVar.X();
            case 4:
                return this.f8377b.e(aVar);
            case 5:
                return Boolean.valueOf(aVar.D());
            case 6:
                aVar.S();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // f7.w
    public void e(n7.c cVar, Object obj) {
        if (obj == null) {
            cVar.D();
            return;
        }
        w j10 = this.f8376a.j(obj.getClass());
        if (!(j10 instanceof j)) {
            j10.e(cVar, obj);
            return;
        }
        cVar.f();
        cVar.o();
    }
}
