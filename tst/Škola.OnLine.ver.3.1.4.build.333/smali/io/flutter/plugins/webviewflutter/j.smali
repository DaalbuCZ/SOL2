.class Lio/flutter/plugins/webviewflutter/j;
.super Lio/flutter/plugin/platform/g;
.source ""


# instance fields
.field private final b:Lio/flutter/plugins/webviewflutter/i2;


# direct methods
.method constructor <init>(Lio/flutter/plugins/webviewflutter/i2;)V
    .locals 1

    sget-object v0, Lt8/r;->a:Lt8/r;

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/g;-><init>(Lt8/i;)V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/j;->b:Lio/flutter/plugins/webviewflutter/i2;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/f;
    .locals 2

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/j;->b:Lio/flutter/plugins/webviewflutter/i2;

    move-object p2, p3

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugin/platform/f;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to find WebView instance: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
