package f4;

import android.content.Context;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f7231b = new c();

    /* renamed from: a  reason: collision with root package name */
    private b f7232a = null;

    public static b a(Context context) {
        return f7231b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.f7232a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f7232a = new b(context);
        }
        return this.f7232a;
    }
}
