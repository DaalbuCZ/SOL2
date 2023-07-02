.class public abstract Lc0/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final b:Landroidx/room/h;

.field private volatile c:Lg0/f;


# direct methods
.method public constructor <init>(Landroidx/room/h;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lc0/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lc0/d;->b:Landroidx/room/h;

    return-void
.end method

.method private c()Lg0/f;
    .locals 2

    invoke-virtual {p0}, Lc0/d;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc0/d;->b:Landroidx/room/h;

    invoke-virtual {v1, v0}, Landroidx/room/h;->d(Ljava/lang/String;)Lg0/f;

    move-result-object v0

    return-object v0
.end method

.method private e(Z)Lg0/f;
    .locals 0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc0/d;->c:Lg0/f;

    if-nez p1, :cond_0

    invoke-direct {p0}, Lc0/d;->c()Lg0/f;

    move-result-object p1

    iput-object p1, p0, Lc0/d;->c:Lg0/f;

    :cond_0
    iget-object p1, p0, Lc0/d;->c:Lg0/f;

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lc0/d;->c()Lg0/f;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a()Lg0/f;
    .locals 3

    invoke-virtual {p0}, Lc0/d;->b()V

    iget-object v0, p0, Lc0/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    invoke-direct {p0, v0}, Lc0/d;->e(Z)Lg0/f;

    move-result-object v0

    return-object v0
.end method

.method protected b()V
    .locals 1

    iget-object v0, p0, Lc0/d;->b:Landroidx/room/h;

    invoke-virtual {v0}, Landroidx/room/h;->a()V

    return-void
.end method

.method protected abstract d()Ljava/lang/String;
.end method

.method public f(Lg0/f;)V
    .locals 1

    iget-object v0, p0, Lc0/d;->c:Lg0/f;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lc0/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
