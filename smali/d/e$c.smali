.class Ld/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/core/view/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/e;->Q()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld/e;


# direct methods
.method constructor <init>(Ld/e;)V
    .locals 0

    iput-object p1, p0, Ld/e$c;->a:Ld/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroidx/core/view/e0;)Landroidx/core/view/e0;
    .locals 4

    invoke-virtual {p2}, Landroidx/core/view/e0;->k()I

    move-result v0

    iget-object v1, p0, Ld/e$c;->a:Ld/e;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Ld/e;->L0(Landroidx/core/view/e0;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Landroidx/core/view/e0;->i()I

    move-result v0

    invoke-virtual {p2}, Landroidx/core/view/e0;->j()I

    move-result v2

    invoke-virtual {p2}, Landroidx/core/view/e0;->h()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Landroidx/core/view/e0;->n(IIII)Landroidx/core/view/e0;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Landroidx/core/view/u;->z(Landroid/view/View;Landroidx/core/view/e0;)Landroidx/core/view/e0;

    move-result-object p1

    return-object p1
.end method
