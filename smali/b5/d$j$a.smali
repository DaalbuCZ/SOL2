.class Lb5/d$j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/d$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TV;>;",
        "Lj$/util/Iterator;"
    }
.end annotation


# instance fields
.field final n:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation
.end field

.field final o:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field

.field final synthetic p:Lb5/d$j;


# direct methods
.method constructor <init>(Lb5/d$j;)V
    .locals 0

    iput-object p1, p0, Lb5/d$j$a;->p:Lb5/d$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lb5/d$j;->o:Ljava/util/Collection;

    iput-object p1, p0, Lb5/d$j$a;->o:Ljava/util/Collection;

    invoke-static {p1}, Lb5/d;->i(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lb5/d$j$a;->n:Ljava/util/Iterator;

    return-void
.end method

.method constructor <init>(Lb5/d$j;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lb5/d$j$a;->p:Lb5/d$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lb5/d$j;->o:Ljava/util/Collection;

    iput-object p1, p0, Lb5/d$j$a;->o:Ljava/util/Collection;

    iput-object p2, p0, Lb5/d$j$a;->n:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method b()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lb5/d$j$a;->c()V

    iget-object v0, p0, Lb5/d$j$a;->n:Ljava/util/Iterator;

    return-object v0
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lb5/d$j$a;->p:Lb5/d$j;

    invoke-virtual {v0}, Lb5/d$j;->l()V

    iget-object v0, p0, Lb5/d$j$a;->p:Lb5/d$j;

    iget-object v0, v0, Lb5/d$j;->o:Ljava/util/Collection;

    iget-object v1, p0, Lb5/d$j$a;->o:Ljava/util/Collection;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

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

    invoke-virtual {p0, p1}, Lb5/d$j$a;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    invoke-virtual {p0}, Lb5/d$j$a;->c()V

    iget-object v0, p0, Lb5/d$j$a;->n:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lb5/d$j$a;->c()V

    iget-object v0, p0, Lb5/d$j$a;->n:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, Lb5/d$j$a;->n:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    iget-object v0, p0, Lb5/d$j$a;->p:Lb5/d$j;

    iget-object v0, v0, Lb5/d$j;->r:Lb5/d;

    invoke-static {v0}, Lb5/d;->k(Lb5/d;)I

    iget-object v0, p0, Lb5/d$j$a;->p:Lb5/d$j;

    invoke-virtual {v0}, Lb5/d$j;->s()V

    return-void
.end method
