.class public final Lr9/z;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljava/lang/Object;Lb9/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lb9/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, Lr9/v;

    if-eqz v0, :cond_2

    sget-object v0, Ly8/m;->n:Ly8/m$a;

    check-cast p0, Lr9/v;

    iget-object p0, p0, Lr9/v;->a:Ljava/lang/Throwable;

    invoke-static {}, Lr9/n0;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Ld9/e;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ld9/e;

    invoke-static {p0, p1}, Lkotlinx/coroutines/internal/d0;->a(Ljava/lang/Throwable;Ld9/e;)Ljava/lang/Throwable;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-static {p0}, Ly8/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p1, Ly8/m;->n:Ly8/m$a;

    :goto_1
    invoke-static {p0}, Ly8/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Lj9/l;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Ly8/m;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    new-instance v0, Lr9/w;

    invoke-direct {v0, p0, p1}, Lr9/w;-><init>(Ljava/lang/Object;Lj9/l;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    new-instance p0, Lr9/v;

    const/4 p1, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lr9/v;-><init>(Ljava/lang/Throwable;ZILk9/g;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;Lr9/k;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lr9/k<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Ly8/m;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p0, Lr9/v;

    invoke-static {}, Lr9/n0;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Ld9/e;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ld9/e;

    invoke-static {v0, p1}, Lkotlinx/coroutines/internal/d0;->a(Ljava/lang/Throwable;Ld9/e;)Ljava/lang/Throwable;

    move-result-object v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lr9/v;-><init>(Ljava/lang/Throwable;ZILk9/g;)V

    :goto_1
    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lj9/l;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lr9/z;->b(Ljava/lang/Object;Lj9/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
