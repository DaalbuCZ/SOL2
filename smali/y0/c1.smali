.class public Ly0/c1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/c1$a;
    }
.end annotation


# instance fields
.field private n:Ljava/lang/Process;

.field private o:Ljava/io/BufferedReader;

.field private p:Ly0/c1$a;

.field private volatile q:Z

.field private final r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly0/c1;->q:Z

    iput-object p1, p0, Ly0/c1;->r:Ljava/lang/String;

    return-void
.end method

.method private c()Ljava/io/BufferedReader;
    .locals 3

    iget-object v0, p0, Ly0/c1;->o:Ljava/io/BufferedReader;

    if-nez v0, :cond_0

    iget-object v0, p0, Ly0/c1;->n:Ljava/lang/Process;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    iget-object v2, p0, Ly0/c1;->n:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Ly0/c1;->o:Ljava/io/BufferedReader;

    :cond_0
    iget-object v0, p0, Ly0/c1;->o:Ljava/io/BufferedReader;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ly0/c1;->p:Ly0/c1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ly0/c1$a;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    invoke-direct {p0}, Ly0/c1;->c()Ljava/io/BufferedReader;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-boolean v2, p0, Ly0/c1;->q:Z

    if-eqz v2, :cond_1

    invoke-direct {p0, v1}, Ly0/c1;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Logcat"

    const-string v2, "IOException reading logcat trace."

    invoke-static {v1, v2, v0}, Ly0/i0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public e(Ly0/c1$a;)V
    .locals 0

    iput-object p1, p0, Ly0/c1;->p:Ly0/c1$a;

    return-void
.end method

.method public run()V
    .locals 4

    const-string v0, "Logcat"

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string v2, "logcat -c"

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Process;->waitFor()I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logcat -v brief "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ly0/c1;->r:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1

    iput-object v1, p0, Ly0/c1;->n:Ljava/lang/Process;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    const-string v2, "Exception executing logcat command."

    invoke-static {v0, v2, v1}, Ly0/i0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-direct {p0}, Ly0/c1;->g()V

    const-string v1, "run: Logcat thread finished"

    invoke-static {v0, v1}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
