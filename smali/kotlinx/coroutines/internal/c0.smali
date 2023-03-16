.class public Lkotlinx/coroutines/internal/c0;
.super Lr9/a;
.source ""

# interfaces
.implements Ld9/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lr9/a<",
        "TT;>;",
        "Ld9/e;"
    }
.end annotation


# instance fields
.field public final p:Lb9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb9/d<",
            "TT;>;"
        }
    .end annotation
.end field


# virtual methods
.method protected D0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/internal/c0;->p:Lb9/d;

    invoke-static {p1, v0}, Lr9/z;->a(Ljava/lang/Object;Lb9/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lb9/d;->l(Ljava/lang/Object;)V

    return-void
.end method

.method public final H0()Lr9/p1;
    .locals 1

    invoke-virtual {p0}, Lr9/w1;->Y()Lr9/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr9/q;->getParent()Lr9/p1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected final e0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final h()Ld9/e;
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/internal/c0;->p:Lb9/d;

    instance-of v1, v0, Ld9/e;

    if-eqz v1, :cond_0

    check-cast v0, Ld9/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final n()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected z(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lkotlinx/coroutines/internal/c0;->p:Lb9/d;

    invoke-static {v0}, Lc9/b;->b(Lb9/d;)Lb9/d;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/coroutines/internal/c0;->p:Lb9/d;

    invoke-static {p1, v1}, Lr9/z;->a(Ljava/lang/Object;Lb9/d;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lkotlinx/coroutines/internal/i;->c(Lb9/d;Ljava/lang/Object;Lj9/l;ILjava/lang/Object;)V

    return-void
.end method
