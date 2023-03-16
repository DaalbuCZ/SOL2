package z3;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class d {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Account f17334a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f17335b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f17336c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<x3.a<?>, z> f17337d;

    /* renamed from: e  reason: collision with root package name */
    private final int f17338e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final View f17339f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17340g;

    /* renamed from: h  reason: collision with root package name */
    private final String f17341h;

    /* renamed from: i  reason: collision with root package name */
    private final q4.a f17342i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f17343j;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private Account f17344a;

        /* renamed from: b  reason: collision with root package name */
        private m.b<Scope> f17345b;

        /* renamed from: c  reason: collision with root package name */
        private String f17346c;

        /* renamed from: d  reason: collision with root package name */
        private String f17347d;

        /* renamed from: e  reason: collision with root package name */
        private q4.a f17348e = q4.a.f12698j;

        public d a() {
            return new d(this.f17344a, this.f17345b, null, 0, null, this.f17346c, this.f17347d, this.f17348e, false);
        }

        public a b(String str) {
            this.f17346c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.f17345b == null) {
                this.f17345b = new m.b<>();
            }
            this.f17345b.addAll(collection);
            return this;
        }

        public final a d(@Nullable Account account) {
            this.f17344a = account;
            return this;
        }

        public final a e(String str) {
            this.f17347d = str;
            return this;
        }
    }

    public d(@Nullable Account account, Set<Scope> set, Map<x3.a<?>, z> map, int i10, @Nullable View view, String str, String str2, @Nullable q4.a aVar, boolean z10) {
        this.f17334a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f17335b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f17337d = map;
        this.f17339f = view;
        this.f17338e = i10;
        this.f17340g = str;
        this.f17341h = str2;
        this.f17342i = aVar == null ? q4.a.f12698j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (z zVar : map.values()) {
            hashSet.addAll(zVar.f17455a);
        }
        this.f17336c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f17334a;
    }

    public Account b() {
        Account account = this.f17334a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f17336c;
    }

    public String d() {
        return this.f17340g;
    }

    public Set<Scope> e() {
        return this.f17335b;
    }

    public final q4.a f() {
        return this.f17342i;
    }

    public final Integer g() {
        return this.f17343j;
    }

    public final String h() {
        return this.f17341h;
    }

    public final void i(Integer num) {
        this.f17343j = num;
    }
}
