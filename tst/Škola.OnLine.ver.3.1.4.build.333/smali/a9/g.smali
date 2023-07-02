.class public final synthetic La9/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La9/g;->k(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic b(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La9/g;->m(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic c(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La9/g;->h(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic d(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La9/g;->j(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic e(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La9/g;->l(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic f(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La9/g;->i(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static g()Lt8/i;
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
    sget-object v0, La9/h$b;->d:La9/h$b;

    return-object v0
.end method

.method public static synthetic h(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, La9/h$a;->a()Ljava/lang/String;

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
    invoke-static {p0}, La9/h;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, La9/h$a;->e()Ljava/lang/String;

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
    invoke-static {p0}, La9/h;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, La9/h$a;->b()Ljava/lang/String;

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
    invoke-static {p0}, La9/h;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, La9/h$a;->f()Ljava/lang/String;

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
    invoke-static {p0}, La9/h;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, La9/h$a;->c()Ljava/util/List;

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
    invoke-static {p0}, La9/h;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(La9/h$a;Ljava/lang/Object;Lt8/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, La9/h$c;->values()[La9/h$c;

    move-result-object v2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-object p1, v2, p1

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p0, p1}, La9/h$a;->d(La9/h$c;)Ljava/util/List;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "directoryArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    :goto_1
    invoke-static {p0}, La9/h;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static n(Lt8/c;La9/h$a;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Lt8/c;->c()Lt8/c$c;

    move-result-object v0

    new-instance v1, Lt8/a;

    invoke-static {}, La9/g;->g()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath"

    invoke-direct {v1, p0, v3, v2, v0}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;Lt8/c$c;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance v2, La9/c;

    invoke-direct {v2, p1}, La9/c;-><init>(La9/h$a;)V

    invoke-virtual {v1, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Lt8/a;->e(Lt8/a$d;)V

    :goto_0
    invoke-interface {p0}, Lt8/c;->c()Lt8/c$c;

    move-result-object v1

    new-instance v2, Lt8/a;

    invoke-static {}, La9/g;->g()Lt8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath"

    invoke-direct {v2, p0, v4, v3, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;Lt8/c$c;)V

    if-eqz p1, :cond_1

    new-instance v1, La9/f;

    invoke-direct {v1, p1}, La9/f;-><init>(La9/h$a;)V

    invoke-virtual {v2, v1}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v0}, Lt8/a;->e(Lt8/a$d;)V

    :goto_1
    invoke-interface {p0}, Lt8/c;->c()Lt8/c$c;

    move-result-object v1

    new-instance v2, Lt8/a;

    invoke-static {}, La9/g;->g()Lt8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath"

    invoke-direct {v2, p0, v4, v3, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;Lt8/c$c;)V

    if-eqz p1, :cond_2

    new-instance v1, La9/d;

    invoke-direct {v1, p1}, La9/d;-><init>(La9/h$a;)V

    invoke-virtual {v2, v1}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v0}, Lt8/a;->e(Lt8/a$d;)V

    :goto_2
    invoke-interface {p0}, Lt8/c;->c()Lt8/c$c;

    move-result-object v1

    new-instance v2, Lt8/a;

    invoke-static {}, La9/g;->g()Lt8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath"

    invoke-direct {v2, p0, v4, v3, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;Lt8/c$c;)V

    if-eqz p1, :cond_3

    new-instance v1, La9/a;

    invoke-direct {v1, p1}, La9/a;-><init>(La9/h$a;)V

    invoke-virtual {v2, v1}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2, v0}, Lt8/a;->e(Lt8/a$d;)V

    :goto_3
    invoke-interface {p0}, Lt8/c;->c()Lt8/c$c;

    move-result-object v1

    new-instance v2, Lt8/a;

    invoke-static {}, La9/g;->g()Lt8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths"

    invoke-direct {v2, p0, v4, v3, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;Lt8/c$c;)V

    if-eqz p1, :cond_4

    new-instance v1, La9/e;

    invoke-direct {v1, p1}, La9/e;-><init>(La9/h$a;)V

    invoke-virtual {v2, v1}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2, v0}, Lt8/a;->e(Lt8/a$d;)V

    :goto_4
    invoke-interface {p0}, Lt8/c;->c()Lt8/c$c;

    move-result-object v1

    new-instance v2, Lt8/a;

    invoke-static {}, La9/g;->g()Lt8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths"

    invoke-direct {v2, p0, v4, v3, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;Lt8/c$c;)V

    if-eqz p1, :cond_5

    new-instance p0, La9/b;

    invoke-direct {p0, p1}, La9/b;-><init>(La9/h$a;)V

    invoke-virtual {v2, p0}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v2, v0}, Lt8/a;->e(Lt8/a$d;)V

    :goto_5
    return-void
.end method
