.class Lio/flutter/plugins/webviewflutter/g2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/webviewflutter/g2;->setInputConnectionTarget(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/view/View;

.field final synthetic o:Lio/flutter/plugins/webviewflutter/g2;


# direct methods
.method constructor <init>(Lio/flutter/plugins/webviewflutter/g2;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/g2$a;->o:Lio/flutter/plugins/webviewflutter/g2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/g2$a;->n:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/g2$a;->o:Lio/flutter/plugins/webviewflutter/g2;

    invoke-static {v0}, Lio/flutter/plugins/webviewflutter/g2;->b(Lio/flutter/plugins/webviewflutter/g2;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "InputAwareWebView"

    const-string v1, "Can\'t set the input connection target because there is no containerView to use as a handler."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/g2$a;->o:Lio/flutter/plugins/webviewflutter/g2;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/g2$a;->n:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->onWindowFocusChanged(Z)V

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/g2$a;->o:Lio/flutter/plugins/webviewflutter/g2;

    invoke-static {v1}, Lio/flutter/plugins/webviewflutter/g2;->b(Lio/flutter/plugins/webviewflutter/g2;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    return-void
.end method
