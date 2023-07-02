.class public final Le4/x0;
.super Le4/n0;
.source ""


# instance fields
.field private a:Le4/c;

.field private final b:I


# direct methods
.method public constructor <init>(Le4/c;I)V
    .locals 0

    invoke-direct {p0}, Le4/n0;-><init>()V

    iput-object p1, p0, Le4/x0;->a:Le4/c;

    iput p2, p0, Le4/x0;->b:I

    return-void
.end method


# virtual methods
.method public final I(ILandroid/os/IBinder;Le4/b1;)V
    .locals 2

    iget-object v0, p0, Le4/x0;->a:Le4/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, Le4/c;->c0(Le4/c;Le4/b1;)V

    iget-object p3, p3, Le4/b1;->n:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Le4/x0;->k0(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public final R(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final k0(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Le4/x0;->a:Le4/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le4/x0;->a:Le4/c;

    iget v1, p0, Le4/x0;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Le4/c;->N(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Le4/x0;->a:Le4/c;

    return-void
.end method
