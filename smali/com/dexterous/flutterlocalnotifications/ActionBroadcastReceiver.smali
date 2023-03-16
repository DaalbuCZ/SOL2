.class public Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;
    }
.end annotation


# static fields
.field private static b:Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;

.field private static c:Lio/flutter/embedding/engine/a;


# instance fields
.field a:Lc1/a;


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Ly7/a;)V
    .locals 2

    new-instance v0, Ll8/d;

    invoke-virtual {p1}, Ly7/a;->l()Ll8/c;

    move-result-object p1

    const-string v1, "dexterous.com/flutter/local_notifications/actions"

    invoke-direct {v0, p1, v1}, Ll8/d;-><init>(Ll8/c;Ljava/lang/String;)V

    sget-object p1, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;

    invoke-virtual {v0, p1}, Ll8/d;->d(Ll8/d$d;)V

    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    sget-object v0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Lio/flutter/embedding/engine/a;

    const-string v1, "ActionBroadcastReceiver"

    if-eqz v0, :cond_0

    const-string p1, "Engine is already initialised"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {}, Lx7/a;->e()Lx7/a;

    move-result-object v0

    invoke-virtual {v0}, Lx7/a;->c()La8/f;

    move-result-object v0

    invoke-virtual {v0, p1}, La8/f;->q(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, La8/f;->g(Landroid/content/Context;[Ljava/lang/String;)V

    new-instance v2, Lio/flutter/embedding/engine/a;

    invoke-direct {v2, p1}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;)V

    sput-object v2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Lio/flutter/embedding/engine/a;

    iget-object v2, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:Lc1/a;

    invoke-virtual {v2}, Lc1/a;->d()Lio/flutter/view/FlutterCallbackInformation;

    move-result-object v2

    if-nez v2, :cond_1

    const-string p1, "Callback information could not be retrieved"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    sget-object v1, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->h()Ly7/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a(Ly7/a;)V

    invoke-virtual {v0}, La8/f;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ly7/a$b;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    invoke-direct {v3, p1, v0, v2}, Ly7/a$b;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;Lio/flutter/view/FlutterCallbackInformation;)V

    invoke-virtual {v1, v3}, Ly7/a;->j(Ly7/a$b;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:Lc1/a;

    if-nez v0, :cond_1

    new-instance v0, Lc1/a;

    invoke-direct {v0, p1}, Lc1/a;-><init>(Landroid/content/Context;)V

    :cond_1
    iput-object v0, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:Lc1/a;

    invoke-static {p2}, Lcom/dexterous/flutterlocalnotifications/FlutterLocalNotificationsPlugin;->extractNotificationResponseMap(Landroid/content/Intent;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "cancelNotification"

    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p1}, Landroidx/core/app/n;->f(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p2

    const-string v1, "notificationId"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2, v1}, Landroidx/core/app/n;->b(I)V

    :cond_2
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;

    if-nez p2, :cond_3

    new-instance p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;-><init>(Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$a;)V

    sput-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;

    :cond_3
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;

    invoke-virtual {p2, v0}, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver$b;->c(Ljava/util/Map;)V

    invoke-direct {p0, p1}, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b(Landroid/content/Context;)V

    return-void
.end method
