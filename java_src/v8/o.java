package v8;

import java.util.ArrayList;
import java.util.Iterator;
import l8.d;
/* loaded from: classes.dex */
final class o implements d.b {

    /* renamed from: a  reason: collision with root package name */
    private d.b f15764a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Object> f15765b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f15766c = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        String f15767a;

        /* renamed from: b  reason: collision with root package name */
        String f15768b;

        /* renamed from: c  reason: collision with root package name */
        Object f15769c;

        c(String str, String str2, Object obj) {
            this.f15767a = str;
            this.f15768b = str2;
            this.f15769c = obj;
        }
    }

    private void d(Object obj) {
        if (this.f15766c) {
            return;
        }
        this.f15765b.add(obj);
    }

    private void e() {
        if (this.f15764a == null) {
            return;
        }
        Iterator<Object> it = this.f15765b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof b) {
                this.f15764a.c();
            } else if (next instanceof c) {
                c cVar = (c) next;
                this.f15764a.b(cVar.f15767a, cVar.f15768b, cVar.f15769c);
            } else {
                this.f15764a.a(next);
            }
        }
        this.f15765b.clear();
    }

    @Override // l8.d.b
    public void a(Object obj) {
        d(obj);
        e();
    }

    @Override // l8.d.b
    public void b(String str, String str2, Object obj) {
        d(new c(str, str2, obj));
        e();
    }

    @Override // l8.d.b
    public void c() {
        d(new b());
        e();
        this.f15766c = true;
    }

    public void f(d.b bVar) {
        this.f15764a = bVar;
        e();
    }
}
