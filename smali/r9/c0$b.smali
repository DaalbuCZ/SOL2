.class final Lr9/c0$b;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr9/c0;->a(Lb9/g;Lb9/g;Z)Lb9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/p<",
        "Lb9/g;",
        "Lb9/g$b;",
        "Lb9/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Lk9/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/r<",
            "Lb9/g;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic p:Z


# direct methods
.method constructor <init>(Lk9/r;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk9/r<",
            "Lb9/g;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lr9/c0$b;->o:Lk9/r;

    iput-boolean p2, p0, Lr9/c0$b;->p:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lb9/g;Lb9/g$b;)Lb9/g;
    .locals 4

    instance-of v0, p2, Lr9/a0;

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lr9/c0$b;->o:Lk9/r;

    iget-object v0, v0, Lk9/r;->n:Ljava/lang/Object;

    check-cast v0, Lb9/g;

    invoke-interface {p2}, Lb9/g$b;->getKey()Lb9/g$c;

    move-result-object v1

    invoke-interface {v0, v1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lr9/c0$b;->p:Z

    check-cast p2, Lr9/a0;

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lr9/a0;->t()Lr9/a0;

    move-result-object p2

    :cond_1
    invoke-interface {p1, p2}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, Lr9/c0$b;->o:Lk9/r;

    iget-object v2, v1, Lk9/r;->n:Ljava/lang/Object;

    check-cast v2, Lb9/g;

    invoke-interface {p2}, Lb9/g$b;->getKey()Lb9/g$c;

    move-result-object v3

    invoke-interface {v2, v3}, Lb9/g;->B(Lb9/g$c;)Lb9/g;

    move-result-object v2

    iput-object v2, v1, Lk9/r;->n:Ljava/lang/Object;

    check-cast p2, Lr9/a0;

    invoke-interface {p2, v0}, Lr9/a0;->f(Lb9/g$b;)Lb9/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb9/g;

    check-cast p2, Lb9/g$b;

    invoke-virtual {p0, p1, p2}, Lr9/c0$b;->a(Lb9/g;Lb9/g$b;)Lb9/g;

    move-result-object p1

    return-object p1
.end method
