.class public final synthetic Ld4/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ld4/g;

.field public final synthetic o:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Ld4/g;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/t;->n:Ld4/g;

    iput-object p2, p0, Ld4/t;->o:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld4/t;->n:Ld4/g;

    iget-object v1, p0, Ld4/t;->o:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Ld4/g;->q(Landroid/os/IBinder;)V

    return-void
.end method
