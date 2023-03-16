.class Lt9/a$b;
.super Lt9/o;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lt9/o<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final q:Lt9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/a$a<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final r:Lr9/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt9/a$a;Lr9/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/a$a<",
            "TE;>;",
            "Lr9/k<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lt9/o;-><init>()V

    iput-object p1, p0, Lt9/a$b;->q:Lt9/a$a;

    iput-object p2, p0, Lt9/a$b;->r:Lr9/k;

    return-void
.end method


# virtual methods
.method public D(Lt9/j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/j<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p1, Lt9/j;->q:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lt9/a$b;->r:Lr9/k;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lr9/k$a;->a(Lr9/k;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt9/a$b;->r:Lr9/k;

    invoke-virtual {p1}, Lt9/j;->I()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, Lr9/k;->q(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lt9/a$b;->q:Lt9/a$a;

    invoke-virtual {v1, p1}, Lt9/a$a;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lt9/a$b;->r:Lr9/k;

    invoke-interface {p1, v0}, Lr9/k;->s(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public E(Ljava/lang/Object;)Lj9/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lj9/l<",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt9/a$b;->q:Lt9/a$a;

    iget-object v0, v0, Lt9/a$a;->a:Lt9/a;

    iget-object v0, v0, Lt9/c;->b:Lj9/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lt9/a$b;->r:Lr9/k;

    invoke-interface {v1}, Lb9/d;->b()Lb9/g;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkotlinx/coroutines/internal/y;->a(Lj9/l;Ljava/lang/Object;Lb9/g;)Lj9/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    iget-object v0, p0, Lt9/a$b;->q:Lt9/a$a;

    invoke-virtual {v0, p1}, Lt9/a$a;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lt9/a$b;->r:Lr9/k;

    sget-object v0, Lr9/m;->a:Lkotlinx/coroutines/internal/e0;

    invoke-interface {p1, v0}, Lr9/k;->s(Ljava/lang/Object;)V

    return-void
.end method

.method public h(Ljava/lang/Object;Lkotlinx/coroutines/internal/r$b;)Lkotlinx/coroutines/internal/e0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlinx/coroutines/internal/r$b;",
            ")",
            "Lkotlinx/coroutines/internal/e0;"
        }
    .end annotation

    iget-object p2, p0, Lt9/a$b;->r:Lr9/k;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt9/a$b;->E(Ljava/lang/Object;)Lj9/l;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1, p1}, Lr9/k;->i(Ljava/lang/Object;Ljava/lang/Object;Lj9/l;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lr9/n0;->a()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lr9/m;->a:Lkotlinx/coroutines/internal/e0;

    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_1
    sget-object p1, Lr9/m;->a:Lkotlinx/coroutines/internal/e0;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiveHasNext@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lr9/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
