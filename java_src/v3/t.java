package v3;

import android.os.Bundle;
/* loaded from: classes.dex */
final class t extends u<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // v3.u
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new v(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // v3.u
    public final boolean b() {
        return true;
    }
}
