.class public final synthetic Lu3/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic n:Lu3/q;


# direct methods
.method public synthetic constructor <init>(Lu3/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/o;->n:Lu3/q;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lu3/o;->n:Lu3/q;

    invoke-static {v0, p1}, Lu3/q;->b(Lu3/q;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
