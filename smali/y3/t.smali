.class public final synthetic Ly3/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly3/g;

.field public final synthetic o:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Ly3/g;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/t;->n:Ly3/g;

    iput-object p2, p0, Ly3/t;->o:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly3/t;->n:Ly3/g;

    iget-object v1, p0, Ly3/t;->o:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Ly3/g;->q(Landroid/os/IBinder;)V

    return-void
.end method
