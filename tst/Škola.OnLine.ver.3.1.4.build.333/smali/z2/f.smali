.class public abstract Lz2/f;
.super Lz2/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/f$a;,
        Lz2/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lz2/a;"
    }
.end annotation


# instance fields
.field private final u:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TT;",
            "Lz2/f$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private v:Landroid/os/Handler;

.field private w:Lt3/p0;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lz2/a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lz2/f;->u:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic F(Lz2/f;Ljava/lang/Object;Lz2/u;Lx1/y3;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz2/f;->J(Ljava/lang/Object;Lz2/u;Lx1/y3;)V

    return-void
.end method

.method private synthetic J(Ljava/lang/Object;Lz2/u;Lx1/y3;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lz2/f;->K(Ljava/lang/Object;Lz2/u;Lx1/y3;)V

    return-void
.end method


# virtual methods
.method protected C(Lt3/p0;)V
    .locals 0

    iput-object p1, p0, Lz2/f;->w:Lt3/p0;

    invoke-static {}, Lu3/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lz2/f;->v:Landroid/os/Handler;

    return-void
.end method

.method protected E()V
    .locals 4

    iget-object v0, p0, Lz2/f;->u:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/f$b;

    iget-object v2, v1, Lz2/f$b;->a:Lz2/u;

    iget-object v3, v1, Lz2/f$b;->b:Lz2/u$c;

    invoke-interface {v2, v3}, Lz2/u;->q(Lz2/u$c;)V

    iget-object v2, v1, Lz2/f$b;->a:Lz2/u;

    iget-object v3, v1, Lz2/f$b;->c:Lz2/f$a;

    invoke-interface {v2, v3}, Lz2/u;->l(Lz2/b0;)V

    iget-object v2, v1, Lz2/f$b;->a:Lz2/u;

    iget-object v1, v1, Lz2/f$b;->c:Lz2/f$a;

    invoke-interface {v2, v1}, Lz2/u;->f(Lb2/w;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz2/f;->u:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method protected abstract G(Ljava/lang/Object;Lz2/u$b;)Lz2/u$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz2/u$b;",
            ")",
            "Lz2/u$b;"
        }
    .end annotation
.end method

.method protected abstract H(Ljava/lang/Object;J)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)J"
        }
    .end annotation
.end method

.method protected abstract I(Ljava/lang/Object;I)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)I"
        }
    .end annotation
.end method

.method protected abstract K(Ljava/lang/Object;Lz2/u;Lx1/y3;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz2/u;",
            "Lx1/y3;",
            ")V"
        }
    .end annotation
.end method

.method protected final L(Ljava/lang/Object;Lz2/u;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz2/u;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lz2/f;->u:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lu3/a;->a(Z)V

    new-instance v0, Lz2/e;

    invoke-direct {v0, p0, p1}, Lz2/e;-><init>(Lz2/f;Ljava/lang/Object;)V

    new-instance v1, Lz2/f$a;

    invoke-direct {v1, p0, p1}, Lz2/f$a;-><init>(Lz2/f;Ljava/lang/Object;)V

    iget-object v2, p0, Lz2/f;->u:Ljava/util/HashMap;

    new-instance v3, Lz2/f$b;

    invoke-direct {v3, p2, v0, v1}, Lz2/f$b;-><init>(Lz2/u;Lz2/u$c;Lz2/f$a;)V

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lz2/f;->v:Landroid/os/Handler;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lz2/u;->k(Landroid/os/Handler;Lz2/b0;)V

    iget-object p1, p0, Lz2/f;->v:Landroid/os/Handler;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lz2/u;->p(Landroid/os/Handler;Lb2/w;)V

    iget-object p1, p0, Lz2/f;->w:Lt3/p0;

    invoke-virtual {p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lz2/u;->g(Lz2/u$c;Lt3/p0;Ly1/t1;)V

    invoke-virtual {p0}, Lz2/a;->B()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Lz2/u;->h(Lz2/u$c;)V

    :cond_0
    return-void
.end method

.method protected y()V
    .locals 3

    iget-object v0, p0, Lz2/f;->u:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/f$b;

    iget-object v2, v1, Lz2/f$b;->a:Lz2/u;

    iget-object v1, v1, Lz2/f$b;->b:Lz2/u$c;

    invoke-interface {v2, v1}, Lz2/u;->h(Lz2/u$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected z()V
    .locals 3

    iget-object v0, p0, Lz2/f;->u:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/f$b;

    iget-object v2, v1, Lz2/f$b;->a:Lz2/u;

    iget-object v1, v1, Lz2/f$b;->b:Lz2/u$c;

    invoke-interface {v2, v1}, Lz2/u;->i(Lz2/u$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method
