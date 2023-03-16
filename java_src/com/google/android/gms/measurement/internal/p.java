package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class p extends d5 {

    /* renamed from: c  reason: collision with root package name */
    private long f4869c;

    /* renamed from: d  reason: collision with root package name */
    private String f4870d;

    /* renamed from: e  reason: collision with root package name */
    private AccountManager f4871e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f4872f;

    /* renamed from: g  reason: collision with root package name */
    private long f4873g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(j4 j4Var) {
        super(j4Var);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    protected final boolean j() {
        Calendar calendar = Calendar.getInstance();
        this.f4869c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f4870d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long o() {
        h();
        return this.f4873g;
    }

    public final long p() {
        k();
        return this.f4869c;
    }

    public final String q() {
        k();
        return this.f4870d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        h();
        this.f4872f = null;
        this.f4873g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        h();
        long a10 = this.f4438a.e().a();
        if (a10 - this.f4873g > 86400000) {
            this.f4872f = null;
        }
        Boolean bool = this.f4872f;
        if (bool == null) {
            if (androidx.core.content.a.a(this.f4438a.c(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f4438a.d().y().a("Permission error checking for dasher/unicorn accounts");
            } else {
                if (this.f4871e == null) {
                    this.f4871e = AccountManager.get(this.f4438a.c());
                }
                try {
                    Account[] result = this.f4871e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result != null && result.length > 0) {
                        this.f4872f = Boolean.TRUE;
                        this.f4873g = a10;
                        return true;
                    }
                    Account[] result2 = this.f4871e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f4872f = Boolean.TRUE;
                        this.f4873g = a10;
                        return true;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                    this.f4438a.d().t().b("Exception checking account types", e10);
                }
            }
            this.f4873g = a10;
            this.f4872f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
