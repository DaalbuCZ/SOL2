.class final La5/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic n:La5/d0;


# direct methods
.method synthetic constructor <init>(La5/d0;La5/b0;)V
    .locals 0

    iput-object p1, p0, La5/c0;->n:La5/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, La5/c0;->n:La5/d0;

    invoke-static {v0}, La5/d0;->f(La5/d0;)La5/s;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, La5/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, La5/c0;->n:La5/d0;

    new-instance v0, La5/z;

    invoke-direct {v0, p0, p2}, La5/z;-><init>(La5/c0;Landroid/os/IBinder;)V

    invoke-virtual {p1}, La5/d0;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, La5/c0;->n:La5/d0;

    invoke-static {v0}, La5/d0;->f(La5/d0;)La5/s;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, La5/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, La5/c0;->n:La5/d0;

    new-instance v0, La5/a0;

    invoke-direct {v0, p0}, La5/a0;-><init>(La5/c0;)V

    invoke-virtual {p1}, La5/d0;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
