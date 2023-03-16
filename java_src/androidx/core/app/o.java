package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f1298a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f1299b;

    /* renamed from: c  reason: collision with root package name */
    String f1300c;

    /* renamed from: d  reason: collision with root package name */
    String f1301d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1302e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1303f;

    /* loaded from: classes.dex */
    static class a {
        static o a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.c(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(o oVar) {
            return new Person.Builder().setName(oVar.e()).setIcon(oVar.c() != null ? oVar.c().y() : null).setUri(oVar.f()).setKey(oVar.d()).setBot(oVar.g()).setImportant(oVar.h()).build();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f1304a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f1305b;

        /* renamed from: c  reason: collision with root package name */
        String f1306c;

        /* renamed from: d  reason: collision with root package name */
        String f1307d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1308e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1309f;

        public o a() {
            return new o(this);
        }

        public b b(boolean z10) {
            this.f1308e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f1305b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f1309f = z10;
            return this;
        }

        public b e(String str) {
            this.f1307d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f1304a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f1306c = str;
            return this;
        }
    }

    o(b bVar) {
        this.f1298a = bVar.f1304a;
        this.f1299b = bVar.f1305b;
        this.f1300c = bVar.f1306c;
        this.f1301d = bVar.f1307d;
        this.f1302e = bVar.f1308e;
        this.f1303f = bVar.f1309f;
    }

    public static o a(Person person) {
        return a.a(person);
    }

    public static o b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.b(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f1299b;
    }

    public String d() {
        return this.f1301d;
    }

    public CharSequence e() {
        return this.f1298a;
    }

    public String f() {
        return this.f1300c;
    }

    public boolean g() {
        return this.f1302e;
    }

    public boolean h() {
        return this.f1303f;
    }

    public String i() {
        String str = this.f1300c;
        if (str != null) {
            return str;
        }
        if (this.f1298a != null) {
            return "name:" + ((Object) this.f1298a);
        }
        return "";
    }

    public Person j() {
        return a.b(this);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f1298a);
        IconCompat iconCompat = this.f1299b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.x() : null);
        bundle.putString("uri", this.f1300c);
        bundle.putString("key", this.f1301d);
        bundle.putBoolean("isBot", this.f1302e);
        bundle.putBoolean("isImportant", this.f1303f);
        return bundle;
    }
}
