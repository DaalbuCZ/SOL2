.class public Lt7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Ll8/a;
.implements Lt8/d$d;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field private n:Lt8/d$b;

.field private o:Landroid/view/View;

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lt8/c;)V
    .locals 2

    new-instance v0, Lt8/d;

    const-string v1, "flutter_keyboard_visibility"

    invoke-direct {v0, p1, v1}, Lt8/d;-><init>(Lt8/c;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lt8/d;->d(Lt8/d$d;)V

    return-void
.end method

.method private d(Landroid/app/Activity;)V
    .locals 1

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lt7/a;->o:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lt7/a;->o:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lt7/a;->o:Landroid/view/View;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lt8/d$b;)V
    .locals 0

    iput-object p2, p0, Lt7/a;->n:Lt8/d$b;

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lt7/a;->n:Lt8/d$b;

    return-void
.end method

.method public onAttachedToActivity(Ll8/c;)V
    .locals 0

    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lt7/a;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 0

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lt7/a;->c(Lt8/c;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    invoke-direct {p0}, Lt7/a;->e()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-direct {p0}, Lt7/a;->e()V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 0

    invoke-direct {p0}, Lt7/a;->e()V

    return-void
.end method

.method public onGlobalLayout()V
    .locals 4

    iget-object v0, p0, Lt7/a;->o:Landroid/view/View;

    if-eqz v0, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v1, p0, Lt7/a;->o:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-double v0, v0

    iget-object v2, p0, Lt7/a;->o:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    const-wide v2, 0x3feb333333333333L    # 0.85

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-boolean v1, p0, Lt7/a;->p:Z

    if-eq v0, v1, :cond_1

    iput-boolean v0, p0, Lt7/a;->p:Z

    iget-object v1, p0, Lt7/a;->n:Lt8/d$b;

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lt8/d$b;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ll8/c;)V
    .locals 0

    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lt7/a;->d(Landroid/app/Activity;)V

    return-void
.end method
