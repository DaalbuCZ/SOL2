.class public Ls8/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lt8/k;

.field private b:Lh8/a;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lt8/k$d;",
            ">;>;"
        }
    .end annotation
.end field

.field final d:Lt8/k$c;


# direct methods
.method public constructor <init>(Lg8/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls8/b$a;

    invoke-direct {v0, p0}, Ls8/b$a;-><init>(Ls8/b;)V

    iput-object v0, p0, Ls8/b;->d:Lt8/k$c;

    new-instance v1, Lt8/k;

    sget-object v2, Lt8/s;->b:Lt8/s;

    const-string v3, "flutter/deferredcomponent"

    invoke-direct {v1, p1, v3, v2}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;Lt8/l;)V

    iput-object v1, p0, Ls8/b;->a:Lt8/k;

    invoke-virtual {v1, v0}, Lt8/k;->e(Lt8/k$c;)V

    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object p1

    invoke-virtual {p1}, Lf8/a;->a()Lh8/a;

    move-result-object p1

    iput-object p1, p0, Ls8/b;->b:Lh8/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ls8/b;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Ls8/b;)Lh8/a;
    .locals 0

    iget-object p0, p0, Ls8/b;->b:Lh8/a;

    return-object p0
.end method

.method static synthetic b(Ls8/b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ls8/b;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public c(Lh8/a;)V
    .locals 0

    iput-object p1, p0, Ls8/b;->b:Lh8/a;

    return-void
.end method
