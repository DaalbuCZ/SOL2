.class public Lv0/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static e:Lv0/g;


# instance fields
.field private a:Lv0/a;

.field private b:Lv0/b;

.field private c:Lv0/e;

.field private d:Lv0/f;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lz0/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lv0/a;

    invoke-direct {v0, p1, p2}, Lv0/a;-><init>(Landroid/content/Context;Lz0/a;)V

    iput-object v0, p0, Lv0/g;->a:Lv0/a;

    new-instance v0, Lv0/b;

    invoke-direct {v0, p1, p2}, Lv0/b;-><init>(Landroid/content/Context;Lz0/a;)V

    iput-object v0, p0, Lv0/g;->b:Lv0/b;

    new-instance v0, Lv0/e;

    invoke-direct {v0, p1, p2}, Lv0/e;-><init>(Landroid/content/Context;Lz0/a;)V

    iput-object v0, p0, Lv0/g;->c:Lv0/e;

    new-instance v0, Lv0/f;

    invoke-direct {v0, p1, p2}, Lv0/f;-><init>(Landroid/content/Context;Lz0/a;)V

    iput-object v0, p0, Lv0/g;->d:Lv0/f;

    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;Lz0/a;)Lv0/g;
    .locals 2

    const-class v0, Lv0/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lv0/g;->e:Lv0/g;

    if-nez v1, :cond_0

    new-instance v1, Lv0/g;

    invoke-direct {v1, p0, p1}, Lv0/g;-><init>(Landroid/content/Context;Lz0/a;)V

    sput-object v1, Lv0/g;->e:Lv0/g;

    :cond_0
    sget-object p0, Lv0/g;->e:Lv0/g;
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
.method public a()Lv0/a;
    .locals 1

    iget-object v0, p0, Lv0/g;->a:Lv0/a;

    return-object v0
.end method

.method public b()Lv0/b;
    .locals 1

    iget-object v0, p0, Lv0/g;->b:Lv0/b;

    return-object v0
.end method

.method public d()Lv0/e;
    .locals 1

    iget-object v0, p0, Lv0/g;->c:Lv0/e;

    return-object v0
.end method

.method public e()Lv0/f;
    .locals 1

    iget-object v0, p0, Lv0/g;->d:Lv0/f;

    return-object v0
.end method
