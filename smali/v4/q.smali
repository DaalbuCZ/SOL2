.class final Lv4/q;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field final synthetic a:Lv4/r;


# direct methods
.method synthetic constructor <init>(Lv4/r;Lv4/p;)V
    .locals 0

    iput-object p1, p0, Lv4/q;->a:Lv4/r;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lv4/q;->a:Lv4/r;

    invoke-virtual {v0, p1, p2}, Lv4/r;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
