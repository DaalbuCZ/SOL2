.class public Lb8/d;
.super Landroid/content/BroadcastReceiver;
.source ""

# interfaces
.implements Lt8/d$d;


# instance fields
.field private final n:Landroid/content/Context;

.field private final o:Lb8/a;

.field private p:Lt8/d$b;

.field private final q:Landroid/os/Handler;

.field private r:Landroid/net/ConnectivityManager$NetworkCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb8/a;)V
    .locals 2

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lb8/d;->q:Landroid/os/Handler;

    iput-object p1, p0, Lb8/d;->n:Landroid/content/Context;

    iput-object p2, p0, Lb8/d;->o:Lb8/a;

    return-void
.end method

.method public static synthetic c(Lb8/d;)V
    .locals 0

    invoke-direct {p0}, Lb8/d;->g()V

    return-void
.end method

.method public static synthetic d(Lb8/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lb8/d;->h(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lb8/d;)V
    .locals 0

    invoke-direct {p0}, Lb8/d;->i()V

    return-void
.end method

.method static synthetic f(Lb8/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lb8/d;->j(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic g()V
    .locals 2

    iget-object v0, p0, Lb8/d;->p:Lt8/d$b;

    iget-object v1, p0, Lb8/d;->o:Lb8/a;

    invoke-virtual {v1}, Lb8/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lt8/d$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic h(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lb8/d;->p:Lt8/d$b;

    invoke-interface {v0, p1}, Lt8/d$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private i()V
    .locals 2

    new-instance v0, Lb8/b;

    invoke-direct {v0, p0}, Lb8/b;-><init>(Lb8/d;)V

    iget-object v1, p0, Lb8/d;->q:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private j(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lb8/c;

    invoke-direct {v0, p0, p1}, Lb8/c;-><init>(Lb8/d;Ljava/lang/String;)V

    iget-object p1, p0, Lb8/d;->q:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lt8/d$b;)V
    .locals 1

    iput-object p2, p0, Lb8/d;->p:Lt8/d$b;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_0

    new-instance p1, Lb8/d$a;

    invoke-direct {p1, p0}, Lb8/d$a;-><init>(Lb8/d;)V

    iput-object p1, p0, Lb8/d;->r:Landroid/net/ConnectivityManager$NetworkCallback;

    iget-object p1, p0, Lb8/d;->o:Lb8/a;

    invoke-virtual {p1}, Lb8/a;->a()Landroid/net/ConnectivityManager;

    move-result-object p1

    iget-object p2, p0, Lb8/d;->r:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, p2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb8/d;->n:Landroid/content/Context;

    new-instance p2, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {p2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Lb8/d;->r:Landroid/net/ConnectivityManager$NetworkCallback;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lb8/d;->o:Lb8/a;

    invoke-virtual {p1}, Lb8/a;->a()Landroid/net/ConnectivityManager;

    move-result-object p1

    iget-object v0, p0, Lb8/d;->r:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lb8/d;->r:Landroid/net/ConnectivityManager$NetworkCallback;

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p1, p0, Lb8/d;->n:Landroid/content/Context;

    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lb8/d;->p:Lt8/d$b;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lb8/d;->o:Lb8/a;

    invoke-virtual {p2}, Lb8/a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lt8/d$b;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
