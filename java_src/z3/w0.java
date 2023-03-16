package z3;

import android.util.Log;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a  reason: collision with root package name */
    private Object f17448a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17449b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f17450c;

    public w0(c cVar, Object obj) {
        this.f17450c = cVar;
        this.f17448a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f17448a;
            if (this.f17449b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f17449b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f17448a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f17450c.E;
        synchronized (arrayList) {
            arrayList2 = this.f17450c.E;
            arrayList2.remove(this);
        }
    }
}
