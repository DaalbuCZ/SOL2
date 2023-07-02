.class public final Lea/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static final a(Lj9/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Lg9/m;->n:Lg9/m$a;

    invoke-static {p1}, Lg9/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lj9/d;->k(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Lj9/d;Lj9/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;",
            "Lj9/d<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lk9/b;->b(Lj9/d;)Lj9/d;

    move-result-object p0

    sget-object v0, Lg9/m;->n:Lg9/m$a;

    sget-object v0, Lg9/s;->a:Lg9/s;

    invoke-static {v0}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lkotlinx/coroutines/internal/i;->c(Lj9/d;Ljava/lang/Object;Lr9/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lea/a;->a(Lj9/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lr9/p;Ljava/lang/Object;Lj9/d;Lr9/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr9/p<",
            "-TR;-",
            "Lj9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lj9/d<",
            "-TT;>;",
            "Lr9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lk9/b;->a(Lr9/p;Ljava/lang/Object;Lj9/d;)Lj9/d;

    move-result-object p0

    invoke-static {p0}, Lk9/b;->b(Lj9/d;)Lj9/d;

    move-result-object p0

    sget-object p1, Lg9/m;->n:Lg9/m$a;

    sget-object p1, Lg9/s;->a:Lg9/s;

    invoke-static {p1}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lkotlinx/coroutines/internal/i;->b(Lj9/d;Ljava/lang/Object;Lr9/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lea/a;->a(Lj9/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic d(Lr9/p;Ljava/lang/Object;Lj9/d;Lr9/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lea/a;->c(Lr9/p;Ljava/lang/Object;Lj9/d;Lr9/l;)V

    return-void
.end method
