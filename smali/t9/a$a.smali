.class final Lt9/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt9/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt9/g<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final a:Lt9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/a<",
            "TE;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/a<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9/a$a;->a:Lt9/a;

    sget-object p1, Lt9/b;->d:Lkotlinx/coroutines/internal/e0;

    iput-object p1, p0, Lt9/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method private final b(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lt9/j;

    if-eqz v0, :cond_1

    check-cast p1, Lt9/j;

    iget-object v0, p1, Lt9/j;->q:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lt9/j;->I()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/internal/d0;->k(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private final c(Lb9/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lc9/b;->b(Lb9/d;)Lb9/d;

    move-result-object v0

    invoke-static {v0}, Lr9/n;->a(Lb9/d;)Lr9/l;

    move-result-object v0

    new-instance v1, Lt9/a$b;

    invoke-direct {v1, p0, v0}, Lt9/a$b;-><init>(Lt9/a$a;Lr9/k;)V

    :cond_0
    iget-object v2, p0, Lt9/a$a;->a:Lt9/a;

    invoke-static {v2, v1}, Lt9/a;->n(Lt9/a;Lt9/o;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lt9/a$a;->a:Lt9/a;

    invoke-static {v2, v0, v1}, Lt9/a;->o(Lt9/a;Lr9/k;Lt9/o;)V

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lt9/a$a;->a:Lt9/a;

    invoke-virtual {v2}, Lt9/a;->v()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lt9/a$a;->d(Ljava/lang/Object;)V

    instance-of v3, v2, Lt9/j;

    if-eqz v3, :cond_3

    check-cast v2, Lt9/j;

    iget-object v1, v2, Lt9/j;->q:Ljava/lang/Throwable;

    if-nez v1, :cond_2

    sget-object v1, Ly8/m;->n:Ly8/m$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ld9/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_2
    sget-object v1, Ly8/m;->n:Ly8/m$a;

    invoke-virtual {v2}, Lt9/j;->I()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, Ly8/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Ly8/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lb9/d;->l(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object v3, Lt9/b;->d:Lkotlinx/coroutines/internal/e0;

    if-eq v2, v3, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, Ld9/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v3, p0, Lt9/a$a;->a:Lt9/a;

    iget-object v3, v3, Lt9/c;->b:Lj9/l;

    if-eqz v3, :cond_4

    invoke-interface {v0}, Lb9/d;->b()Lb9/g;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lkotlinx/coroutines/internal/y;->a(Lj9/l;Ljava/lang/Object;Lb9/g;)Lj9/l;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    invoke-interface {v0, v1, v2}, Lr9/k;->m(Ljava/lang/Object;Lj9/l;)V

    :goto_2
    invoke-virtual {v0}, Lr9/l;->A()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {p1}, Ld9/h;->c(Lb9/d;)V

    :cond_5
    return-object v0
.end method


# virtual methods
.method public a(Lb9/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lt9/a$a;->b:Ljava/lang/Object;

    sget-object v1, Lt9/b;->d:Lkotlinx/coroutines/internal/e0;

    if-eq v0, v1, :cond_0

    :goto_0
    invoke-direct {p0, v0}, Lt9/a$a;->b(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ld9/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lt9/a$a;->a:Lt9/a;

    invoke-virtual {v0}, Lt9/a;->v()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lt9/a$a;->b:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lt9/a$a;->c(Lb9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lt9/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, Lt9/a$a;->b:Ljava/lang/Object;

    instance-of v1, v0, Lt9/j;

    if-nez v1, :cond_1

    sget-object v1, Lt9/b;->d:Lkotlinx/coroutines/internal/e0;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Lt9/a$a;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\'hasNext\' should be called prior to \'next\' invocation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    check-cast v0, Lt9/j;

    invoke-virtual {v0}, Lt9/j;->I()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/internal/d0;->k(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method
