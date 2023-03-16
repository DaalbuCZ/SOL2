package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: n  reason: collision with root package name */
    private final int f1569n;

    /* renamed from: o  reason: collision with root package name */
    private final b f1570o;

    /* renamed from: p  reason: collision with root package name */
    private final int f1571p;

    public a(int i10, b bVar, int i11) {
        this.f1569n = i10;
        this.f1570o = bVar;
        this.f1571p = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1569n);
        this.f1570o.G(this.f1571p, bundle);
    }
}
