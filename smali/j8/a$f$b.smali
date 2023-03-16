.class Lj8/a$f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/a$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lj8/a$f;


# direct methods
.method constructor <init>(Lj8/a$f;)V
    .locals 0

    iput-object p1, p0, Lj8/a$f$b;->n:Lj8/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 3

    iget-object p1, p0, Lj8/a$f$b;->n:Lj8/a$f;

    invoke-static {p1}, Lj8/a$f;->g(Lj8/a$f;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lj8/a$f$b;->n:Lj8/a$f;

    iget-object p1, p1, Lj8/a$f;->h:Lj8/a;

    invoke-static {p1}, Lj8/a;->c(Lj8/a;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj8/a$f$b;->n:Lj8/a$f;

    iget-object v0, p1, Lj8/a$f;->h:Lj8/a;

    invoke-static {p1}, Lj8/a$f;->h(Lj8/a$f;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lj8/a;->d(Lj8/a;J)V

    :cond_1
    :goto_0
    return-void
.end method
