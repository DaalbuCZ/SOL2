.class public final Lw9/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static final a(Lb9/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Ly8/m;->n:Ly8/m$a;

    invoke-static {p1}, Ly8/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly8/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lb9/d;->l(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Lb9/d;Lb9/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;",
            "Lb9/d<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lc9/b;->b(Lb9/d;)Lb9/d;

    move-result-object p0

    sget-object v0, Ly8/m;->n:Ly8/m$a;

    sget-object v0, Ly8/s;->a:Ly8/s;

    invoke-static {v0}, Ly8/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lkotlinx/coroutines/internal/i;->c(Lb9/d;Ljava/lang/Object;Lj9/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lw9/a;->a(Lb9/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lj9/p;Ljava/lang/Object;Lb9/d;Lj9/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/p<",
            "-TR;-",
            "Lb9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lb9/d<",
            "-TT;>;",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lc9/b;->a(Lj9/p;Ljava/lang/Object;Lb9/d;)Lb9/d;

    move-result-object p0

    invoke-static {p0}, Lc9/b;->b(Lb9/d;)Lb9/d;

    move-result-object p0

    sget-object p1, Ly8/m;->n:Ly8/m$a;

    sget-object p1, Ly8/s;->a:Ly8/s;

    invoke-static {p1}, Ly8/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lkotlinx/coroutines/internal/i;->b(Lb9/d;Ljava/lang/Object;Lj9/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lw9/a;->a(Lb9/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic d(Lj9/p;Ljava/lang/Object;Lb9/d;Lj9/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lw9/a;->c(Lj9/p;Ljava/lang/Object;Lb9/d;Lj9/l;)V

    return-void
.end method
