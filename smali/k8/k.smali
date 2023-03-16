.class public Lk8/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/k$f;,
        Lk8/k$b;,
        Lk8/k$c;,
        Lk8/k$e;,
        Lk8/k$d;,
        Lk8/k$g;
    }
.end annotation


# instance fields
.field private final a:Ll8/k;

.field private b:Lk8/k$g;

.field private final c:Ll8/k$c;


# direct methods
.method public constructor <init>(Ly7/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk8/k$a;

    invoke-direct {v0, p0}, Lk8/k$a;-><init>(Lk8/k;)V

    iput-object v0, p0, Lk8/k;->c:Ll8/k$c;

    new-instance v1, Ll8/k;

    sget-object v2, Ll8/s;->b:Ll8/s;

    const-string v3, "flutter/platform_views"

    invoke-direct {v1, p1, v3, v2}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;)V

    iput-object v1, p0, Lk8/k;->a:Ll8/k;

    invoke-virtual {v1, v0}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method static synthetic a(Lk8/k;)Lk8/k$g;
    .locals 0

    iget-object p0, p0, Lk8/k;->b:Lk8/k$g;

    return-object p0
.end method

.method static synthetic b(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lk8/k;->c(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lx7/b;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(I)V
    .locals 2

    iget-object v0, p0, Lk8/k;->a:Ll8/k;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "viewFocused"

    invoke-virtual {v0, v1, p1}, Ll8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lk8/k$g;)V
    .locals 0

    iput-object p1, p0, Lk8/k;->b:Lk8/k$g;

    return-void
.end method
