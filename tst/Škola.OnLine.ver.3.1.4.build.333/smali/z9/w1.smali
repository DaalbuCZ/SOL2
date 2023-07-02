.class public Lz9/w1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz9/p1;
.implements Lz9/s;
.implements Lz9/d2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz9/w1$b;,
        Lz9/w1$a;
    }
.end annotation


# static fields
.field private static final synthetic n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lz9/w1;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, Lz9/x1;->c()Lz9/z0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lz9/x1;->d()Lz9/z0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lz9/w1;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lz9/w1;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method private final A0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lz9/k1;

    if-nez v0, :cond_0

    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lz9/z0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lz9/v1;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lz9/r;

    if-nez v0, :cond_3

    instance-of v0, p2, Lz9/v;

    if-nez v0, :cond_3

    check-cast p1, Lz9/k1;

    invoke-direct {p0, p1, p2}, Lz9/w1;->y0(Lz9/k1;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, Lz9/x1;->b()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Lz9/k1;

    invoke-direct {p0, p1, p2}, Lz9/w1;->B0(Lz9/k1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final B0(Lz9/k1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-direct {p0, p1}, Lz9/w1;->X(Lz9/k1;)Lz9/a2;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lz9/x1;->b()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, Lz9/w1$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lz9/w1$b;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_2

    new-instance v1, Lz9/w1$b;

    invoke-direct {v1, v0, v3, v2}, Lz9/w1$b;-><init>(Lz9/a2;ZLjava/lang/Throwable;)V

    :cond_2
    new-instance v4, Ls9/r;

    invoke-direct {v4}, Ls9/r;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lz9/w1$b;->g()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v1, v5}, Lz9/w1$b;->k(Z)V

    if-eq v1, p1, :cond_4

    sget-object v6, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v6, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {}, Lz9/x1;->b()Lkotlinx/coroutines/internal/e0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-static {}, Lz9/n0;->a()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v1}, Lz9/w1$b;->i()Z

    move-result v6

    xor-int/2addr v6, v5

    if-eqz v6, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_6
    :goto_1
    invoke-virtual {v1}, Lz9/w1$b;->f()Z

    move-result v6

    instance-of v7, p2, Lz9/v;

    if-eqz v7, :cond_7

    move-object v7, p2

    check-cast v7, Lz9/v;

    goto :goto_2

    :cond_7
    move-object v7, v2

    :goto_2
    if-eqz v7, :cond_8

    iget-object v7, v7, Lz9/v;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v7}, Lz9/w1$b;->b(Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v1}, Lz9/w1$b;->e()Ljava/lang/Throwable;

    move-result-object v7

    if-nez v6, :cond_9

    move v3, v5

    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_a

    move-object v2, v7

    :cond_a
    iput-object v2, v4, Ls9/r;->n:Ljava/lang/Object;

    sget-object v3, Lg9/s;->a:Lg9/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    move-object v3, v2

    check-cast v3, Ljava/lang/Throwable;

    if-eqz v2, :cond_b

    invoke-direct {p0, v0, v2}, Lz9/w1;->k0(Lz9/a2;Ljava/lang/Throwable;)V

    :cond_b
    invoke-direct {p0, p1}, Lz9/w1;->O(Lz9/k1;)Lz9/r;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-direct {p0, v1, p1, p2}, Lz9/w1;->C0(Lz9/w1$b;Lz9/r;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, Lz9/x1;->b:Lkotlinx/coroutines/internal/e0;

    return-object p1

    :cond_c
    invoke-direct {p0, v1, p2}, Lz9/w1;->N(Lz9/w1$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method private final C(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lz9/k1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lz9/w1$b;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lz9/w1$b;

    invoke-virtual {v1}, Lz9/w1$b;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lz9/v;

    invoke-direct {p0, p1}, Lz9/w1;->L(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lz9/v;-><init>(Ljava/lang/Throwable;ZILs9/g;)V

    invoke-direct {p0, v0, v1}, Lz9/w1;->A0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lz9/x1;->b()Lkotlinx/coroutines/internal/e0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1
.end method

.method private final C0(Lz9/w1$b;Lz9/r;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, Lz9/r;->r:Lz9/s;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lz9/w1$a;

    invoke-direct {v3, p0, p1, p2, p3}, Lz9/w1$a;-><init>(Lz9/w1;Lz9/w1$b;Lz9/r;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lz9/p1$a;->d(Lz9/p1;ZZLr9/l;ILjava/lang/Object;)Lz9/y0;

    move-result-object v0

    sget-object v1, Lz9/b2;->n:Lz9/b2;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-direct {p0, p2}, Lz9/w1;->j0(Lkotlinx/coroutines/internal/r;)Lz9/r;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method private final D(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lz9/w1;->e0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, Lz9/w1;->Y()Lz9/q;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, Lz9/b2;->n:Lz9/b2;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lz9/q;->n(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method private final J(Lz9/k1;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lz9/w1;->Y()Lz9/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz9/y0;->e()V

    sget-object v0, Lz9/b2;->n:Lz9/b2;

    invoke-virtual {p0, v0}, Lz9/w1;->s0(Lz9/q;)V

    :cond_0
    instance-of v0, p2, Lz9/v;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lz9/v;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object v1, p2, Lz9/v;->a:Ljava/lang/Throwable;

    :cond_2
    instance-of p2, p1, Lz9/v1;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, Lz9/v1;

    invoke-virtual {p2, v1}, Lz9/x;->C(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    new-instance v0, Lz9/y;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lz9/y;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lz9/w1;->b0(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lz9/k1;->h()Lz9/a2;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p1, v1}, Lz9/w1;->l0(Lz9/a2;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private final K(Lz9/w1$b;Lz9/r;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-direct {p0, p2}, Lz9/w1;->j0(Lkotlinx/coroutines/internal/r;)Lz9/r;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-direct {p0, p1, p2, p3}, Lz9/w1;->C0(Lz9/w1$b;Lz9/r;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    return-void

    :cond_3
    invoke-direct {p0, p1, p3}, Lz9/w1;->N(Lz9/w1$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/w1;->z(Ljava/lang/Object;)V

    return-void
.end method

.method private final L(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    new-instance v0, Lz9/q1;

    invoke-static {p0}, Lz9/w1;->m(Lz9/w1;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lz9/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lz9/p1;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lz9/d2;

    invoke-interface {p1}, Lz9/d2;->F()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final N(Lz9/w1$b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lz9/w1$b;->i()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_4
    :goto_2
    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lz9/w1$b;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_6
    :goto_3
    instance-of v0, p2, Lz9/v;

    const/4 v3, 0x0

    if-eqz v0, :cond_7

    move-object v0, p2

    check-cast v0, Lz9/v;

    goto :goto_4

    :cond_7
    move-object v0, v3

    :goto_4
    if-eqz v0, :cond_8

    iget-object v0, v0, Lz9/v;->a:Ljava/lang/Throwable;

    goto :goto_5

    :cond_8
    move-object v0, v3

    :goto_5
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lz9/w1$b;->f()Z

    move-result v4

    invoke-virtual {p1, v0}, Lz9/w1$b;->j(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, p1, v5}, Lz9/w1;->S(Lz9/w1$b;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-direct {p0, v6, v5}, Lz9/w1;->y(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    monitor-exit p1

    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    if-ne v6, v0, :cond_b

    goto :goto_6

    :cond_b
    new-instance p2, Lz9/v;

    const/4 v0, 0x2

    invoke-direct {p2, v6, v2, v0, v3}, Lz9/v;-><init>(Ljava/lang/Throwable;ZILs9/g;)V

    :goto_6
    if-eqz v6, :cond_e

    invoke-direct {p0, v6}, Lz9/w1;->D(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0, v6}, Lz9/w1;->a0(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_7

    :cond_c
    move v1, v2

    :cond_d
    :goto_7
    if-eqz v1, :cond_e

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lz9/v;

    invoke-virtual {v0}, Lz9/v;->b()Z

    :cond_e
    if-nez v4, :cond_f

    invoke-virtual {p0, v6}, Lz9/w1;->m0(Ljava/lang/Throwable;)V

    :cond_f
    invoke-virtual {p0, p2}, Lz9/w1;->n0(Ljava/lang/Object;)V

    sget-object v0, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lz9/x1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {}, Lz9/n0;->a()Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v0, :cond_10

    goto :goto_8

    :cond_10
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_11
    :goto_8
    invoke-direct {p0, p1, p2}, Lz9/w1;->J(Lz9/k1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method private final O(Lz9/k1;)Lz9/r;
    .locals 2

    instance-of v0, p1, Lz9/r;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lz9/r;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-interface {p1}, Lz9/k1;->h()Lz9/a2;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lz9/w1;->j0(Lkotlinx/coroutines/internal/r;)Lz9/r;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method private final R(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lz9/v;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lz9/v;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Lz9/v;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method private final S(Lz9/w1$b;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz9/w1$b;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lz9/w1$b;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lz9/q1;

    invoke-static {p0}, Lz9/w1;->m(Lz9/w1;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lz9/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lz9/p1;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_3
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1
.end method

.method private final X(Lz9/k1;)Lz9/a2;
    .locals 3

    invoke-interface {p1}, Lz9/k1;->h()Lz9/a2;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lz9/z0;

    if-eqz v0, :cond_0

    new-instance v0, Lz9/a2;

    invoke-direct {v0}, Lz9/a2;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lz9/v1;

    if-eqz v0, :cond_1

    check-cast p1, Lz9/v1;

    invoke-direct {p0, p1}, Lz9/w1;->q0(Lz9/v1;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private final f0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lz9/w1$b;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, Lz9/w1$b;

    invoke-virtual {v3}, Lz9/w1$b;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lz9/x1;->f()Lkotlinx/coroutines/internal/e0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lz9/w1$b;

    invoke-virtual {v3}, Lz9/w1$b;->f()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, Lz9/w1;->L(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, Lz9/w1$b;

    invoke-virtual {p1, v1}, Lz9/w1$b;->b(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, Lz9/w1$b;

    invoke-virtual {p1}, Lz9/w1$b;->e()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-eqz v0, :cond_6

    check-cast v2, Lz9/w1$b;

    invoke-virtual {v2}, Lz9/w1$b;->h()Lz9/a2;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lz9/w1;->k0(Lz9/a2;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, Lz9/k1;

    if-eqz v3, :cond_b

    if-nez v1, :cond_8

    invoke-direct {p0, p1}, Lz9/w1;->L(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, Lz9/k1;

    invoke-interface {v3}, Lz9/k1;->a()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-direct {p0, v3, v1}, Lz9/w1;->z0(Lz9/k1;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, Lz9/v;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lz9/v;-><init>(Ljava/lang/Throwable;ZILs9/g;)V

    invoke-direct {p0, v2, v3}, Lz9/w1;->A0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object v4

    if-eq v3, v4, :cond_a

    invoke-static {}, Lz9/x1;->b()Lkotlinx/coroutines/internal/e0;

    move-result-object v2

    if-eq v3, v2, :cond_0

    return-object v3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, Lz9/x1;->f()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1
.end method

.method private final h0(Lr9/l;Z)Lz9/v1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;Z)",
            "Lz9/v1;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    instance-of p2, p1, Lz9/r1;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lz9/r1;

    :cond_0
    if-nez v0, :cond_5

    new-instance v0, Lz9/n1;

    invoke-direct {v0, p1}, Lz9/n1;-><init>(Lr9/l;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lz9/v1;

    if-eqz p2, :cond_2

    move-object v0, p1

    check-cast v0, Lz9/v1;

    :cond_2
    if-eqz v0, :cond_4

    invoke-static {}, Lz9/n0;->a()Z

    move-result p1

    if-eqz p1, :cond_5

    instance-of p1, v0, Lz9/r1;

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_4
    new-instance v0, Lz9/o1;

    invoke-direct {v0, p1}, Lz9/o1;-><init>(Lr9/l;)V

    :cond_5
    :goto_0
    invoke-virtual {v0, p0}, Lz9/v1;->E(Lz9/w1;)V

    return-object v0
.end method

.method private final j0(Lkotlinx/coroutines/internal/r;)Lz9/r;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->u()Lkotlinx/coroutines/internal/r;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->t()Lkotlinx/coroutines/internal/r;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->x()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, Lz9/r;

    if-eqz v0, :cond_1

    check-cast p1, Lz9/r;

    return-object p1

    :cond_1
    instance-of v0, p1, Lz9/a2;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final k0(Lz9/a2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0, p2}, Lz9/w1;->m0(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->s()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/r;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lz9/r1;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lz9/v1;

    :try_start_0
    invoke-virtual {v2, p2}, Lz9/x;->C(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lg9/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lz9/y;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lz9/y;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lg9/s;->a:Lg9/s;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->t()Lkotlinx/coroutines/internal/r;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lz9/w1;->b0(Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0, p2}, Lz9/w1;->D(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final l0(Lz9/a2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->s()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/r;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lz9/v1;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lz9/v1;

    :try_start_0
    invoke-virtual {v2, p2}, Lz9/x;->C(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lg9/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lz9/y;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lz9/y;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lg9/s;->a:Lg9/s;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->t()Lkotlinx/coroutines/internal/r;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lz9/w1;->b0(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public static final synthetic m(Lz9/w1;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lz9/w1;->H()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final p0(Lz9/z0;)V
    .locals 2

    new-instance v0, Lz9/a2;

    invoke-direct {v0}, Lz9/a2;-><init>()V

    invoke-virtual {p1}, Lz9/z0;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lz9/j1;

    invoke-direct {v1, v0}, Lz9/j1;-><init>(Lz9/a2;)V

    move-object v0, v1

    :goto_0
    sget-object v1, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final q0(Lz9/v1;)V
    .locals 2

    new-instance v0, Lz9/a2;

    invoke-direct {v0}, Lz9/a2;-><init>()V

    invoke-virtual {p1, v0}, Lkotlinx/coroutines/internal/r;->o(Lkotlinx/coroutines/internal/r;)Z

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->t()Lkotlinx/coroutines/internal/r;

    move-result-object v0

    sget-object v1, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public static final synthetic t(Lz9/w1;Lz9/w1$b;Lz9/r;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz9/w1;->K(Lz9/w1$b;Lz9/r;Ljava/lang/Object;)V

    return-void
.end method

.method private final t0(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, Lz9/z0;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lz9/z0;

    invoke-virtual {v0}, Lz9/z0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    sget-object v0, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lz9/x1;->c()Lz9/z0;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lz9/w1;->o0()V

    return v2

    :cond_2
    instance-of v0, p1, Lz9/j1;

    if-eqz v0, :cond_4

    sget-object v0, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, Lz9/j1;

    invoke-virtual {v3}, Lz9/j1;->h()Lz9/a2;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lz9/w1;->o0()V

    return v2

    :cond_4
    return v3
.end method

.method private final u(Ljava/lang/Object;Lz9/a2;Lz9/v1;)Z
    .locals 2

    new-instance v0, Lz9/w1$c;

    invoke-direct {v0, p3, p0, p1}, Lz9/w1$c;-><init>(Lkotlinx/coroutines/internal/r;Lz9/w1;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lkotlinx/coroutines/internal/r;->u()Lkotlinx/coroutines/internal/r;

    move-result-object p1

    invoke-virtual {p1, p3, p2, v0}, Lkotlinx/coroutines/internal/r;->B(Lkotlinx/coroutines/internal/r;Lkotlinx/coroutines/internal/r;Lkotlinx/coroutines/internal/r$a;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method private final u0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Lz9/w1$b;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, Lz9/w1$b;

    invoke-virtual {p1}, Lz9/w1$b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lz9/w1$b;->g()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lz9/k1;

    if-eqz v0, :cond_3

    check-cast p1, Lz9/k1;

    invoke-interface {p1}, Lz9/k1;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lz9/v;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public static synthetic w0(Lz9/w1;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lz9/w1;->v0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final y(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-static {}, Lz9/n0;->d()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v1, p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lkotlinx/coroutines/internal/d0;->n(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {}, Lz9/n0;->d()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lkotlinx/coroutines/internal/d0;->n(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v2

    :goto_2
    if-eq v2, p1, :cond_2

    if-eq v2, v1, :cond_2

    instance-of v3, v2, Ljava/util/concurrent/CancellationException;

    if-nez v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p1, v2}, Lg9/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method private final y0(Lz9/k1;Ljava/lang/Object;)Z
    .locals 4

    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    instance-of v0, p1, Lz9/z0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lz9/v1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_2
    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of v0, p2, Lz9/v;

    xor-int/2addr v0, v2

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    :goto_3
    sget-object v0, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lz9/x1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz9/w1;->m0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, Lz9/w1;->n0(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lz9/w1;->J(Lz9/k1;Ljava/lang/Object;)V

    return v2
.end method

.method private final z0(Lz9/k1;Ljava/lang/Throwable;)Z
    .locals 5

    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    instance-of v0, p1, Lz9/w1$b;

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lz9/k1;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_1
    invoke-direct {p0, p1}, Lz9/w1;->X(Lz9/k1;)Lz9/a2;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_4

    return v2

    :cond_4
    new-instance v3, Lz9/w1$b;

    invoke-direct {v3, v0, v2, p2}, Lz9/w1$b;-><init>(Lz9/a2;ZLjava/lang/Throwable;)V

    sget-object v4, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    invoke-direct {p0, v0, p2}, Lz9/w1;->k0(Lz9/a2;Ljava/lang/Throwable;)V

    return v1
.end method


# virtual methods
.method public final A(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object v0

    invoke-virtual {p0}, Lz9/w1;->W()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lz9/w1;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lz9/x1;->b:Lkotlinx/coroutines/internal/e0;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, Lz9/w1;->f0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lz9/x1;->b:Lkotlinx/coroutines/internal/e0;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lz9/x1;->f()Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, Lz9/w1;->z(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public B(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz9/w1;->A(Ljava/lang/Object;)Z

    return-void
.end method

.method public E(Lj9/g;)Lj9/g;
    .locals 0

    invoke-static {p0, p1}, Lz9/p1$a;->f(Lz9/p1;Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public F()Ljava/util/concurrent/CancellationException;
    .locals 5

    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lz9/w1$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lz9/w1$b;

    invoke-virtual {v1}, Lz9/w1$b;->e()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lz9/v;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lz9/v;

    iget-object v1, v1, Lz9/v;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lz9/k1;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lz9/q1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Lz9/w1;->u0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lz9/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lz9/p1;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final G()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lz9/w1$b;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, Lz9/w1$b;

    invoke-virtual {v0}, Lz9/w1$b;->e()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lz9/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lz9/w1;->v0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, Lz9/k1;

    if-nez v1, :cond_3

    instance-of v1, v0, Lz9/v;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lz9/v;

    iget-object v0, v0, Lz9/v;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, Lz9/w1;->w0(Lz9/w1;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lz9/q1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lz9/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lz9/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lz9/p1;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected H()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public I(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lz9/w1;->A(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lz9/w1;->T()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public M(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-instance v0, Lz9/q1;

    invoke-static {p0}, Lz9/w1;->m(Lz9/w1;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lz9/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lz9/p1;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Lz9/w1;->B(Ljava/lang/Throwable;)V

    return-void
.end method

.method public Q(Lj9/g$c;)Lj9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$c<",
            "*>;)",
            "Lj9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lz9/p1$a;->e(Lz9/p1;Lj9/g$c;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public W()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Y()Lz9/q;
    .locals 1

    iget-object v0, p0, Lz9/w1;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lz9/q;

    return-object v0
.end method

.method public final Z()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lz9/w1;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lkotlinx/coroutines/internal/z;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/z;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/z;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public a()Z
    .locals 2

    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lz9/k1;

    if-eqz v1, :cond_0

    check-cast v0, Lz9/k1;

    invoke-interface {v0}, Lz9/k1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected a0(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b0(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method public c(Lj9/g$c;)Lj9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lj9/g$b;",
            ">(",
            "Lj9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lz9/p1$a;->c(Lz9/p1;Lj9/g$c;)Lj9/g$b;

    move-result-object p1

    return-object p1
.end method

.method protected final c0(Lz9/p1;)V
    .locals 1

    invoke-static {}, Lz9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lz9/w1;->Y()Lz9/q;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    sget-object p1, Lz9/b2;->n:Lz9/b2;

    invoke-virtual {p0, p1}, Lz9/w1;->s0(Lz9/q;)V

    return-void

    :cond_3
    invoke-interface {p1}, Lz9/p1;->start()Z

    invoke-interface {p1, p0}, Lz9/p1;->p(Lz9/s;)Lz9/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/w1;->s0(Lz9/q;)V

    invoke-virtual {p0}, Lz9/w1;->d0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lz9/y0;->e()V

    sget-object p1, Lz9/b2;->n:Lz9/b2;

    invoke-virtual {p0, p1}, Lz9/w1;->s0(Lz9/q;)V

    :cond_4
    return-void
.end method

.method public final d0()Z
    .locals 1

    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lz9/k1;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected e0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lz9/w1;->A0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lz9/x1;->a()Lkotlinx/coroutines/internal/e0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lz9/x1;->b()Lkotlinx/coroutines/internal/e0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lz9/w1;->R(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final getKey()Lj9/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj9/g$c<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lz9/p1;->m:Lz9/p1$b;

    return-object v0
.end method

.method public i0()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lz9/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected m0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final n(ZZLr9/l;)Lz9/y0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lr9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;)",
            "Lz9/y0;"
        }
    .end annotation

    invoke-direct {p0, p3, p1}, Lz9/w1;->h0(Lr9/l;Z)Lz9/v1;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lz9/z0;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lz9/z0;

    invoke-virtual {v2}, Lz9/z0;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-direct {p0, v2}, Lz9/w1;->p0(Lz9/z0;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lz9/k1;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Lz9/k1;

    invoke-interface {v2}, Lz9/k1;->h()Lz9/a2;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lz9/v1;

    invoke-direct {p0, v1}, Lz9/w1;->q0(Lz9/v1;)V

    goto :goto_0

    :cond_3
    sget-object v4, Lz9/b2;->n:Lz9/b2;

    if-eqz p1, :cond_8

    instance-of v5, v1, Lz9/w1$b;

    if-eqz v5, :cond_8

    monitor-enter v1

    :try_start_0
    move-object v3, v1

    check-cast v3, Lz9/w1$b;

    invoke-virtual {v3}, Lz9/w1$b;->e()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4

    instance-of v5, p3, Lz9/r;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Lz9/w1$b;

    invoke-virtual {v5}, Lz9/w1$b;->g()Z

    move-result v5

    if-nez v5, :cond_7

    :cond_4
    invoke-direct {p0, v1, v2, v0}, Lz9/w1;->u(Ljava/lang/Object;Lz9/a2;Lz9/v1;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    monitor-exit v1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    monitor-exit v1

    return-object v0

    :cond_6
    move-object v4, v0

    :cond_7
    :try_start_1
    sget-object v5, Lg9/s;->a:Lg9/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_1
    if-eqz v3, :cond_a

    if-eqz p2, :cond_9

    invoke-interface {p3, v3}, Lr9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v4

    :cond_a
    invoke-direct {p0, v1, v2, v0}, Lz9/w1;->u(Ljava/lang/Object;Lz9/a2;Lz9/v1;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_b
    if-eqz p2, :cond_e

    instance-of p1, v1, Lz9/v;

    if-eqz p1, :cond_c

    check-cast v1, Lz9/v;

    goto :goto_2

    :cond_c
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_d

    iget-object v3, v1, Lz9/v;->a:Ljava/lang/Throwable;

    :cond_d
    invoke-interface {p3, v3}, Lr9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    sget-object p1, Lz9/b2;->n:Lz9/b2;

    return-object p1
.end method

.method protected n0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected o0()V
    .locals 0

    return-void
.end method

.method public final p(Lz9/s;)Lz9/q;
    .locals 6

    new-instance v3, Lz9/r;

    invoke-direct {v3, p1}, Lz9/r;-><init>(Lz9/s;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lz9/p1$a;->d(Lz9/p1;ZZLr9/l;ILjava/lang/Object;)Lz9/y0;

    move-result-object p1

    check-cast p1, Lz9/q;

    return-object p1
.end method

.method public final r0(Lz9/v1;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lz9/v1;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lz9/w1;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lz9/x1;->c()Lz9/z0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, Lz9/k1;

    if-eqz v1, :cond_3

    check-cast v0, Lz9/k1;

    invoke-interface {v0}, Lz9/k1;->h()Lz9/a2;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->y()Z

    :cond_3
    return-void
.end method

.method public final s0(Lz9/q;)V
    .locals 0

    iput-object p1, p0, Lz9/w1;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public final start()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lz9/w1;->t0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lz9/w1;->x0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lr9/p<",
            "-TR;-",
            "Lj9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lz9/p1$a;->b(Lz9/p1;Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final v0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lz9/q1;

    if-nez p2, :cond_1

    invoke-static {p0}, Lz9/w1;->m(Lz9/w1;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lz9/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lz9/p1;)V

    :cond_2
    return-object v0
.end method

.method public final x(Lz9/d2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz9/w1;->A(Ljava/lang/Object;)Z

    return-void
.end method

.method public final x0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lz9/w1;->i0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lz9/w1;->Z()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lz9/w1;->u0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected z(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
