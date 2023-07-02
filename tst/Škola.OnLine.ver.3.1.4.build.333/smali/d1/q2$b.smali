.class public Ld1/q2$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/q2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Throwable;

.field private b:Ljava/lang/Thread;

.field private c:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic e(Ld1/q2$b;)Ljava/lang/Thread;
    .locals 0

    iget-object p0, p0, Ld1/q2$b;->b:Ljava/lang/Thread;

    return-object p0
.end method

.method static synthetic f(Ld1/q2$b;)Ljava/lang/Throwable;
    .locals 0

    iget-object p0, p0, Ld1/q2$b;->a:Ljava/lang/Throwable;

    return-object p0
.end method

.method static synthetic g(Ld1/q2$b;)Ljava/util/Date;
    .locals 0

    iget-object p0, p0, Ld1/q2$b;->c:Ljava/util/Date;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Thread;)Ld1/q2$b;
    .locals 0

    iput-object p1, p0, Ld1/q2$b;->b:Ljava/lang/Thread;

    return-object p0
.end method

.method public b(Ljava/lang/Throwable;)Ld1/q2$b;
    .locals 1

    const-string v0, "throwable == null"

    invoke-static {p1, v0}, Ld1/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object p1, p0, Ld1/q2$b;->a:Ljava/lang/Throwable;

    return-object p0
.end method

.method public c(Ljava/util/Date;)Ld1/q2$b;
    .locals 1

    const-string v0, "date == null"

    invoke-static {p1, v0}, Ld1/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    iput-object p1, p0, Ld1/q2$b;->c:Ljava/util/Date;

    return-object p0
.end method

.method public d()Ld1/q2;
    .locals 2

    new-instance v0, Ld1/q2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ld1/q2;-><init>(Ld1/q2$b;Ld1/q2$a;)V

    return-object v0
.end method
