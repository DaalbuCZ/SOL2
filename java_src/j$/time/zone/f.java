package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
/* loaded from: classes2.dex */
final class f extends g {

    /* renamed from: c  reason: collision with root package name */
    private final Set f9586c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f9586c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.g
    protected c c(String str, boolean z10) {
        if (this.f9586c.contains(str)) {
            return new c(TimeZone.getTimeZone(str));
        }
        throw new d("Not a built-in time zone: " + str);
    }

    @Override // j$.time.zone.g
    protected Set d() {
        return this.f9586c;
    }
}
