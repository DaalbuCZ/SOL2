.class Lcom/google/firebase/messaging/j1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/content/Intent;

.field private final b:Ly4/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly4/j<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Intent;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/messaging/j1$a;->b:Ly4/j;

    iput-object p1, p0, Lcom/google/firebase/messaging/j1$a;->a:Landroid/content/Intent;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/messaging/j1$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/j1$a;->f()V

    return-void
.end method

.method public static synthetic b(Ljava/util/concurrent/ScheduledFuture;Ly4/i;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/messaging/j1$a;->g(Ljava/util/concurrent/ScheduledFuture;Ly4/i;)V

    return-void
.end method

.method private synthetic f()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Service took too long to process intent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/firebase/messaging/j1$a;->a:Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Releasing WakeLock."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/google/firebase/messaging/j1$a;->d()V

    return-void
.end method

.method private static synthetic g(Ljava/util/concurrent/ScheduledFuture;Ly4/i;)V
    .locals 0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    return-void
.end method


# virtual methods
.method c(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/messaging/j1$a;->a:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v0

    const/high16 v1, 0x10000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lcom/google/firebase/messaging/h1;

    invoke-direct {v1, p0}, Lcom/google/firebase/messaging/h1;-><init>(Lcom/google/firebase/messaging/j1$a;)V

    if-eqz v0, :cond_1

    sget-wide v2, Lcom/google/firebase/messaging/e1;->a:J

    goto :goto_1

    :cond_1
    const-wide/16 v2, 0x2328

    :goto_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v1, v2, v3, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/messaging/j1$a;->e()Ly4/i;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/messaging/i1;

    invoke-direct {v2, v0}, Lcom/google/firebase/messaging/i1;-><init>(Ljava/util/concurrent/ScheduledFuture;)V

    invoke-virtual {v1, p1, v2}, Ly4/i;->b(Ljava/util/concurrent/Executor;Ly4/d;)Ly4/i;

    return-void
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/j1$a;->b:Ly4/j;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly4/j;->e(Ljava/lang/Object;)Z

    return-void
.end method

.method e()Ly4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/messaging/j1$a;->b:Ly4/j;

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method
