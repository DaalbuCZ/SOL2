package k9;
/* loaded from: classes.dex */
public class t {
    public o9.d a(i iVar) {
        return iVar;
    }

    public o9.b b(Class cls) {
        return new e(cls);
    }

    public o9.c c(Class cls, String str) {
        return new m(cls, str);
    }

    public o9.e d(n nVar) {
        return nVar;
    }

    public String e(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(l lVar) {
        return e(lVar);
    }
}
