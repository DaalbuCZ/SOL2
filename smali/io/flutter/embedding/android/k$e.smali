.class Lio/flutter/embedding/android/k$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/embedding/android/k;->B(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj8/a;

.field final synthetic b:Ljava/lang/Runnable;

.field final synthetic c:Lio/flutter/embedding/android/k;


# direct methods
.method constructor <init>(Lio/flutter/embedding/android/k;Lj8/a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/android/k$e;->c:Lio/flutter/embedding/android/k;

    iput-object p2, p0, Lio/flutter/embedding/android/k$e;->a:Lj8/a;

    iput-object p3, p0, Lio/flutter/embedding/android/k$e;->b:Ljava/lang/Runnable;

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

    iget-object v0, p0, Lio/flutter/embedding/android/k$e;->a:Lj8/a;

    invoke-virtual {v0, p0}, Lj8/a;->q(Lj8/b;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k$e;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lio/flutter/embedding/android/k$e;->c:Lio/flutter/embedding/android/k;

    iget-object v1, v0, Lio/flutter/embedding/android/k;->q:Lj8/c;

    instance-of v1, v1, Lio/flutter/embedding/android/g;

    if-nez v1, :cond_0

    invoke-static {v0}, Lio/flutter/embedding/android/k;->i(Lio/flutter/embedding/android/k;)Lio/flutter/embedding/android/g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/k$e;->c:Lio/flutter/embedding/android/k;

    invoke-static {v0}, Lio/flutter/embedding/android/k;->i(Lio/flutter/embedding/android/k;)Lio/flutter/embedding/android/g;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/android/g;->g()V

    :cond_0
    return-void
.end method
