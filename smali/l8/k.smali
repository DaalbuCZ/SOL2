.class public Ll8/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/k$a;,
        Ll8/k$b;,
        Ll8/k$d;,
        Ll8/k$c;
    }
.end annotation


# instance fields
.field private final a:Ll8/c;

.field private final b:Ljava/lang/String;

.field private final c:Ll8/l;

.field private final d:Ll8/c$c;


# direct methods
.method public constructor <init>(Ll8/c;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ll8/s;->b:Ll8/s;

    invoke-direct {p0, p1, p2, v0}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;)V

    return-void
.end method

.method public constructor <init>(Ll8/c;Ljava/lang/String;Ll8/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;Ll8/c$c;)V

    return-void
.end method

.method public constructor <init>(Ll8/c;Ljava/lang/String;Ll8/l;Ll8/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll8/k;->a:Ll8/c;

    iput-object p2, p0, Ll8/k;->b:Ljava/lang/String;

    iput-object p3, p0, Ll8/k;->c:Ll8/l;

    iput-object p4, p0, Ll8/k;->d:Ll8/c$c;

    return-void
.end method

.method static synthetic a(Ll8/k;)Ll8/l;
    .locals 0

    iget-object p0, p0, Ll8/k;->c:Ll8/l;

    return-object p0
.end method

.method static synthetic b(Ll8/k;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ll8/k;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Ll8/k;->d(Ljava/lang/String;Ljava/lang/Object;Ll8/k$d;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;Ll8/k$d;)V
    .locals 4

    iget-object v0, p0, Ll8/k;->a:Ll8/c;

    iget-object v1, p0, Ll8/k;->b:Ljava/lang/String;

    iget-object v2, p0, Ll8/k;->c:Ll8/l;

    new-instance v3, Ll8/j;

    invoke-direct {v3, p1, p2}, Ll8/j;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ll8/l;->a(Ll8/j;)Ljava/nio/ByteBuffer;

    move-result-object p1

    if-nez p3, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Ll8/k$b;

    invoke-direct {p2, p0, p3}, Ll8/k$b;-><init>(Ll8/k;Ll8/k$d;)V

    :goto_0
    invoke-interface {v0, v1, p1, p2}, Ll8/c;->h(Ljava/lang/String;Ljava/nio/ByteBuffer;Ll8/c$b;)V

    return-void
.end method

.method public e(Ll8/k$c;)V
    .locals 3

    iget-object v0, p0, Ll8/k;->d:Ll8/c$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll8/k;->a:Ll8/c;

    iget-object v2, p0, Ll8/k;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ll8/k$a;

    invoke-direct {v1, p0, p1}, Ll8/k$a;-><init>(Ll8/k;Ll8/k$c;)V

    :goto_0
    iget-object p1, p0, Ll8/k;->d:Ll8/c$c;

    invoke-interface {v0, v2, v1, p1}, Ll8/c;->c(Ljava/lang/String;Ll8/c$a;Ll8/c$c;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Ll8/k;->a:Ll8/c;

    iget-object v2, p0, Ll8/k;->b:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ll8/k$a;

    invoke-direct {v1, p0, p1}, Ll8/k$a;-><init>(Ll8/k;Ll8/k$c;)V

    :goto_1
    invoke-interface {v0, v2, v1}, Ll8/c;->f(Ljava/lang/String;Ll8/c$a;)V

    :goto_2
    return-void
.end method
