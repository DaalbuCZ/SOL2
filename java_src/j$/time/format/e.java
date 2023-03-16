package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final char f9453a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(char c10) {
        this.f9453a = c10;
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        sb.append(this.f9453a);
        return true;
    }

    @Override // j$.time.format.g
    public int b(s sVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char charAt = charSequence.charAt(i10);
        return (charAt == this.f9453a || (!sVar.j() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.f9453a) || Character.toLowerCase(charAt) == Character.toLowerCase(this.f9453a)))) ? i10 + 1 : ~i10;
    }

    public String toString() {
        if (this.f9453a == '\'') {
            return "''";
        }
        StringBuilder b10 = j$.time.a.b("'");
        b10.append(this.f9453a);
        b10.append("'");
        return b10.toString();
    }
}
