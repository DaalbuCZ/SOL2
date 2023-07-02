.class public final Lf8/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/a$b;
    }
.end annotation


# static fields
.field private static e:Lf8/a;

.field private static f:Z


# instance fields
.field private a:Li8/f;

.field private b:Lh8/a;

.field private c:Lio/flutter/embedding/engine/FlutterJNI$c;

.field private d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>(Li8/f;Lh8/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/a;->a:Li8/f;

    iput-object p2, p0, Lf8/a;->b:Lh8/a;

    iput-object p3, p0, Lf8/a;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    iput-object p4, p0, Lf8/a;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method synthetic constructor <init>(Li8/f;Lh8/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;Lf8/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lf8/a;-><init>(Li8/f;Lh8/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public static e()Lf8/a;
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lf8/a;->f:Z

    sget-object v0, Lf8/a;->e:Lf8/a;

    if-nez v0, :cond_0

    new-instance v0, Lf8/a$b;

    invoke-direct {v0}, Lf8/a$b;-><init>()V

    invoke-virtual {v0}, Lf8/a$b;->a()Lf8/a;

    move-result-object v0

    sput-object v0, Lf8/a;->e:Lf8/a;

    :cond_0
    sget-object v0, Lf8/a;->e:Lf8/a;

    return-object v0
.end method


# virtual methods
.method public a()Lh8/a;
    .locals 1

    iget-object v0, p0, Lf8/a;->b:Lh8/a;

    return-object v0
.end method

.method public b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lf8/a;->d:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public c()Li8/f;
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Li8/f;

    return-object v0
.end method

.method public d()Lio/flutter/embedding/engine/FlutterJNI$c;
    .locals 1

    iget-object v0, p0, Lf8/a;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    return-object v0
.end method
