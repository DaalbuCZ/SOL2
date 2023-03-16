.class Ld/e$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field private a:Lh/b$a;

.field final synthetic b:Ld/e;


# direct methods
.method public constructor <init>(Ld/e;Lh/b$a;)V
    .locals 0

    iput-object p1, p0, Ld/e$i;->b:Ld/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld/e$i;->a:Lh/b$a;

    return-void
.end method


# virtual methods
.method public a(Lh/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Ld/e$i;->a:Lh/b$a;

    invoke-interface {v0, p1, p2}, Lh/b$a;->a(Lh/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public b(Lh/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Ld/e$i;->a:Lh/b$a;

    invoke-interface {v0, p1, p2}, Lh/b$a;->b(Lh/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Lh/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Ld/e$i;->b:Ld/e;

    iget-object v0, v0, Ld/e;->I:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/u;->E(Landroid/view/View;)V

    iget-object v0, p0, Ld/e$i;->a:Lh/b$a;

    invoke-interface {v0, p1, p2}, Lh/b$a;->c(Lh/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public d(Lh/b;)V
    .locals 2

    iget-object v0, p0, Ld/e$i;->a:Lh/b$a;

    invoke-interface {v0, p1}, Lh/b$a;->d(Lh/b;)V

    iget-object p1, p0, Ld/e$i;->b:Ld/e;

    iget-object v0, p1, Ld/e;->D:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Ld/e;->s:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Ld/e$i;->b:Ld/e;

    iget-object v0, v0, Ld/e;->E:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Ld/e$i;->b:Ld/e;

    iget-object v0, p1, Ld/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ld/e;->V()V

    iget-object p1, p0, Ld/e$i;->b:Ld/e;

    iget-object v0, p1, Ld/e;->C:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/core/view/u;->b(Landroid/view/View;)Landroidx/core/view/a0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/view/a0;->b(F)Landroidx/core/view/a0;

    move-result-object v0

    iput-object v0, p1, Ld/e;->F:Landroidx/core/view/a0;

    iget-object p1, p0, Ld/e$i;->b:Ld/e;

    iget-object p1, p1, Ld/e;->F:Landroidx/core/view/a0;

    new-instance v0, Ld/e$i$a;

    invoke-direct {v0, p0}, Ld/e$i$a;-><init>(Ld/e$i;)V

    invoke-virtual {p1, v0}, Landroidx/core/view/a0;->h(Landroidx/core/view/b0;)Landroidx/core/view/a0;

    :cond_1
    iget-object p1, p0, Ld/e$i;->b:Ld/e;

    iget-object v0, p1, Ld/e;->u:Ld/c;

    if-eqz v0, :cond_2

    iget-object p1, p1, Ld/e;->B:Lh/b;

    invoke-interface {v0, p1}, Ld/c;->h(Lh/b;)V

    :cond_2
    iget-object p1, p0, Ld/e$i;->b:Ld/e;

    const/4 v0, 0x0

    iput-object v0, p1, Ld/e;->B:Lh/b;

    iget-object p1, p1, Ld/e;->I:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/core/view/u;->E(Landroid/view/View;)V

    return-void
.end method
