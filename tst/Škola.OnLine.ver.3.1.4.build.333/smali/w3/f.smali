.class public final Lw3/f;
.super Landroid/opengl/GLSurfaceView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/f$a;
    }
.end annotation


# instance fields
.field private final n:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lw3/f$a;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Landroid/hardware/SensorManager;

.field private final p:Landroid/hardware/Sensor;

.field private final q:Lw3/c;

.field private final r:Landroid/os/Handler;

.field private final s:Lw3/d;

.field private t:Landroid/graphics/SurfaceTexture;

.field private u:Landroid/view/Surface;

.field private v:Z

.field private w:Z

.field private x:Z


# direct methods
.method public static synthetic a(Lw3/f;)V
    .locals 0

    invoke-direct {p0}, Lw3/f;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 3

    iget-object v0, p0, Lw3/f;->u:Landroid/view/Surface;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw3/f;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw3/f$a;

    invoke-interface {v2, v0}, Lw3/f$a;->h(Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lw3/f;->t:Landroid/graphics/SurfaceTexture;

    invoke-static {v1, v0}, Lw3/f;->c(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lw3/f;->t:Landroid/graphics/SurfaceTexture;

    iput-object v0, p0, Lw3/f;->u:Landroid/view/Surface;

    return-void
.end method

.method private static c(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :cond_1
    return-void
.end method

.method private e()V
    .locals 5

    iget-boolean v0, p0, Lw3/f;->v:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lw3/f;->w:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lw3/f;->p:Landroid/hardware/Sensor;

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Lw3/f;->x:Z

    if-ne v0, v3, :cond_1

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    iget-object v3, p0, Lw3/f;->o:Landroid/hardware/SensorManager;

    iget-object v4, p0, Lw3/f;->q:Lw3/c;

    invoke-virtual {v3, v4, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lw3/f;->o:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lw3/f;->q:Lw3/c;

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :goto_1
    iput-boolean v0, p0, Lw3/f;->x:Z

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public d(Lw3/f$a;)V
    .locals 1

    iget-object v0, p0, Lw3/f;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public getCameraMotionListener()Lw3/a;
    .locals 1

    iget-object v0, p0, Lw3/f;->s:Lw3/d;

    return-object v0
.end method

.method public getVideoFrameMetadataListener()Lv3/j;
    .locals 1

    iget-object v0, p0, Lw3/f;->s:Lw3/d;

    return-object v0
.end method

.method public getVideoSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lw3/f;->u:Landroid/view/Surface;

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    iget-object v0, p0, Lw3/f;->r:Landroid/os/Handler;

    new-instance v1, Lw3/e;

    invoke-direct {v1, p0}, Lw3/e;-><init>(Lw3/f;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lw3/f;->w:Z

    invoke-direct {p0}, Lw3/f;->e()V

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw3/f;->w:Z

    invoke-direct {p0}, Lw3/f;->e()V

    return-void
.end method

.method public setDefaultStereoMode(I)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public setUseSensorRotation(Z)V
    .locals 0

    iput-boolean p1, p0, Lw3/f;->v:Z

    invoke-direct {p0}, Lw3/f;->e()V

    return-void
.end method
