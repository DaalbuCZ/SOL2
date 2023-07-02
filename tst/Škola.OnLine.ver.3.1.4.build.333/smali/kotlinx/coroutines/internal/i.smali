.class public final Lkotlinx/coroutines/internal/i;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lkotlinx/coroutines/internal/e0;

.field public static final b:Lkotlinx/coroutines/internal/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/i;->a:Lkotlinx/coroutines/internal/e0;

    new-instance v0, Lkotlinx/coroutines/internal/e0;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/i;->b:Lkotlinx/coroutines/internal/e0;

    return-void
.end method

.method public static final synthetic a()Lkotlinx/coroutines/internal/e0;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/i;->a:Lkotlinx/coroutines/internal/e0;

    return-object v0
.end method

.method public static final b(Lj9/d;Ljava/lang/Object;Lr9/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/d<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lr9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p0, Lkotlinx/coroutines/internal/h;

    if-eqz v0, :cond_8

    check-cast p0, Lkotlinx/coroutines/internal/h;

    invoke-static {p1, p2}, Lz9/z;->b(Ljava/lang/Object;Lr9/l;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lkotlinx/coroutines/internal/h;->q:Lz9/d0;

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/h;->b()Lj9/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz9/d0;->W(Lj9/g;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object p2, p0, Lkotlinx/coroutines/internal/h;->s:Ljava/lang/Object;

    iput v1, p0, Lz9/u0;->p:I

    iget-object p1, p0, Lkotlinx/coroutines/internal/h;->q:Lz9/d0;

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/h;->b()Lj9/g;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lz9/d0;->b(Lj9/g;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    sget-object v0, Lz9/g2;->a:Lz9/g2;

    invoke-virtual {v0}, Lz9/g2;->a()Lz9/a1;

    move-result-object v0

    invoke-virtual {v0}, Lz9/a1;->e0()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lkotlinx/coroutines/internal/h;->s:Ljava/lang/Object;

    iput v1, p0, Lz9/u0;->p:I

    invoke-virtual {v0, p0}, Lz9/a1;->a0(Lz9/u0;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v1}, Lz9/a1;->c0(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/h;->b()Lj9/g;

    move-result-object v3

    sget-object v4, Lz9/p1;->m:Lz9/p1$b;

    invoke-interface {v3, v4}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object v3

    check-cast v3, Lz9/p1;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lz9/p1;->a()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Lz9/p1;->G()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lkotlinx/coroutines/internal/h;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object p2, Lg9/m;->n:Lg9/m$a;

    invoke-static {v3}, Lg9/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Lj9/d;->k(Ljava/lang/Object;)V

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    iget-object p2, p0, Lkotlinx/coroutines/internal/h;->r:Lj9/d;

    iget-object v3, p0, Lkotlinx/coroutines/internal/h;->t:Ljava/lang/Object;

    invoke-interface {p2}, Lj9/d;->b()Lj9/g;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/i0;->c(Lj9/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lkotlinx/coroutines/internal/i0;->a:Lkotlinx/coroutines/internal/e0;

    if-eq v3, v5, :cond_3

    invoke-static {p2, v4, v3}, Lz9/c0;->f(Lj9/d;Lj9/g;Ljava/lang/Object;)Lz9/i2;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    :try_start_1
    iget-object v5, p0, Lkotlinx/coroutines/internal/h;->r:Lj9/d;

    invoke-interface {v5, p1}, Lj9/d;->k(Ljava/lang/Object;)V

    sget-object p1, Lg9/s;->a:Lg9/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    :try_start_2
    invoke-virtual {p2}, Lz9/i2;->I0()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_4
    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/i0;->a(Lj9/g;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lz9/i2;->I0()Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/i0;->a(Lj9/g;Ljava/lang/Object;)V

    :cond_6
    throw p1

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lz9/a1;->g0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lz9/u0;->i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-virtual {v0, v1}, Lz9/a1;->Y(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lz9/a1;->Y(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lj9/d;->k(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic c(Lj9/d;Ljava/lang/Object;Lr9/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/internal/i;->b(Lj9/d;Ljava/lang/Object;Lr9/l;)V

    return-void
.end method
