.class public final synthetic Lio/flutter/plugins/webviewflutter/d1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lio/flutter/plugins/webviewflutter/k$a0;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/d1;->c(Lio/flutter/plugins/webviewflutter/k$a0;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static b()Ll8/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/i<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/flutter/plugins/webviewflutter/k$b0;->d:Lio/flutter/plugins/webviewflutter/k$b0;

    return-object v0
.end method

.method public static synthetic c(Lio/flutter/plugins/webviewflutter/k$a0;Ljava/lang/Object;Ll8/a$e;)V
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

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$a0;->b(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "shouldOverrideUrlLoadingArg unexpectedly null."

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
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static d(Ll8/c;Lio/flutter/plugins/webviewflutter/k$a0;)V
    .locals 3

    .line 1
    new-instance v0, Ll8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/d1;->b()Ll8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.WebViewClientHostApi.create"

    invoke-direct {v0, p0, v2, v1}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_0

    new-instance p0, Lio/flutter/plugins/webviewflutter/c1;

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/c1;-><init>(Lio/flutter/plugins/webviewflutter/k$a0;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Ll8/a;->e(Ll8/a$d;)V

    return-void
.end method