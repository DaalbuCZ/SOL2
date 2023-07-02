.class public Ls8/l;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Z

.field private b:[B

.field private c:Lt8/k;

.field private d:Lt8/k$d;

.field private e:Z

.field private f:Z

.field private final g:Lt8/k$c;


# direct methods
.method public constructor <init>(Lg8/a;Z)V
    .locals 3

    new-instance v0, Lt8/k;

    sget-object v1, Lt8/s;->b:Lt8/s;

    const-string v2, "flutter/restoration"

    invoke-direct {v0, p1, v2, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;Lt8/l;)V

    invoke-direct {p0, v0, p2}, Ls8/l;-><init>(Lt8/k;Z)V

    return-void
.end method

.method constructor <init>(Lt8/k;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls8/l;->e:Z

    iput-boolean v0, p0, Ls8/l;->f:Z

    new-instance v0, Ls8/l$b;

    invoke-direct {v0, p0}, Ls8/l$b;-><init>(Ls8/l;)V

    iput-object v0, p0, Ls8/l;->g:Lt8/k$c;

    iput-object p1, p0, Ls8/l;->c:Lt8/k;

    iput-boolean p2, p0, Ls8/l;->a:Z

    invoke-virtual {p1, v0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method static synthetic a(Ls8/l;)[B
    .locals 0

    iget-object p0, p0, Ls8/l;->b:[B

    return-object p0
.end method

.method static synthetic b(Ls8/l;[B)[B
    .locals 0

    iput-object p1, p0, Ls8/l;->b:[B

    return-object p1
.end method

.method static synthetic c(Ls8/l;Z)Z
    .locals 0

    iput-boolean p1, p0, Ls8/l;->f:Z

    return p1
.end method

.method static synthetic d(Ls8/l;)Z
    .locals 0

    iget-boolean p0, p0, Ls8/l;->e:Z

    return p0
.end method

.method static synthetic e(Ls8/l;[B)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1}, Ls8/l;->i([B)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Ls8/l;Lt8/k$d;)Lt8/k$d;
    .locals 0

    iput-object p1, p0, Ls8/l;->d:Lt8/k$d;

    return-object p1
.end method

.method private i([B)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "enabled"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "data"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ls8/l;->b:[B

    return-void
.end method

.method public h()[B
    .locals 1

    iget-object v0, p0, Ls8/l;->b:[B

    return-object v0
.end method

.method public j([B)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls8/l;->e:Z

    iget-object v0, p0, Ls8/l;->d:Lt8/k$d;

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Ls8/l;->i([B)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lt8/k$d;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ls8/l;->d:Lt8/k$d;

    :cond_0
    iput-object p1, p0, Ls8/l;->b:[B

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Ls8/l;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls8/l;->c:Lt8/k;

    invoke-direct {p0, p1}, Ls8/l;->i([B)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ls8/l$a;

    invoke-direct {v2, p0, p1}, Ls8/l$a;-><init>(Ls8/l;[B)V

    const-string p1, "push"

    invoke-virtual {v0, p1, v1, v2}, Lt8/k;->d(Ljava/lang/String;Ljava/lang/Object;Lt8/k$d;)V

    :goto_0
    return-void
.end method
