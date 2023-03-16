package t4;

import java.util.ArrayList;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collection f14745a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Collection collection) {
        this.f14745a = collection;
    }

    @Override // t4.a
    public final /* bridge */ /* synthetic */ Object a(i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f14745a);
        return l.e(arrayList);
    }
}
