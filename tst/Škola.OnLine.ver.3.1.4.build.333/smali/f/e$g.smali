.class Lf/e$g;
.super Landroidx/core/view/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf/e;->G0(Lj/b$a;)Lj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf/e;


# direct methods
.method constructor <init>(Lf/e;)V
    .locals 0

    iput-object p1, p0, Lf/e$g;->a:Lf/e;

    invoke-direct {p0}, Landroidx/core/view/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lf/e$g;->a:Lf/e;

    iget-object p1, p1, Lf/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lf/e$g;->a:Lf/e;

    iget-object p1, p1, Lf/e;->F:Landroidx/core/view/c0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/view/c0;->h(Landroidx/core/view/d0;)Landroidx/core/view/c0;

    iget-object p1, p0, Lf/e$g;->a:Lf/e;

    iput-object v0, p1, Lf/e;->F:Landroidx/core/view/c0;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lf/e$g;->a:Lf/e;

    iget-object p1, p1, Lf/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lf/e$g;->a:Lf/e;

    iget-object p1, p1, Lf/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object p1, p0, Lf/e$g;->a:Lf/e;

    iget-object p1, p1, Lf/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf/e$g;->a:Lf/e;

    iget-object p1, p1, Lf/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/w;->E(Landroid/view/View;)V

    :cond_0
    return-void
.end method
