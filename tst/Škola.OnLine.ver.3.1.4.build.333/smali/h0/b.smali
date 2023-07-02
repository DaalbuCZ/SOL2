.class Lh0/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh0/b$a;
    }
.end annotation


# instance fields
.field private final n:Landroid/content/Context;

.field private final o:Ljava/lang/String;

.field private final p:Lg0/c$a;

.field private final q:Z

.field private final r:Ljava/lang/Object;

.field private s:Lh0/b$a;

.field private t:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lg0/c$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/b;->n:Landroid/content/Context;

    iput-object p2, p0, Lh0/b;->o:Ljava/lang/String;

    iput-object p3, p0, Lh0/b;->p:Lg0/c$a;

    iput-boolean p4, p0, Lh0/b;->q:Z

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/b;->r:Ljava/lang/Object;

    return-void
.end method

.method private a()Lh0/b$a;
    .locals 7

    iget-object v0, p0, Lh0/b;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh0/b;->s:Lh0/b$a;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Lh0/a;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    iget-object v3, p0, Lh0/b;->o:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Lh0/b;->q:Z

    if-eqz v3, :cond_0

    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lh0/b;->n:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v4

    iget-object v5, p0, Lh0/b;->o:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v4, Lh0/b$a;

    iget-object v5, p0, Lh0/b;->n:Landroid/content/Context;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    iget-object v6, p0, Lh0/b;->p:Lg0/c$a;

    invoke-direct {v4, v5, v3, v1, v6}, Lh0/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lh0/a;Lg0/c$a;)V

    iput-object v4, p0, Lh0/b;->s:Lh0/b$a;

    goto :goto_0

    :cond_0
    new-instance v3, Lh0/b$a;

    iget-object v4, p0, Lh0/b;->n:Landroid/content/Context;

    iget-object v5, p0, Lh0/b;->o:Ljava/lang/String;

    iget-object v6, p0, Lh0/b;->p:Lg0/c$a;

    invoke-direct {v3, v4, v5, v1, v6}, Lh0/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lh0/a;Lg0/c$a;)V

    iput-object v3, p0, Lh0/b;->s:Lh0/b$a;

    :goto_0
    const/16 v1, 0x10

    if-lt v2, v1, :cond_1

    iget-object v1, p0, Lh0/b;->s:Lh0/b$a;

    iget-boolean v2, p0, Lh0/b;->t:Z

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    :cond_1
    iget-object v1, p0, Lh0/b;->s:Lh0/b$a;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public R()Lg0/b;
    .locals 1

    invoke-direct {p0}, Lh0/b;->a()Lh0/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lh0/b$a;->c()Lg0/b;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    invoke-direct {p0}, Lh0/b;->a()Lh0/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lh0/b$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh0/b;->o:Ljava/lang/String;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 2

    iget-object v0, p0, Lh0/b;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh0/b;->s:Lh0/b$a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    :cond_0
    iput-boolean p1, p0, Lh0/b;->t:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
