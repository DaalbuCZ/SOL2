.class public final Lz3/x0;
.super Lz3/n0;
.source ""


# instance fields
.field private a:Lz3/c;

.field private final b:I


# direct methods
.method public constructor <init>(Lz3/c;I)V
    .locals 0

    invoke-direct {p0}, Lz3/n0;-><init>()V

    iput-object p1, p0, Lz3/x0;->a:Lz3/c;

    iput p2, p0, Lz3/x0;->b:I

    return-void
.end method


# virtual methods
.method public final Q(ILandroid/os/IBinder;Lz3/b1;)V
    .locals 2

    iget-object v0, p0, Lz3/x0;->a:Lz3/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lz3/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, Lz3/c;->c0(Lz3/c;Lz3/b1;)V

    iget-object p3, p3, Lz3/b1;->n:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Lz3/x0;->j0(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public final S(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final j0(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lz3/x0;->a:Lz3/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz3/x0;->a:Lz3/c;

    iget v1, p0, Lz3/x0;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lz3/c;->N(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lz3/x0;->a:Lz3/c;

    return-void
.end method
