.class final Lx1/t3$c;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lx1/t3;


# direct methods
.method private constructor <init>(Lx1/t3;)V
    .locals 0

    iput-object p1, p0, Lx1/t3$c;->a:Lx1/t3;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lx1/t3;Lx1/t3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t3$c;-><init>(Lx1/t3;)V

    return-void
.end method

.method public static synthetic a(Lx1/t3;)V
    .locals 0

    invoke-static {p0}, Lx1/t3$c;->b(Lx1/t3;)V

    return-void
.end method

.method private static synthetic b(Lx1/t3;)V
    .locals 0

    invoke-static {p0}, Lx1/t3;->b(Lx1/t3;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object p1, p0, Lx1/t3$c;->a:Lx1/t3;

    invoke-static {p1}, Lx1/t3;->a(Lx1/t3;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lx1/t3$c;->a:Lx1/t3;

    new-instance v0, Lx1/u3;

    invoke-direct {v0, p2}, Lx1/u3;-><init>(Lx1/t3;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
