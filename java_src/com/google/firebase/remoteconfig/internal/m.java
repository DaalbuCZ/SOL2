package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import d7.j;
import java.util.Date;
/* loaded from: classes.dex */
public class m {

    /* renamed from: d  reason: collision with root package name */
    static final Date f5886d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    static final Date f5887e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f5888a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5889b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f5890c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5891a;

        /* renamed from: b  reason: collision with root package name */
        private Date f5892b;

        a(int i10, Date date) {
            this.f5891a = i10;
            this.f5892b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f5892b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f5891a;
        }
    }

    public m(SharedPreferences sharedPreferences) {
        this.f5888a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.f5890c) {
            aVar = new a(this.f5888a.getInt("num_failed_fetches", 0), new Date(this.f5888a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f5888a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public d7.h c() {
        o a10;
        synchronized (this.f5889b) {
            long j10 = this.f5888a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f5888a.getInt("last_fetch_status", 0);
            a10 = o.b().c(i10).d(j10).b(new j.b().d(this.f5888a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f5888a.getLong("minimum_fetch_interval_in_seconds", j.f5861j)).c()).a();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f5888a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date e() {
        return new Date(this.f5888a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long f() {
        return this.f5888a.getLong("minimum_fetch_interval_in_seconds", j.f5861j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        h(0, f5887e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i10, Date date) {
        synchronized (this.f5890c) {
            this.f5888a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(String str) {
        synchronized (this.f5889b) {
            this.f5888a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        synchronized (this.f5889b) {
            this.f5888a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Date date) {
        synchronized (this.f5889b) {
            this.f5888a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        synchronized (this.f5889b) {
            this.f5888a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
