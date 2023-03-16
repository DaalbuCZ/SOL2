package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import io.flutter.embedding.android.g;
/* loaded from: classes.dex */
public class b extends io.flutter.embedding.android.g {

    /* renamed from: t  reason: collision with root package name */
    private a f8753t;

    public b(Context context, int i10, int i11, a aVar) {
        super(context, i10, i11, g.b.overlay);
        this.f8753t = aVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f8753t;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
