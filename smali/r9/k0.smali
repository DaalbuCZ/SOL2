.class public final Lr9/k0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lb9/g;)Lr9/j0;
    .locals 3

    new-instance v0, Lkotlinx/coroutines/internal/f;

    sget-object v1, Lr9/p1;->l:Lr9/p1$b;

    invoke-interface {p0, v1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lr9/t1;->b(Lr9/p1;ILjava/lang/Object;)Lr9/t;

    move-result-object v1

    invoke-interface {p0, v1}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/f;-><init>(Lb9/g;)V

    return-object v0
.end method
