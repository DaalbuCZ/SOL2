.class Lv5/k;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final s:Ljava/io/FilenameFilter;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lv5/s;

.field private final c:Lv5/n;

.field private final d:Lw5/i;

.field private final e:Lv5/i;

.field private final f:Lv5/w;

.field private final g:La6/f;

.field private final h:Lv5/a;

.field private final i:Lw5/c;

.field private final j:Ls5/a;

.field private final k:Lt5/a;

.field private final l:Lv5/e0;

.field private m:Lv5/q;

.field private n:Lc6/i;

.field final o:Ly4/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly4/j<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final p:Ly4/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly4/j<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final q:Ly4/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly4/j<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field final r:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lv5/j;->a:Lv5/j;

    sput-object v0, Lv5/k;->s:Ljava/io/FilenameFilter;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lv5/i;Lv5/w;Lv5/s;La6/f;Lv5/n;Lv5/a;Lw5/i;Lw5/c;Lv5/e0;Ls5/a;Lt5/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lv5/k;->n:Lc6/i;

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    iput-object v0, p0, Lv5/k;->o:Ly4/j;

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    iput-object v0, p0, Lv5/k;->p:Ly4/j;

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    iput-object v0, p0, Lv5/k;->q:Ly4/j;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lv5/k;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lv5/k;->a:Landroid/content/Context;

    iput-object p2, p0, Lv5/k;->e:Lv5/i;

    iput-object p3, p0, Lv5/k;->f:Lv5/w;

    iput-object p4, p0, Lv5/k;->b:Lv5/s;

    iput-object p5, p0, Lv5/k;->g:La6/f;

    iput-object p6, p0, Lv5/k;->c:Lv5/n;

    iput-object p7, p0, Lv5/k;->h:Lv5/a;

    iput-object p8, p0, Lv5/k;->d:Lw5/i;

    iput-object p9, p0, Lv5/k;->i:Lw5/c;

    iput-object p11, p0, Lv5/k;->j:Ls5/a;

    iput-object p12, p0, Lv5/k;->k:Lt5/a;

    iput-object p10, p0, Lv5/k;->l:Lv5/e0;

    return-void
.end method

.method private A(Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Finalizing native report for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/f;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lv5/k;->j:Ls5/a;

    invoke-interface {v0, p1}, Ls5/a;->a(Ljava/lang/String;)Ls5/g;

    move-result-object v0

    invoke-interface {v0}, Ls5/g;->d()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    new-instance v3, Lw5/c;

    iget-object v4, p0, Lv5/k;->g:La6/f;

    invoke-direct {v3, v4, p1}, Lw5/c;-><init>(La6/f;Ljava/lang/String;)V

    iget-object v4, p0, Lv5/k;->g:La6/f;

    invoke-virtual {v4, p1}, La6/f;->i(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v0, "Couldn\'t create directory to store native session files, aborting."

    invoke-virtual {p1, v0}, Ls5/f;->k(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-direct {p0, v1, v2}, Lv5/k;->y(J)V

    iget-object v1, p0, Lv5/k;->g:La6/f;

    invoke-virtual {v3}, Lw5/c;->b()[B

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Lv5/k;->F(Ls5/g;Ljava/lang/String;La6/f;[B)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0}, Lv5/a0;->b(Ljava/io/File;Ljava/util/List;)V

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v1

    const-string v2, "CrashlyticsController#finalizePreviousNativeSession"

    invoke-virtual {v1, v2}, Ls5/f;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lv5/k;->l:Lv5/e0;

    invoke-virtual {v1, p1, v0}, Lv5/e0;->h(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v3}, Lw5/c;->a()V

    return-void

    :cond_2
    :goto_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No minidump data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/f;->k(Ljava/lang/String;)V

    return-void
.end method

.method private static C()Z
    .locals 1

    :try_start_0
    const-string v0, "com.google.firebase.crash.FirebaseCrash"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method private D()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lv5/k;->l:Lv5/e0;

    invoke-virtual {v0}, Lv5/e0;->n()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static E()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lv5/k;->G(J)J

    move-result-wide v0

    return-wide v0
.end method

.method static F(Ls5/g;Ljava/lang/String;La6/f;[B)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls5/g;",
            "Ljava/lang/String;",
            "La6/f;",
            "[B)",
            "Ljava/util/List<",
            "Lv5/z;",
            ">;"
        }
    .end annotation

    const-string v0, "user-data"

    invoke-virtual {p2, p1, v0}, La6/f;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-string v1, "keys"

    invoke-virtual {p2, p1, v1}, La6/f;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lv5/f;

    const-string v3, "logs_file"

    const-string v4, "logs"

    invoke-direct {v2, v3, v4, p3}, Lv5/f;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lv5/v;

    invoke-interface {p0}, Ls5/g;->f()Ljava/io/File;

    move-result-object v2

    const-string v3, "crash_meta_file"

    const-string v4, "metadata"

    invoke-direct {p3, v3, v4, v2}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lv5/v;

    invoke-interface {p0}, Ls5/g;->e()Ljava/io/File;

    move-result-object v2

    const-string v3, "session_meta_file"

    const-string v4, "session"

    invoke-direct {p3, v3, v4, v2}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lv5/v;

    invoke-interface {p0}, Ls5/g;->a()Ljava/io/File;

    move-result-object v2

    const-string v3, "app_meta_file"

    const-string v4, "app"

    invoke-direct {p3, v3, v4, v2}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lv5/v;

    invoke-interface {p0}, Ls5/g;->c()Ljava/io/File;

    move-result-object v2

    const-string v3, "device_meta_file"

    const-string v4, "device"

    invoke-direct {p3, v3, v4, v2}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lv5/v;

    invoke-interface {p0}, Ls5/g;->b()Ljava/io/File;

    move-result-object v2

    const-string v3, "os_meta_file"

    const-string v4, "os"

    invoke-direct {p3, v3, v4, v2}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lv5/v;

    invoke-interface {p0}, Ls5/g;->d()Ljava/io/File;

    move-result-object p0

    const-string v2, "minidump_file"

    const-string v3, "minidump"

    invoke-direct {p3, v2, v3, p0}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lv5/v;

    const-string p3, "user_meta_file"

    const-string v2, "user"

    invoke-direct {p0, p3, v2, v0}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lv5/v;

    const-string p3, "keys_file"

    invoke-direct {p0, p3, v1, p1}, Lv5/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method private static G(J)J
    .locals 2

    const-wide/16 v0, 0x3e8

    div-long/2addr p0, v0

    return-wide p0
.end method

.method private static synthetic K(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    const-string p0, ".ae"

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private M(J)Ly4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lv5/k;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string p2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    invoke-virtual {p1, p2}, Ls5/f;->k(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Logging app exception event to Firebase Analytics"

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    new-instance v1, Lv5/k$h;

    invoke-direct {v1, p0, p1, p2}, Lv5/k$h;-><init>(Lv5/k;J)V

    invoke-static {v0, v1}, Ly4/l;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method private N()Ly4/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lv5/k;->L()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lv5/k;->M(J)Ly4/i;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not parse app exception timestamp from file "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls5/f;->k(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ly4/l;->f(Ljava/util/Collection;)Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method private V()Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/k;->b:Lv5/s;

    invoke-virtual {v0}, Lv5/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Automatic data collection is enabled. Allowing upload."

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lv5/k;->o:Ly4/j;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ly4/j;->e(Ljava/lang/Object;)Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Automatic data collection is disabled."

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Notifying that unsent reports are available."

    invoke-virtual {v0, v1}, Ls5/f;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lv5/k;->o:Ly4/j;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ly4/j;->e(Ljava/lang/Object;)Z

    iget-object v0, p0, Lv5/k;->b:Lv5/s;

    invoke-virtual {v0}, Lv5/s;->i()Ly4/i;

    move-result-object v0

    new-instance v1, Lv5/k$c;

    invoke-direct {v1, p0}, Lv5/k$c;-><init>(Lv5/k;)V

    invoke-virtual {v0, v1}, Ly4/i;->r(Ly4/h;)Ly4/i;

    move-result-object v0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v1

    const-string v2, "Waiting for send/deleteUnsentReports to be called."

    invoke-virtual {v1, v2}, Ls5/f;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lv5/k;->p:Ly4/j;

    invoke-virtual {v1}, Ly4/j;->a()Ly4/i;

    move-result-object v1

    invoke-static {v0, v1}, Lv5/j0;->k(Ly4/i;Ly4/i;)Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method private W(Ljava/lang/String;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lv5/k;->a:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lw5/c;

    iget-object v2, p0, Lv5/k;->g:La6/f;

    invoke-direct {v1, v2, p1}, Lw5/c;-><init>(La6/f;Ljava/lang/String;)V

    iget-object v2, p0, Lv5/k;->g:La6/f;

    iget-object v3, p0, Lv5/k;->e:Lv5/i;

    invoke-static {p1, v2, v3}, Lw5/i;->i(Ljava/lang/String;La6/f;Lv5/i;)Lw5/i;

    move-result-object v2

    iget-object v3, p0, Lv5/k;->l:Lv5/e0;

    invoke-virtual {v3, p1, v0, v1, v2}, Lv5/e0;->t(Ljava/lang/String;Ljava/util/List;Lw5/c;Lw5/i;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No ApplicationExitInfo available. Session: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/f;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANR feature enabled, but device is API "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls5/f;->i(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lv5/k;->K(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(J)J
    .locals 0

    invoke-static {p0, p1}, Lv5/k;->G(J)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic c(Lv5/k;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lv5/k;->D()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Lv5/k;->s(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e(Lv5/k;)Lw5/c;
    .locals 0

    iget-object p0, p0, Lv5/k;->i:Lw5/c;

    return-object p0
.end method

.method static synthetic f(Lv5/k;)Lt5/a;
    .locals 0

    iget-object p0, p0, Lv5/k;->k:Lt5/a;

    return-object p0
.end method

.method static synthetic g(Lv5/k;)Lv5/n;
    .locals 0

    iget-object p0, p0, Lv5/k;->c:Lv5/n;

    return-object p0
.end method

.method static synthetic h(Lv5/k;)Lv5/e0;
    .locals 0

    iget-object p0, p0, Lv5/k;->l:Lv5/e0;

    return-object p0
.end method

.method static synthetic i(Lv5/k;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv5/k;->y(J)V

    return-void
.end method

.method static synthetic j(Lv5/k;)Lv5/w;
    .locals 0

    iget-object p0, p0, Lv5/k;->f:Lv5/w;

    return-object p0
.end method

.method static synthetic k(Lv5/k;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lv5/k;->x(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic l(Lv5/k;)Lv5/s;
    .locals 0

    iget-object p0, p0, Lv5/k;->b:Lv5/s;

    return-object p0
.end method

.method static synthetic m(Lv5/k;)Lv5/i;
    .locals 0

    iget-object p0, p0, Lv5/k;->e:Lv5/i;

    return-object p0
.end method

.method static synthetic n(Lv5/k;)Ly4/i;
    .locals 0

    invoke-direct {p0}, Lv5/k;->N()Ly4/i;

    move-result-object p0

    return-object p0
.end method

.method private static p(Lv5/w;Lv5/a;)Lx5/d0$a;
    .locals 6

    invoke-virtual {p0}, Lv5/w;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lv5/a;->f:Ljava/lang/String;

    iget-object v2, p1, Lv5/a;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lv5/w;->a()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p1, Lv5/a;->d:Ljava/lang/String;

    invoke-static {p0}, Lv5/t;->e(Ljava/lang/String;)Lv5/t;

    move-result-object p0

    invoke-virtual {p0}, Lv5/t;->g()I

    move-result v4

    iget-object v5, p1, Lv5/a;->h:Ls5/e;

    invoke-static/range {v0 .. v5}, Lx5/d0$a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILs5/e;)Lx5/d0$a;

    move-result-object p0

    return-object p0
.end method

.method private static q()Lx5/d0$b;
    .locals 16

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v3, v0

    mul-long v10, v1, v3

    invoke-static {}, Lv5/h;->m()I

    move-result v5

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    invoke-static {}, Lv5/h;->t()J

    move-result-wide v8

    invoke-static {}, Lv5/h;->z()Z

    move-result v12

    invoke-static {}, Lv5/h;->n()I

    move-result v13

    sget-object v14, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v15, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static/range {v5 .. v15}, Lx5/d0$b;->c(ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)Lx5/d0$b;

    move-result-object v0

    return-object v0
.end method

.method private static r()Lx5/d0$c;
    .locals 3

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {}, Lv5/h;->A()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lx5/d0$c;->a(Ljava/lang/String;Ljava/lang/String;Z)Lx5/d0$c;

    move-result-object v0

    return-object v0
.end method

.method private static s(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private w(ZLc6/i;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lv5/k;->l:Lv5/e0;

    invoke-virtual {v1}, Lv5/e0;->n()Ljava/util/SortedSet;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, p1, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string p2, "No open sessions to be closed."

    invoke-virtual {p1, p2}, Ls5/f;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2}, Lc6/i;->b()Lc6/d;

    move-result-object p2

    iget-object p2, p2, Lc6/d;->b:Lc6/d$a;

    iget-boolean p2, p2, Lc6/d$a;->b:Z

    if-eqz p2, :cond_1

    invoke-direct {p0, v1}, Lv5/k;->W(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p2

    const-string v2, "ANR feature disabled."

    invoke-virtual {p2, v2}, Ls5/f;->i(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Lv5/k;->j:Ls5/a;

    invoke-interface {p2, v1}, Ls5/a;->d(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, v1}, Lv5/k;->A(Ljava/lang/String;)V

    :cond_2
    const/4 p2, 0x0

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    :cond_3
    iget-object p1, p0, Lv5/k;->l:Lv5/e0;

    invoke-static {}, Lv5/k;->E()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2}, Lv5/e0;->i(JLjava/lang/String;)V

    return-void
.end method

.method private x(Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Lv5/k;->E()J

    move-result-wide v6

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Opening a new session with ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lv5/m;->l()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Crashlytics Android SDK/%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lv5/k;->f:Lv5/w;

    iget-object v1, p0, Lv5/k;->h:Lv5/a;

    invoke-static {v0, v1}, Lv5/k;->p(Lv5/w;Lv5/a;)Lx5/d0$a;

    move-result-object v0

    invoke-static {}, Lv5/k;->r()Lx5/d0$c;

    move-result-object v1

    invoke-static {}, Lv5/k;->q()Lx5/d0$b;

    move-result-object v3

    iget-object v4, p0, Lv5/k;->j:Ls5/a;

    invoke-static {v0, v1, v3}, Lx5/d0;->b(Lx5/d0$a;Lx5/d0$c;Lx5/d0$b;)Lx5/d0;

    move-result-object v5

    move-object v0, v4

    move-object v1, p1

    move-wide v3, v6

    invoke-interface/range {v0 .. v5}, Ls5/a;->c(Ljava/lang/String;Ljava/lang/String;JLx5/d0;)V

    iget-object v0, p0, Lv5/k;->i:Lw5/c;

    invoke-virtual {v0, p1}, Lw5/c;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lv5/k;->l:Lv5/e0;

    invoke-virtual {v0, p1, v6, v7}, Lv5/e0;->o(Ljava/lang/String;J)V

    return-void
.end method

.method private y(J)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lv5/k;->g:La6/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ".ae"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, La6/f;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Create new file failed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p2

    const-string v0, "Could not create app exception marker file."

    invoke-virtual {p2, v0, p1}, Ls5/f;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method B(Lc6/i;)Z
    .locals 3

    iget-object v0, p0, Lv5/k;->e:Lv5/i;

    invoke-virtual {v0}, Lv5/i;->b()V

    invoke-virtual {p0}, Lv5/k;->J()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v0, "Skipping session finalization because a crash has already occurred."

    invoke-virtual {p1, v0}, Ls5/f;->k(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v2, "Finalizing previously open sessions."

    invoke-virtual {v0, v2}, Ls5/f;->i(Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0, p1}, Lv5/k;->w(ZLc6/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v1, "Closed all previously open sessions."

    invoke-virtual {p1, v1}, Ls5/f;->i(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception p1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v2, "Unable to finalize previously open sessions."

    invoke-virtual {v0, v2, p1}, Ls5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method

.method H(Lc6/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lv5/k;->I(Lc6/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method declared-synchronized I(Lc6/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
    .locals 10

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handling uncaught exception \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\" from thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Lv5/k;->e:Lv5/i;

    new-instance v1, Lv5/k$b;

    move-object v2, v1

    move-object v3, p0

    move-object v6, p3

    move-object v7, p2

    move-object v8, p1

    move v9, p4

    invoke-direct/range {v2 .. v9}, Lv5/k$b;-><init>(Lv5/k;JLjava/lang/Throwable;Ljava/lang/Thread;Lc6/i;Z)V

    invoke-virtual {v0, v1}, Lv5/i;->i(Ljava/util/concurrent/Callable;)Ly4/i;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, Lv5/j0;->d(Ly4/i;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p2

    const-string p3, "Error handling uncaught exception"

    invoke-virtual {p2, p3, p1}, Ls5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string p2, "Cannot send reports. Timed out while fetching settings."

    invoke-virtual {p1, p2}, Ls5/f;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method J()Z
    .locals 1

    iget-object v0, p0, Lv5/k;->m:Lv5/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lv5/q;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method L()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/k;->g:La6/f;

    sget-object v1, Lv5/k;->s:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v1}, La6/f;->f(Ljava/io/FilenameFilter;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method O(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lv5/k;->n:Lc6/i;

    if-nez v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string p2, "settingsProvider not set"

    invoke-virtual {p1, p2}, Ls5/f;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, p2, v1}, Lv5/k;->I(Lc6/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method P(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lv5/k;->e:Lv5/i;

    new-instance v1, Lv5/k$g;

    invoke-direct {v1, p0, p1}, Lv5/k$g;-><init>(Lv5/k;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lv5/i;->h(Ljava/util/concurrent/Callable;)Ly4/i;

    return-void
.end method

.method Q()Ly4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/k;->p:Ly4/j;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ly4/j;->e(Ljava/lang/Object;)Z

    iget-object v0, p0, Lv5/k;->q:Ly4/j;

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method R(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lv5/k;->d:Lw5/i;

    invoke-virtual {v0, p1, p2}, Lw5/i;->l(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lv5/k;->a:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-static {p2}, Lv5/h;->x(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string p2, "Attempting to set custom attribute with null key, ignoring."

    invoke-virtual {p1, p2}, Ls5/f;->d(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method S(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lv5/k;->d:Lw5/i;

    invoke-virtual {v0, p1, p2}, Lw5/i;->m(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lv5/k;->a:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-static {p2}, Lv5/h;->x(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string p2, "Attempting to set custom attribute with null key, ignoring."

    invoke-virtual {p1, p2}, Ls5/f;->d(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method T(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv5/k;->d:Lw5/i;

    invoke-virtual {v0, p1}, Lw5/i;->n(Ljava/lang/String;)V

    return-void
.end method

.method U(Ly4/i;)Ly4/i;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TaskMainThread"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/i<",
            "Lc6/d;",
            ">;)",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/k;->l:Lv5/e0;

    invoke-virtual {v0}, Lv5/e0;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v0, "No crash reports are available to be sent."

    invoke-virtual {p1, v0}, Ls5/f;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lv5/k;->o:Ly4/j;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ly4/j;->e(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Crash reports are available to be sent."

    invoke-virtual {v0, v1}, Ls5/f;->i(Ljava/lang/String;)V

    invoke-direct {p0}, Lv5/k;->V()Ly4/i;

    move-result-object v0

    new-instance v1, Lv5/k$d;

    invoke-direct {v1, p0, p1}, Lv5/k$d;-><init>(Lv5/k;Ly4/i;)V

    invoke-virtual {v0, v1}, Ly4/i;->r(Ly4/h;)Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method X(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v6, p0, Lv5/k;->e:Lv5/i;

    new-instance v7, Lv5/k$f;

    move-object v0, v7

    move-object v1, p0

    move-object v4, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lv5/k$f;-><init>(Lv5/k;JLjava/lang/Throwable;Ljava/lang/Thread;)V

    invoke-virtual {v6, v7}, Lv5/i;->g(Ljava/lang/Runnable;)Ly4/i;

    return-void
.end method

.method Y(JLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lv5/k;->e:Lv5/i;

    new-instance v1, Lv5/k$e;

    invoke-direct {v1, p0, p1, p2, p3}, Lv5/k$e;-><init>(Lv5/k;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lv5/i;->h(Ljava/util/concurrent/Callable;)Ly4/i;

    return-void
.end method

.method o()Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/k;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "checkForUnsentReports should only be called once per execution."

    invoke-virtual {v0, v1}, Ls5/f;->k(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lv5/k;->o:Ly4/j;

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method t()Ly4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/k;->p:Ly4/j;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ly4/j;->e(Ljava/lang/Object;)Z

    iget-object v0, p0, Lv5/k;->q:Ly4/j;

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method u()Z
    .locals 3

    iget-object v0, p0, Lv5/k;->c:Lv5/n;

    invoke-virtual {v0}, Lv5/n;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lv5/k;->D()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lv5/k;->j:Ls5/a;

    invoke-interface {v2, v0}, Ls5/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v2, "Found previous crash marker."

    invoke-virtual {v0, v2}, Ls5/f;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lv5/k;->c:Lv5/n;

    invoke-virtual {v0}, Lv5/n;->d()Z

    return v1
.end method

.method v(Lc6/i;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lv5/k;->w(ZLc6/i;)V

    return-void
.end method

.method z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lc6/i;)V
    .locals 2

    iput-object p3, p0, Lv5/k;->n:Lc6/i;

    invoke-virtual {p0, p1}, Lv5/k;->P(Ljava/lang/String;)V

    new-instance p1, Lv5/k$a;

    invoke-direct {p1, p0}, Lv5/k$a;-><init>(Lv5/k;)V

    new-instance v0, Lv5/q;

    iget-object v1, p0, Lv5/k;->j:Ls5/a;

    invoke-direct {v0, p1, p3, p2, v1}, Lv5/q;-><init>(Lv5/q$a;Lc6/i;Ljava/lang/Thread$UncaughtExceptionHandler;Ls5/a;)V

    iput-object v0, p0, Lv5/k;->m:Lv5/q;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method
