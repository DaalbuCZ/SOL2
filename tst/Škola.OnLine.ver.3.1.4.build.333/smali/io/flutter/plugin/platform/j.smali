.class Lio/flutter/plugin/platform/j;
.super Landroid/widget/FrameLayout;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x17
.end annotation


# instance fields
.field private final A:Lio/flutter/view/d$b;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:Landroid/graphics/SurfaceTexture;

.field private u:Landroid/view/Surface;

.field private v:Lio/flutter/embedding/android/a;

.field w:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

.field private final x:Ljava/util/concurrent/atomic/AtomicLong;

.field private final y:Lio/flutter/view/d$a;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/flutter/plugin/platform/j;->x:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lio/flutter/plugin/platform/j$a;

    invoke-direct {p1, p0}, Lio/flutter/plugin/platform/j$a;-><init>(Lio/flutter/plugin/platform/j;)V

    iput-object p1, p0, Lio/flutter/plugin/platform/j;->y:Lio/flutter/view/d$a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/plugin/platform/j;->z:Z

    new-instance v0, Lio/flutter/plugin/platform/j$b;

    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/j$b;-><init>(Lio/flutter/plugin/platform/j;)V

    iput-object v0, p0, Lio/flutter/plugin/platform/j;->A:Lio/flutter/view/d$b;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/view/d$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/j;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lio/flutter/plugin/platform/j;->y:Lio/flutter/view/d$a;

    invoke-interface {p2, p1}, Lio/flutter/view/d$c;->c(Lio/flutter/view/d$a;)V

    iget-object p1, p0, Lio/flutter/plugin/platform/j;->A:Lio/flutter/view/d$b;

    invoke-interface {p2, p1}, Lio/flutter/view/d$c;->b(Lio/flutter/view/d$b;)V

    invoke-interface {p2}, Lio/flutter/view/d$c;->d()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/j;->l(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method static synthetic a(Lio/flutter/plugin/platform/j;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugin/platform/j;->x:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method static synthetic b(Lio/flutter/plugin/platform/j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugin/platform/j;->z:Z

    return p1
.end method

.method private f()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugin/platform/j;->z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/j;->t:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/j;->c(Landroid/graphics/SurfaceTexture;)Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugin/platform/j;->z:Z

    :cond_1
    return-void
.end method

.method private n()Z
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x1d

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method protected c(Landroid/graphics/SurfaceTexture;)Landroid/view/Surface;
    .locals 1

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/j;->s:I

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    const-string v1, "PlatformViewWrapper"

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    const-string p1, "Platform view cannot be composed without a surface."

    :goto_0
    invoke-static {v1, p1}, Lf8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "Invalid surface. The platform view cannot be displayed."

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/flutter/plugin/platform/j;->t:Landroid/graphics/SurfaceTexture;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->isReleased()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lio/flutter/plugin/platform/j;->n()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lio/flutter/plugin/platform/j;->g()V

    iget-object p1, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    invoke-virtual {p1}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    invoke-direct {p0}, Lio/flutter/plugin/platform/j;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    invoke-virtual {v0, p1}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    :goto_1
    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    invoke-virtual {v1, p1}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    throw v0

    :cond_4
    :goto_2
    const-string p1, "Invalid texture. The platform view cannot be displayed."

    goto :goto_0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/j;->r:I

    return v0
.end method

.method public h()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/j;->t:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    iput-object v0, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    :cond_0
    return-void
.end method

.method public i(II)V
    .locals 1

    iput p1, p0, Lio/flutter/plugin/platform/j;->r:I

    iput p2, p0, Lio/flutter/plugin/platform/j;->s:I

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->t:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    :cond_0
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    move-result-object p1

    return-object p1
.end method

.method public j(Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget v0, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v0, p0, Lio/flutter/plugin/platform/j;->p:I

    iget p1, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput p1, p0, Lio/flutter/plugin/platform/j;->q:I

    return-void
.end method

.method public k(Landroid/view/View$OnFocusChangeListener;)V
    .locals 2

    invoke-virtual {p0}, Lio/flutter/plugin/platform/j;->o()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/flutter/plugin/platform/j;->w:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    if-nez v1, :cond_0

    new-instance v1, Lio/flutter/plugin/platform/j$c;

    invoke-direct {v1, p0, p1}, Lio/flutter/plugin/platform/j$c;-><init>(Lio/flutter/plugin/platform/j;Landroid/view/View$OnFocusChangeListener;)V

    iput-object v1, p0, Lio/flutter/plugin/platform/j;->w:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    :cond_0
    return-void
.end method

.method public l(Landroid/graphics/SurfaceTexture;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const-string p1, "PlatformViewWrapper"

    const-string v0, "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle."

    invoke-static {p1, v0}, Lf8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iput-object p1, p0, Lio/flutter/plugin/platform/j;->t:Landroid/graphics/SurfaceTexture;

    iget v0, p0, Lio/flutter/plugin/platform/j;->r:I

    if-lez v0, :cond_1

    iget v1, p0, Lio/flutter/plugin/platform/j;->s:I

    if-lez v1, :cond_1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    :cond_1
    iget-object v0, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_2
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/j;->c(Landroid/graphics/SurfaceTexture;)Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    invoke-virtual {p1}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-direct {p0}, Lio/flutter/plugin/platform/j;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    invoke-virtual {v0, p1}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lio/flutter/plugin/platform/j;->u:Landroid/view/Surface;

    invoke-virtual {v1, p1}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    throw v0
.end method

.method public m(Lio/flutter/embedding/android/a;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/j;->v:Lio/flutter/embedding/android/a;

    return-void
.end method

.method public o()V
    .locals 3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/flutter/plugin/platform/j;->w:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    iput-object v2, p0, Lio/flutter/plugin/platform/j;->w:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    :cond_0
    return-void
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->v:Lio/flutter/embedding/android/a;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    iget v1, p0, Lio/flutter/plugin/platform/j;->p:I

    int-to-float v1, v1

    iget v2, p0, Lio/flutter/plugin/platform/j;->q:I

    goto :goto_0

    :cond_1
    iget v1, p0, Lio/flutter/plugin/platform/j;->n:I

    int-to-float v1, v1

    iget v2, p0, Lio/flutter/plugin/platform/j;->o:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget v1, p0, Lio/flutter/plugin/platform/j;->p:I

    iput v1, p0, Lio/flutter/plugin/platform/j;->n:I

    iget v1, p0, Lio/flutter/plugin/platform/j;->q:I

    iput v1, p0, Lio/flutter/plugin/platform/j;->o:I

    goto :goto_1

    :cond_2
    iget v1, p0, Lio/flutter/plugin/platform/j;->p:I

    iput v1, p0, Lio/flutter/plugin/platform/j;->n:I

    iget v2, p0, Lio/flutter/plugin/platform/j;->q:I

    iput v2, p0, Lio/flutter/plugin/platform/j;->o:I

    int-to-float v1, v1

    :goto_0
    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :goto_1
    iget-object v1, p0, Lio/flutter/plugin/platform/j;->v:Lio/flutter/embedding/android/a;

    invoke-virtual {v1, p1, v0}, Lio/flutter/embedding/android/a;->g(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Z

    move-result p1

    return p1
.end method

.method public requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method
