.class Lio/flutter/plugins/firebase/core/p$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/core/l$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/core/p;->f(Lio/flutter/plugins/firebase/core/l$b;Ljava/lang/Object;Lt8/a$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/flutter/plugins/firebase/core/l$h<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lt8/a$e;


# direct methods
.method constructor <init>(Ljava/util/Map;Lt8/a$e;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/p$b;->a:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/p$b;->b:Lt8/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/core/p$b;->c(Ljava/lang/Void;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/p$b;->a:Ljava/util/Map;

    invoke-static {p1}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "error"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/core/p$b;->b:Lt8/a$e;

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/p$b;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lio/flutter/plugins/firebase/core/p$b;->a:Ljava/util/Map;

    const-string v0, "result"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/core/p$b;->b:Lt8/a$e;

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/p$b;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method
