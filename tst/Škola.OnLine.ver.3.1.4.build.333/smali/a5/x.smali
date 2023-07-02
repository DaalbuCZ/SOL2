.class final La5/x;
.super La5/t;
.source ""


# instance fields
.field final synthetic o:La5/d0;


# direct methods
.method constructor <init>(La5/d0;)V
    .locals 0

    iput-object p1, p0, La5/x;->o:La5/d0;

    invoke-direct {p0}, La5/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, La5/x;->o:La5/d0;

    invoke-static {v0}, La5/d0;->d(La5/d0;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, La5/d0;->f(La5/d0;)La5/s;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Unbind from service."

    invoke-virtual {v0, v3, v2}, La5/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, La5/x;->o:La5/d0;

    invoke-static {v0}, La5/d0;->a(La5/d0;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v0}, La5/d0;->b(La5/d0;)Landroid/content/ServiceConnection;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, La5/x;->o:La5/d0;

    invoke-static {v0, v1}, La5/d0;->j(La5/d0;Z)V

    iget-object v0, p0, La5/x;->o:La5/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La5/d0;->k(La5/d0;Landroid/os/IInterface;)V

    iget-object v0, p0, La5/x;->o:La5/d0;

    invoke-static {v0, v1}, La5/d0;->i(La5/d0;Landroid/content/ServiceConnection;)V

    :cond_0
    iget-object v0, p0, La5/x;->o:La5/d0;

    invoke-static {v0}, La5/d0;->l(La5/d0;)V

    return-void
.end method
