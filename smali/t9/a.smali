.class public abstract Lt9/a;
.super Lt9/c;
.source ""

# interfaces
.implements Lt9/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt9/a$c;,
        Lt9/a$a;,
        Lt9/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lt9/c<",
        "TE;>;",
        "Lt9/f<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lj9/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-TE;",
            "Ly8/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lt9/c;-><init>(Lj9/l;)V

    return-void
.end method

.method public static final synthetic n(Lt9/a;Lt9/o;)Z
    .locals 0

    invoke-direct {p0, p1}, Lt9/a;->p(Lt9/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic o(Lt9/a;Lr9/k;Lt9/o;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt9/a;->w(Lr9/k;Lt9/o;)V

    return-void
.end method

.method private final p(Lt9/o;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lt9/a;->q(Lt9/o;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lt9/a;->u()V

    :cond_0
    return p1
.end method

.method private final w(Lr9/k;Lt9/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/k<",
            "*>;",
            "Lt9/o<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Lt9/a$c;

    invoke-direct {v0, p0, p2}, Lt9/a$c;-><init>(Lt9/a;Lt9/o;)V

    invoke-interface {p1, v0}, Lr9/k;->e(Lj9/l;)V

    return-void
.end method


# virtual methods
.method public final iterator()Lt9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt9/g<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lt9/a$a;

    invoke-direct {v0, p0}, Lt9/a$a;-><init>(Lt9/a;)V

    return-object v0
.end method

.method protected l()Lt9/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt9/q<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0}, Lt9/c;->l()Lt9/q;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lt9/j;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lt9/a;->t()V

    :cond_0
    return-object v0
.end method

.method protected q(Lt9/o;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lt9/a;->r()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lt9/c;->e()Lkotlinx/coroutines/internal/p;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->u()Lkotlinx/coroutines/internal/r;

    move-result-object v3

    instance-of v4, v3, Lt9/s;

    xor-int/2addr v4, v2

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, p1, v0}, Lkotlinx/coroutines/internal/r;->n(Lkotlinx/coroutines/internal/r;Lkotlinx/coroutines/internal/r;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lt9/c;->e()Lkotlinx/coroutines/internal/p;

    move-result-object v0

    new-instance v3, Lt9/a$d;

    invoke-direct {v3, p1, p0}, Lt9/a$d;-><init>(Lkotlinx/coroutines/internal/r;Lt9/a;)V

    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->u()Lkotlinx/coroutines/internal/r;

    move-result-object v4

    instance-of v5, v4, Lt9/s;

    xor-int/2addr v5, v2

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, p1, v0, v3}, Lkotlinx/coroutines/internal/r;->B(Lkotlinx/coroutines/internal/r;Lkotlinx/coroutines/internal/r;Lkotlinx/coroutines/internal/r$a;)I

    move-result v4

    if-eq v4, v2, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    goto :goto_0

    :cond_4
    :goto_1
    move v1, v2

    :cond_5
    :goto_2
    return v1
.end method

.method protected abstract r()Z
.end method

.method protected abstract s()Z
.end method

.method protected t()V
    .locals 0

    return-void
.end method

.method protected u()V
    .locals 0

    return-void
.end method

.method protected v()Ljava/lang/Object;
    .locals 3

    :goto_0
    invoke-virtual {p0}, Lt9/c;->m()Lt9/s;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lt9/b;->d:Lkotlinx/coroutines/internal/e0;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt9/s;->E(Lkotlinx/coroutines/internal/r$b;)Lkotlinx/coroutines/internal/e0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {}, Lr9/n0;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lr9/m;->a:Lkotlinx/coroutines/internal/e0;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_3
    :goto_2
    invoke-virtual {v0}, Lt9/s;->C()V

    invoke-virtual {v0}, Lt9/s;->D()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-virtual {v0}, Lt9/s;->F()V

    goto :goto_0
.end method
