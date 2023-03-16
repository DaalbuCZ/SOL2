package kotlinx.coroutines.internal;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
final class d extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final d f10911a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final a f10912b = new a();

    /* loaded from: classes.dex */
    public static final class a extends ClassValue<j9.l<? super Throwable, ? extends Throwable>> {
        a() {
        }
    }

    private d() {
    }

    @Override // kotlinx.coroutines.internal.g
    public j9.l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        return (j9.l) f10912b.get(cls);
    }
}
