.class public abstract Ld9/d;
.super Ld9/a;
.source ""


# instance fields
.field private final o:Lb9/g;

.field private transient p:Lb9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb9/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lb9/d;->b()Lb9/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Ld9/d;-><init>(Lb9/d;Lb9/g;)V

    return-void
.end method

.method public constructor <init>(Lb9/d;Lb9/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "Ljava/lang/Object;",
            ">;",
            "Lb9/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ld9/a;-><init>(Lb9/d;)V

    iput-object p2, p0, Ld9/d;->o:Lb9/g;

    return-void
.end method


# virtual methods
.method public b()Lb9/g;
    .locals 1

    iget-object v0, p0, Ld9/d;->o:Lb9/g;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method protected t()V
    .locals 3

    iget-object v0, p0, Ld9/d;->p:Lb9/d;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ld9/d;->b()Lb9/g;

    move-result-object v1

    sget-object v2, Lb9/e;->b:Lb9/e$b;

    invoke-interface {v1, v2}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v1

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    check-cast v1, Lb9/e;

    invoke-interface {v1, v0}, Lb9/e;->R(Lb9/d;)V

    :cond_0
    sget-object v0, Ld9/c;->n:Ld9/c;

    iput-object v0, p0, Ld9/d;->p:Lb9/d;

    return-void
.end method

.method public final u()Lb9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld9/d;->p:Lb9/d;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ld9/d;->b()Lb9/g;

    move-result-object v0

    sget-object v1, Lb9/e;->b:Lb9/e$b;

    invoke-interface {v0, v1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v0

    check-cast v0, Lb9/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lb9/e;->p(Lb9/d;)Lb9/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Ld9/d;->p:Lb9/d;

    :cond_2
    return-object v0
.end method
