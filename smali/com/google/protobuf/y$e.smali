.class public Lcom/google/protobuf/y$e;
.super Lcom/google/protobuf/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/protobuf/s0;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/n<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/protobuf/s0;

.field final b:Lcom/google/protobuf/y$d;


# virtual methods
.method public a()Lcom/google/protobuf/u1$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$e;->b:Lcom/google/protobuf/y$d;

    invoke-virtual {v0}, Lcom/google/protobuf/y$d;->i()Lcom/google/protobuf/u1$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/protobuf/s0;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$e;->a:Lcom/google/protobuf/s0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$e;->b:Lcom/google/protobuf/y$d;

    invoke-virtual {v0}, Lcom/google/protobuf/y$d;->d()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$e;->b:Lcom/google/protobuf/y$d;

    iget-boolean v0, v0, Lcom/google/protobuf/y$d;->q:Z

    return v0
.end method
