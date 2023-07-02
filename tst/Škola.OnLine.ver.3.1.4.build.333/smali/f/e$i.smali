.class Lf/e$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field private a:Lj/b$a;

.field final synthetic b:Lf/e;


# direct methods
.method public constructor <init>(Lf/e;Lj/b$a;)V
    .locals 0

    iput-object p1, p0, Lf/e$i;->b:Lf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf/e$i;->a:Lj/b$a;

    return-void
.end method


# virtual methods
.method public a(Lj/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lf/e$i;->a:Lj/b$a;

    invoke-interface {v0, p1, p2}, Lj/b$a;->a(Lj/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public b(Lj/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lf/e$i;->a:Lj/b$a;

    invoke-interface {v0, p1, p2}, Lj/b$a;->b(Lj/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Lj/b;)V
    .locals 2

    iget-object v0, p0, Lf/e$i;->a:Lj/b$a;

    invoke-interface {v0, p1}, Lj/b$a;->c(Lj/b;)V

    iget-object p1, p0, Lf/e$i;->b:Lf/e;

    iget-object v0, p1, Lf/e;->D:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lf/e;->s:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lf/e$i;->b:Lf/e;

    iget-object v0, v0, Lf/e;->E:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lf/e$i;->b:Lf/e;

    iget-object v0, p1, Lf/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lf/e;->V()V

    iget-object p1, p0, Lf/e$i;->b:Lf/e;

    iget-object v0, p1, Lf/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/core/view/w;->b(Landroid/view/View;)Landroidx/core/view/c0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/view/c0;->b(F)Landroidx/core/view/c0;

    move-result-object v0

    iput-object v0, p1, Lf/e;->F:Landroidx/core/view/c0;

    iget-object p1, p0, Lf/e$i;->b:Lf/e;

    iget-object p1, p1, Lf/e;->F:Landroidx/core/view/c0;

    new-instance v0, Lf/e$i$a;

    invoke-direct {v0, p0}, Lf/e$i$a;-><init>(Lf/e$i;)V

    invoke-virtual {p1, v0}, Landroidx/core/view/c0;->h(Landroidx/core/view/d0;)Landroidx/core/view/c0;

    :cond_1
    iget-object p1, p0, Lf/e$i;->b:Lf/e;

    iget-object v0, p1, Lf/e;->u:Lf/c;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lf/e;->B:Lj/b;

    invoke-interface {v0, p1}, Lf/c;->d(Lj/b;)V

    :cond_2
    iget-object p1, p0, Lf/e$i;->b:Lf/e;

    const/4 v0, 0x0

    iput-object v0, p1, Lf/e;->B:Lj/b;

    iget-object p1, p1, Lf/e;->I:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/core/view/w;->E(Landroid/view/View;)V

    return-void
.end method

.method public d(Lj/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lf/e$i;->b:Lf/e;

    iget-object v0, v0, Lf/e;->I:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/w;->E(Landroid/view/View;)V

    iget-object v0, p0, Lf/e$i;->a:Lj/b$a;

    invoke-interface {v0, p1, p2}, Lj/b$a;->d(Lj/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
