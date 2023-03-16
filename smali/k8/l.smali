.class public Lk8/l;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Z

.field private b:[B

.field private c:Ll8/k;

.field private d:Ll8/k$d;

.field private e:Z

.field private f:Z

.field private final g:Ll8/k$c;


# direct methods
.method constructor <init>(Ll8/k;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk8/l;->e:Z

    iput-boolean v0, p0, Lk8/l;->f:Z

    new-instance v0, Lk8/l$b;

    invoke-direct {v0, p0}, Lk8/l$b;-><init>(Lk8/l;)V

    iput-object v0, p0, Lk8/l;->g:Ll8/k$c;

    iput-object p1, p0, Lk8/l;->c:Ll8/k;

    iput-boolean p2, p0, Lk8/l;->a:Z

    invoke-virtual {p1, v0}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method public constructor <init>(Ly7/a;Z)V
    .locals 3

    new-instance v0, Ll8/k;

    sget-object v1, Ll8/s;->b:Ll8/s;

    const-string v2, "flutter/restoration"

    invoke-direct {v0, p1, v2, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;)V

    invoke-direct {p0, v0, p2}, Lk8/l;-><init>(Ll8/k;Z)V

    return-void
.end method

.method static synthetic a(Lk8/l;)[B
    .locals 0

    iget-object p0, p0, Lk8/l;->b:[B

    return-object p0
.end method

.method static synthetic b(Lk8/l;[B)[B
    .locals 0

    iput-object p1, p0, Lk8/l;->b:[B

    return-object p1
.end method

.method static synthetic c(Lk8/l;Z)Z
    .locals 0

    iput-boolean p1, p0, Lk8/l;->f:Z

    return p1
.end method

.method static synthetic d(Lk8/l;)Z
    .locals 0

    iget-boolean p0, p0, Lk8/l;->e:Z

    return p0
.end method

.method static synthetic e(Lk8/l;[B)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1}, Lk8/l;->i([B)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lk8/l;Ll8/k$d;)Ll8/k$d;
    .locals 0

    iput-object p1, p0, Lk8/l;->d:Ll8/k$d;

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

    iput-object v0, p0, Lk8/l;->b:[B

    return-void
.end method

.method public h()[B
    .locals 1

    iget-object v0, p0, Lk8/l;->b:[B

    return-object v0
.end method

.method public j([B)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk8/l;->e:Z

    iget-object v0, p0, Lk8/l;->d:Ll8/k$d;

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lk8/l;->i([B)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ll8/k$d;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lk8/l;->d:Ll8/k$d;

    :cond_0
    iput-object p1, p0, Lk8/l;->b:[B

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lk8/l;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk8/l;->c:Ll8/k;

    invoke-direct {p0, p1}, Lk8/l;->i([B)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lk8/l$a;

    invoke-direct {v2, p0, p1}, Lk8/l$a;-><init>(Lk8/l;[B)V

    const-string p1, "push"

    invoke-virtual {v0, p1, v1, v2}, Ll8/k;->d(Ljava/lang/String;Ljava/lang/Object;Ll8/k$d;)V

    :goto_0
    return-void
.end method
