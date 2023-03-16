.class final Lv3/f;
.super Lk4/f;
.source ""


# instance fields
.field final synthetic a:Lv3/d;


# direct methods
.method constructor <init>(Lv3/d;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lv3/f;->a:Lv3/d;

    invoke-direct {p0, p2}, Lk4/f;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lv3/f;->a:Lv3/d;

    invoke-static {v0, p1}, Lv3/d;->d(Lv3/d;Landroid/os/Message;)V

    return-void
.end method
