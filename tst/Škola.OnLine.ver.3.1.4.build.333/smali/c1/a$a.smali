.class Lc1/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lc1/a;


# direct methods
.method constructor <init>(Lc1/a;)V
    .locals 0

    iput-object p1, p0, Lc1/a$a;->n:Lc1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)Z
    .locals 1

    iget-object v0, p0, Lc1/a$a;->n:Lc1/a;

    invoke-static {v0}, Lc1/a;->a(Lc1/a;)Lt8/k$d;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v0, 0x255c

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lc1/a$a;->n:Lc1/a;

    invoke-static {p1}, Lc1/a;->a(Lc1/a;)Lt8/k$d;

    move-result-object p1

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    const-string p3, "result.feedback.url"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lc1/a$a;->n:Lc1/a;

    invoke-static {p1}, Lc1/a;->a(Lc1/a;)Lt8/k$d;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1, p2}, Lt8/k$d;->a(Ljava/lang/Object;)V

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
