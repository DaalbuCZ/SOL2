.class final La4/f;
.super Lp4/f;
.source ""


# instance fields
.field final synthetic a:La4/d;


# direct methods
.method constructor <init>(La4/d;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, La4/f;->a:La4/d;

    invoke-direct {p0, p2}, Lp4/f;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, La4/f;->a:La4/d;

    invoke-static {v0, p1}, La4/d;->d(La4/d;Landroid/os/Message;)V

    return-void
.end method
