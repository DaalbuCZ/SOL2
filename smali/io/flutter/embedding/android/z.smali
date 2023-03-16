.class public Lio/flutter/embedding/android/z;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Lj0/a;


# direct methods
.method public constructor <init>(Lj0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/z;->a:Lj0/a;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/a<",
            "Landroidx/window/layout/v;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/android/z;->a:Lj0/a;

    invoke-virtual {v0, p1, p2, p3}, Lj0/a;->c(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    return-void
.end method

.method public b(Landroidx/core/util/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/a<",
            "Landroidx/window/layout/v;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/android/z;->a:Lj0/a;

    invoke-virtual {v0, p1}, Lj0/a;->e(Landroidx/core/util/a;)V

    return-void
.end method
