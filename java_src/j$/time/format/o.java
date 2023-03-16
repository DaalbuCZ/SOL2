package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f9477a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(String str) {
        this.f9477a = str;
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        sb.append(this.f9477a);
        return true;
    }

    @Override // j$.time.format.g
    public int b(s sVar, CharSequence charSequence, int i10) {
        if (i10 > charSequence.length() || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.f9477a;
        return !sVar.r(charSequence, i10, str, 0, str.length()) ? ~i10 : this.f9477a.length() + i10;
    }

    public String toString() {
        String replace = this.f9477a.replace("'", "''");
        return "'" + replace + "'";
    }
}
