.class public final Lz3/p;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static b:Lz3/p;

.field private static final c:Lz3/q;


# instance fields
.field private a:Lz3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lz3/q;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lz3/q;-><init>(IZZII)V

    sput-object v6, Lz3/p;->c:Lz3/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()Lz3/p;
    .locals 2

    const-class v0, Lz3/p;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz3/p;->b:Lz3/p;

    if-nez v1, :cond_0

    new-instance v1, Lz3/p;

    invoke-direct {v1}, Lz3/p;-><init>()V

    sput-object v1, Lz3/p;->b:Lz3/p;

    :cond_0
    sget-object v1, Lz3/p;->b:Lz3/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()Lz3/q;
    .locals 1

    iget-object v0, p0, Lz3/p;->a:Lz3/q;

    return-object v0
.end method

.method public final declared-synchronized c(Lz3/q;)V
    .locals 2

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    sget-object p1, Lz3/p;->c:Lz3/q;

    iput-object p1, p0, Lz3/p;->a:Lz3/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lz3/p;->a:Lz3/q;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lz3/q;->C()I

    move-result v0

    invoke-virtual {p1}, Lz3/q;->C()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ge v0, v1, :cond_1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :goto_0
    :try_start_2
    iput-object p1, p0, Lz3/p;->a:Lz3/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method