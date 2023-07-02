.class Li8/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/f;->r(Landroid/content/Context;Li8/f$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Li8/f$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Li8/f;


# direct methods
.method constructor <init>(Li8/f;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Li8/f$a;->b:Li8/f;

    iput-object p2, p0, Li8/f$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Li8/f$a;)V
    .locals 0

    invoke-direct {p0}, Li8/f$a;->c()V

    return-void
.end method

.method private synthetic c()V
    .locals 1

    iget-object v0, p0, Li8/f$a;->b:Li8/f;

    invoke-static {v0}, Li8/f;->d(Li8/f;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->prefetchDefaultFontManager()V

    return-void
.end method


# virtual methods
.method public b()Li8/f$b;
    .locals 5

    const-string v0, "FlutterLoader initTask"

    invoke-static {v0}, Le9/e;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Li8/f$a;->b:Li8/f;

    iget-object v1, p0, Li8/f$a;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Li8/f;->c(Li8/f;Landroid/content/Context;)Li8/g;

    iget-object v0, p0, Li8/f$a;->b:Li8/f;

    invoke-static {v0}, Li8/f;->d(Li8/f;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->loadLibrary()V

    iget-object v0, p0, Li8/f$a;->b:Li8/f;

    invoke-static {v0}, Li8/f;->d(Li8/f;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->updateRefreshRate()V

    iget-object v0, p0, Li8/f$a;->b:Li8/f;

    invoke-static {v0}, Li8/f;->e(Li8/f;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Li8/e;

    invoke-direct {v1, p0}, Li8/e;-><init>(Li8/f$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    new-instance v0, Li8/f$b;

    iget-object v1, p0, Li8/f$a;->a:Landroid/content/Context;

    invoke-static {v1}, Le9/b;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Li8/f$a;->a:Landroid/content/Context;

    invoke-static {v2}, Le9/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Li8/f$a;->a:Landroid/content/Context;

    invoke-static {v3}, Le9/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Li8/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li8/f$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Le9/e;->d()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {}, Le9/e;->d()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/f$a;->b()Li8/f$b;

    move-result-object v0

    return-object v0
.end method
