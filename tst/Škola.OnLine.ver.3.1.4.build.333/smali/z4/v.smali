.class final Lz4/v;
.super Lz4/t;
.source ""


# instance fields
.field private final d:Ljava/lang/String;

.field final synthetic e:Lz4/w;


# direct methods
.method constructor <init>(Lz4/w;Ly4/j;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lz4/v;->e:Lz4/w;

    new-instance v0, La5/s;

    const-string v1, "OnRequestInstallCallback"

    invoke-direct {v0, v1}, La5/s;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, Lz4/t;-><init>(Lz4/w;La5/s;Ly4/j;)V

    iput-object p3, p0, Lz4/v;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final k(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lz4/t;->k(Landroid/os/Bundle;)V

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
    iget-object v0, p0, Lz4/t;->b:Ly4/j;

    iget-object v1, p0, Lz4/v;->e:Lz4/w;

    iget-object v2, p0, Lz4/v;->d:Ljava/lang/String;

    invoke-static {v1, p1, v2}, Lz4/w;->f(Lz4/w;Landroid/os/Bundle;Ljava/lang/String;)Lz4/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly4/j;->e(Ljava/lang/Object;)Z

    return-void
.end method
