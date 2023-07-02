.class public final synthetic Ld9/n;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->r(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic b(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->v(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic c(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->u(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic d(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->n(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic e(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->w(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic f(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->s(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic g(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->t(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic h(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->m(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic i(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->o(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic j(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->q(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic k(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ld9/n;->p(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static l()Lt8/i;
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
    sget-object v0, Ld9/b$c;->d:Ld9/b$c;

    return-object v0
.end method

.method public static synthetic m(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-interface {p0}, Ld9/b$b;->b()V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$d;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->a(Ld9/b$d;)Ld9/b$i;

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$f;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->d(Ld9/b$f;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->j(Ld9/b$i;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$e;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->e(Ld9/b$e;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$j;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->i(Ld9/b$j;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$g;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->f(Ld9/b$g;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->g(Ld9/b$i;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->k(Ld9/b$i;)Ld9/b$h;

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$h;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->h(Ld9/b$h;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Ld9/b$b;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/b$i;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ld9/b$b;->c(Ld9/b$i;)V

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
    invoke-static {p0}, Ld9/b;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static x(Lt8/c;Ld9/b$b;)V
    .locals 4

    .line 1
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.AndroidVideoPlayerApi.initialize"

    invoke-direct {v0, p0, v2, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Ld9/k;

    invoke-direct {v2, p1}, Ld9/k;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_0
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.create"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Ld9/g;

    invoke-direct {v2, p1}, Ld9/g;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_1
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.dispose"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_2

    new-instance v2, Ld9/d;

    invoke-direct {v2, p1}, Ld9/d;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_2
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setLooping"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_3

    new-instance v2, Ld9/m;

    invoke-direct {v2, p1}, Ld9/m;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_3
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setVolume"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_4

    new-instance v2, Ld9/c;

    invoke-direct {v2, p1}, Ld9/c;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_4
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setPlaybackSpeed"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_5

    new-instance v2, Ld9/i;

    invoke-direct {v2, p1}, Ld9/i;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_5
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.play"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_6

    new-instance v2, Ld9/j;

    invoke-direct {v2, p1}, Ld9/j;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_6
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.position"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_7

    new-instance v2, Ld9/f;

    invoke-direct {v2, p1}, Ld9/f;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_7
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.seekTo"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_8

    new-instance v2, Ld9/e;

    invoke-direct {v2, p1}, Ld9/e;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_8
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.pause"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_9

    new-instance v2, Ld9/h;

    invoke-direct {v2, p1}, Ld9/h;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_9
    new-instance v0, Lt8/a;

    invoke-static {}, Ld9/n;->l()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setMixWithOthers"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_a

    new-instance p0, Ld9/l;

    invoke-direct {p0, p1}, Ld9/l;-><init>(Ld9/b$b;)V

    invoke-virtual {v0, p0}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_a
    return-void
.end method
