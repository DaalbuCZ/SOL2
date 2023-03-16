package k8;

import java.util.HashMap;
import java.util.Map;
import l8.k;
import l8.s;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10807a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f10808b;

    /* renamed from: c  reason: collision with root package name */
    private l8.k f10809c;

    /* renamed from: d  reason: collision with root package name */
    private k.d f10810d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10811e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10812f;

    /* renamed from: g  reason: collision with root package name */
    private final k.c f10813g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f10814a;

        a(byte[] bArr) {
            this.f10814a = bArr;
        }

        @Override // l8.k.d
        public void a(Object obj) {
            l.this.f10808b = this.f10814a;
        }

        @Override // l8.k.d
        public void b(String str, String str2, Object obj) {
            x7.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // l8.k.d
        public void c() {
        }
    }

    /* loaded from: classes.dex */
    class b implements k.c {
        b() {
        }

        @Override // l8.k.c
        public void onMethodCall(l8.j jVar, k.d dVar) {
            Map i10;
            String str = jVar.f11211a;
            Object obj = jVar.f11212b;
            str.hashCode();
            if (str.equals("get")) {
                l.this.f10812f = true;
                if (!l.this.f10811e) {
                    l lVar = l.this;
                    if (lVar.f10807a) {
                        lVar.f10810d = dVar;
                        return;
                    }
                }
                l lVar2 = l.this;
                i10 = lVar2.i(lVar2.f10808b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                l.this.f10808b = (byte[]) obj;
                i10 = null;
            }
            dVar.a(i10);
        }
    }

    l(l8.k kVar, boolean z10) {
        this.f10811e = false;
        this.f10812f = false;
        b bVar = new b();
        this.f10813g = bVar;
        this.f10809c = kVar;
        this.f10807a = z10;
        kVar.e(bVar);
    }

    public l(y7.a aVar, boolean z10) {
        this(new l8.k(aVar, "flutter/restoration", s.f11226b), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f10808b = null;
    }

    public byte[] h() {
        return this.f10808b;
    }

    public void j(byte[] bArr) {
        this.f10811e = true;
        k.d dVar = this.f10810d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f10810d = null;
        } else if (this.f10812f) {
            this.f10809c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f10808b = bArr;
    }
}
