.class public abstract Lu0/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt0/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private c:Lv0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private d:Lu0/c$a;


# direct methods
.method constructor <init>(Lv0/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv0/d<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lu0/c;->a:Ljava/util/List;

    iput-object p1, p0, Lu0/c;->c:Lv0/d;

    return-void
.end method

.method private h(Lu0/c$a;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu0/c$a;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2}, Lu0/c;->c(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {p1, p2}, Lu0/c$a;->a(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p2, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {p1, p2}, Lu0/c$a;->b(Ljava/util/List;)V

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lu0/c;->b:Ljava/lang/Object;

    iget-object v0, p0, Lu0/c;->d:Lu0/c$a;

    invoke-direct {p0, v0, p1}, Lu0/c;->h(Lu0/c$a;Ljava/lang/Object;)V

    return-void
.end method

.method abstract b(Lx0/p;)Z
.end method

.method abstract c(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lu0/c;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lu0/c;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Ljava/lang/Iterable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lx0/p;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/p;

    invoke-virtual {p0, v0}, Lu0/c;->b(Lx0/p;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lu0/c;->a:Ljava/util/List;

    iget-object v0, v0, Lx0/p;->a:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lu0/c;->c:Lv0/d;

    invoke-virtual {p1, p0}, Lv0/d;->c(Lt0/a;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lu0/c;->c:Lv0/d;

    invoke-virtual {p1, p0}, Lv0/d;->a(Lt0/a;)V

    :goto_1
    iget-object p1, p0, Lu0/c;->d:Lu0/c$a;

    iget-object v0, p0, Lu0/c;->b:Ljava/lang/Object;

    invoke-direct {p0, p1, v0}, Lu0/c;->h(Lu0/c$a;Ljava/lang/Object;)V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu0/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lu0/c;->c:Lv0/d;

    invoke-virtual {v0, p0}, Lv0/d;->c(Lt0/a;)V

    :cond_0
    return-void
.end method

.method public g(Lu0/c$a;)V
    .locals 1

    iget-object v0, p0, Lu0/c;->d:Lu0/c$a;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lu0/c;->d:Lu0/c$a;

    iget-object v0, p0, Lu0/c;->b:Ljava/lang/Object;

    invoke-direct {p0, p1, v0}, Lu0/c;->h(Lu0/c$a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
