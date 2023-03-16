.class public final synthetic Lv3/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# instance fields
.field public final synthetic a:Lv3/d;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lv3/d;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/z;->a:Lv3/d;

    iput-object p2, p0, Lv3/z;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Lt4/i;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lv3/z;->a:Lv3/d;

    iget-object v1, p0, Lv3/z;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Lv3/d;->c(Landroid/os/Bundle;Lt4/i;)Lt4/i;

    move-result-object p1

    return-object p1
.end method
