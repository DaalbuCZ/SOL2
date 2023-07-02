.class final Lu3/y$d;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lu3/y;


# direct methods
.method private constructor <init>(Lu3/y;)V
    .locals 0

    iput-object p1, p0, Lu3/y$d;->a:Lu3/y;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lu3/y;Lu3/y$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/y$d;-><init>(Lu3/y;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-static {p1}, Lu3/y;->b(Landroid/content/Context;)I

    move-result p2

    sget v0, Lu3/n0;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lu3/y$d;->a:Lu3/y;

    invoke-static {p1, p2}, Lu3/y$b;->a(Landroid/content/Context;Lu3/y;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu3/y$d;->a:Lu3/y;

    invoke-static {p1, p2}, Lu3/y;->c(Lu3/y;I)V

    :goto_0
    return-void
.end method
