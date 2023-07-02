.class public Lt8/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/k$a;,
        Lt8/k$b;,
        Lt8/k$d;,
        Lt8/k$c;
    }
.end annotation


# instance fields
.field private final a:Lt8/c;

.field private final b:Ljava/lang/String;

.field private final c:Lt8/l;

.field private final d:Lt8/c$c;


# direct methods
.method public constructor <init>(Lt8/c;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lt8/s;->b:Lt8/s;

    invoke-direct {p0, p1, p2, v0}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;Lt8/l;)V

    return-void
.end method

.method public constructor <init>(Lt8/c;Ljava/lang/String;Lt8/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;Lt8/l;Lt8/c$c;)V

    return-void
.end method

.method public constructor <init>(Lt8/c;Ljava/lang/String;Lt8/l;Lt8/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/k;->a:Lt8/c;

    iput-object p2, p0, Lt8/k;->b:Ljava/lang/String;

    iput-object p3, p0, Lt8/k;->c:Lt8/l;

    iput-object p4, p0, Lt8/k;->d:Lt8/c$c;

    return-void
.end method

.method static synthetic a(Lt8/k;)Lt8/l;
    .locals 0

    iget-object p0, p0, Lt8/k;->c:Lt8/l;

    return-object p0
.end method

.method static synthetic b(Lt8/k;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt8/k;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lt8/k;->d(Ljava/lang/String;Ljava/lang/Object;Lt8/k$d;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;Lt8/k$d;)V
    .locals 4

    iget-object v0, p0, Lt8/k;->a:Lt8/c;

    iget-object v1, p0, Lt8/k;->b:Ljava/lang/String;

    iget-object v2, p0, Lt8/k;->c:Lt8/l;

    new-instance v3, Lt8/j;

    invoke-direct {v3, p1, p2}, Lt8/j;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lt8/l;->f(Lt8/j;)Ljava/nio/ByteBuffer;

    move-result-object p1

    if-nez p3, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Lt8/k$b;

    invoke-direct {p2, p0, p3}, Lt8/k$b;-><init>(Lt8/k;Lt8/k$d;)V

    :goto_0
    invoke-interface {v0, v1, p1, p2}, Lt8/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lt8/c$b;)V

    return-void
.end method

.method public e(Lt8/k$c;)V
    .locals 3

    iget-object v0, p0, Lt8/k;->d:Lt8/c$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt8/k;->a:Lt8/c;

    iget-object v2, p0, Lt8/k;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lt8/k$a;

    invoke-direct {v1, p0, p1}, Lt8/k$a;-><init>(Lt8/k;Lt8/k$c;)V

    :goto_0
    iget-object p1, p0, Lt8/k;->d:Lt8/c$c;

    invoke-interface {v0, v2, v1, p1}, Lt8/c;->b(Ljava/lang/String;Lt8/c$a;Lt8/c$c;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lt8/k;->a:Lt8/c;

    iget-object v2, p0, Lt8/k;->b:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lt8/k$a;

    invoke-direct {v1, p0, p1}, Lt8/k$a;-><init>(Lt8/k;Lt8/k$c;)V

    :goto_1
    invoke-interface {v0, v2, v1}, Lt8/c;->e(Ljava/lang/String;Lt8/c$a;)V

    :goto_2
    return-void
.end method
