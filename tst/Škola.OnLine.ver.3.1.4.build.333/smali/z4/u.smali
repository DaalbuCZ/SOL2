.class final Lz4/u;
.super Lz4/t;
.source ""


# direct methods
.method constructor <init>(Lz4/w;Ly4/j;)V
    .locals 2

    new-instance v0, La5/s;

    const-string v1, "OnCompleteUpdateCallback"

    invoke-direct {v0, v1}, La5/s;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, Lz4/t;-><init>(Lz4/w;La5/s;Ly4/j;)V

    return-void
.end method


# virtual methods
.method public final C(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lz4/t;->C(Landroid/os/Bundle;)V

    invoke-static {p1}, Lz4/w;->a(Landroid/os/Bundle;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz4/t;->b:Ly4/j;

    new-instance v1, Lc5/a;

    invoke-static {p1}, Lz4/w;->a(Landroid/os/Bundle;)I

    move-result p1

    invoke-direct {v1, p1}, Lc5/a;-><init>(I)V

    invoke-virtual {v0, v1}, Ly4/j;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    iget-object p1, p0, Lz4/t;->b:Ly4/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly4/j;->e(Ljava/lang/Object;)Z

    return-void
.end method
