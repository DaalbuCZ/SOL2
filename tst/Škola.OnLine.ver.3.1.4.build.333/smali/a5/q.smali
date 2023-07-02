.class final La5/q;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field final synthetic a:La5/r;


# direct methods
.method synthetic constructor <init>(La5/r;La5/p;)V
    .locals 0

    iput-object p1, p0, La5/q;->a:La5/r;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, La5/q;->a:La5/r;

    invoke-virtual {v0, p1, p2}, La5/r;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
