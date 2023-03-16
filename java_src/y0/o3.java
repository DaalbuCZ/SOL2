package y0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class o3 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16633a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f16634b;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<View> list);
    }

    /* loaded from: classes.dex */
    private class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private View f16635n;

        /* renamed from: o  reason: collision with root package name */
        private a f16636o;

        public b(View view, a aVar) {
            this.f16635n = view;
            this.f16636o = aVar;
        }

        private List<View> a(View view) {
            if (o3.this.f16634b.contains(view.getTag())) {
                return Collections.emptyList();
            }
            if (!(view instanceof ViewGroup) || (view instanceof AdapterView)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                arrayList2.addAll(a(viewGroup.getChildAt(i10)));
            }
            return arrayList2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<View> a10 = a(this.f16635n);
            a aVar = this.f16636o;
            if (aVar != null) {
                aVar.a(a10);
            }
            this.f16636o = null;
        }
    }

    public o3(List<Object> list) {
        this.f16634b = list;
    }

    public void b(View view, a aVar) {
        this.f16633a.execute(new b(view, aVar));
    }
}
