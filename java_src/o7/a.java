package o7;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import c8.a;
import l8.c;
import l8.d;
/* loaded from: classes.dex */
public class a implements c8.a, d8.a, d.InterfaceC0160d, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: n  reason: collision with root package name */
    private d.b f12157n;

    /* renamed from: o  reason: collision with root package name */
    private View f12158o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12159p;

    private void c(c cVar) {
        new d(cVar, "flutter_keyboard_visibility").d(this);
    }

    private void d(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        this.f12158o = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private void e() {
        View view = this.f12158o;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f12158o = null;
        }
    }

    @Override // l8.d.InterfaceC0160d
    public void a(Object obj, d.b bVar) {
        this.f12157n = bVar;
    }

    @Override // l8.d.InterfaceC0160d
    public void b(Object obj) {
        this.f12157n = null;
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        d(cVar.e());
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        c(bVar.b());
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        e();
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        e();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f12158o != null) {
            Rect rect = new Rect();
            this.f12158o.getWindowVisibleDisplayFrame(rect);
            ?? r02 = ((double) rect.height()) / ((double) this.f12158o.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r02 != this.f12159p) {
                this.f12159p = r02;
                d.b bVar = this.f12157n;
                if (bVar != null) {
                    bVar.a(Integer.valueOf((int) r02));
                }
            }
        }
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        d(cVar.e());
    }
}
