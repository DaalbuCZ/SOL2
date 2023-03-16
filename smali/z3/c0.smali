.class final Lz3/c0;
.super Lz3/d0;
.source ""


# instance fields
.field final synthetic n:Landroid/content/Intent;

.field final synthetic o:Ly3/e;


# direct methods
.method constructor <init>(Landroid/content/Intent;Ly3/e;I)V
    .locals 0

    iput-object p1, p0, Lz3/c0;->n:Landroid/content/Intent;

    iput-object p2, p0, Lz3/c0;->o:Ly3/e;

    invoke-direct {p0}, Lz3/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lz3/c0;->n:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz3/c0;->o:Ly3/e;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Ly3/e;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
