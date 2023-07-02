.class public abstract Lba/a;
.super Lba/c;
.source ""

# interfaces
.implements Lba/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba/a$c;,
        Lba/a$a;,
        Lba/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lba/c<",
        "TE;>;",
        "Lba/f<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lr9/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/l<",
            "-TE;",
            "Lg9/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lba/c;-><init>(Lr9/l;)V

    return-void
.end method

.method public static final synthetic n(Lba/a;Lba/o;)Z
    .locals 0

    invoke-direct {p0, p1}, Lba/a;->p(Lba/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic o(Lba/a;Lz9/k;Lba/o;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lba/a;->w(Lz9/k;Lba/o;)V

    return-void
.end method

.method private final p(Lba/o;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lba/a;->q(Lba/o;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lba/a;->u()V

    :cond_0
    return p1
.end method

.method private final w(Lz9/k;Lba/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz9/k<",
            "*>;",
            "Lba/o<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Lba/a$c;

    invoke-direct {v0, p0, p2}, Lba/a$c;-><init>(Lba/a;Lba/o;)V

    invoke-interface {p1, v0}, Lz9/k;->h(Lr9/l;)V

    return-void
.end method


# virtual methods
.method public final iterator()Lba/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lba/g<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lba/a$a;

    invoke-direct {v0, p0}, Lba/a$a;-><init>(Lba/a;)V

    return-object v0
.end method

.method protected l()Lba/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lba/q<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0}, Lba/c;->l()Lba/q;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lba/j;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lba/a;->t()V

    :cond_0
    return-object v0
.end method

.method protected q(Lba/o;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lba/a;->r()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lba/c;->e()Lkotlinx/coroutines/internal/p;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->u()Lkotlinx/coroutines/internal/r;

    move-result-object v3

    instance-of v4, v3, Lba/s;

    xor-int/2addr v4, v2

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, p1, v0}, Lkotlinx/coroutines/internal/r;->k(Lkotlinx/coroutines/internal/r;Lkotlinx/coroutines/internal/r;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lba/c;->e()Lkotlinx/coroutines/internal/p;

    move-result-object v0

    new-instance v3, Lba/a$d;

    invoke-direct {v3, p1, p0}, Lba/a$d;-><init>(Lkotlinx/coroutines/internal/r;Lba/a;)V

    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->u()Lkotlinx/coroutines/internal/r;

    move-result-object v4

    instance-of v5, v4, Lba/s;

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
    invoke-virtual {p0}, Lba/c;->m()Lba/s;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lba/b;->d:Lkotlinx/coroutines/internal/e0;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lba/s;->E(Lkotlinx/coroutines/internal/r$b;)Lkotlinx/coroutines/internal/e0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {}, Lz9/n0;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lz9/m;->a:Lkotlinx/coroutines/internal/e0;

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
    invoke-virtual {v0}, Lba/s;->C()V

    invoke-virtual {v0}, Lba/s;->D()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-virtual {v0}, Lba/s;->F()V

    goto :goto_0
.end method
