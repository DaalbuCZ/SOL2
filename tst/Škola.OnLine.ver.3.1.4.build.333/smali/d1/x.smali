.class public Ld1/x;
.super Ld1/v1;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/x$b;
    }
.end annotation


# instance fields
.field private final q:Ld1/q1;

.field private final r:Z

.field private final s:Z

.field private t:Landroid/widget/EditText;

.field private u:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Ld1/q1;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld1/v1;-><init>(Ld1/q1;ZZ)V

    iput-object p1, p0, Ld1/x;->q:Ld1/q1;

    iput-boolean p2, p0, Ld1/x;->r:Z

    iput-boolean p3, p0, Ld1/x;->s:Z

    return-void
.end method

.method private static f(Landroid/widget/EditText;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result v0

    const/16 v1, 0x81

    if-eq v0, v1, :cond_3

    const/16 v1, 0x91

    if-eq v0, v1, :cond_3

    invoke-static {}, Ld1/h3;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xe1

    if-eq v0, v1, :cond_3

    :cond_0
    invoke-static {}, Ld1/h3;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x12

    if-eq v0, v1, :cond_3

    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object p0

    instance-of p0, p0, Landroid/text/method/PasswordTransformationMethod;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ld1/x;->t:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iput-object v1, p0, Ld1/x;->t:Landroid/widget/EditText;

    iget-object v0, p0, Ld1/x;->u:Ljava/util/Timer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    iput-object v1, p0, Ld1/x;->u:Ljava/util/Timer;

    :cond_0
    invoke-super {p0}, Ld1/v1;->a()V

    return-void
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 9

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Ld1/x;->u:Ljava/util/Timer;

    new-instance v8, Ld1/x$b;

    iget-object v1, p0, Ld1/x;->t:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v2

    iget-object v1, p0, Ld1/x;->t:Landroid/widget/EditText;

    invoke-static {v1}, Ld1/x;->f(Landroid/widget/EditText;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v3, p1

    iget-object v4, p0, Ld1/x;->q:Ld1/q1;

    iget-boolean v5, p0, Ld1/x;->r:Z

    iget-boolean v6, p0, Ld1/x;->s:Z

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Ld1/x$b;-><init>(ILjava/lang/String;Ld1/q1;ZZLd1/x$a;)V

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v8, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;)V"
        }
    .end annotation

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Ld1/x;->t:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, Ld1/x;->u:Ljava/util/Timer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    :cond_0
    return-void
.end method
