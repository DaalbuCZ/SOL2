.class Landroidx/core/app/r$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method static a(Landroid/content/Intent;)Landroid/content/ClipData;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object p0

    return-object p0
.end method

.method static b(Landroid/content/Intent;Landroid/content/ClipData;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    return-void
.end method
