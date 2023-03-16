.class Lio/flutter/plugins/webviewflutter/q3$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lio/flutter/plugins/webviewflutter/p2;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lio/flutter/plugins/webviewflutter/p2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Lio/flutter/plugins/webviewflutter/p2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3$b;->a:Lio/flutter/plugins/webviewflutter/p2;

    return-void
.end method


# virtual methods
.method a()Lio/flutter/plugins/webviewflutter/p2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$b;->a:Lio/flutter/plugins/webviewflutter/p2;

    return-object v0
.end method

.method b()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$b;->a:Lio/flutter/plugins/webviewflutter/p2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/plugins/webviewflutter/p2;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$b;->a:Lio/flutter/plugins/webviewflutter/p2;

    return-void
.end method

.method c(Lio/flutter/plugins/webviewflutter/p2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/q3$b;->b()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3$b;->a:Lio/flutter/plugins/webviewflutter/p2;

    return-void
.end method
