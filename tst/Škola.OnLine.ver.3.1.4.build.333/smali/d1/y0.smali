.class public Ld1/y0;
.super Ld1/v1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/y0$a;
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

    iget-object v0, p0, Ld1/y0;->q:Landroid/view/View;

    check-cast v0, Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iput-object v1, p0, Ld1/y0;->q:Landroid/view/View;

    invoke-super {p0}, Ld1/v1;->a()V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Ld1/y0;->q:Landroid/view/View;

    new-instance v0, Ld1/y0$a;

    invoke-static {p1}, Ld1/d0;->d(Landroid/view/View;)Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ld1/y0$a;-><init>(Ld1/y0;Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    check-cast p1, Landroid/widget/SeekBar;

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method
