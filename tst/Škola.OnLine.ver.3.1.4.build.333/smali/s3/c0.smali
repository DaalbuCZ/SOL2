.class public abstract Ls3/c0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/c0$a;
    }
.end annotation


# instance fields
.field private a:Ls3/c0$a;

.field private b:Lt3/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Lt3/f;
    .locals 1

    iget-object v0, p0, Ls3/c0;->b:Lt3/f;

    invoke-static {v0}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/f;

    return-object v0
.end method

.method public b(Ls3/c0$a;Lt3/f;)V
    .locals 0

    iput-object p1, p0, Ls3/c0;->a:Ls3/c0$a;

    iput-object p2, p0, Ls3/c0;->b:Lt3/f;

    return-void
.end method

.method protected final c()V
    .locals 1

    iget-object v0, p0, Ls3/c0;->a:Ls3/c0$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls3/c0$a;->e()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract e(Ljava/lang/Object;)V
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/c0;->a:Ls3/c0$a;

    iput-object v0, p0, Ls3/c0;->b:Lt3/f;

    return-void
.end method

.method public abstract g([Lx1/n3;Lz2/v0;Lz2/u$b;Lx1/y3;)Ls3/d0;
.end method

.method public h(Lz1/e;)V
    .locals 0

    return-void
.end method
