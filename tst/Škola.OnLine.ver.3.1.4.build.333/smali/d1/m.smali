.class public Ld1/m;
.super Ld1/v1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/m$b;
    }
.end annotation


# instance fields
.field private q:Landroid/view/View;


# direct methods
.method public constructor <init>(Ld1/q1;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld1/v1;-><init>(Ld1/q1;ZZ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ld1/m;->q:Landroid/view/View;

    check-cast v0, Landroid/widget/CompoundButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iput-object v1, p0, Ld1/m;->q:Landroid/view/View;

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

    iput-object p1, p0, Ld1/m;->q:Landroid/view/View;

    new-instance v0, Ld1/m$b;

    invoke-static {p1}, Ld1/d0;->a(Landroid/view/View;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Ld1/m$b;-><init>(Ld1/m;Landroid/widget/CompoundButton$OnCheckedChangeListener;Ld1/m$a;)V

    check-cast p1, Landroid/widget/CompoundButton;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method
