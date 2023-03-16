package j$.util.concurrent;
/* loaded from: classes2.dex */
class x extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected Object initialValue() {
        return new ThreadLocalRandom(null);
    }
}
