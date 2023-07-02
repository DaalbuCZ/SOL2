.class final Lcom/google/protobuf/y$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/u$b<",
        "Lcom/google/protobuf/y$d;",
        ">;"
    }
.end annotation


# instance fields
.field final n:Lcom/google/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$d<",
            "*>;"
        }
    .end annotation
.end field

.field final o:I

.field final p:Lcom/google/protobuf/u1$b;

.field final q:Z

.field final r:Z


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/protobuf/y$d;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/y$d;->e(Lcom/google/protobuf/y$d;)I

    move-result p1

    return p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/y$d;->o:I

    return v0
.end method

.method public e(Lcom/google/protobuf/y$d;)I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/y$d;->o:I

    iget p1, p1, Lcom/google/protobuf/y$d;->o:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/y$d;->q:Z

    return v0
.end method

.method public g()Lcom/google/protobuf/a0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/a0$d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/y$d;->n:Lcom/google/protobuf/a0$d;

    return-object v0
.end method

.method public i()Lcom/google/protobuf/u1$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$d;->p:Lcom/google/protobuf/u1$b;

    return-object v0
.end method

.method public k(Lcom/google/protobuf/s0$a;Lcom/google/protobuf/s0;)Lcom/google/protobuf/s0$a;
    .locals 0

    check-cast p1, Lcom/google/protobuf/y$a;

    check-cast p2, Lcom/google/protobuf/y;

    invoke-virtual {p1, p2}, Lcom/google/protobuf/y$a;->J(Lcom/google/protobuf/y;)Lcom/google/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method

.method public m()Lcom/google/protobuf/u1$c;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$d;->p:Lcom/google/protobuf/u1$b;

    invoke-virtual {v0}, Lcom/google/protobuf/u1$b;->e()Lcom/google/protobuf/u1$c;

    move-result-object v0

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/y$d;->r:Z

    return v0
.end method
