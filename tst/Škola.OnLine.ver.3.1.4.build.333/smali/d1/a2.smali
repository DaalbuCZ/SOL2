.class public Ld1/a2;
.super Ld1/v1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/a2$b;
    }
.end annotation


# instance fields
.field private q:Landroid/view/View;

.field private r:Ld1/a2$b;


# direct methods
.method public constructor <init>(Ld1/q1;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld1/v1;-><init>(Ld1/q1;ZZ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ld1/a2;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v1, p0, Ld1/a2;->q:Landroid/view/View;

    iget-object v0, p0, Ld1/a2;->r:Ld1/a2$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld1/a2$b;->a()V

    iput-object v1, p0, Ld1/a2;->r:Ld1/a2$b;

    :cond_0
    invoke-super {p0}, Ld1/v1;->a()V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Ld1/a2;->q:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ld1/a2$b;

    invoke-static {p1}, Ld1/d0;->b(Landroid/view/View;)Landroid/view/View$OnClickListener;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Ld1/a2$b;-><init>(Ld1/a2;Landroid/view/View$OnClickListener;Ld1/a2$a;)V

    iput-object v0, p0, Ld1/a2;->r:Ld1/a2$b;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
