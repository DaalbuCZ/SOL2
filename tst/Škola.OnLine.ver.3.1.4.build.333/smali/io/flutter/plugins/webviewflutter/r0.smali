.class public final synthetic Lio/flutter/plugins/webviewflutter/r0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic A(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->f(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "requireArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic B(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->i(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "supportArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic C(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->k(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "overviewArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static D(Lt8/c;Lio/flutter/plugins/webviewflutter/k$u;)V
    .locals 4

    .line 1
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.WebSettingsHostApi.create"

    invoke-direct {v0, p0, v2, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/webviewflutter/i0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/i0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_0
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.dispose"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Lio/flutter/plugins/webviewflutter/o0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/o0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_1
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setDomStorageEnabled"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_2

    new-instance v2, Lio/flutter/plugins/webviewflutter/g0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/g0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_2
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_3

    new-instance v2, Lio/flutter/plugins/webviewflutter/m0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/m0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_3
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setSupportMultipleWindows"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_4

    new-instance v2, Lio/flutter/plugins/webviewflutter/q0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/q0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_4
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptEnabled"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_5

    new-instance v2, Lio/flutter/plugins/webviewflutter/e0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/e0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_5
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setUserAgentString"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_6

    new-instance v2, Lio/flutter/plugins/webviewflutter/k0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/k0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_6
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_7

    new-instance v2, Lio/flutter/plugins/webviewflutter/l0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/l0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_7
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setSupportZoom"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_8

    new-instance v2, Lio/flutter/plugins/webviewflutter/d0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/d0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_8
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setLoadWithOverviewMode"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_9

    new-instance v2, Lio/flutter/plugins/webviewflutter/j0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/j0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_9
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setUseWideViewPort"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_a

    new-instance v2, Lio/flutter/plugins/webviewflutter/h0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/h0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_a
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setDisplayZoomControls"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_b

    new-instance v2, Lio/flutter/plugins/webviewflutter/p0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/p0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_b

    :cond_b
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_b
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setBuiltInZoomControls"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_c

    new-instance v2, Lio/flutter/plugins/webviewflutter/n0;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/n0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_c

    :cond_c
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_c
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/r0;->o()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebSettingsHostApi.setAllowFileAccess"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_d

    new-instance p0, Lio/flutter/plugins/webviewflutter/f0;

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/f0;-><init>(Lio/flutter/plugins/webviewflutter/k$u;)V

    invoke-virtual {v0, p0}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_d

    :cond_d
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_d
    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->B(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->p(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->C(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->z(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->A(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic f(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->w(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->t(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic h(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->q(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->s(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->x(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic k(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->y(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->u(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic m(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->v(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic n(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->r(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static o()Lt8/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt8/i<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/flutter/plugins/webviewflutter/k$v;->d:Lio/flutter/plugins/webviewflutter/k$v;

    return-object v0
.end method

.method public static synthetic p(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->b(Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "webViewInstanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$u;->a(Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->l(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "useArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->e(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "enabledArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->n(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "enabledArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->h(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "enabledArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->d(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "flagArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->m(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "flagArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->g(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "supportArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic y(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->c(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "flagArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Lio/flutter/plugins/webviewflutter/k$u;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$u;->j(Ljava/lang/Long;Ljava/lang/String;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instanceIdArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method
