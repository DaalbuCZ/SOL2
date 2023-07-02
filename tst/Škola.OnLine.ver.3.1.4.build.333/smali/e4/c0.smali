.class final Le4/c0;
.super Le4/d0;
.source ""


# instance fields
.field final synthetic n:Landroid/content/Intent;

.field final synthetic o:Ld4/e;


# direct methods
.method constructor <init>(Landroid/content/Intent;Ld4/e;I)V
    .locals 0

    iput-object p1, p0, Le4/c0;->n:Landroid/content/Intent;

    iput-object p2, p0, Le4/c0;->o:Ld4/e;

    invoke-direct {p0}, Le4/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Le4/c0;->n:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le4/c0;->o:Ld4/e;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Ld4/e;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
