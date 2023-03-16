.class final Lu4/r;
.super Lv4/t;
.source ""


# instance fields
.field final synthetic o:Ljava/lang/String;

.field final synthetic p:Lt4/j;

.field final synthetic q:Lu4/w;


# direct methods
.method constructor <init>(Lu4/w;Lt4/j;Ljava/lang/String;Lt4/j;)V
    .locals 0

    iput-object p1, p0, Lu4/r;->q:Lu4/w;

    iput-object p3, p0, Lu4/r;->o:Ljava/lang/String;

    iput-object p4, p0, Lu4/r;->p:Lt4/j;

    invoke-direct {p0, p2}, Lv4/t;-><init>(Lt4/j;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lu4/r;->q:Lu4/w;

    iget-object v0, v0, Lu4/w;->a:Lv4/d0;

    invoke-virtual {v0}, Lv4/d0;->e()Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, Lu4/r;->q:Lu4/w;

    invoke-static {v1}, Lu4/w;->h(Lu4/w;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lu4/r;->o:Ljava/lang/String;

    invoke-static {v1, v3}, Lu4/w;->b(Lu4/w;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v3, Lu4/v;

    iget-object v4, p0, Lu4/r;->q:Lu4/w;

    iget-object v5, p0, Lu4/r;->p:Lt4/j;

    iget-object v6, p0, Lu4/r;->o:Ljava/lang/String;

    invoke-direct {v3, v4, v5, v6}, Lu4/v;-><init>(Lu4/w;Lt4/j;Ljava/lang/String;)V

    invoke-interface {v0, v2, v1, v3}, Lv4/l;->R(Ljava/lang/String;Landroid/os/Bundle;Lv4/n;)V
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

    iget-object v4, p0, Lu4/r;->o:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "requestUpdateInfo(%s)"

    invoke-virtual {v1, v0, v3, v2}, Lv4/s;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lu4/r;->p:Lt4/j;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lt4/j;->d(Ljava/lang/Exception;)Z

    return-void
.end method
