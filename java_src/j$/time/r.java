package j$.time;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends ZoneId {

    /* renamed from: a  reason: collision with root package name */
    private final String f9541a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.zone.c f9542b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(String str, j$.time.zone.c cVar) {
        this.f9541a = str;
        this.f9542b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r s(String str, boolean z10) {
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i10 == 0) && ((charAt < '0' || charAt > '9' || i10 == 0) && ((charAt != '~' || i10 == 0) && ((charAt != '.' || i10 == 0) && ((charAt != '_' || i10 == 0) && ((charAt != '+' || i10 == 0) && (charAt != '-' || i10 == 0))))))))) {
                    throw new d("Invalid ID for region-based ZoneId, invalid format: " + str);
                }
            }
            j$.time.zone.c cVar = null;
            try {
                cVar = j$.time.zone.g.b(str, true);
            } catch (j$.time.zone.d e10) {
                if (z10) {
                    throw e10;
                }
            }
            return new r(str, cVar);
        }
        throw new d("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    @Override // j$.time.ZoneId
    public String o() {
        return this.f9541a;
    }

    @Override // j$.time.ZoneId
    public j$.time.zone.c p() {
        j$.time.zone.c cVar = this.f9542b;
        return cVar != null ? cVar : j$.time.zone.g.b(this.f9541a, false);
    }
}
