package x1;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f16255n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: o  reason: collision with root package name */
    private static final a f16256o = new a(h.f16232a);

    /* renamed from: p  reason: collision with root package name */
    private static final a f16257p = new a(g.f16227a);

    /* renamed from: b  reason: collision with root package name */
    private boolean f16258b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16259c;

    /* renamed from: d  reason: collision with root package name */
    private int f16260d;

    /* renamed from: e  reason: collision with root package name */
    private int f16261e;

    /* renamed from: f  reason: collision with root package name */
    private int f16262f;

    /* renamed from: g  reason: collision with root package name */
    private int f16263g;

    /* renamed from: h  reason: collision with root package name */
    private int f16264h;

    /* renamed from: i  reason: collision with root package name */
    private int f16265i;

    /* renamed from: j  reason: collision with root package name */
    private int f16266j;

    /* renamed from: l  reason: collision with root package name */
    private int f16268l;

    /* renamed from: k  reason: collision with root package name */
    private int f16267k = 1;

    /* renamed from: m  reason: collision with root package name */
    private int f16269m = 112800;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0234a f16270a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f16271b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private Constructor<? extends l> f16272c;

        /* renamed from: x1.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0234a {
            Constructor<? extends l> a();
        }

        public a(InterfaceC0234a interfaceC0234a) {
            this.f16270a = interfaceC0234a;
        }

        private Constructor<? extends l> b() {
            synchronized (this.f16271b) {
                if (this.f16271b.get()) {
                    return this.f16272c;
                }
                try {
                    return this.f16270a.a();
                } catch (ClassNotFoundException unused) {
                    this.f16271b.set(true);
                    return this.f16272c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public l a(Object... objArr) {
            Constructor<? extends l> b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void e(int i10, List<l> list) {
        l bVar;
        switch (i10) {
            case 0:
                bVar = new h2.b();
                break;
            case 1:
                bVar = new h2.e();
                break;
            case 2:
                bVar = new h2.h((this.f16259c ? 2 : 0) | this.f16260d | (this.f16258b ? 1 : 0));
                break;
            case 3:
                bVar = new y1.b((this.f16259c ? 2 : 0) | this.f16261e | (this.f16258b ? 1 : 0));
                break;
            case 4:
                bVar = f16256o.a(Integer.valueOf(this.f16262f));
                if (bVar == null) {
                    bVar = new a2.d(this.f16262f);
                    break;
                }
                break;
            case 5:
                bVar = new b2.c();
                break;
            case 6:
                bVar = new d2.e(this.f16263g);
                break;
            case 7:
                bVar = new e2.f((this.f16259c ? 2 : 0) | this.f16266j | (this.f16258b ? 1 : 0));
                break;
            case 8:
                list.add(new f2.g(this.f16265i));
                bVar = new f2.k(this.f16264h);
                break;
            case 9:
                bVar = new g2.d();
                break;
            case 10:
                bVar = new h2.a0();
                break;
            case 11:
                bVar = new h2.h0(this.f16267k, this.f16268l, this.f16269m);
                break;
            case 12:
                bVar = new i2.b();
                break;
            case 13:
            default:
                return;
            case 14:
                bVar = new c2.a();
                break;
            case 15:
                bVar = f16257p.a(new Object[0]);
                if (bVar == null) {
                    return;
                }
                break;
            case 16:
                bVar = new z1.b();
                break;
        }
        list.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends l> f() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(l.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends l> g() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(l.class).getConstructor(new Class[0]);
    }

    @Override // x1.r
    public synchronized l[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // x1.r
    public synchronized l[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f16255n;
        arrayList = new ArrayList(iArr.length);
        int b10 = p3.k.b(map);
        if (b10 != -1) {
            e(b10, arrayList);
        }
        int c10 = p3.k.c(uri);
        if (c10 != -1 && c10 != b10) {
            e(c10, arrayList);
        }
        for (int i10 : iArr) {
            if (i10 != b10 && i10 != c10) {
                e(i10, arrayList);
            }
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }
}
