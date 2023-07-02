.class public final synthetic Lio/flutter/plugins/webviewflutter/f2;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic A(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->C(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static B()Lt8/i;
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
    sget-object v0, Lio/flutter/plugins/webviewflutter/k$d0;->d:Lio/flutter/plugins/webviewflutter/k$d0;

    return-object v0
.end method

.method public static synthetic C(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->b(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "useHybridCompositionArg unexpectedly null."

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

.method public static synthetic D(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->a(Ljava/lang/Long;)V

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

.method public static synthetic E(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->o(Ljava/lang/Long;)V

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

.method public static synthetic F(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->f(Ljava/lang/Long;)V

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

.method public static synthetic G(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->r(Ljava/lang/Long;Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "includeDiskFilesArg unexpectedly null."

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

.method public static synthetic H(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 5

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

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/webviewflutter/f2$a;

    invoke-direct {v2, v0, p2}, Lio/flutter/plugins/webviewflutter/f2$a;-><init>(Ljava/util/Map;Lt8/a$e;)V

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, p1, v2}, Lio/flutter/plugins/webviewflutter/k$c0;->u(Ljava/lang/Long;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$n;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "javascriptStringArg unexpectedly null."

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

    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic I(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->d(Ljava/lang/Long;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic J(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    if-eqz v2, :cond_1

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, v1, v2, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->v(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "yArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "xArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
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

.method public static synthetic K(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    if-eqz v2, :cond_1

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, v1, v2, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->z(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "yArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "xArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
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

.method public static synthetic L(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->c(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic M(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->x(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic N(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->y(Ljava/lang/Long;)Lio/flutter/plugins/webviewflutter/k$e0;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic O(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 6

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

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x3

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, v2, v3, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->e(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "dataArg unexpectedly null."

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

.method public static synthetic P(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->m(Ljava/lang/Boolean;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "enabledArg unexpectedly null."

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

.method public static synthetic Q(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->A(Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "webViewClientInstanceIdArg unexpectedly null."

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

.method public static synthetic R(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->g(Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "javaScriptChannelInstanceIdArg unexpectedly null."

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

.method public static synthetic S(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->w(Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "javaScriptChannelInstanceIdArg unexpectedly null."

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

.method public static synthetic T(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 5

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

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move-object p1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_0
    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->l(Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

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

    goto :goto_1

    :catch_1
    move-exception p0

    :goto_1
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic U(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 5

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

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move-object p1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_0
    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->n(Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

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

    goto :goto_1

    :catch_1
    move-exception p0

    :goto_1
    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    invoke-interface {p2, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic V(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, v1, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->k(Ljava/lang/Long;Ljava/lang/Long;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "colorArg unexpectedly null."

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

.method public static synthetic W(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 10

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

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_0

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    const/4 v2, 0x4

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    const/4 v2, 0x5

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v3, p0

    invoke-interface/range {v3 .. v9}, Lio/flutter/plugins/webviewflutter/k$c0;->i(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "dataArg unexpectedly null."

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

.method public static synthetic X(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, v2, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->p(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "headersArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "urlArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
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

.method public static synthetic Y(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p0, v1, v2, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->t(Ljava/lang/Long;Ljava/lang/String;[B)V

    const-string p0, "result"

    const/4 p1, 0x0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "dataArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "urlArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
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

.method public static synthetic Z(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->s(Ljava/lang/Long;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic a(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->J(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic a0(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->q(Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic b(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->a0(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic b0(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->h(Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object p0

    const-string p1, "result"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic c(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->I(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic c0(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
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

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$c0;->j(Ljava/lang/Long;)V

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

.method public static synthetic d(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->c0(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static d0(Lt8/c;Lio/flutter/plugins/webviewflutter/k$c0;)V
    .locals 4

    .line 1
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.WebViewHostApi.create"

    invoke-direct {v0, p0, v2, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/webviewflutter/w1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/w1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_0
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.dispose"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Lio/flutter/plugins/webviewflutter/f1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/f1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_1
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.loadData"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_2

    new-instance v2, Lio/flutter/plugins/webviewflutter/d2;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/d2;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_2
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.loadDataWithBaseUrl"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_3

    new-instance v2, Lio/flutter/plugins/webviewflutter/e2;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/e2;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_3
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.loadUrl"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_4

    new-instance v2, Lio/flutter/plugins/webviewflutter/s1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/s1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_4
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.postUrl"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_5

    new-instance v2, Lio/flutter/plugins/webviewflutter/v1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/v1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_5
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.getUrl"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_6

    new-instance v2, Lio/flutter/plugins/webviewflutter/m1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/m1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_6
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.canGoBack"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_7

    new-instance v2, Lio/flutter/plugins/webviewflutter/p1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/p1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_7
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.canGoForward"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_8

    new-instance v2, Lio/flutter/plugins/webviewflutter/l1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/l1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_8
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.goBack"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_9

    new-instance v2, Lio/flutter/plugins/webviewflutter/y1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/y1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_9
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.goForward"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_a

    new-instance v2, Lio/flutter/plugins/webviewflutter/o1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/o1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_a
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.reload"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_b

    new-instance v2, Lio/flutter/plugins/webviewflutter/i1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/i1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_b

    :cond_b
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_b
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.clearCache"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_c

    new-instance v2, Lio/flutter/plugins/webviewflutter/g1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/g1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_c

    :cond_c
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_c
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.evaluateJavascript"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_d

    new-instance v2, Lio/flutter/plugins/webviewflutter/k1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/k1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_d

    :cond_d
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_d
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.getTitle"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_e

    new-instance v2, Lio/flutter/plugins/webviewflutter/x1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/x1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_e

    :cond_e
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_e
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.scrollTo"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_f

    new-instance v2, Lio/flutter/plugins/webviewflutter/e1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/e1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_f

    :cond_f
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_f
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.scrollBy"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_10

    new-instance v2, Lio/flutter/plugins/webviewflutter/a2;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/a2;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_10

    :cond_10
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_10
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.getScrollX"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_11

    new-instance v2, Lio/flutter/plugins/webviewflutter/t1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/t1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_11

    :cond_11
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_11
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.getScrollY"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_12

    new-instance v2, Lio/flutter/plugins/webviewflutter/c2;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/c2;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_12

    :cond_12
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_12
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.getScrollPosition"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_13

    new-instance v2, Lio/flutter/plugins/webviewflutter/u1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/u1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_13

    :cond_13
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_13
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.setWebContentsDebuggingEnabled"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_14

    new-instance v2, Lio/flutter/plugins/webviewflutter/b2;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/b2;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_14

    :cond_14
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_14
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.setWebViewClient"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_15

    new-instance v2, Lio/flutter/plugins/webviewflutter/n1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/n1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_15

    :cond_15
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_15
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.addJavaScriptChannel"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_16

    new-instance v2, Lio/flutter/plugins/webviewflutter/h1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/h1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_16

    :cond_16
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_16
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.removeJavaScriptChannel"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_17

    new-instance v2, Lio/flutter/plugins/webviewflutter/q1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/q1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_17

    :cond_17
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_17
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.setDownloadListener"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_18

    new-instance v2, Lio/flutter/plugins/webviewflutter/z1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/z1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_18

    :cond_18
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_18
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.setWebChromeClient"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_19

    new-instance v2, Lio/flutter/plugins/webviewflutter/r1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/webviewflutter/r1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_19

    :cond_19
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_19
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/f2;->B()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WebViewHostApi.setBackgroundColor"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_1a

    new-instance p0, Lio/flutter/plugins/webviewflutter/j1;

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/j1;-><init>(Lio/flutter/plugins/webviewflutter/k$c0;)V

    invoke-virtual {v0, p0}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_1a

    :cond_1a
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_1a
    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->T(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic f(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->K(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->P(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic h(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->M(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->O(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->W(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic k(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->D(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->G(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic m(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->R(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic n(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->F(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic o(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->V(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic p(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->H(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic q(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->b0(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic r(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->Z(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic s(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->Q(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic t(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->E(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic u(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->S(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic v(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->U(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic w(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->X(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic x(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->L(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic y(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->N(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic z(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->Y(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method
