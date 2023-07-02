.class public Lg8/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/a$d;,
        Lg8/a$b;,
        Lg8/a$c;,
        Lg8/a$e;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/embedding/engine/FlutterJNI;

.field private final b:Landroid/content/res/AssetManager;

.field private final c:Lg8/c;

.field private final d:Lt8/c;

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Lg8/a$e;

.field private final h:Lt8/c$a;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg8/a;->e:Z

    new-instance v0, Lg8/a$a;

    invoke-direct {v0, p0}, Lg8/a$a;-><init>(Lg8/a;)V

    iput-object v0, p0, Lg8/a;->h:Lt8/c$a;

    iput-object p1, p0, Lg8/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iput-object p2, p0, Lg8/a;->b:Landroid/content/res/AssetManager;

    new-instance p2, Lg8/c;

    invoke-direct {p2, p1}, Lg8/c;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p2, p0, Lg8/a;->c:Lg8/c;

    const-string v1, "flutter/isolate"

    invoke-virtual {p2, v1, v0}, Lg8/c;->e(Ljava/lang/String;Lt8/c$a;)V

    new-instance v0, Lg8/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lg8/a$d;-><init>(Lg8/c;Lg8/a$a;)V

    iput-object v0, p0, Lg8/a;->d:Lt8/c;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg8/a;->e:Z

    :cond_0
    return-void
.end method

.method static synthetic g(Lg8/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lg8/a;->f:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic h(Lg8/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lg8/a;->f:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic i(Lg8/a;)Lg8/a$e;
    .locals 0

    iget-object p0, p0, Lg8/a;->g:Lg8/a$e;

    return-object p0
.end method


# virtual methods
.method public a(Lt8/c$d;)Lt8/c$c;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lg8/a;->d:Lt8/c;

    invoke-interface {v0, p1}, Lt8/c;->a(Lt8/c$d;)Lt8/c$c;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Lt8/c$a;Lt8/c$c;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lg8/a;->d:Lt8/c;

    invoke-interface {v0, p1, p2, p3}, Lt8/c;->b(Ljava/lang/String;Lt8/c$a;Lt8/c$c;)V

    return-void
.end method

.method public synthetic c()Lt8/c$c;
    .locals 1

    invoke-static {p0}, Lt8/b;->a(Lt8/c;)Lt8/c$c;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lt8/c$b;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lg8/a;->d:Lt8/c;

    invoke-interface {v0, p1, p2, p3}, Lt8/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lt8/c$b;)V

    return-void
.end method

.method public e(Ljava/lang/String;Lt8/c$a;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lg8/a;->d:Lt8/c;

    invoke-interface {v0, p1, p2}, Lt8/c;->e(Ljava/lang/String;Lt8/c$a;)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lg8/a;->d:Lt8/c;

    invoke-interface {v0, p1, p2}, Lt8/c;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public j(Lg8/a$b;)V
    .locals 8

    iget-boolean v0, p0, Lg8/a;->e:Z

    const-string v1, "DartExecutor"

    if-eqz v0, :cond_0

    const-string p1, "Attempted to run a DartExecutor that is already running."

    invoke-static {v1, p1}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "DartExecutor#executeDartCallback"

    invoke-static {v0}, Le9/e;->a(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Executing Dart callback: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lg8/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v3, p1, Lg8/a$b;->b:Ljava/lang/String;

    iget-object v0, p1, Lg8/a$b;->c:Lio/flutter/view/FlutterCallbackInformation;

    iget-object v4, v0, Lio/flutter/view/FlutterCallbackInformation;->callbackName:Ljava/lang/String;

    iget-object v5, v0, Lio/flutter/view/FlutterCallbackInformation;->callbackLibraryPath:Ljava/lang/String;

    iget-object v6, p1, Lg8/a$b;->a:Landroid/content/res/AssetManager;

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lio/flutter/embedding/engine/FlutterJNI;->runBundleAndSnapshotFromLibrary(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg8/a;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Le9/e;->d()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Le9/e;->d()V

    throw p1
.end method

.method public k(Lg8/a$c;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg8/a$c;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lg8/a;->e:Z

    const-string v1, "DartExecutor"

    if-eqz v0, :cond_0

    const-string p1, "Attempted to run a DartExecutor that is already running."

    invoke-static {v1, p1}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "DartExecutor#executeDartEntrypoint"

    invoke-static {v0}, Le9/e;->a(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Executing Dart entrypoint: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lg8/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v3, p1, Lg8/a$c;->a:Ljava/lang/String;

    iget-object v4, p1, Lg8/a$c;->c:Ljava/lang/String;

    iget-object v5, p1, Lg8/a$c;->b:Ljava/lang/String;

    iget-object v6, p0, Lg8/a;->b:Landroid/content/res/AssetManager;

    move-object v7, p2

    invoke-virtual/range {v2 .. v7}, Lio/flutter/embedding/engine/FlutterJNI;->runBundleAndSnapshotFromLibrary(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg8/a;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Le9/e;->d()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Le9/e;->d()V

    throw p1
.end method

.method public l()Lt8/c;
    .locals 1

    iget-object v0, p0, Lg8/a;->d:Lt8/c;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg8/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lg8/a;->e:Z

    return v0
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lg8/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->notifyLowMemoryWarning()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 2

    const-string v0, "DartExecutor"

    const-string v1, "Attached to JNI. Registering the platform message handler for this Dart execution context."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v1, p0, Lg8/a;->c:Lg8/c;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lg8/f;)V

    return-void
.end method

.method public q()V
    .locals 2

    const-string v0, "DartExecutor"

    const-string v1, "Detached from JNI. De-registering the platform message handler for this Dart execution context."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lg8/f;)V

    return-void
.end method
