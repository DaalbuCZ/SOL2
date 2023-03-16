package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.s;
import k8.d;
/* loaded from: classes.dex */
public class m implements s.d {

    /* renamed from: a  reason: collision with root package name */
    private final k8.d f8550a;

    /* renamed from: b  reason: collision with root package name */
    private final s.b f8551b = new s.b();

    public m(k8.d dVar) {
        this.f8550a = dVar;
    }

    @Override // io.flutter.embedding.android.s.d
    public void a(KeyEvent keyEvent, final s.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f8550a.e(new d.b(keyEvent, this.f8551b.a(keyEvent.getUnicodeChar())), action != 0, new d.a() { // from class: io.flutter.embedding.android.l
                @Override // k8.d.a
                public final void a(boolean z10) {
                    s.d.a.this.a(z10);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
