.class public Lq0/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static e:Lq0/g;


# instance fields
.field private a:Lq0/a;

.field private b:Lq0/b;

.field private c:Lq0/e;

.field private d:Lq0/f;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lu0/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lq0/a;

    invoke-direct {v0, p1, p2}, Lq0/a;-><init>(Landroid/content/Context;Lu0/a;)V

    iput-object v0, p0, Lq0/g;->a:Lq0/a;

    new-instance v0, Lq0/b;

    invoke-direct {v0, p1, p2}, Lq0/b;-><init>(Landroid/content/Context;Lu0/a;)V

    iput-object v0, p0, Lq0/g;->b:Lq0/b;

    new-instance v0, Lq0/e;

    invoke-direct {v0, p1, p2}, Lq0/e;-><init>(Landroid/content/Context;Lu0/a;)V

    iput-object v0, p0, Lq0/g;->c:Lq0/e;

    new-instance v0, Lq0/f;

    invoke-direct {v0, p1, p2}, Lq0/f;-><init>(Landroid/content/Context;Lu0/a;)V

    iput-object v0, p0, Lq0/g;->d:Lq0/f;

    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;Lu0/a;)Lq0/g;
    .locals 2

    const-class v0, Lq0/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lq0/g;->e:Lq0/g;

    if-nez v1, :cond_0

    new-instance v1, Lq0/g;

    invoke-direct {v1, p0, p1}, Lq0/g;-><init>(Landroid/content/Context;Lu0/a;)V

    sput-object v1, Lq0/g;->e:Lq0/g;

    :cond_0
    sget-object p0, Lq0/g;->e:Lq0/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a()Lq0/a;
    .locals 1

    iget-object v0, p0, Lq0/g;->a:Lq0/a;

    return-object v0
.end method

.method public b()Lq0/b;
    .locals 1

    iget-object v0, p0, Lq0/g;->b:Lq0/b;

    return-object v0
.end method

.method public d()Lq0/e;
    .locals 1

    iget-object v0, p0, Lq0/g;->c:Lq0/e;

    return-object v0
.end method

.method public e()Lq0/f;
    .locals 1

    iget-object v0, p0, Lq0/g;->d:Lq0/f;

    return-object v0
.end method
