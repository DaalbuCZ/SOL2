.class final Lu4/s;
.super Lv4/t;
.source ""


# instance fields
.field final synthetic o:Lt4/j;

.field final synthetic p:Ljava/lang/String;

.field final synthetic q:Lu4/w;


# direct methods
.method constructor <init>(Lu4/w;Lt4/j;Lt4/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu4/s;->q:Lu4/w;

    iput-object p3, p0, Lu4/s;->o:Lt4/j;

    iput-object p4, p0, Lu4/s;->p:Ljava/lang/String;

    invoke-direct {p0, p2}, Lv4/t;-><init>(Lt4/j;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lu4/s;->q:Lu4/w;

    iget-object v0, v0, Lu4/w;->a:Lv4/d0;

    invoke-virtual {v0}, Lv4/d0;->e()Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, Lu4/s;->q:Lu4/w;

    invoke-static {v1}, Lu4/w;->h(Lu4/w;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lu4/w;->c()Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Lu4/u;

    iget-object v4, p0, Lu4/s;->q:Lu4/w;

    iget-object v5, p0, Lu4/s;->o:Lt4/j;

    invoke-direct {v3, v4, v5}, Lu4/u;-><init>(Lu4/w;Lt4/j;)V

    invoke-interface {v0, v1, v2, v3}, Lv4/l;->Y(Ljava/lang/String;Landroid/os/Bundle;Lv4/n;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lu4/w;->g()Lv4/s;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lu4/s;->p:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "completeUpdate(%s)"

    invoke-virtual {v1, v0, v3, v2}, Lv4/s;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lu4/s;->o:Lt4/j;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lt4/j;->d(Ljava/lang/Exception;)Z

    return-void
.end method
