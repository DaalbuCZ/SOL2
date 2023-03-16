.class Ld/e$l$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/e$l;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld/e$l;


# direct methods
.method constructor <init>(Ld/e$l;)V
    .locals 0

    iput-object p1, p0, Ld/e$l$a;->a:Ld/e$l;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Ld/e$l$a;->a:Ld/e$l;

    invoke-virtual {p1}, Ld/e$l;->d()V

    return-void
.end method
