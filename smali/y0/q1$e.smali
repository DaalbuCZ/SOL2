.class Ly0/q1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/q1;->s(Ly0/z1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ly0/z1;

.field final synthetic o:Ly0/q1;


# direct methods
.method constructor <init>(Ly0/q1;Ly0/z1;)V
    .locals 0

    iput-object p1, p0, Ly0/q1$e;->o:Ly0/q1;

    iput-object p2, p0, Ly0/q1$e;->n:Ly0/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ly0/q1$e;->o:Ly0/q1;

    iget-object v1, p0, Ly0/q1$e;->n:Ly0/z1;

    invoke-static {v0, v1}, Ly0/q1;->u(Ly0/q1;Ly0/z1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0/q1$e;->o:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->k0(Ly0/q1;)Ly0/s2;

    move-result-object v0

    invoke-interface {v0}, Ly0/s2;->e()Ly0/k3;

    move-result-object v0

    iget-object v1, p0, Ly0/q1$e;->o:Ly0/q1;

    invoke-static {v1, v0}, Ly0/q1;->T(Ly0/q1;Ly0/k3;)V

    iget-object v1, p0, Ly0/q1$e;->o:Ly0/q1;

    invoke-static {v1, v0}, Ly0/q1;->r(Ly0/q1;Ly0/k3;)V

    iget-object v0, p0, Ly0/q1$e;->o:Ly0/q1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ly0/q1;->v(Ly0/q1;Z)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0/q1$e;->o:Ly0/q1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ly0/q1;->v(Ly0/q1;Z)Z

    const-string v0, "Bugfender-SDK"

    const-string v1, "Bugfender SDK initialization has failed."

    invoke-static {v0, v1}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
