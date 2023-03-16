.class public final synthetic Lq7/d;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lq7/a$c;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lq7/d;->e(Lq7/a$c;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic b(Lq7/a$c;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lq7/d;->d(Lq7/a$c;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static c()Ll8/i;
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
    sget-object v0, Lq7/a$d;->d:Lq7/a$d;

    return-object v0
.end method

.method public static synthetic d(Lq7/a$c;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq7/a$b;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lq7/a$c;->a(Lq7/a$b;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "msgArg unexpectedly null."

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
    invoke-static {p0}, Lq7/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lq7/a$c;Ljava/lang/Object;Ll8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, Lq7/a$c;->isEnabled()Lq7/a$a;

    move-result-object p0

    const-string v0, "result"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    invoke-static {p0}, Lq7/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static f(Ll8/c;Lq7/a$c;)V
    .locals 4

    .line 1
    new-instance v0, Ll8/a;

    invoke-static {}, Lq7/d;->c()Ll8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.WakelockApi.toggle"

    invoke-direct {v0, p0, v2, v1}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lq7/c;

    invoke-direct {v2, p1}, Lq7/c;-><init>(Lq7/a$c;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_0
    new-instance v0, Ll8/a;

    invoke-static {}, Lq7/d;->c()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WakelockApi.isEnabled"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_1

    new-instance p0, Lq7/b;

    invoke-direct {p0, p1}, Lq7/b;-><init>(Lq7/a$c;)V

    invoke-virtual {v0, p0}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_1
    return-void
.end method
