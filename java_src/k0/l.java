package k0;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import k0.u;
/* loaded from: classes.dex */
public final class l extends u {

    /* loaded from: classes.dex */
    public static final class a extends u.a<a, l> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f10526c.f13234d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k0.u.a
        /* renamed from: h */
        public l c() {
            if (this.f10524a && Build.VERSION.SDK_INT >= 23 && this.f10526c.f13240j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new l(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k0.u.a
        /* renamed from: i */
        public a d() {
            return this;
        }
    }

    l(a aVar) {
        super(aVar.f10525b, aVar.f10526c, aVar.f10527d);
    }

    public static l e(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
