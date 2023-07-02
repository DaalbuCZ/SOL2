.class public final synthetic Lio/flutter/plugins/imagepicker/k;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/imagepicker/k;->g(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/imagepicker/k;->f(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/imagepicker/k;->e(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V

    return-void
.end method

.method public static d()Lt8/i;
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
    sget-object v0, Lio/flutter/plugins/imagepicker/g$g;->d:Lio/flutter/plugins/imagepicker/g$g;

    return-object v0
.end method

.method public static synthetic e(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/flutter/plugins/imagepicker/g$k;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/flutter/plugins/imagepicker/g$h;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/Boolean;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/Boolean;

    new-instance v7, Lio/flutter/plugins/imagepicker/k$a;

    invoke-direct {v7, v0, p2}, Lio/flutter/plugins/imagepicker/k$a;-><init>(Ljava/util/ArrayList;Lt8/a$e;)V

    move-object v2, p0

    invoke-interface/range {v2 .. v7}, Lio/flutter/plugins/imagepicker/g$f;->a(Lio/flutter/plugins/imagepicker/g$k;Lio/flutter/plugins/imagepicker/g$h;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/flutter/plugins/imagepicker/g$i;)V

    return-void
.end method

.method public static synthetic f(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/flutter/plugins/imagepicker/g$k;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/flutter/plugins/imagepicker/g$m;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/Boolean;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/Boolean;

    new-instance v7, Lio/flutter/plugins/imagepicker/k$b;

    invoke-direct {v7, v0, p2}, Lio/flutter/plugins/imagepicker/k$b;-><init>(Ljava/util/ArrayList;Lt8/a$e;)V

    move-object v2, p0

    invoke-interface/range {v2 .. v7}, Lio/flutter/plugins/imagepicker/g$f;->c(Lio/flutter/plugins/imagepicker/g$k;Lio/flutter/plugins/imagepicker/g$m;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/flutter/plugins/imagepicker/g$i;)V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/imagepicker/g$f;Ljava/lang/Object;Lt8/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-interface {p0}, Lio/flutter/plugins/imagepicker/g$f;->b()Lio/flutter/plugins/imagepicker/g$c;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lio/flutter/plugins/imagepicker/g;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    invoke-interface {p2, p1}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static h(Lt8/c;Lio/flutter/plugins/imagepicker/g$f;)V
    .locals 4

    .line 1
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/imagepicker/k;->d()Lt8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.ImagePickerApi.pickImages"

    invoke-direct {v0, p0, v2, v1}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/imagepicker/j;

    invoke-direct {v2, p1}, Lio/flutter/plugins/imagepicker/j;-><init>(Lio/flutter/plugins/imagepicker/g$f;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_0
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/imagepicker/k;->d()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.ImagePickerApi.pickVideos"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Lio/flutter/plugins/imagepicker/i;

    invoke-direct {v2, p1}, Lio/flutter/plugins/imagepicker/i;-><init>(Lio/flutter/plugins/imagepicker/g$f;)V

    invoke-virtual {v0, v2}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_1
    new-instance v0, Lt8/a;

    invoke-static {}, Lio/flutter/plugins/imagepicker/k;->d()Lt8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.ImagePickerApi.retrieveLostResults"

    invoke-direct {v0, p0, v3, v2}, Lt8/a;-><init>(Lt8/c;Ljava/lang/String;Lt8/i;)V

    if-eqz p1, :cond_2

    new-instance p0, Lio/flutter/plugins/imagepicker/h;

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/h;-><init>(Lio/flutter/plugins/imagepicker/g$f;)V

    invoke-virtual {v0, p0}, Lt8/a;->e(Lt8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lt8/a;->e(Lt8/a$d;)V

    :goto_2
    return-void
.end method
