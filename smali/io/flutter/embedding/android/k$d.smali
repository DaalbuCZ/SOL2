.class Lio/flutter/embedding/android/k$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/core/util/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/core/util/a<",
        "Landroidx/window/layout/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/embedding/android/k;


# direct methods
.method constructor <init>(Lio/flutter/embedding/android/k;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/android/k$d;->a:Lio/flutter/embedding/android/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/window/layout/v;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k$d;->a:Lio/flutter/embedding/android/k;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/android/k;->setWindowInfoListenerDisplayFeatures(Landroidx/window/layout/v;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/window/layout/v;

    invoke-virtual {p0, p1}, Lio/flutter/embedding/android/k$d;->a(Landroidx/window/layout/v;)V

    return-void
.end method
