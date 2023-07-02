.class final Lz9/c0$b;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/c0;->a(Lj9/g;Lj9/g;Z)Lj9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/p<",
        "Lj9/g;",
        "Lj9/g$b;",
        "Lj9/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Ls9/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls9/r<",
            "Lj9/g;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic p:Z


# direct methods
.method constructor <init>(Ls9/r;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls9/r<",
            "Lj9/g;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lz9/c0$b;->o:Ls9/r;

    iput-boolean p2, p0, Lz9/c0$b;->p:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lj9/g;Lj9/g$b;)Lj9/g;
    .locals 4

    instance-of v0, p2, Lz9/a0;

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lz9/c0$b;->o:Ls9/r;

    iget-object v0, v0, Ls9/r;->n:Ljava/lang/Object;

    check-cast v0, Lj9/g;

    invoke-interface {p2}, Lj9/g$b;->getKey()Lj9/g$c;

    move-result-object v1

    invoke-interface {v0, v1}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lz9/c0$b;->p:Z

    check-cast p2, Lz9/a0;

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lz9/a0;->w()Lz9/a0;

    move-result-object p2

    :cond_1
    invoke-interface {p1, p2}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, Lz9/c0$b;->o:Ls9/r;

    iget-object v2, v1, Ls9/r;->n:Ljava/lang/Object;

    check-cast v2, Lj9/g;

    invoke-interface {p2}, Lj9/g$b;->getKey()Lj9/g$c;

    move-result-object v3

    invoke-interface {v2, v3}, Lj9/g;->Q(Lj9/g$c;)Lj9/g;

    move-result-object v2

    iput-object v2, v1, Ls9/r;->n:Ljava/lang/Object;

    check-cast p2, Lz9/a0;

    invoke-interface {p2, v0}, Lz9/a0;->U(Lj9/g$b;)Lj9/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj9/g;

    check-cast p2, Lj9/g$b;

    invoke-virtual {p0, p1, p2}, Lz9/c0$b;->a(Lj9/g;Lj9/g$b;)Lj9/g;

    move-result-object p1

    return-object p1
.end method
