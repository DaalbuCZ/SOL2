.class public Lio/flutter/plugins/firebase/messaging/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll8/k$c;


# instance fields
.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private o:Ll8/k;

.field private p:Lio/flutter/embedding/engine/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/messaging/b;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/firebase/messaging/b;La8/f;Landroid/os/Handler;Lio/flutter/embedding/engine/e;J)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lio/flutter/plugins/firebase/messaging/b;->k(La8/f;Landroid/os/Handler;Lio/flutter/embedding/engine/e;J)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/firebase/messaging/b;La8/f;Lio/flutter/embedding/engine/e;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/flutter/plugins/firebase/messaging/b;->j(La8/f;Lio/flutter/embedding/engine/e;J)V

    return-void
.end method

.method static synthetic c(Lio/flutter/plugins/firebase/messaging/b;)J
    .locals 2

    invoke-direct {p0}, Lio/flutter/plugins/firebase/messaging/b;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method private e()J
    .locals 4

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "io.flutter.firebase.messaging.callback"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "callback_handle"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private f()J
    .locals 4

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "io.flutter.firebase.messaging.callback"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "user_callback_handle"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private g(Ll8/c;)V
    .locals 2

    new-instance v0, Ll8/k;

    const-string v1, "plugins.flutter.io/firebase_messaging_background"

    invoke-direct {v0, p1, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/messaging/b;->o:Ll8/k;

    invoke-virtual {v0, p0}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method private synthetic j(La8/f;Lio/flutter/embedding/engine/e;J)V
    .locals 4

    invoke-virtual {p1}, La8/f;->i()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {p0}, Lio/flutter/plugins/firebase/messaging/b;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "FLTFireBGExecutor"

    if-eqz p2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Creating background FlutterEngine instance, with args: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lio/flutter/embedding/engine/e;->b()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lio/flutter/embedding/engine/a;

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p2}, Lio/flutter/embedding/engine/e;->b()[Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, v2, p2}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    iput-object v1, p0, Lio/flutter/plugins/firebase/messaging/b;->p:Lio/flutter/embedding/engine/a;

    goto :goto_0

    :cond_0
    const-string p2, "Creating background FlutterEngine instance."

    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p2, Lio/flutter/embedding/engine/a;

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/b;->p:Lio/flutter/embedding/engine/a;

    :goto_0
    invoke-static {p3, p4}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    move-result-object p2

    iget-object p3, p0, Lio/flutter/plugins/firebase/messaging/b;->p:Lio/flutter/embedding/engine/a;

    invoke-virtual {p3}, Lio/flutter/embedding/engine/a;->h()Ly7/a;

    move-result-object p3

    invoke-direct {p0, p3}, Lio/flutter/plugins/firebase/messaging/b;->g(Ll8/c;)V

    new-instance p4, Ly7/a$b;

    invoke-direct {p4, v0, p1, p2}, Ly7/a$b;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;Lio/flutter/view/FlutterCallbackInformation;)V

    invoke-virtual {p3, p4}, Ly7/a;->j(Ly7/a$b;)V

    :cond_1
    return-void
.end method

.method private synthetic k(La8/f;Landroid/os/Handler;Lio/flutter/embedding/engine/e;J)V
    .locals 8

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, La8/f;->q(Landroid/content/Context;)V

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v7, Lp8/c;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lp8/c;-><init>(Lio/flutter/plugins/firebase/messaging/b;La8/f;Lio/flutter/embedding/engine/e;J)V

    const/4 p3, 0x0

    invoke-virtual {p1, v0, p3, p2, v7}, La8/f;->h(Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    return-void
.end method

.method private l()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/b;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->m()V

    return-void
.end method

.method public static m(J)V
    .locals 3

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "io.flutter.firebase.messaging.callback"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "callback_handle"

    invoke-interface {v0, v1, p0, p1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static n(J)V
    .locals 3

    invoke-static {}, Lp8/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "io.flutter.firebase.messaging.callback"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "user_callback_handle"

    invoke-interface {v0, v1, p0, p1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public d(Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/b;->p:Lio/flutter/embedding/engine/a;

    const-string v1, "FLTFireBGExecutor"

    if-nez v0, :cond_0

    const-string p1, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered."

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p2, :cond_1

    new-instance v0, Lio/flutter/plugins/firebase/messaging/b$a;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/messaging/b$a;-><init>(Lio/flutter/plugins/firebase/messaging/b;Ljava/util/concurrent/CountDownLatch;)V

    :cond_1
    const-string p2, "notification"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/messaging/o0;

    if-eqz p1, :cond_2

    invoke-static {p1}, Lio/flutter/plugins/firebase/messaging/g;->f(Lcom/google/firebase/messaging/o0;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/plugins/firebase/messaging/b;->o:Ll8/k;

    new-instance v1, Lio/flutter/plugins/firebase/messaging/b$b;

    invoke-direct {v1, p0, p1}, Lio/flutter/plugins/firebase/messaging/b$b;-><init>(Lio/flutter/plugins/firebase/messaging/b;Ljava/util/Map;)V

    const-string p1, "MessagingBackground#onMessage"

    invoke-virtual {p2, p1, v1, v0}, Ll8/k;->d(Ljava/lang/String;Ljava/lang/Object;Ll8/k$d;)V

    goto :goto_0

    :cond_2
    const-string p1, "RemoteMessage instance not found in Intent."

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method h()Z
    .locals 4

    invoke-direct {p0}, Lio/flutter/plugins/firebase/messaging/b;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/b;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public o()V
    .locals 4

    invoke-virtual {p0}, Lio/flutter/plugins/firebase/messaging/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/firebase/messaging/b;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lio/flutter/plugins/firebase/messaging/b;->p(JLio/flutter/embedding/engine/e;)V

    :cond_0
    return-void
.end method

.method public onMethodCall(Ll8/j;Ll8/k$d;)V
    .locals 1

    iget-object p1, p1, Ll8/j;->a:Ljava/lang/String;

    :try_start_0
    const-string v0, "MessagingBackground#initialized"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/firebase/messaging/b;->l()V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Ll8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ll8/k$d;->c()V
    :try_end_0
    .catch Lio/flutter/plugins/firebase/messaging/j; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Flutter FCM error: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    throw p1
.end method

.method public p(JLio/flutter/embedding/engine/e;)V
    .locals 9

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/b;->p:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_0

    const-string p1, "FLTFireBGExecutor"

    const-string p2, "Background isolate already started."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v2, La8/f;

    invoke-direct {v2}, La8/f;-><init>()V

    new-instance v7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v8, Lp8/b;

    move-object v0, v8

    move-object v1, p0

    move-object v3, v7

    move-object v4, p3

    move-wide v5, p1

    invoke-direct/range {v0 .. v6}, Lp8/b;-><init>(Lio/flutter/plugins/firebase/messaging/b;La8/f;Landroid/os/Handler;Lio/flutter/embedding/engine/e;J)V

    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
