.class public Ld1/j1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/view/View;Ld1/q1;ZZ)Ld1/e1;
    .locals 1

    instance-of v0, p0, Landroid/widget/Button;

    if-eqz v0, :cond_0

    instance-of v0, p0, Landroid/widget/CompoundButton;

    if-nez v0, :cond_0

    new-instance p0, Ld1/a2;

    invoke-direct {p0, p1, p2, p3}, Ld1/a2;-><init>(Ld1/q1;ZZ)V

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/widget/SeekBar;

    if-eqz v0, :cond_1

    new-instance p0, Ld1/y0;

    invoke-direct {p0, p1, p2, p3}, Ld1/y0;-><init>(Ld1/q1;ZZ)V

    return-object p0

    :cond_1
    instance-of v0, p0, Landroid/widget/EditText;

    if-eqz v0, :cond_2

    new-instance p0, Ld1/x;

    invoke-direct {p0, p1, p2, p3}, Ld1/x;-><init>(Ld1/q1;ZZ)V

    return-object p0

    :cond_2
    instance-of v0, p0, Landroid/widget/Spinner;

    if-eqz v0, :cond_3

    new-instance p0, Ld1/f3;

    invoke-direct {p0, p1, p2, p3}, Ld1/f3;-><init>(Ld1/q1;ZZ)V

    return-object p0

    :cond_3
    instance-of p0, p0, Landroid/widget/CompoundButton;

    if-eqz p0, :cond_4

    new-instance p0, Ld1/m;

    invoke-direct {p0, p1, p2, p3}, Ld1/m;-><init>(Ld1/q1;ZZ)V

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method
