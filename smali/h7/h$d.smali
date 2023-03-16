.class abstract Lh7/h$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "Lj$/util/Iterator;"
    }
.end annotation


# instance fields
.field n:Lh7/h$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/h$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field o:Lh7/h$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/h$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field p:I

.field final synthetic q:Lh7/h;


# direct methods
.method constructor <init>(Lh7/h;)V
    .locals 1

    iput-object p1, p0, Lh7/h$d;->q:Lh7/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lh7/h;->r:Lh7/h$e;

    iget-object v0, v0, Lh7/h$e;->q:Lh7/h$e;

    iput-object v0, p0, Lh7/h$d;->n:Lh7/h$e;

    const/4 v0, 0x0

    iput-object v0, p0, Lh7/h$d;->o:Lh7/h$e;

    iget p1, p1, Lh7/h;->q:I

    iput p1, p0, Lh7/h$d;->p:I

    return-void
.end method


# virtual methods
.method final b()Lh7/h$e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh7/h$e<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lh7/h$d;->n:Lh7/h$e;

    iget-object v1, p0, Lh7/h$d;->q:Lh7/h;

    iget-object v2, v1, Lh7/h;->r:Lh7/h$e;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lh7/h;->q:I

    iget v2, p0, Lh7/h$d;->p:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lh7/h$e;->q:Lh7/h$e;

    iput-object v1, p0, Lh7/h$d;->n:Lh7/h$e;

    iput-object v0, p0, Lh7/h$d;->o:Lh7/h$e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Iterator$-CC;->$default$forEachRemaining(Ljava/util/Iterator;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lh7/h$d;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lh7/h$d;->n:Lh7/h$e;

    iget-object v1, p0, Lh7/h$d;->q:Lh7/h;

    iget-object v1, v1, Lh7/h;->r:Lh7/h$e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lh7/h$d;->o:Lh7/h$e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lh7/h$d;->q:Lh7/h;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lh7/h;->f(Lh7/h$e;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lh7/h$d;->o:Lh7/h$e;

    iget-object v0, p0, Lh7/h$d;->q:Lh7/h;

    iget v0, v0, Lh7/h;->q:I

    iput v0, p0, Lh7/h$d;->p:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
