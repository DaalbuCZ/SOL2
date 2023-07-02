.class final Lz4/r;
.super La5/t;
.source ""


# instance fields
.field final synthetic o:Ljava/lang/String;

.field final synthetic p:Ly4/j;

.field final synthetic q:Lz4/w;


# direct methods
.method constructor <init>(Lz4/w;Ly4/j;Ljava/lang/String;Ly4/j;)V
    .locals 0

    iput-object p1, p0, Lz4/r;->q:Lz4/w;

    iput-object p3, p0, Lz4/r;->o:Ljava/lang/String;

    iput-object p4, p0, Lz4/r;->p:Ly4/j;

    invoke-direct {p0, p2}, La5/t;-><init>(Ly4/j;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lz4/r;->q:Lz4/w;

    iget-object v0, v0, Lz4/w;->a:La5/d0;

    invoke-virtual {v0}, La5/d0;->e()Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, Lz4/r;->q:Lz4/w;

    invoke-static {v1}, Lz4/w;->h(Lz4/w;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lz4/r;->o:Ljava/lang/String;

    invoke-static {v1, v3}, Lz4/w;->b(Lz4/w;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v3, Lz4/v;

    iget-object v4, p0, Lz4/r;->q:Lz4/w;

    iget-object v5, p0, Lz4/r;->p:Ly4/j;

    iget-object v6, p0, Lz4/r;->o:Ljava/lang/String;

    invoke-direct {v3, v4, v5, v6}, Lz4/v;-><init>(Lz4/w;Ly4/j;Ljava/lang/String;)V

    invoke-interface {v0, v2, v1, v3}, La5/l;->Y(Ljava/lang/String;Landroid/os/Bundle;La5/n;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lz4/w;->g()La5/s;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lz4/r;->o:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "requestUpdateInfo(%s)"

    invoke-virtual {v1, v0, v3, v2}, La5/s;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lz4/r;->p:Ly4/j;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ly4/j;->d(Ljava/lang/Exception;)Z

    return-void
.end method
