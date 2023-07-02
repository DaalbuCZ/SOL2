.class public Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# static fields
.field static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/messaging/o0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "FLTFireMsgReceiver"

    const-string v1, "broadcast received for message"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lx8/a;->a()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lx8/a;->b(Landroid/content/Context;)V

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_1

    const-string p1, "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled."

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    new-instance v0, Lcom/google/firebase/messaging/o0;

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/google/firebase/messaging/o0;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/google/firebase/messaging/o0;->E()Lcom/google/firebase/messaging/o0$c;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-object p2, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/o0;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lio/flutter/plugins/firebase/messaging/f;->b()Lio/flutter/plugins/firebase/messaging/f;

    move-result-object p2

    invoke-virtual {p2, v0}, Lio/flutter/plugins/firebase/messaging/f;->i(Lcom/google/firebase/messaging/o0;)V

    :cond_2
    invoke-static {p1}, Lio/flutter/plugins/firebase/messaging/g;->d(Landroid/content/Context;)Z

    move-result p2

    const-string v1, "notification"

    if-eqz p2, :cond_3

    new-instance p2, Landroid/content/Intent;

    const-string v2, "io.flutter.plugins.firebase.messaging.NOTIFICATION"

    invoke-direct {p2, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-static {p1}, La0/a;->b(Landroid/content/Context;)La0/a;

    move-result-object p1

    invoke-virtual {p1, p2}, La0/a;->d(Landroid/content/Intent;)Z

    return-void

    :cond_3
    new-instance p2, Landroid/content/Intent;

    const-class v2, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;

    invoke-direct {p2, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-static {p1, p2}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->k(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
