.class public final Le4/y0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private final n:I

.field final synthetic o:Le4/c;


# direct methods
.method public constructor <init>(Le4/c;I)V
    .locals 0

    iput-object p1, p0, Le4/y0;->o:Le4/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Le4/y0;->n:I

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object p1, p0, Le4/y0;->o:Le4/c;

    if-nez p2, :cond_0

    const/16 p2, 0x10

    invoke-static {p1, p2}, Le4/c;->d0(Le4/c;I)V

    return-void

    :cond_0
    invoke-static {p1}, Le4/c;->W(Le4/c;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Le4/y0;->o:Le4/c;

    const-string v1, "com.google.android.gms.common.internal.IGmsServiceBroker"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, Le4/l;

    if-eqz v2, :cond_1

    check-cast v1, Le4/l;

    goto :goto_0

    :cond_1
    new-instance v1, Le4/o0;

    invoke-direct {v1, p2}, Le4/o0;-><init>(Landroid/os/IBinder;)V

    :goto_0
    invoke-static {v0, v1}, Le4/c;->a0(Le4/c;Le4/l;)V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le4/y0;->o:Le4/c;

    const/4 p2, 0x0

    const/4 v0, 0x0

    iget v1, p0, Le4/y0;->n:I

    invoke-virtual {p1, p2, v0, v1}, Le4/c;->e0(ILandroid/os/Bundle;I)V

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object p1, p0, Le4/y0;->o:Le4/c;

    invoke-static {p1}, Le4/c;->W(Le4/c;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Le4/y0;->o:Le4/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le4/c;->a0(Le4/c;Le4/l;)V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le4/y0;->o:Le4/c;

    iget-object p1, p1, Le4/c;->y:Landroid/os/Handler;

    const/4 v0, 0x6

    iget v1, p0, Le4/y0;->n:I

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
