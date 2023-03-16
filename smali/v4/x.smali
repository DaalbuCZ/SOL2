.class final Lv4/x;
.super Lv4/t;
.source ""


# instance fields
.field final synthetic o:Lv4/d0;


# direct methods
.method constructor <init>(Lv4/d0;)V
    .locals 0

    iput-object p1, p0, Lv4/x;->o:Lv4/d0;

    invoke-direct {p0}, Lv4/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lv4/x;->o:Lv4/d0;

    invoke-static {v0}, Lv4/d0;->d(Lv4/d0;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lv4/d0;->f(Lv4/d0;)Lv4/s;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Unbind from service."

    invoke-virtual {v0, v3, v2}, Lv4/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lv4/x;->o:Lv4/d0;

    invoke-static {v0}, Lv4/d0;->a(Lv4/d0;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v0}, Lv4/d0;->b(Lv4/d0;)Landroid/content/ServiceConnection;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lv4/x;->o:Lv4/d0;

    invoke-static {v0, v1}, Lv4/d0;->j(Lv4/d0;Z)V

    iget-object v0, p0, Lv4/x;->o:Lv4/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lv4/d0;->k(Lv4/d0;Landroid/os/IInterface;)V

    iget-object v0, p0, Lv4/x;->o:Lv4/d0;

    invoke-static {v0, v1}, Lv4/d0;->i(Lv4/d0;Landroid/content/ServiceConnection;)V

    :cond_0
    iget-object v0, p0, Lv4/x;->o:Lv4/d0;

    invoke-static {v0}, Lv4/d0;->l(Lv4/d0;)V

    return-void
.end method
