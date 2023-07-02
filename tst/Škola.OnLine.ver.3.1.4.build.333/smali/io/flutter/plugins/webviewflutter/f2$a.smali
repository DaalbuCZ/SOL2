.class Lio/flutter/plugins/webviewflutter/f2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/k$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/webviewflutter/f2;->H(Lio/flutter/plugins/webviewflutter/k$c0;Ljava/lang/Object;Lt8/a$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/flutter/plugins/webviewflutter/k$n<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lt8/a$e;


# direct methods
.method constructor <init>(Ljava/util/Map;Lt8/a$e;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/f2$a;->a:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/f2$a;->b:Lt8/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/webviewflutter/f2$a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/f2$a;->a:Ljava/util/Map;

    const-string v1, "result"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/f2$a;->b:Lt8/a$e;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/f2$a;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Lt8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method
