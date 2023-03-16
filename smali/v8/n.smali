.class public final synthetic Lv8/n;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->r(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic b(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->v(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic c(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->u(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic d(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->n(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic e(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->w(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic f(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->s(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic g(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->t(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic h(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->m(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic i(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->o(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic j(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->q(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static synthetic k(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lv8/n;->p(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public static l()Ll8/i;
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
    sget-object v0, Lv8/b$c;->d:Lv8/b$c;

    return-object v0
.end method

.method public static synthetic m(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, Lv8/b$b;->a()V

    const-string p0, "result"

    const/4 v0, 0x0

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$d;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->k(Lv8/b$d;)Lv8/b$i;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$f;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->d(Lv8/b$f;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->e(Lv8/b$i;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$e;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->b(Lv8/b$e;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$j;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->c(Lv8/b$j;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$g;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->i(Lv8/b$g;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->h(Lv8/b$i;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->f(Lv8/b$i;)Lv8/b$h;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$h;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->g(Lv8/b$h;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lv8/b$b;Ljava/lang/Object;Ll8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lv8/b$b;->j(Lv8/b$i;)V

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
    invoke-static {p0}, Lv8/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Ll8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static x(Ll8/c;Lv8/b$b;)V
    .locals 4

    .line 1
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.AndroidVideoPlayerApi.initialize"

    invoke-direct {v0, p0, v2, v1}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lv8/k;

    invoke-direct {v2, p1}, Lv8/k;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_0
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.create"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Lv8/g;

    invoke-direct {v2, p1}, Lv8/g;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_1
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.dispose"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_2

    new-instance v2, Lv8/d;

    invoke-direct {v2, p1}, Lv8/d;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_2
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setLooping"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_3

    new-instance v2, Lv8/m;

    invoke-direct {v2, p1}, Lv8/m;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_3
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setVolume"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_4

    new-instance v2, Lv8/c;

    invoke-direct {v2, p1}, Lv8/c;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_4
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setPlaybackSpeed"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_5

    new-instance v2, Lv8/i;

    invoke-direct {v2, p1}, Lv8/i;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_5
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.play"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_6

    new-instance v2, Lv8/j;

    invoke-direct {v2, p1}, Lv8/j;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_6
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.position"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_7

    new-instance v2, Lv8/f;

    invoke-direct {v2, p1}, Lv8/f;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_7
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.seekTo"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_8

    new-instance v2, Lv8/e;

    invoke-direct {v2, p1}, Lv8/e;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_8
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.pause"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_9

    new-instance v2, Lv8/h;

    invoke-direct {v2, p1}, Lv8/h;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, v2}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_9
    new-instance v0, Ll8/a;

    invoke-static {}, Lv8/n;->l()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setMixWithOthers"

    invoke-direct {v0, p0, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    if-eqz p1, :cond_a

    new-instance p0, Lv8/l;

    invoke-direct {p0, p1}, Lv8/l;-><init>(Lv8/b$b;)V

    invoke-virtual {v0, p0}, Ll8/a;->e(Ll8/a$d;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v0, v1}, Ll8/a;->e(Ll8/a$d;)V

    :goto_a
    return-void
.end method
