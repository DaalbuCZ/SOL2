.class Lg5/d$j;
.super Ljava/util/AbstractCollection;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/d$j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractCollection<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final n:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field o:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field

.field final p:Lg5/d$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/d<",
            "TK;TV;>.j;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field final q:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field final synthetic r:Lg5/d;


# direct methods
.method constructor <init>(Lg5/d;Ljava/lang/Object;Ljava/util/Collection;Lg5/d$j;)V
    .locals 0
    .param p3    # Ljava/util/Collection;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Collection<",
            "TV;>;",
            "Lg5/d<",
            "TK;TV;>.j;)V"
        }
    .end annotation

    iput-object p1, p0, Lg5/d$j;->r:Lg5/d;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p2, p0, Lg5/d$j;->n:Ljava/lang/Object;

    iput-object p3, p0, Lg5/d$j;->o:Ljava/util/Collection;

    iput-object p4, p0, Lg5/d$j;->p:Lg5/d$j;

    if-nez p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lg5/d$j;->h()Ljava/util/Collection;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lg5/d$j;->q:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lg5/d$j;->r:Lg5/d;

    invoke-static {v1}, Lg5/d;->j(Lg5/d;)I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg5/d$j;->d()V

    :cond_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TV;>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lg5/d$j;->size()I

    move-result v0

    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    iget-object v2, p0, Lg5/d$j;->r:Lg5/d;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, Lg5/d;->l(Lg5/d;I)I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lg5/d$j;->d()V

    :cond_1
    return p1
.end method

.method public clear()V
    .locals 2

    invoke-virtual {p0}, Lg5/d$j;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    iget-object v1, p0, Lg5/d$j;->r:Lg5/d;

    invoke-static {v1, v0}, Lg5/d;->m(Lg5/d;I)I

    invoke-virtual {p0}, Lg5/d$j;->s()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method d()V
    .locals 3

    iget-object v0, p0, Lg5/d$j;->p:Lg5/d$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg5/d$j;->d()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg5/d$j;->r:Lg5/d;

    invoke-static {v0}, Lg5/d;->h(Lg5/d;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lg5/d$j;->n:Ljava/lang/Object;

    iget-object v2, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method g()Lg5/d$j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/d<",
            "TK;TV;>.j;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lg5/d$j;->p:Lg5/d$j;

    return-object v0
.end method

.method h()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lg5/d$j;->l()V

    new-instance v0, Lg5/d$j$a;

    invoke-direct {v0, p0}, Lg5/d$j$a;-><init>(Lg5/d$j;)V

    return-object v0
.end method

.method k()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lg5/d$j;->n:Ljava/lang/Object;

    return-object v0
.end method

.method l()V
    .locals 2

    iget-object v0, p0, Lg5/d$j;->p:Lg5/d$j;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->p:Lg5/d$j;

    invoke-virtual {v0}, Lg5/d$j;->h()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lg5/d$j;->q:Ljava/util/Collection;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg5/d$j;->r:Lg5/d;

    invoke-static {v0}, Lg5/d;->h(Lg5/d;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lg5/d$j;->n:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    iput-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    :cond_2
    :goto_0
    return-void
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lg5/d$j;->r:Lg5/d;

    invoke-static {v0}, Lg5/d;->k(Lg5/d;)I

    invoke-virtual {p0}, Lg5/d$j;->s()V

    :cond_0
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lg5/d$j;->size()I

    move-result v0

    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    iget-object v2, p0, Lg5/d$j;->r:Lg5/d;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, Lg5/d;->l(Lg5/d;I)I

    invoke-virtual {p0}, Lg5/d$j;->s()V

    :cond_1
    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p1}, Lf5/k;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lg5/d$j;->size()I

    move-result v0

    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    iget-object v2, p0, Lg5/d$j;->r:Lg5/d;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, Lg5/d;->l(Lg5/d;I)I

    invoke-virtual {p0}, Lg5/d$j;->s()V

    :cond_0
    return p1
.end method

.method s()V
    .locals 2

    iget-object v0, p0, Lg5/d$j;->p:Lg5/d$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg5/d$j;->s()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg5/d$j;->r:Lg5/d;

    invoke-static {v0}, Lg5/d;->h(Lg5/d;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lg5/d$j;->n:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public size()I
    .locals 1

    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg5/d$j;->l()V

    iget-object v0, p0, Lg5/d$j;->o:Ljava/util/Collection;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
