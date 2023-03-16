package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0396x extends U {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SortedSet f10195f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0396x(SortedSet sortedSet, Collection collection, int i10) {
        super(collection, i10);
        this.f10195f = sortedSet;
    }

    @Override // j$.util.U, j$.util.H
    public Comparator getComparator() {
        return this.f10195f.comparator();
    }
}
