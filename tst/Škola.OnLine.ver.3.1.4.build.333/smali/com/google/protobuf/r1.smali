.class public Lcom/google/protobuf/r1;
.super Ljava/util/AbstractList;
.source ""

# interfaces
.implements Lcom/google/protobuf/h0;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "Lcom/google/protobuf/h0;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field private final n:Lcom/google/protobuf/h0;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/r1;->n:Lcom/google/protobuf/h0;

    return-void
.end method

.method static synthetic d(Lcom/google/protobuf/r1;)Lcom/google/protobuf/h0;
    .locals 0

    iget-object p0, p0, Lcom/google/protobuf/r1;->n:Lcom/google/protobuf/h0;

    return-object p0
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/r1;->n:Lcom/google/protobuf/h0;

    invoke-interface {v0}, Lcom/google/protobuf/h0;->A()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public g(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r1;->n:Lcom/google/protobuf/h0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/r1;->g(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/protobuf/r1$b;

    invoke-direct {v0, p0}, Lcom/google/protobuf/r1$b;-><init>(Lcom/google/protobuf/r1;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/protobuf/r1$a;

    invoke-direct {v0, p0, p1}, Lcom/google/protobuf/r1$a;-><init>(Lcom/google/protobuf/r1;I)V

    return-object v0
.end method

.method public q(Lcom/google/protobuf/h;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r1;->n:Lcom/google/protobuf/h0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public w()Lcom/google/protobuf/h0;
    .locals 0

    return-object p0
.end method

.method public z(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r1;->n:Lcom/google/protobuf/h0;

    invoke-interface {v0, p1}, Lcom/google/protobuf/h0;->z(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
