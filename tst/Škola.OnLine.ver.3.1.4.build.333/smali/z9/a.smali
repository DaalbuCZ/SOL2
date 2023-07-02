.class public abstract Lz9/a;
.super Lz9/w1;
.source ""

# interfaces
.implements Lj9/d;
.implements Lz9/j0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lz9/w1;",
        "Lj9/d<",
        "TT;>;",
        "Lz9/j0;"
    }
.end annotation


# instance fields
.field private final o:Lj9/g;


# direct methods
.method public constructor <init>(Lj9/g;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, Lz9/w1;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, Lz9/p1;->m:Lz9/p1$b;

    invoke-interface {p1, p2}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object p2

    check-cast p2, Lz9/p1;

    invoke-virtual {p0, p2}, Lz9/w1;->c0(Lz9/p1;)V

    :cond_0
    invoke-interface {p1, p0}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    iput-object p1, p0, Lz9/a;->o:Lj9/g;

    return-void
.end method


# virtual methods
.method protected D0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz9/w1;->z(Ljava/lang/Object;)V

    return-void
.end method

.method protected E0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected F0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final G0(Lz9/l0;Ljava/lang/Object;Lr9/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lz9/l0;",
            "TR;",
            "Lr9/p<",
            "-TR;-",
            "Lj9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, Lz9/l0;->g(Lr9/p;Ljava/lang/Object;Lj9/d;)V

    return-void
.end method

.method protected H()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lz9/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 1

    invoke-super {p0}, Lz9/w1;->a()Z

    move-result v0

    return v0
.end method

.method public final b()Lj9/g;
    .locals 1

    iget-object v0, p0, Lz9/a;->o:Lj9/g;

    return-object v0
.end method

.method public final b0(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lz9/a;->o:Lj9/g;

    invoke-static {v0, p1}, Lz9/g0;->a(Lj9/g;Ljava/lang/Throwable;)V

    return-void
.end method

.method public i()Lj9/g;
    .locals 1

    iget-object v0, p0, Lz9/a;->o:Lj9/g;

    return-object v0
.end method

.method public i0()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lz9/a;->o:Lj9/g;

    invoke-static {v0}, Lz9/c0;->b(Lj9/g;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lz9/w1;->i0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lz9/w1;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lz9/z;->d(Ljava/lang/Object;Lr9/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/w1;->g0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lz9/x1;->b:Lkotlinx/coroutines/internal/e0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lz9/a;->D0(Ljava/lang/Object;)V

    return-void
.end method

.method protected final n0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lz9/v;

    if-eqz v0, :cond_0

    check-cast p1, Lz9/v;

    iget-object v0, p1, Lz9/v;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lz9/v;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lz9/a;->E0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lz9/a;->F0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
