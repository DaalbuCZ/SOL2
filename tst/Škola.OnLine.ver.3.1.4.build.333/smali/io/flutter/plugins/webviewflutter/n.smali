.class public final synthetic Lio/flutter/plugins/webviewflutter/n;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lio/flutter/plugins/webviewflutter/k$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/n;->d(Lio/flutter/plugins/webviewflutter/k$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/webviewflutter/k$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/n;->e(Lio/flutter/plugins/webviewflutter/k$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static c()Lt8/i;
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
    sget-object v0, Lio/flutter/plugins/webviewflutter/k$c;->d:Lio/flutter/plugins/webviewflutter/k$c;

    return-object v0
.end method

.method public static synthetic d(Lio/flutter/plugins/webviewflutter/k$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    new-instance v0, Lio/flutter/plugins/webviewflutter/n$a;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/webviewflutter/n$a;-><init>(Ljava/util/Map;Lt8/a$e;)V

    invoke-interface {p0, v0}, Lio/flutter/plugins/webviewflutter/k$b;->a(Lio/flutter/plugins/webviewflutter/k$n;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/webviewflutter/k$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$b;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "valueArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "urlArg unexpectedly null."

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

.method public static f(Lt8/c;Lio/flutter/plugins/webviewflutter/k$b;)V
    .locals 4

    .line 1
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/n;->c()Lt8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.CookieManagerHostApi.clearCookies"

    invoke-direct {v0, p0, v2, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/webviewflutter/l;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/l;-><init>(Lio/flutter/plugins/webviewflutter/k$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_0
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/n;->c()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.CookieManagerHostApi.setCookie"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_1

    new-instance p0, Lio/flutter/plugins/webviewflutter/m;

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/m;-><init>(Lio/flutter/plugins/webviewflutter/k$b;)V

    invoke-virtual {v0, p0}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_1
    return-void
.end method
