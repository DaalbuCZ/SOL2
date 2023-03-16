.class final Ls7/e$e;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/e;->q(Ll8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/a<",
        "Ly8/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Ls7/e;

.field final synthetic p:Ll8/k$d;


# direct methods
.method constructor <init>(Ls7/e;Ll8/k$d;)V
    .locals 0

    iput-object p1, p0, Ls7/e$e;->o:Ls7/e;

    iput-object p2, p0, Ls7/e$e;->p:Ll8/k$d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Ls7/e$e;->o:Ls7/e;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Ls7/e;->i(Ls7/e;Ljava/lang/Integer;)V

    iget-object v0, p0, Ls7/e$e;->o:Ls7/e;

    iget-object v2, p0, Ls7/e$e;->p:Ll8/k$d;

    invoke-static {v0, v2}, Ls7/e;->j(Ls7/e;Ll8/k$d;)V

    iget-object v0, p0, Ls7/e$e;->o:Ls7/e;

    invoke-static {v0}, Ls7/e;->g(Ls7/e;)Lu4/b;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ls7/e$e;->o:Ls7/e;

    invoke-static {v2}, Ls7/e;->f(Ls7/e;)Lu4/a;

    move-result-object v2

    invoke-static {v2}, Lk9/k;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Ls7/e$e;->o:Ls7/e;

    invoke-static {v3}, Ls7/e;->e(Ls7/e;)Ls7/a;

    move-result-object v3

    invoke-static {v3}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-interface {v3}, Ls7/a;->a()Landroid/app/Activity;

    move-result-object v3

    const/16 v4, 0x4fc

    invoke-interface {v0, v2, v1, v3, v4}, Lu4/b;->a(Lu4/a;ILandroid/app/Activity;I)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls7/e$e;->a()V

    sget-object v0, Ly8/s;->a:Ly8/s;

    return-object v0
.end method
