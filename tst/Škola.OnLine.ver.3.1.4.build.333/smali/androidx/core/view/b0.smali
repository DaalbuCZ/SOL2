.class public final synthetic Landroidx/core/view/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Landroidx/core/view/f0;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/view/f0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/view/b0;->a:Landroidx/core/view/f0;

    iput-object p2, p0, Landroidx/core/view/b0;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/b0;->a:Landroidx/core/view/f0;

    iget-object v1, p0, Landroidx/core/view/b0;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Landroidx/core/view/c0;->a(Landroidx/core/view/f0;Landroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void
.end method
