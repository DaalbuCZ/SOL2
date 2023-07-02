.class public abstract Ll9/d;
.super Ll9/a;
.source ""


# instance fields
.field private final o:Lj9/g;

.field private transient p:Lj9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lj9/d;->b()Lj9/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Ll9/d;-><init>(Lj9/d;Lj9/g;)V

    return-void
.end method

.method public constructor <init>(Lj9/d;Lj9/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;",
            "Lj9/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ll9/a;-><init>(Lj9/d;)V

    iput-object p2, p0, Ll9/d;->o:Lj9/g;

    return-void
.end method


# virtual methods
.method public b()Lj9/g;
    .locals 1

    iget-object v0, p0, Ll9/d;->o:Lj9/g;

    invoke-static {v0}, Ls9/k;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method protected t()V
    .locals 3

    iget-object v0, p0, Ll9/d;->p:Lj9/d;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ll9/d;->b()Lj9/g;

    move-result-object v1

    sget-object v2, Lj9/e;->k:Lj9/e$b;

    invoke-interface {v1, v2}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object v1

    invoke-static {v1}, Ls9/k;->b(Ljava/lang/Object;)V

    check-cast v1, Lj9/e;

    invoke-interface {v1, v0}, Lj9/e;->f(Lj9/d;)V

    :cond_0
    sget-object v0, Ll9/c;->n:Ll9/c;

    iput-object v0, p0, Ll9/d;->p:Lj9/d;

    return-void
.end method

.method public final u()Lj9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll9/d;->p:Lj9/d;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ll9/d;->b()Lj9/g;

    move-result-object v0

    sget-object v1, Lj9/e;->k:Lj9/e$b;

    invoke-interface {v0, v1}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object v0

    check-cast v0, Lj9/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lj9/e;->V(Lj9/d;)Lj9/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Ll9/d;->p:Lj9/d;

    :cond_2
    return-object v0
.end method
