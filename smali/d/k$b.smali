.class Ld/k$b;
.super Landroidx/core/view/c0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld/k;


# direct methods
.method constructor <init>(Ld/k;)V
    .locals 0

    iput-object p1, p0, Ld/k$b;->a:Ld/k;

    invoke-direct {p0}, Landroidx/core/view/c0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Ld/k$b;->a:Ld/k;

    const/4 v0, 0x0

    iput-object v0, p1, Ld/k;->y:Lh/h;

    iget-object p1, p1, Ld/k;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
