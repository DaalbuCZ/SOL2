package androidx.lifecycle;

import androidx.lifecycle.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements g {

    /* renamed from: n  reason: collision with root package name */
    private final c f2062n;

    /* renamed from: o  reason: collision with root package name */
    private final g f2063o;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2064a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2064a = iArr;
            try {
                iArr[e.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2064a[e.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2064a[e.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2064a[e.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2064a[e.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2064a[e.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2064a[e.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(c cVar, g gVar) {
        this.f2062n = cVar;
        this.f2063o = gVar;
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        switch (a.f2064a[bVar.ordinal()]) {
            case 1:
                this.f2062n.c(iVar);
                break;
            case 2:
                this.f2062n.f(iVar);
                break;
            case 3:
                this.f2062n.a(iVar);
                break;
            case 4:
                this.f2062n.e(iVar);
                break;
            case 5:
                this.f2062n.g(iVar);
                break;
            case 6:
                this.f2062n.b(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f2063o;
        if (gVar != null) {
            gVar.d(iVar, bVar);
        }
    }
}
