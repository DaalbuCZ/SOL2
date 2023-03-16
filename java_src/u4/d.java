package u4;
/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract d a();

        public abstract a b(boolean z10);
    }

    public static d c(int i10) {
        return d(i10).a();
    }

    public static a d(int i10) {
        a0 a0Var = new a0();
        a0Var.c(i10);
        a0Var.b(false);
        return a0Var;
    }

    public abstract boolean a();

    public abstract int b();
}
