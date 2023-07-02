.class Lf/k$b;
.super Landroidx/core/view/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf/k;


# direct methods
.method constructor <init>(Lf/k;)V
    .locals 0

    iput-object p1, p0, Lf/k$b;->a:Lf/k;

    invoke-direct {p0}, Landroidx/core/view/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lf/k$b;->a:Lf/k;

    const/4 v0, 0x0

    iput-object v0, p1, Lf/k;->y:Lj/h;

    iget-object p1, p1, Lf/k;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
