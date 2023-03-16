package z3;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f17436a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17437b;

    public r(Context context) {
        o.i(context);
        Resources resources = context.getResources();
        this.f17436a = resources;
        this.f17437b = resources.getResourcePackageName(w3.k.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.f17436a.getIdentifier(str, "string", this.f17437b);
        if (identifier == 0) {
            return null;
        }
        return this.f17436a.getString(identifier);
    }
}
