.class Lba/a$b;
.super Lba/o;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba/a;
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
        "Lba/o<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final q:Lba/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lba/a$a<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final r:Lz9/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz9/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lba/a$a;Lz9/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba/a$a<",
            "TE;>;",
            "Lz9/k<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lba/o;-><init>()V

    iput-object p1, p0, Lba/a$b;->q:Lba/a$a;

    iput-object p2, p0, Lba/a$b;->r:Lz9/k;

    return-void
.end method


# virtual methods
.method public D(Lba/j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba/j<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p1, Lba/j;->q:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lba/a$b;->r:Lz9/k;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lz9/k$a;->a(Lz9/k;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lba/a$b;->r:Lz9/k;

    invoke-virtual {p1}, Lba/j;->I()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, Lz9/k;->r(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lba/a$b;->q:Lba/a$a;

    invoke-virtual {v1, p1}, Lba/a$a;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lba/a$b;->r:Lz9/k;

    invoke-interface {p1, v0}, Lz9/k;->s(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public E(Ljava/lang/Object;)Lr9/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lr9/l<",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lba/a$b;->q:Lba/a$a;

    iget-object v0, v0, Lba/a$a;->a:Lba/a;

    iget-object v0, v0, Lba/c;->b:Lr9/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lba/a$b;->r:Lz9/k;

    invoke-interface {v1}, Lj9/d;->b()Lj9/g;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkotlinx/coroutines/internal/y;->a(Lr9/l;Ljava/lang/Object;Lj9/g;)Lr9/l;

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

    iget-object v0, p0, Lba/a$b;->q:Lba/a$a;

    invoke-virtual {v0, p1}, Lba/a$a;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lba/a$b;->r:Lz9/k;

    sget-object v0, Lz9/m;->a:Lkotlinx/coroutines/internal/e0;

    invoke-interface {p1, v0}, Lz9/k;->s(Ljava/lang/Object;)V

    return-void
.end method

.method public g(Ljava/lang/Object;Lkotlinx/coroutines/internal/r$b;)Lkotlinx/coroutines/internal/e0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlinx/coroutines/internal/r$b;",
            ")",
            "Lkotlinx/coroutines/internal/e0;"
        }
    .end annotation

    iget-object p2, p0, Lba/a$b;->r:Lz9/k;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lba/a$b;->E(Ljava/lang/Object;)Lr9/l;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1, p1}, Lz9/k;->o(Ljava/lang/Object;Ljava/lang/Object;Lr9/l;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lz9/n0;->a()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lz9/m;->a:Lkotlinx/coroutines/internal/e0;

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
    sget-object p1, Lz9/m;->a:Lkotlinx/coroutines/internal/e0;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiveHasNext@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
