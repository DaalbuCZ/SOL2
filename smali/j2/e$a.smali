.class Lj2/e$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/e;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj2/e;


# direct methods
.method constructor <init>(Lj2/e;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lj2/e$a;->a:Lj2/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lj2/e$a;->a:Lj2/e;

    invoke-static {v0, p1}, Lj2/e;->a(Lj2/e;Landroid/os/Message;)V

    return-void
.end method
