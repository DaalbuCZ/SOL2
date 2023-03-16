.class public Lk8/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll8/k;

.field private b:Lz7/a;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ll8/k$d;",
            ">;>;"
        }
    .end annotation
.end field

.field final d:Ll8/k$c;


# direct methods
.method public constructor <init>(Ly7/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk8/b$a;

    invoke-direct {v0, p0}, Lk8/b$a;-><init>(Lk8/b;)V

    iput-object v0, p0, Lk8/b;->d:Ll8/k$c;

    new-instance v1, Ll8/k;

    sget-object v2, Ll8/s;->b:Ll8/s;

    const-string v3, "flutter/deferredcomponent"

    invoke-direct {v1, p1, v3, v2}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;)V

    iput-object v1, p0, Lk8/b;->a:Ll8/k;

    invoke-virtual {v1, v0}, Ll8/k;->e(Ll8/k$c;)V

    invoke-static {}, Lx7/a;->e()Lx7/a;

    move-result-object p1

    invoke-virtual {p1}, Lx7/a;->a()Lz7/a;

    move-result-object p1

    iput-object p1, p0, Lk8/b;->b:Lz7/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lk8/b;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lk8/b;)Lz7/a;
    .locals 0

    iget-object p0, p0, Lk8/b;->b:Lz7/a;

    return-object p0
.end method

.method static synthetic b(Lk8/b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lk8/b;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public c(Lz7/a;)V
    .locals 0

    iput-object p1, p0, Lk8/b;->b:Lz7/a;

    return-void
.end method
