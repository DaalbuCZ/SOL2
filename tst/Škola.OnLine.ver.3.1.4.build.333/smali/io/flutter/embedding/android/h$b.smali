.class Lio/flutter/embedding/android/h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/embedding/android/h;


# direct methods
.method constructor <init>(Lio/flutter/embedding/android/h;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/android/h$b;->a:Lio/flutter/embedding/android/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 2

    const-string v0, "FlutterSurfaceView"

    const-string v1, "onFlutterUiDisplayed()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/h$b;->a:Lio/flutter/embedding/android/h;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setAlpha(F)V

    iget-object v0, p0, Lio/flutter/embedding/android/h$b;->a:Lio/flutter/embedding/android/h;

    invoke-static {v0}, Lio/flutter/embedding/android/h;->i(Lio/flutter/embedding/android/h;)Lr8/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/h$b;->a:Lio/flutter/embedding/android/h;

    invoke-static {v0}, Lio/flutter/embedding/android/h;->i(Lio/flutter/embedding/android/h;)Lr8/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lr8/a;->q(Lr8/b;)V

    :cond_0
    return-void
.end method
